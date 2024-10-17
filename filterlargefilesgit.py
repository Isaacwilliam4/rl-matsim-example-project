import os

# Define the size limit (10MB)
SIZE_LIMIT = 15 * 1024 * 1024  # 10MB in bytes

# Function to check the size of each file and add to .gitignore if too large
def add_large_files_to_gitignore():
    # Get the current working directory
    current_directory = os.getcwd()
    gitignore_path = os.path.join(current_directory, '.gitignore')
    og_large_files = set()

    with open(gitignore_path, 'r') as gitignore_file:
        line = gitignore_file.readline().strip()
        while "___MANUALADDFILES___" not in line:
            line = gitignore_file.readline()
        while True:
            line = gitignore_file.readline()
            if line == '':
                break
            og_large_files.add(line.strip())
    
    # Set to store large files to add to .gitignore
    large_files = set()
    # Walk through all files in the directory
    for root, dirs, files in os.walk(current_directory):
        for file in files:
            file_path = os.path.join(root, file)
            # Skip files in the .git directory
            if '.git' in file_path:
                continue
            # Check the file size
            if os.path.isfile(file_path) and os.path.getsize(file_path) > SIZE_LIMIT:
                # Add the file path to the set of large files
                relative_path = os.path.relpath(file_path, current_directory)
                filename = os.path.basename(relative_path)

                if filename not in og_large_files:
                  large_files.add(filename)

    # Add the large files to .gitignore
    if large_files:
        with open(gitignore_path, 'a') as gitignore_file:
            for large_file in large_files:
                gitignore_file.write(f"{large_file}\n")
        print(f"Added {len(large_files)} large files to .gitignore.")
    else:
        print("No files larger than 10MB found.")

# Run the function
add_large_files_to_gitignore()
