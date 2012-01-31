//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Location characteristics which override values set in the referenced measurement point.
 * 
 * <p>Java class for LocationCharacteristicsOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationCharacteristicsOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementLanesOverride" type="{http://datex2.eu/schema/2/2_0}LaneEnum" minOccurs="0"/>
 *         &lt;element name="reversedFlow" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="locationCharacteristicsOverrideExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCharacteristicsOverride", propOrder = {
    "measurementLanesOverride",
    "reversedFlow",
    "locationCharacteristicsOverrideExtension"
})
public class LocationCharacteristicsOverride {

    protected LaneEnum measurementLanesOverride;
    protected Boolean reversedFlow;
    protected ExtensionType locationCharacteristicsOverrideExtension;

    /**
     * Gets the value of the measurementLanesOverride property.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getMeasurementLanesOverride() {
        return measurementLanesOverride;
    }

    /**
     * Sets the value of the measurementLanesOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setMeasurementLanesOverride(LaneEnum value) {
        this.measurementLanesOverride = value;
    }

    /**
     * Gets the value of the reversedFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedFlow() {
        return reversedFlow;
    }

    /**
     * Sets the value of the reversedFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedFlow(Boolean value) {
        this.reversedFlow = value;
    }

    /**
     * Gets the value of the locationCharacteristicsOverrideExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationCharacteristicsOverrideExtension() {
        return locationCharacteristicsOverrideExtension;
    }

    /**
     * Sets the value of the locationCharacteristicsOverrideExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationCharacteristicsOverrideExtension(ExtensionType value) {
        this.locationCharacteristicsOverrideExtension = value;
    }

}
