import os

# Define the size limit (10MB)
SIZE_LIMIT = 15 * 1024 * 1024  # 10MB in bytes

# Function to check the size of each file and add to .gitignore if too large
def add_large_files_to_gitignore():
    # Get the current working directory
    current_directory = os.getcwd()
    gitignore_path = os.path.join(current_directory, '.gitignore')

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
                large_files.add(relative_path)

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
