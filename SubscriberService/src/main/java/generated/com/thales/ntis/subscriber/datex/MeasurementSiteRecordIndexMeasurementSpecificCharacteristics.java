//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _MeasurementSiteRecordIndexMeasurementSpecificCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSpecificCharacteristics" type="{http://datex2.eu/schema/2/2_0}MeasurementSpecificCharacteristics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics", propOrder = {
    "measurementSpecificCharacteristics"
})
public class MeasurementSiteRecordIndexMeasurementSpecificCharacteristics {

    @XmlElement(required = true)
    protected MeasurementSpecificCharacteristics measurementSpecificCharacteristics;
    @XmlAttribute(required = true)
    protected int index;

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSpecificCharacteristics }
     *     
     */
    public MeasurementSpecificCharacteristics getMeasurementSpecificCharacteristics() {
        return measurementSpecificCharacteristics;
    }

    /**
     * Sets the value of the measurementSpecificCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSpecificCharacteristics }
     *     
     */
    public void setMeasurementSpecificCharacteristics(MeasurementSpecificCharacteristics value) {
        this.measurementSpecificCharacteristics = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
