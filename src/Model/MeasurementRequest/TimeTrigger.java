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
public class TimeTrigger {
    private List<SampleSetTimeTrigger> sampleSet = new ArrayList<>();
    private int periodicity;
    private PriorityTimeTrigger priorityTimeTrigger;
    private NothingNewReportMode nothingNewReportMode;

    /**
     * @return the sampleSet
     */
    public List<SampleSetTimeTrigger> getSampleSet() {
        return sampleSet;
    }

    /**
     * @param sampleSet the sampleSet to set
     */
    public void setSampleSet(List<SampleSetTimeTrigger> sampleSet) {
        this.sampleSet = sampleSet;
    }

    /**
     * @return the periodicity
     */
    public int getPeriodicity() {
        return periodicity;
    }

    /**
     * @param periodicity the periodicity to set
     */
    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    /**
     * @return the priorityTimeTrigger
     */
    public PriorityTimeTrigger getPriorityTimeTrigger() {
        return priorityTimeTrigger;
    }

    /**
     * @param priorityTimeTrigger the priorityTimeTrigger to set
     */
    public void setPriorityTimeTrigger(PriorityTimeTrigger priorityTimeTrigger) {
        this.priorityTimeTrigger = priorityTimeTrigger;
    }

    /**
     * @return the nothingNewReportMode
     */
    public NothingNewReportMode getNothingNewReportMode() {
        return nothingNewReportMode;
    }

    /**
     * @param nothingNewReportMode the nothingNewReportMode to set
     */
    public void setNothingNewReportMode(NothingNewReportMode nothingNewReportMode) {
        this.nothingNewReportMode = nothingNewReportMode;
    }
}
