/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementSchedule {
    private List<MeasurementPeriod> measurementPeriod = new ArrayList<>();
    private List<EventTrigger> eventTrigger = new ArrayList<>();
    private TimeTrigger timeTrigger;
    private ServiceStartTrigger serviceStartTrigger;
    /**
     * @return the measurementPeriod
     */
    public List<MeasurementPeriod> getMeasurementPeriod() {
        return measurementPeriod;
    }

    /**
     * @param measurementPeriod the measurementPeriod to set
     */
    public void setMeasurementPeriod(List<MeasurementPeriod> measurementPeriod) {
        this.measurementPeriod = measurementPeriod;
    }

    /**
     * @return the eventTrigger
     */
    public List<EventTrigger> getEventTrigger() {
        return eventTrigger;
    }

    /**
     * @param eventTrigger the eventTrigger to set
     */
    public void setEventTrigger(List<EventTrigger> eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    /**
     * @return the timeTrigger
     */
    public TimeTrigger getTimeTrigger() {
        return timeTrigger;
    }

    /**
     * @param timeTrigger the timeTrigger to set
     */
    public void setTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
    }

    /**
     * @return the serviceStartTrigger
     */
    public ServiceStartTrigger getServiceStartTrigger() {
        return serviceStartTrigger;
    }

    /**
     * @param serviceStartTrigger the serviceStartTrigger to set
     */
    public void setServiceStartTrigger(ServiceStartTrigger serviceStartTrigger) {
        this.serviceStartTrigger = serviceStartTrigger;
    }
}
