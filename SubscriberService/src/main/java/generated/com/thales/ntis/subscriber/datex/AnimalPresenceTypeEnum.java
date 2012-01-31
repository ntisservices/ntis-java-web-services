//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnimalPresenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnimalPresenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="animalsOnTheRoad"/>
 *     &lt;enumeration value="herdOfAnimalsOnTheRoad"/>
 *     &lt;enumeration value="largeAnimalsOnTheRoad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnimalPresenceTypeEnum")
@XmlEnum
public enum AnimalPresenceTypeEnum {


    /**
     * Traffic may be disrupted due to animals on the roadway.
     * 
     */
    @XmlEnumValue("animalsOnTheRoad")
    ANIMALS_ON_THE_ROAD("animalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to a herd of animals on the roadway.
     * 
     */
    @XmlEnumValue("herdOfAnimalsOnTheRoad")
    HERD_OF_ANIMALS_ON_THE_ROAD("herdOfAnimalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to large animals on the roadway.
     * 
     */
    @XmlEnumValue("largeAnimalsOnTheRoad")
    LARGE_ANIMALS_ON_THE_ROAD("largeAnimalsOnTheRoad");
    private final String value;

    AnimalPresenceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnimalPresenceTypeEnum fromValue(String v) {
        for (AnimalPresenceTypeEnum c: AnimalPresenceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
