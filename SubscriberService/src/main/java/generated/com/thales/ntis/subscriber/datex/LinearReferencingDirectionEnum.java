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
 * <p>Java class for LinearReferencingDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinearReferencingDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="opposite"/>
 *     &lt;enumeration value="aligned"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinearReferencingDirectionEnum")
@XmlEnum
public enum LinearReferencingDirectionEnum {


    /**
     * Indicates that both directions of traffic flow are affected by the situation or relate to the traffic data.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is in the opposite sense to the direction in which the linear element is defined.
     * 
     */
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is in the same sense as the direction in which the linear element is defined.
     * 
     */
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LinearReferencingDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearReferencingDirectionEnum fromValue(String v) {
        for (LinearReferencingDirectionEnum c: LinearReferencingDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
