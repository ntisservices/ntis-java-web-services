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
 * Group of people involved in the event having common characteristics and/or status.
 * 
 * <p>Java class for GroupOfPeopleInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfPeopleInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="injuryStatus" type="{http://datex2.eu/schema/2/2_0}InjuryStatusTypeEnum" minOccurs="0"/>
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/2/2_0}InvolvementRolesEnum" minOccurs="0"/>
 *         &lt;element name="categoryOfPeopleInvolved" type="{http://datex2.eu/schema/2/2_0}PersonCategoryEnum" minOccurs="0"/>
 *         &lt;element name="groupOfPeopleInvolvedExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfPeopleInvolved", propOrder = {
    "numberOfPeople",
    "injuryStatus",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "groupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved {

    protected BigInteger numberOfPeople;
    protected InjuryStatusTypeEnum injuryStatus;
    protected InvolvementRolesEnum involvementRole;
    protected PersonCategoryEnum categoryOfPeopleInvolved;
    protected ExtensionType groupOfPeopleInvolvedExtension;

    /**
     * Gets the value of the numberOfPeople property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Sets the value of the numberOfPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPeople(BigInteger value) {
        this.numberOfPeople = value;
    }

    /**
     * Gets the value of the injuryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * Sets the value of the injuryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatus(InjuryStatusTypeEnum value) {
        this.injuryStatus = value;
    }

    /**
     * Gets the value of the involvementRole property.
     * 
     * @return
     *     possible object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Sets the value of the involvementRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRole(InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    /**
     * Gets the value of the categoryOfPeopleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getCategoryOfPeopleInvolved() {
        return categoryOfPeopleInvolved;
    }

    /**
     * Sets the value of the categoryOfPeopleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setCategoryOfPeopleInvolved(PersonCategoryEnum value) {
        this.categoryOfPeopleInvolved = value;
    }

    /**
     * Gets the value of the groupOfPeopleInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfPeopleInvolvedExtension() {
        return groupOfPeopleInvolvedExtension;
    }

    /**
     * Sets the value of the groupOfPeopleInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfPeopleInvolvedExtension(ExtensionType value) {
        this.groupOfPeopleInvolvedExtension = value;
    }

}
