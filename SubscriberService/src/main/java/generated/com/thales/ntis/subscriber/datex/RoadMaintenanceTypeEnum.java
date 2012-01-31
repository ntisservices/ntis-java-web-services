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
 * <p>Java class for RoadMaintenanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadMaintenanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clearanceWork"/>
 *     &lt;enumeration value="controlledAvalanche"/>
 *     &lt;enumeration value="installationWork"/>
 *     &lt;enumeration value="grassCuttingWork"/>
 *     &lt;enumeration value="litterClearance"/>
 *     &lt;enumeration value="maintenanceWork"/>
 *     &lt;enumeration value="overheadWorks"/>
 *     &lt;enumeration value="repairWork"/>
 *     &lt;enumeration value="resurfacingWork"/>
 *     &lt;enumeration value="roadMarkingWork"/>
 *     &lt;enumeration value="roadsideWork"/>
 *     &lt;enumeration value="roadworksClearance"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="rockFallPreventativeMaintenance"/>
 *     &lt;enumeration value="saltingInProgress"/>
 *     &lt;enumeration value="snowploughsInUse"/>
 *     &lt;enumeration value="sweepingOfRoad"/>
 *     &lt;enumeration value="treeAndVegetationCuttingWork"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadMaintenanceTypeEnum")
@XmlEnum
public enum RoadMaintenanceTypeEnum {


    /**
     * Clearance work of an unspecified nature.
     * 
     */
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),

    /**
     * Controlled avalanche work.
     * 
     */
    @XmlEnumValue("controlledAvalanche")
    CONTROLLED_AVALANCHE("controlledAvalanche"),

    /**
     * Installation of new equipments or systems on or along-side the roadway.
     * 
     */
    @XmlEnumValue("installationWork")
    INSTALLATION_WORK("installationWork"),

    /**
     * Grass cutting work.
     * 
     */
    @XmlEnumValue("grassCuttingWork")
    GRASS_CUTTING_WORK("grassCuttingWork"),

    /**
     * Work to collect litter from the roadway and/or adjacent verges.
     * 
     */
    @XmlEnumValue("litterClearance")
    LITTER_CLEARANCE("litterClearance"),

    /**
     * Maintenance of road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),

    /**
     * Works which are overhead of the carriageway.
     * 
     */
    @XmlEnumValue("overheadWorks")
    OVERHEAD_WORKS("overheadWorks"),

    /**
     * Repair work to road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),

    /**
     * Work associated with relaying or renewal of worn-out road surface (pavement).
     * 
     */
    @XmlEnumValue("resurfacingWork")
    RESURFACING_WORK("resurfacingWork"),

    /**
     * Striping and repainting of road markings, plus placement or replacement of reflecting studs (cats' eyes).
     * 
     */
    @XmlEnumValue("roadMarkingWork")
    ROAD_MARKING_WORK("roadMarkingWork"),

    /**
     * Road side work of an unspecified nature.
     * 
     */
    @XmlEnumValue("roadsideWork")
    ROADSIDE_WORK("roadsideWork"),

    /**
     * Roadworks are completed and are being cleared.
     * 
     */
    @XmlEnumValue("roadworksClearance")
    ROADWORKS_CLEARANCE("roadworksClearance"),

    /**
     * Road maintenance or improvement activity of an unspecified nature which may potentially cause traffic disruption.
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * Rock fall preventative maintenance.
     * 
     */
    @XmlEnumValue("rockFallPreventativeMaintenance")
    ROCK_FALL_PREVENTATIVE_MAINTENANCE("rockFallPreventativeMaintenance"),

    /**
     * Spreading of salt and / or grit on the road surface to prevent or melt snow or ice.
     * 
     */
    @XmlEnumValue("saltingInProgress")
    SALTING_IN_PROGRESS("saltingInProgress"),

    /**
     * Snowploughs or other similar mechanical devices in use to clear snow from the road.
     * 
     */
    @XmlEnumValue("snowploughsInUse")
    SNOWPLOUGHS_IN_USE("snowploughsInUse"),

    /**
     * Sweeping of the roadway.
     * 
     */
    @XmlEnumValue("sweepingOfRoad")
    SWEEPING_OF_ROAD("sweepingOfRoad"),

    /**
     * Tree and vegetation cutting work adjacent to the roadway.
     * 
     */
    @XmlEnumValue("treeAndVegetationCuttingWork")
    TREE_AND_VEGETATION_CUTTING_WORK("treeAndVegetationCuttingWork"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadMaintenanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadMaintenanceTypeEnum fromValue(String v) {
        for (RoadMaintenanceTypeEnum c: RoadMaintenanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
