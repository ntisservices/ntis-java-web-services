//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 10:48:07 AM GMT 
//


package com.thales.ntis.subscriber.datex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of FusedData
 * 
 * <p>Java class for FusedDataPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FusedDataPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="fusedData" type="{http://www.thalesgroup.com/NTIS/Datex2Extensions/1.0Beta1}FusedData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FusedDataPublication", namespace = "http://www.thalesgroup.com/NTIS/Datex2Extensions/1.0Beta1", propOrder = {
    "fusedData"
})
public class FusedDataPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected List<FusedData> fusedData;

    /**
     * Gets the value of the fusedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fusedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFusedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FusedData }
     * 
     * 
     */
    public List<FusedData> getFusedData() {
        if (fusedData == null) {
            fusedData = new ArrayList<FusedData>();
        }
        return this.fusedData;
    }

}
