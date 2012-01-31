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
 * <p>Java class for DisturbanceActivityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisturbanceActivityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airRaid"/>
 *     &lt;enumeration value="altercationOfVehicleOccupants"/>
 *     &lt;enumeration value="assault"/>
 *     &lt;enumeration value="assetDestruction"/>
 *     &lt;enumeration value="attack"/>
 *     &lt;enumeration value="attackOnVehicle"/>
 *     &lt;enumeration value="blockadeOrBarrier"/>
 *     &lt;enumeration value="bombAlert"/>
 *     &lt;enumeration value="crowd"/>
 *     &lt;enumeration value="demonstration"/>
 *     &lt;enumeration value="evacuation"/>
 *     &lt;enumeration value="filterBlockade"/>
 *     &lt;enumeration value="goSlowOperation"/>
 *     &lt;enumeration value="gunfireOnRoadway"/>
 *     &lt;enumeration value="illVehicleOccupants"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="publicDisturbance"/>
 *     &lt;enumeration value="radioactiveLeakAlert"/>
 *     &lt;enumeration value="riot"/>
 *     &lt;enumeration value="sabotage"/>
 *     &lt;enumeration value="securityAlert"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="sightseersObstructingAccess"/>
 *     &lt;enumeration value="strike"/>
 *     &lt;enumeration value="terroristIncident"/>
 *     &lt;enumeration value="theft"/>
 *     &lt;enumeration value="toxicCloudAlert"/>
 *     &lt;enumeration value="unspecifiedAlert"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisturbanceActivityTypeEnum")
@XmlEnum
public enum DisturbanceActivityTypeEnum {


    /**
     * A situation relating to any threat from foreign air power.
     * 
     */
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),

    /**
     * An altercation (argument, dispute or fight) between two or more vehicle occupants.
     * 
     */
    @XmlEnumValue("altercationOfVehicleOccupants")
    ALTERCATION_OF_VEHICLE_OCCUPANTS("altercationOfVehicleOccupants"),

    /**
     * A situation where an assault has taken place on one or more persons.
     * 
     */
    @XmlEnumValue("assault")
    ASSAULT("assault"),

    /**
     * A situation where assets of one or more persons or authorities have been destroyed.
     * 
     */
    @XmlEnumValue("assetDestruction")
    ASSET_DESTRUCTION("assetDestruction"),

    /**
     * A situation where an attack on a group of people or properties has taken place.
     * 
     */
    @XmlEnumValue("attack")
    ATTACK("attack"),

    /**
     * A situation where an attack on a vehicle or its occupants has taken place.
     * 
     */
    @XmlEnumValue("attackOnVehicle")
    ATTACK_ON_VEHICLE("attackOnVehicle"),

    /**
     * A manned blockade or barrier across a road stopping vehicles passing.
     * 
     */
    @XmlEnumValue("blockadeOrBarrier")
    BLOCKADE_OR_BARRIER("blockadeOrBarrier"),

    /**
     * An alert to a situation where suspected or actual explosive or incendiary devices may cause disruption to traffic.
     * 
     */
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),

    /**
     * A major gathering of people that could disrupt traffic.
     * 
     */
    @XmlEnumValue("crowd")
    CROWD("crowd"),

    /**
     * A public protest with the potential to disrupt traffic.
     * 
     */
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),

    /**
     * A situation where a definite area is being cleared due to dangerous conditions or for security reasons.
     * 
     */
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),

    /**
     * A manned blockade of a road where only certain vehicles are allowed through.
     * 
     */
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),

    /**
     * As a form of protest, several vehicles are driving in a convoy at a low speed which is affecting the normal traffic flow.
     * 
     */
    @XmlEnumValue("goSlowOperation")
    GO_SLOW_OPERATION("goSlowOperation"),

    /**
     * A situation involving gunfire, perceived or actual, on or near the roadway through an act of terrorism or crime, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),

    /**
     * One or more occupants of a vehicle are seriously ill, possibly requiring specialist services or assistance. This may disrupt normal traffic flow.
     * 
     */
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),

    /**
     * A situation where people are walking together in large groups for a common purpose, with potential to disrupt traffic.
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     * A situation of public disorder, with potential to disrupt traffic.
     * 
     */
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),

    /**
     * An alert to a radioactive leak which may endanger the public and hence may cause traffic disruption.
     * 
     */
    @XmlEnumValue("radioactiveLeakAlert")
    RADIOACTIVE_LEAK_ALERT("radioactiveLeakAlert"),

    /**
     * A situation of public disorder involving violent behaviour and/or destruction of property with the potential to disrupt traffic.
     * 
     */
    @XmlEnumValue("riot")
    RIOT("riot"),

    /**
     * A situation resulting from any act of sabotage.
     * 
     */
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),

    /**
     * An official alert to a perceived or actual threat of crime or terrorism, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),

    /**
     * A situation related to a perceived or actual threat of crime or terrorism, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),

    /**
     * Attendees or sightseers to reported event(s) causing obstruction to access.
     * 
     */
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),

    /**
     * A situation resulting from industrial action that could disrupt traffic.
     * 
     */
    @XmlEnumValue("strike")
    STRIKE("strike"),

    /**
     * A situation related to a perceived or actual threat of terrorism, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),

    /**
     * A situation where assets of one or more persons or authorities have been stolen.
     * 
     */
    @XmlEnumValue("theft")
    THEFT("theft"),

    /**
     * An alert to a toxic release of gases and/or particulates into the environment which may endanger the public and hence may cause traffic disruption.
     * 
     */
    @XmlEnumValue("toxicCloudAlert")
    TOXIC_CLOUD_ALERT("toxicCloudAlert"),

    /**
     * An alert to a perceived or actual threat of an unspecified nature, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("unspecifiedAlert")
    UNSPECIFIED_ALERT("unspecifiedAlert"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DisturbanceActivityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisturbanceActivityTypeEnum fromValue(String v) {
        for (DisturbanceActivityTypeEnum c: DisturbanceActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
