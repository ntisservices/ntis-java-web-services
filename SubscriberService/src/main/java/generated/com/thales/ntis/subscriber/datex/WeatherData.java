//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 10:48:07 AM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Measured or derived values relating to the weather at a specific location or locations.
 * 
 * <p>Java class for WeatherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData">
 *       &lt;sequence>
 *         &lt;element name="weatherDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherData", propOrder = {
    "weatherDataExtension"
})
@XmlSeeAlso({
    PrecipitationInformation.class,
    HumidityInformation.class,
    PollutionInformation.class,
    RoadSurfaceConditionInformation.class,
    VisibilityInformation.class,
    WindInformation.class,
    TemperatureInformation.class
})
public abstract class WeatherData
    extends BasicData
{

    protected ExtensionType weatherDataExtension;

    /**
     * Gets the value of the weatherDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherDataExtension() {
        return weatherDataExtension;
    }

    /**
     * Sets the value of the weatherDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherDataExtension(ExtensionType value) {
        this.weatherDataExtension = value;
    }

}
