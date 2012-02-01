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
 * <p>Java class for MeasurementEquipmentFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementEquipmentFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intermittentDataValues"/>
 *     &lt;enumeration value="noDataValuesAvailable"/>
 *     &lt;enumeration value="spuriousUnreliableDataValues"/>
 *     &lt;enumeration value="unspecifiedOrUnknownFault"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementEquipmentFaultEnum")
@XmlEnum
public enum MeasurementEquipmentFaultEnum {


    /**
     * Data values are being produced at intermittent intervals which are not consitent with the expected reporting interval.
     * 
     */
    @XmlEnumValue("intermittentDataValues")
    INTERMITTENT_DATA_VALUES("intermittentDataValues"),

    /**
     * No measured data values are currently available.
     * 
     */
    @XmlEnumValue("noDataValuesAvailable")
    NO_DATA_VALUES_AVAILABLE("noDataValuesAvailable"),

    /**
     * Spurious or unreliable data values are being produced.
     * 
     */
    @XmlEnumValue("spuriousUnreliableDataValues")
    SPURIOUS_UNRELIABLE_DATA_VALUES("spuriousUnreliableDataValues"),

    /**
     * An unspecified or unknown fault exists in the measurement equipment.
     * 
     */
    @XmlEnumValue("unspecifiedOrUnknownFault")
    UNSPECIFIED_OR_UNKNOWN_FAULT("unspecifiedOrUnknownFault"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MeasurementEquipmentFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementEquipmentFaultEnum fromValue(String v) {
        for (MeasurementEquipmentFaultEnum c: MeasurementEquipmentFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
