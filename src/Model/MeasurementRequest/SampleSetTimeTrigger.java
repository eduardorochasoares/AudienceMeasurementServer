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
public class SampleSetTimeTrigger {
    private SampleSetIdentifierTimeTrigger sampleSetIdentifier;
    private List<SampleSetQualifierTimeTrigger> sampleSetQualifierTimeTrigger = new ArrayList<>();

    /**
     * @return the sampleSetIdentifier
     */
    public SampleSetIdentifierTimeTrigger getSampleSetIdentifier() {
        return sampleSetIdentifier;
    }

    /**
     * @param sampleSetIdentifier the sampleSetIdentifier to set
     */
    public void setSampleSetIdentifier(SampleSetIdentifierTimeTrigger sampleSetIdentifier) {
        this.sampleSetIdentifier = sampleSetIdentifier;
    }

    /**
     * @return the sampleSetQualifierTimeTrigger
     */
    public List<SampleSetQualifierTimeTrigger> getSampleSetQualifierTimeTrigger() {
        return sampleSetQualifierTimeTrigger;
    }

    /**
     * @param sampleSetQualifierTimeTrigger the sampleSetQualifierTimeTrigger to set
     */
    public void setSampleSetQualifierTimeTrigger(List<SampleSetQualifierTimeTrigger> sampleSetQualifierTimeTrigger) {
        this.sampleSetQualifierTimeTrigger = sampleSetQualifierTimeTrigger;
    }

    
}
