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
 * <p>Java class for SpeedManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="activeSpeedControlInOperation"/>
 *     &lt;enumeration value="doNotSlowdownUnnecessarily"/>
 *     &lt;enumeration value="observeSpeedLimit"/>
 *     &lt;enumeration value="policeSpeedChecksInOperation"/>
 *     &lt;enumeration value="reduceYourSpeed"/>
 *     &lt;enumeration value="speedRestrictionInOperation"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedManagementTypeEnum")
@XmlEnum
public enum SpeedManagementTypeEnum {


    /**
     * Automatic speed control measures are in place at the specified location, whereby speed limits are set by an automatic system which is triggered by traffic sensing equipment.
     * 
     */
    @XmlEnumValue("activeSpeedControlInOperation")
    ACTIVE_SPEED_CONTROL_IN_OPERATION("activeSpeedControlInOperation"),

    /**
     * Do not slow down unnecessarily.
     * 
     */
    @XmlEnumValue("doNotSlowdownUnnecessarily")
    DO_NOT_SLOWDOWN_UNNECESSARILY("doNotSlowdownUnnecessarily"),

    /**
     * Observe speed limit.
     * 
     */
    @XmlEnumValue("observeSpeedLimit")
    OBSERVE_SPEED_LIMIT("observeSpeedLimit"),

    /**
     * Police speed checks are in operation.
     * 
     */
    @XmlEnumValue("policeSpeedChecksInOperation")
    POLICE_SPEED_CHECKS_IN_OPERATION("policeSpeedChecksInOperation"),

    /**
     * Reduce your speed.
     * 
     */
    @XmlEnumValue("reduceYourSpeed")
    REDUCE_YOUR_SPEED("reduceYourSpeed"),

    /**
     * A speed restriction is in operation.
     * 
     */
    @XmlEnumValue("speedRestrictionInOperation")
    SPEED_RESTRICTION_IN_OPERATION("speedRestrictionInOperation"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpeedManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedManagementTypeEnum fromValue(String v) {
        for (SpeedManagementTypeEnum c: SpeedManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
