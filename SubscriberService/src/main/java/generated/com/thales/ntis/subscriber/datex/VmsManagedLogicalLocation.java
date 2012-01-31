//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The logical location (e.g. a car park, a section of road, a junction etc.) which a VMS contributes to the management of.
 * 
 * <p>Java class for VmsManagedLogicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsManagedLogicalLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managedLogicalLocation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="distanceFromLogicalLocation" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="managedLocation" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/>
 *         &lt;element name="vmsManagedLogicalLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsManagedLogicalLocation", propOrder = {
    "managedLogicalLocation",
    "distanceFromLogicalLocation",
    "managedLocation",
    "vmsManagedLogicalLocationExtension"
})
public class VmsManagedLogicalLocation {

    protected MultilingualString managedLogicalLocation;
    protected BigInteger distanceFromLogicalLocation;
    protected Location managedLocation;
    protected ExtensionType vmsManagedLogicalLocationExtension;

    /**
     * Gets the value of the managedLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getManagedLogicalLocation() {
        return managedLogicalLocation;
    }

    /**
     * Sets the value of the managedLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setManagedLogicalLocation(MultilingualString value) {
        this.managedLogicalLocation = value;
    }

    /**
     * Gets the value of the distanceFromLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromLogicalLocation() {
        return distanceFromLogicalLocation;
    }

    /**
     * Sets the value of the distanceFromLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromLogicalLocation(BigInteger value) {
        this.distanceFromLogicalLocation = value;
    }

    /**
     * Gets the value of the managedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getManagedLocation() {
        return managedLocation;
    }

    /**
     * Sets the value of the managedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setManagedLocation(Location value) {
        this.managedLocation = value;
    }

    /**
     * Gets the value of the vmsManagedLogicalLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsManagedLogicalLocationExtension() {
        return vmsManagedLogicalLocationExtension;
    }

    /**
     * Sets the value of the vmsManagedLogicalLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsManagedLogicalLocationExtension(ExtensionType value) {
        this.vmsManagedLogicalLocationExtension = value;
    }

}
