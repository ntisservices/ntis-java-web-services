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
 * <p>Java class for SubscriptionStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionStateEnum")
@XmlEnum
public enum SubscriptionStateEnum {


    /**
     * The client's subscription as registered with a supplier is currently active.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The client's subscription as registered with a supplier is currently suspended.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    SubscriptionStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionStateEnum fromValue(String v) {
        for (SubscriptionStateEnum c: SubscriptionStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
