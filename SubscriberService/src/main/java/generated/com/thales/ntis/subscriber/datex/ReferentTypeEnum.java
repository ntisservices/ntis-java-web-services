//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 10:48:07 AM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boundary"/>
 *     &lt;enumeration value="intersection"/>
 *     &lt;enumeration value="referenceMarker"/>
 *     &lt;enumeration value="landmark"/>
 *     &lt;enumeration value="roadNode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferentTypeEnum")
@XmlEnum
public enum ReferentTypeEnum {


    /**
     * A boundary between two jurisdictional or administrative areas. These may be legal boundaries such as between counties or countries, maintenance responsibility boundaries or control boundaries. 
     * 
     */
    @XmlEnumValue("boundary")
    BOUNDARY("boundary"),

    /**
     * A crossing of two or more roads where the precise point of intersection is defined according to specific business rules.
     * 
     */
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),

    /**
     * A marker which is usually but not necessarily physical that is one of a sequence which are spaced out along the linear object (road)  to provide a location reference. The spacing of markers is not necessarily even.
     * 
     */
    @XmlEnumValue("referenceMarker")
    REFERENCE_MARKER("referenceMarker"),

    /**
     * A visible identifiable physical landmark either alongside or close to the linear object.
     * 
     */
    @XmlEnumValue("landmark")
    LANDMARK("landmark"),

    /**
     * A topological node defined on a road network. Such nodes may delineate the segmentation of the road network according to defined business rules or may constitute a purely topological representation of a road network.
     * 
     */
    @XmlEnumValue("roadNode")
    ROAD_NODE("roadNode");
    private final String value;

    ReferentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferentTypeEnum fromValue(String v) {
        for (ReferentTypeEnum c: ReferentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
