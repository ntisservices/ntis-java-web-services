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
 * <p>Java class for NonWeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonWeatherRelatedRoadConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dieselOnRoad"/>
 *     &lt;enumeration value="leavesOnRoad"/>
 *     &lt;enumeration value="looseChippings"/>
 *     &lt;enumeration value="looseSandOnRoad"/>
 *     &lt;enumeration value="mudOnRoad"/>
 *     &lt;enumeration value="oilOnRoad"/>
 *     &lt;enumeration value="petrolOnRoad"/>
 *     &lt;enumeration value="roadSurfaceInPoorCondition"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonWeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum NonWeatherRelatedRoadConditionTypeEnum {


    /**
     * Increased skid risk due to diesel on the road.
     * 
     */
    @XmlEnumValue("dieselOnRoad")
    DIESEL_ON_ROAD("dieselOnRoad"),

    /**
     * Increased skid risk due to leaves on road.
     * 
     */
    @XmlEnumValue("leavesOnRoad")
    LEAVES_ON_ROAD("leavesOnRoad"),

    /**
     * Increased skid risk and injury risk due to loose chippings on road.
     * 
     */
    @XmlEnumValue("looseChippings")
    LOOSE_CHIPPINGS("looseChippings"),

    /**
     * Increased skid risk due to loose sand on road.
     * 
     */
    @XmlEnumValue("looseSandOnRoad")
    LOOSE_SAND_ON_ROAD("looseSandOnRoad"),

    /**
     * Increased skid risk due to mud on road.
     * 
     */
    @XmlEnumValue("mudOnRoad")
    MUD_ON_ROAD("mudOnRoad"),

    /**
     * Increased skid risk due to oil on road.
     * 
     */
    @XmlEnumValue("oilOnRoad")
    OIL_ON_ROAD("oilOnRoad"),

    /**
     * Increased skid risk due to petrol on road.
     * 
     */
    @XmlEnumValue("petrolOnRoad")
    PETROL_ON_ROAD("petrolOnRoad"),

    /**
     * The road surface is damaged, severely rutted or potholed (i.e. it is in a poor state of repair).
     * 
     */
    @XmlEnumValue("roadSurfaceInPoorCondition")
    ROAD_SURFACE_IN_POOR_CONDITION("roadSurfaceInPoorCondition"),

    /**
     * The road surface is slippery due to an unspecified non-weather related cause.
     * 
     */
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NonWeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonWeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (NonWeatherRelatedRoadConditionTypeEnum c: NonWeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
