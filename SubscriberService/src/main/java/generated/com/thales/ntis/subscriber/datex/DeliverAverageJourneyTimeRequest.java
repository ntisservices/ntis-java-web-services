//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="D2LogicalModel" type="{http://datex2.eu/schema/2/2_0}D2LogicalModel"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "DeliverAverageJourneyTimeRequest", namespace = "http://www.thalesgroup.com/NTIS/SubscriberService")
public class DeliverAverageJourneyTimeRequest {

    @XmlElement(name = "D2LogicalModel", namespace = "http://www.thalesgroup.com/NTIS/SubscriberService", required = true)
    protected D2LogicalModel d2LogicalModel;

    /**
     * Gets the value of the d2LogicalModel property.
     * 
     * @return
     *     possible object is
     *     {@link D2LogicalModel }
     *     
     */
    public D2LogicalModel getD2LogicalModel() {
        return d2LogicalModel;
    }

    /**
     * Sets the value of the d2LogicalModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link D2LogicalModel }
     *     
     */
    public void setD2LogicalModel(D2LogicalModel value) {
        this.d2LogicalModel = value;
    }

}
