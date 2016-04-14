/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementTriggerMethod {

    private ArrayList<String> EventTrigger = new ArrayList<>();
    private ArrayList<String> TimeSampleTrigger = new ArrayList<>();

    private ArrayList<String> ServiceStartTrigger = new ArrayList<>();


    /**
     * @return the EventTrigger
     */
    public ArrayList<String> getEventTrigger() {
        return EventTrigger;
    }

    /**
     * @param EventTrigger the EventTrigger to set
     */
    public void setEventTrigger(ArrayList<String> EventTrigger) {
        this.EventTrigger = EventTrigger;
    }

    /**
     * @return the TimeSampleTrigger
     */
    public ArrayList<String> getTimeSampleTrigger() {
        return TimeSampleTrigger;
    }

    /**
     * @param TimeSampleTrigger the TimeSampleTrigger to set
     */
    public void setTimeSampleTrigger(ArrayList<String> TimeSampleTrigger) {
        this.TimeSampleTrigger = TimeSampleTrigger;
    }

    /**
     * @return the ServiceStartTrigger
     */
    public ArrayList<String> getServiceStartTrigger() {
        return ServiceStartTrigger;
    }

    /**
     * @param ServiceStartTrigger the ServiceStartTrigger to set
     */
    public void setServiceStartTrigger(ArrayList<String> ServiceStartTrigger) {
        this.ServiceStartTrigger = ServiceStartTrigger;
    }

}
