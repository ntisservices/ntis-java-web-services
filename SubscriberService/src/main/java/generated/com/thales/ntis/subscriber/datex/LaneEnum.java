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
 * <p>Java class for LaneEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LaneEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allLanesCompleteCarriageway"/>
 *     &lt;enumeration value="busLane"/>
 *     &lt;enumeration value="busStop"/>
 *     &lt;enumeration value="carPoolLane"/>
 *     &lt;enumeration value="centralReservation"/>
 *     &lt;enumeration value="crawlerLane"/>
 *     &lt;enumeration value="emergencyLane"/>
 *     &lt;enumeration value="escapeLane"/>
 *     &lt;enumeration value="expressLane"/>
 *     &lt;enumeration value="hardShoulder"/>
 *     &lt;enumeration value="heavyVehicleLane"/>
 *     &lt;enumeration value="lane1"/>
 *     &lt;enumeration value="lane2"/>
 *     &lt;enumeration value="lane3"/>
 *     &lt;enumeration value="lane4"/>
 *     &lt;enumeration value="lane5"/>
 *     &lt;enumeration value="lane6"/>
 *     &lt;enumeration value="lane7"/>
 *     &lt;enumeration value="lane8"/>
 *     &lt;enumeration value="lane9"/>
 *     &lt;enumeration value="layBy"/>
 *     &lt;enumeration value="leftHandTurningLane"/>
 *     &lt;enumeration value="leftLane"/>
 *     &lt;enumeration value="localTrafficLane"/>
 *     &lt;enumeration value="middleLane"/>
 *     &lt;enumeration value="opposingLanes"/>
 *     &lt;enumeration value="overtakingLane"/>
 *     &lt;enumeration value="rightHandTurningLane"/>
 *     &lt;enumeration value="rightLane"/>
 *     &lt;enumeration value="rushHourLane"/>
 *     &lt;enumeration value="setDownArea"/>
 *     &lt;enumeration value="slowVehicleLane"/>
 *     &lt;enumeration value="throughTrafficLane"/>
 *     &lt;enumeration value="tidalFlowLane"/>
 *     &lt;enumeration value="turningLane"/>
 *     &lt;enumeration value="verge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaneEnum")
@XmlEnum
public enum LaneEnum {


    /**
     * In all lanes of the carriageway.
     * 
     */
    @XmlEnumValue("allLanesCompleteCarriageway")
    ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),

    /**
     * In the bus lane.
     * 
     */
    @XmlEnumValue("busLane")
    BUS_LANE("busLane"),

    /**
     * In the bus stop lane.
     * 
     */
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),

    /**
     * In the carpool lane.
     * 
     */
    @XmlEnumValue("carPoolLane")
    CAR_POOL_LANE("carPoolLane"),

    /**
     * On the central median separating the two directional carriageways of the highway.
     * 
     */
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),

    /**
     * In the crawler lane.
     * 
     */
    @XmlEnumValue("crawlerLane")
    CRAWLER_LANE("crawlerLane"),

    /**
     * In the emergency lane.
     * 
     */
    @XmlEnumValue("emergencyLane")
    EMERGENCY_LANE("emergencyLane"),

    /**
     * In the escape lane.
     * 
     */
    @XmlEnumValue("escapeLane")
    ESCAPE_LANE("escapeLane"),

    /**
     * In the express lane.
     * 
     */
    @XmlEnumValue("expressLane")
    EXPRESS_LANE("expressLane"),

    /**
     * On the hard shoulder.
     * 
     */
    @XmlEnumValue("hardShoulder")
    HARD_SHOULDER("hardShoulder"),

    /**
     * In the heavy vehicle lane.
     * 
     */
    @XmlEnumValue("heavyVehicleLane")
    HEAVY_VEHICLE_LANE("heavyVehicleLane"),

    /**
     * In the first lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane1")
    LANE_1("lane1"),

    /**
     * In the second lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane2")
    LANE_2("lane2"),

    /**
     * In the third lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane3")
    LANE_3("lane3"),

    /**
     * In the fourth lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane4")
    LANE_4("lane4"),

    /**
     * In the fifth lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane5")
    LANE_5("lane5"),

    /**
     * In the sixth lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane6")
    LANE_6("lane6"),

    /**
     * In the seventh lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane7")
    LANE_7("lane7"),

    /**
     * In the eighth lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane8")
    LANE_8("lane8"),

    /**
     * In the ninth lane numbered from nearest the hard shoulder to central median.
     * 
     */
    @XmlEnumValue("lane9")
    LANE_9("lane9"),

    /**
     * In a lay-by.
     * 
     */
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),

    /**
     * In the left hand turning lane.
     * 
     */
    @XmlEnumValue("leftHandTurningLane")
    LEFT_HAND_TURNING_LANE("leftHandTurningLane"),

    /**
     * In the left lane.
     * 
     */
    @XmlEnumValue("leftLane")
    LEFT_LANE("leftLane"),

    /**
     * In the local traffic lane.
     * 
     */
    @XmlEnumValue("localTrafficLane")
    LOCAL_TRAFFIC_LANE("localTrafficLane"),

    /**
     * In the middle lane.
     * 
     */
    @XmlEnumValue("middleLane")
    MIDDLE_LANE("middleLane"),

    /**
     * In the opposing lanes.
     * 
     */
    @XmlEnumValue("opposingLanes")
    OPPOSING_LANES("opposingLanes"),

    /**
     * In the overtaking lane.
     * 
     */
    @XmlEnumValue("overtakingLane")
    OVERTAKING_LANE("overtakingLane"),

    /**
     * In the right hand turning lane.
     * 
     */
    @XmlEnumValue("rightHandTurningLane")
    RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),

    /**
     * In the right lane.
     * 
     */
    @XmlEnumValue("rightLane")
    RIGHT_LANE("rightLane"),

    /**
     * In the lane dedicated for use during the rush (peak) hour.
     * 
     */
    @XmlEnumValue("rushHourLane")
    RUSH_HOUR_LANE("rushHourLane"),

    /**
     * In the area/lane reserved for passenger pick-up or set-down.
     * 
     */
    @XmlEnumValue("setDownArea")
    SET_DOWN_AREA("setDownArea"),

    /**
     * In the slow vehicle lane.
     * 
     */
    @XmlEnumValue("slowVehicleLane")
    SLOW_VEHICLE_LANE("slowVehicleLane"),

    /**
     * In the through traffic lane.
     * 
     */
    @XmlEnumValue("throughTrafficLane")
    THROUGH_TRAFFIC_LANE("throughTrafficLane"),

    /**
     * In the lane dedicated for use as a tidal flow lane.
     * 
     */
    @XmlEnumValue("tidalFlowLane")
    TIDAL_FLOW_LANE("tidalFlowLane"),

    /**
     * In the turning lane.
     * 
     */
    @XmlEnumValue("turningLane")
    TURNING_LANE("turningLane"),

    /**
     * On the verge.
     * 
     */
    @XmlEnumValue("verge")
    VERGE("verge");
    private final String value;

    LaneEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneEnum fromValue(String v) {
        for (LaneEnum c: LaneEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
