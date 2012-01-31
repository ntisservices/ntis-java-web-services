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
import javax.xml.bind.annotation.XmlType;


/**
 * Multiple physically separate locations arranged as an ordered set that defines an itinerary or route. The index qualifier indicates the order.
 * 
 * <p>Java class for ItineraryByIndexedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryByIndexedLocations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Itinerary">
 *       &lt;sequence>
 *         &lt;element name="locationContainedInItinerary" type="{http://datex2.eu/schema/2/2_0}_LocationContainedInItinerary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itineraryByIndexedLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByIndexedLocations", propOrder = {
    "locationContainedInItinerary",
    "itineraryByIndexedLocationsExtension"
})
public class ItineraryByIndexedLocations
    extends Itinerary
{

    protected List<LocationContainedInItinerary> locationContainedInItinerary;
    protected ExtensionType itineraryByIndexedLocationsExtension;

    /**
     * Gets the value of the locationContainedInItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContainedInItinerary }
     * 
     * 
     */
    public List<LocationContainedInItinerary> getLocationContainedInItinerary() {
        if (locationContainedInItinerary == null) {
            locationContainedInItinerary = new ArrayList<LocationContainedInItinerary>();
        }
        return this.locationContainedInItinerary;
    }

    /**
     * Gets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryByIndexedLocationsExtension() {
        return itineraryByIndexedLocationsExtension;
    }

    /**
     * Sets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryByIndexedLocationsExtension(ExtensionType value) {
        this.itineraryByIndexedLocationsExtension = value;
    }

}
