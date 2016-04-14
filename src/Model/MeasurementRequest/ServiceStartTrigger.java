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
public class ServiceStartTrigger {
    private int interval;
    private List<SampleSetServiceStartTrigger> sampleset = new ArrayList<>();
    private PriorityServiceStart priorityServiceStart;

    /**
     * @return the interval
     */
    public int getInterval() {
        return interval;
    }

    /**
     * @param interval the interval to set
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * @return the sampleset
     */
    public List<SampleSetServiceStartTrigger> getSampleset() {
        return sampleset;
    }

    /**
     * @param sampleset the sampleset to set
     */
    public void setSampleset(List<SampleSetServiceStartTrigger> sampleset) {
        this.sampleset = sampleset;
    }

    /**
     * @return the priorityServiceStart
     */
    public PriorityServiceStart getPriorityServiceStart() {
        return priorityServiceStart;
    }

    /**
     * @param priorityServiceStart the priorityServiceStart to set
     */
    public void setPriorityServiceStart(PriorityServiceStart priorityServiceStart) {
        this.priorityServiceStart = priorityServiceStart;
    }
}
