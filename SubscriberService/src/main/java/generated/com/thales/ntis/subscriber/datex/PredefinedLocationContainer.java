//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A container which may comprise the definition of a predefined itinerary, non ordered group of locations or single location.
 * 
 * <p>Java class for PredefinedLocationContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationContainerExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationContainer", propOrder = {
    "predefinedLocationContainerExtension"
})
@XmlSeeAlso({
    PredefinedLocation.class,
    PredefinedNonOrderedLocationGroup.class,
    PredefinedItinerary.class
})
public abstract class PredefinedLocationContainer {

    protected ExtensionType predefinedLocationContainerExtension;

    /**
     * Gets the value of the predefinedLocationContainerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationContainerExtension() {
        return predefinedLocationContainerExtension;
    }

    /**
     * Sets the value of the predefinedLocationContainerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationContainerExtension(ExtensionType value) {
        this.predefinedLocationContainerExtension = value;
    }

}
