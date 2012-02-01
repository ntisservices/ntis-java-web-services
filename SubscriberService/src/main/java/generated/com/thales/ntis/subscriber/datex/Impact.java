//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 10:48:07 AM GMT 
//


package com.thales.ntis.subscriber.datex;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An assessment of the impact that an event or operator action defined by the situation record has on the driving conditions.
 * 
 * <p>Java class for Impact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Impact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacityRemaining" type="{http://datex2.eu/schema/2/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="numberOfLanesRestricted" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfOperationalLanes" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="originalNumberOfLanes" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="residualRoadWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="trafficConstrictionType" type="{http://datex2.eu/schema/2/2_0}TrafficConstrictionTypeEnum" minOccurs="0"/>
 *         &lt;element name="delays" type="{http://datex2.eu/schema/2/2_0}Delays" minOccurs="0"/>
 *         &lt;element name="impactExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", propOrder = {
    "capacityRemaining",
    "numberOfLanesRestricted",
    "numberOfOperationalLanes",
    "originalNumberOfLanes",
    "residualRoadWidth",
    "trafficConstrictionType",
    "delays",
    "impactExtension"
})
public class Impact {

    protected Float capacityRemaining;
    protected BigInteger numberOfLanesRestricted;
    protected BigInteger numberOfOperationalLanes;
    protected BigInteger originalNumberOfLanes;
    protected Float residualRoadWidth;
    protected TrafficConstrictionTypeEnum trafficConstrictionType;
    protected Delays delays;
    protected ExtensionType impactExtension;

    /**
     * Gets the value of the capacityRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapacityRemaining() {
        return capacityRemaining;
    }

    /**
     * Sets the value of the capacityRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapacityRemaining(Float value) {
        this.capacityRemaining = value;
    }

    /**
     * Gets the value of the numberOfLanesRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Sets the value of the numberOfLanesRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanesRestricted(BigInteger value) {
        this.numberOfLanesRestricted = value;
    }

    /**
     * Gets the value of the numberOfOperationalLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOperationalLanes() {
        return numberOfOperationalLanes;
    }

    /**
     * Sets the value of the numberOfOperationalLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOperationalLanes(BigInteger value) {
        this.numberOfOperationalLanes = value;
    }

    /**
     * Gets the value of the originalNumberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalNumberOfLanes() {
        return originalNumberOfLanes;
    }

    /**
     * Sets the value of the originalNumberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalNumberOfLanes(BigInteger value) {
        this.originalNumberOfLanes = value;
    }

    /**
     * Gets the value of the residualRoadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualRoadWidth() {
        return residualRoadWidth;
    }

    /**
     * Sets the value of the residualRoadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualRoadWidth(Float value) {
        this.residualRoadWidth = value;
    }

    /**
     * Gets the value of the trafficConstrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Sets the value of the trafficConstrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Gets the value of the impactExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImpactExtension() {
        return impactExtension;
    }

    /**
     * Sets the value of the impactExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImpactExtension(ExtensionType value) {
        this.impactExtension = value;
    }

}
