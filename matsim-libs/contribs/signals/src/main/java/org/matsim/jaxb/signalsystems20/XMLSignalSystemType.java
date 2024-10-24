//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.20 at 07:21:49 PM MESZ 
//


package org.matsim.jaxb.signalsystems20;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signalSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signalSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.matsim.org/files/dtd}matsimObjectType">
 *       &lt;sequence>
 *         &lt;element name="signals">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="signal" type="{http://www.matsim.org/files/dtd}signalType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
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
@XmlType(name = "signalSystemType", propOrder = {
    "signals"
})
public final class XMLSignalSystemType extends XMLMatsimObjectType {

    @XmlElement(required = true)
    private XMLSignalSystemType.XMLSignals signals;

    /**
     * Gets the value of the signals property.
     * 
     * @return
     *     possible object is
     *     {@link XMLSignalSystemType.XMLSignals }
     *     
     */
    public XMLSignalSystemType.XMLSignals getSignals() {
        return signals;
    }

    /**
     * Sets the value of the signals property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSignalSystemType.XMLSignals }
     *     
     */
    public void setSignals(XMLSignalSystemType.XMLSignals value) {
        this.signals = value;
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
     *       &lt;sequence>
     *         &lt;element name="signal" type="{http://www.matsim.org/files/dtd}signalType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "signal"
    })
    public static class XMLSignals {

        @XmlElement(required = true)
        protected List<XMLSignalType> signal;

        /**
         * Gets the value of the signal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLSignalType }
         * 
         * 
         */
        public List<XMLSignalType> getSignal() {
            if (signal == null) {
                signal = new ArrayList<XMLSignalType>();
            }
            return this.signal;
        }

    }

}
