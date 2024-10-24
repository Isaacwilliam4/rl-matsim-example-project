
/* *********************************************************************** *
 * project: org.matsim.*
 * XMLLaneType.java
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2019 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

 //
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 12:10:00 AM MEZ 
//


package org.matsim.jaxb.lanedefinitions20;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laneType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.matsim.org/files/dtd}matsimObjectType">
 *       &lt;sequence>
 *         &lt;element name="leadsTo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="toLink" type="{http://www.matsim.org/files/dtd}idRefType" maxOccurs="unbounded"/>
 *                   &lt;element name="toLane" type="{http://www.matsim.org/files/dtd}idRefType" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="representedLanes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="capacity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="vehiclesPerHour" type="{http://www.w3.org/2001/XMLSchema}double" default="3600" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="startsAt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="meterFromLinkEnd" type="{http://www.w3.org/2001/XMLSchema}double" default="45.0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alignment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;element name="attribute" minOccurs="0" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
 *                           &lt;attribute name="clazz" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
 *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laneType", propOrder = {
    "leadsTo",
    "representedLanes",
    "capacity",
    "startsAt",
    "alignment",
    "attributes"
})
public class XMLLaneType
    extends XMLMatsimObjectType
{

    @XmlElement(required = true)
    protected XMLLaneType.XMLLeadsTo leadsTo;
    protected XMLLaneType.XMLRepresentedLanes representedLanes;
    protected XMLLaneType.XMLCapacity capacity;
    protected XMLLaneType.XMLStartsAt startsAt;
    protected int alignment;
    protected XMLLaneType.XMLAttributes attributes;

    /**
     * Gets the value of the leadsTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLLaneType.XMLLeadsTo }
     *     
     */
    public XMLLaneType.XMLLeadsTo getLeadsTo() {
        return leadsTo;
    }

    /**
     * Sets the value of the leadsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLaneType.XMLLeadsTo }
     *     
     */
    public void setLeadsTo(XMLLaneType.XMLLeadsTo value) {
        this.leadsTo = value;
    }

    /**
     * Gets the value of the representedLanes property.
     * 
     * @return
     *     possible object is
     *     {@link XMLLaneType.XMLRepresentedLanes }
     *     
     */
    public XMLLaneType.XMLRepresentedLanes getRepresentedLanes() {
        return representedLanes;
    }

    /**
     * Sets the value of the representedLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLaneType.XMLRepresentedLanes }
     *     
     */
    public void setRepresentedLanes(XMLLaneType.XMLRepresentedLanes value) {
        this.representedLanes = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLLaneType.XMLCapacity }
     *     
     */
    public XMLLaneType.XMLCapacity getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLaneType.XMLCapacity }
     *     
     */
    public void setCapacity(XMLLaneType.XMLCapacity value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the startsAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLLaneType.XMLStartsAt }
     *     
     */
    public XMLLaneType.XMLStartsAt getStartsAt() {
        return startsAt;
    }

    /**
     * Sets the value of the startsAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLaneType.XMLStartsAt }
     *     
     */
    public void setStartsAt(XMLLaneType.XMLStartsAt value) {
        this.startsAt = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     */
    public int getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     */
    public void setAlignment(int value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     */
    public XMLLaneType.XMLAttributes getAttributes() {
    	return attributes;
    }
    
    /**
     * Sets the value of the attributes property.
     * 
     */
    public void setAttributes(XMLLaneType.XMLAttributes attributes) {
		this.attributes = attributes;
	}


	/**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="vehiclesPerHour" type="{http://www.w3.org/2001/XMLSchema}double" default="3600" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMLCapacity {

        @XmlAttribute
        protected Double vehiclesPerHour;

        /**
         * Gets the value of the vehiclesPerHour property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getVehiclesPerHour() {
            if (vehiclesPerHour == null) {
                return  3600.0D;
            } else {
                return vehiclesPerHour;
            }
        }

        /**
         * Sets the value of the vehiclesPerHour property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setVehiclesPerHour(Double value) {
            this.vehiclesPerHour = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="toLink" type="{http://www.matsim.org/files/dtd}idRefType" maxOccurs="unbounded"/>
     *         &lt;element name="toLane" type="{http://www.matsim.org/files/dtd}idRefType" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toLink",
        "toLane"
    })
    public static class XMLLeadsTo {

        protected List<XMLIdRefType> toLink;
        protected List<XMLIdRefType> toLane;

        /**
         * Gets the value of the toLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the toLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getToLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLIdRefType }
         * 
         * 
         */
        public List<XMLIdRefType> getToLink() {
            if (toLink == null) {
                toLink = new ArrayList<XMLIdRefType>();
            }
            return this.toLink;
        }

        /**
         * Gets the value of the toLane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the toLane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getToLane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLIdRefType }
         * 
         * 
         */
        public List<XMLIdRefType> getToLane() {
            if (toLane == null) {
                toLane = new ArrayList<XMLIdRefType>();
            }
            return this.toLane;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMLRepresentedLanes {

        @XmlAttribute
        protected Double number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getNumber() {
            if (number == null) {
                return  1.0D;
            } else {
                return number;
            }
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNumber(Double value) {
            this.number = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="meterFromLinkEnd" type="{http://www.w3.org/2001/XMLSchema}double" default="45.0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMLStartsAt {

        @XmlAttribute
        protected Double meterFromLinkEnd;

        /**
         * Gets the value of the meterFromLinkEnd property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getMeterFromLinkEnd() {
            if (meterFromLinkEnd == null) {
                return  45.0D;
            } else {
                return meterFromLinkEnd;
            }
        }

        /**
         * Sets the value of the meterFromLinkEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMeterFromLinkEnd(Double value) {
            this.meterFromLinkEnd = value;
        }

    }

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *         &lt;element name="attribute" minOccurs="0" maxOccurs="unbounded">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
	 *                 &lt;attribute name="clazz" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
	 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}String"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder={"attribute"})
	public static class XMLAttributes {
		protected List<XMLAttributeType> attribute;

        /**
         * Gets the value of the attributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLAttributeType }
         * 
         * 
         */
        public List<XMLAttributeType> getAttributeList() {
            if (attribute == null) {
                attribute = new ArrayList<XMLAttributeType>();
            }
            return this.attribute;
        }
	}

}