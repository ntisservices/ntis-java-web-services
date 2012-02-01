//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 10:48:07 AM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the application rate of a substance.
 * 
 * <p>Java class for ApplicationRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationRateValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="applicationRate" type="{http://datex2.eu/schema/2/2_0}IntensityKilogramsPerSquareMetre"/>
 *         &lt;element name="applicationRateValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationRateValue", propOrder = {
    "applicationRate",
    "applicationRateValueExtension"
})
public class ApplicationRateValue
    extends DataValue
{

    protected float applicationRate;
    protected ExtensionType applicationRateValueExtension;

    /**
     * Gets the value of the applicationRate property.
     * 
     */
    public float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     */
    public void setApplicationRate(float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the applicationRateValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getApplicationRateValueExtension() {
        return applicationRateValueExtension;
    }

    /**
     * Sets the value of the applicationRateValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setApplicationRateValueExtension(ExtensionType value) {
        this.applicationRateValueExtension = value;
    }

}
