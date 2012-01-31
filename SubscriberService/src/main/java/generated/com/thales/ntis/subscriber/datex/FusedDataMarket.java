//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FusedDataMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FusedDataMarket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdLocal" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="tmcs" type="{http://www.thalesgroup.com/NTIS/Datex2Extensions/1.0Beta1}FusedDataTMC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FusedDataMarket", namespace = "http://www.thalesgroup.com/NTIS/Datex2Extensions/1.0Beta1", propOrder = {
    "createdLocal",
    "tmcs"
})
public class FusedDataMarket {

    @XmlElement(required = true)
    protected XMLGregorianCalendar createdLocal;
    protected List<FusedDataTMC> tmcs;

    /**
     * Gets the value of the createdLocal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedLocal() {
        return createdLocal;
    }

    /**
     * Sets the value of the createdLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedLocal(XMLGregorianCalendar value) {
        this.createdLocal = value;
    }

    /**
     * Gets the value of the tmcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FusedDataTMC }
     * 
     * 
     */
    public List<FusedDataTMC> getTmcs() {
        if (tmcs == null) {
            tmcs = new ArrayList<FusedDataTMC>();
        }
        return this.tmcs;
    }

}
