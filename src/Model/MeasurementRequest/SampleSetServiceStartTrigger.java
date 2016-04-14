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
public class SampleSetServiceStartTrigger {
    private SampleSetIdentifierServiceStart sampleSetIdentifierServiceStart;
    private List<SampleSetQualifierServiceStart> sampleSetQualifierServiceStart = new ArrayList<>();

    /**
     * @return the sampleSetIdentifierServiceStart
     */
    public SampleSetIdentifierServiceStart getSampleSetIdentifierServiceStart() {
        return sampleSetIdentifierServiceStart;
    }

    /**
     * @param sampleSetIdentifierServiceStart the sampleSetIdentifierServiceStart to set
     */
    public void setSampleSetIdentifierServiceStart(SampleSetIdentifierServiceStart sampleSetIdentifierServiceStart) {
        this.sampleSetIdentifierServiceStart = sampleSetIdentifierServiceStart;
    }

    /**
     * @return the sampleSetQualifierServiceStart
     */
    public List<SampleSetQualifierServiceStart> getSampleSetQualifierServiceStart() {
        return sampleSetQualifierServiceStart;
    }

    /**
     * @param sampleSetQualifierServiceStart the sampleSetQualifierServiceStart to set
     */
    public void setSampleSetQualifierServiceStart(List<SampleSetQualifierServiceStart> sampleSetQualifierServiceStart) {
        this.sampleSetQualifierServiceStart = sampleSetQualifierServiceStart;
    }

}