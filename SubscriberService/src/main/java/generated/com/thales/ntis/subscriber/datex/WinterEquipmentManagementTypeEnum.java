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
 * <p>Java class for WinterEquipmentManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WinterEquipmentManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="doNoUseStudTyres"/>
 *     &lt;enumeration value="useSnowChains"/>
 *     &lt;enumeration value="useSnowChainsOrTyres"/>
 *     &lt;enumeration value="useSnowTyres"/>
 *     &lt;enumeration value="winterEquipmentOnBoardRequired"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentManagementTypeEnum")
@XmlEnum
public enum WinterEquipmentManagementTypeEnum {


    /**
     * Do not use stud tyres.
     * 
     */
    @XmlEnumValue("doNoUseStudTyres")
    DO_NO_USE_STUD_TYRES("doNoUseStudTyres"),

    /**
     * Use snow chains.
     * 
     */
    @XmlEnumValue("useSnowChains")
    USE_SNOW_CHAINS("useSnowChains"),

    /**
     * Use snow chains or snow tyres.
     * 
     */
    @XmlEnumValue("useSnowChainsOrTyres")
    USE_SNOW_CHAINS_OR_TYRES("useSnowChainsOrTyres"),

    /**
     * Use snow tyres.
     * 
     */
    @XmlEnumValue("useSnowTyres")
    USE_SNOW_TYRES("useSnowTyres"),

    /**
     * The carrying of winter equipment (snow chains and/or snow tyres) is required.
     * 
     */
    @XmlEnumValue("winterEquipmentOnBoardRequired")
    WINTER_EQUIPMENT_ON_BOARD_REQUIRED("winterEquipmentOnBoardRequired"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentManagementTypeEnum fromValue(String v) {
        for (WinterEquipmentManagementTypeEnum c: WinterEquipmentManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
