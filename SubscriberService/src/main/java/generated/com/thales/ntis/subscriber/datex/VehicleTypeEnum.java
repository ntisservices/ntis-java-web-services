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
 * <p>Java class for VehicleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agriculturalVehicle"/>
 *     &lt;enumeration value="anyVehicle"/>
 *     &lt;enumeration value="articulatedVehicle"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="caravan"/>
 *     &lt;enumeration value="carOrLightVehicle"/>
 *     &lt;enumeration value="carWithCaravan"/>
 *     &lt;enumeration value="carWithTrailer"/>
 *     &lt;enumeration value="constructionOrMaintenanceVehicle"/>
 *     &lt;enumeration value="fourWheelDrive"/>
 *     &lt;enumeration value="highSidedVehicle"/>
 *     &lt;enumeration value="lorry"/>
 *     &lt;enumeration value="moped"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="motorcycleWithSideCar"/>
 *     &lt;enumeration value="motorscooter"/>
 *     &lt;enumeration value="tanker"/>
 *     &lt;enumeration value="threeWheeledVehicle"/>
 *     &lt;enumeration value="trailer"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="twoWheeledVehicle"/>
 *     &lt;enumeration value="van"/>
 *     &lt;enumeration value="vehicleWithCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithoutCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithCaravan"/>
 *     &lt;enumeration value="vehicleWithTrailer"/>
 *     &lt;enumeration value="withEvenNumberedRegistrationPlates"/>
 *     &lt;enumeration value="withOddNumberedRegistrationPlates"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeEnum")
@XmlEnum
public enum VehicleTypeEnum {


    /**
     * Vehicle normally used for agricultural purposes, e.g. tractor, combined harvester etc.
     * 
     */
    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),

    /**
     * Vehicle of any type.
     * 
     */
    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),

    /**
     * Articulated vehicle.
     * 
     */
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),

    /**
     * Bicycle.
     * 
     */
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),

    /**
     * Bus.
     * 
     */
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Car.
     * 
     */
    @XmlEnumValue("car")
    CAR("car"),

    /**
     * Caravan.
     * 
     */
    @XmlEnumValue("caravan")
    CARAVAN("caravan"),

    /**
     * Car or light vehicle.
     * 
     */
    @XmlEnumValue("carOrLightVehicle")
    CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),

    /**
     * Car towing a caravan.
     * 
     */
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),

    /**
     * Car towing a trailer.
     * 
     */
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),

    /**
     * Vehicle normally used for construction or maintenance purposes, e.g. digger, excavator, bulldozer, lorry mounted crane etc.
     * 
     */
    @XmlEnumValue("constructionOrMaintenanceVehicle")
    CONSTRUCTION_OR_MAINTENANCE_VEHICLE("constructionOrMaintenanceVehicle"),

    /**
     * Four wheel drive vehicle.
     * 
     */
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),

    /**
     * High sided vehicle.
     * 
     */
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),

    /**
     * Lorry of any type.
     * 
     */
    @XmlEnumValue("lorry")
    LORRY("lorry"),

    /**
     * Moped (a two wheeled motor vehicle characterized by a small engine typically less than 50cc and by normally having pedals).
     * 
     */
    @XmlEnumValue("moped")
    MOPED("moped"),

    /**
     * Motorcycle.
     * 
     */
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),

    /**
     * Three wheeled vehicle comprising a motorcycle with an attached side car.
     * 
     */
    @XmlEnumValue("motorcycleWithSideCar")
    MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),

    /**
     * Motorscooter (a two wheeled motor vehicle characterized by a step-through frame and small diameter wheels).
     * 
     */
    @XmlEnumValue("motorscooter")
    MOTORSCOOTER("motorscooter"),

    /**
     * Vehicle with large tank for carrying bulk liquids.
     * 
     */
    @XmlEnumValue("tanker")
    TANKER("tanker"),

    /**
     * Three wheeled vehicle of unspecified type.
     * 
     */
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),

    /**
     * Trailer.
     * 
     */
    @XmlEnumValue("trailer")
    TRAILER("trailer"),

    /**
     * Tram.
     * 
     */
    @XmlEnumValue("tram")
    TRAM("tram"),

    /**
     * Two wheeled vehicle of unspecified type.
     * 
     */
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),

    /**
     * Van.
     * 
     */
    @XmlEnumValue("van")
    VAN("van"),

    /**
     * Vehicle with catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),

    /**
     * Vehicle without catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),

    /**
     * Vehicle (of unspecified type) towing a caravan.
     * 
     */
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),

    /**
     * Vehicle (of unspecified type) towing a trailer.
     * 
     */
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),

    /**
     * Vehicle with even numbered registration plate.
     * 
     */
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),

    /**
     * Vehicle with odd numbered registration plate.
     * 
     */
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTypeEnum fromValue(String v) {
        for (VehicleTypeEnum c: VehicleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
