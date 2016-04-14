/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

/**
 *
 * @author Principal
 */
public enum SampleSetQualifierServiceStart {
    a("a"), b("b"), c("c"), d("c");
    private final String qualifier;

    private SampleSetQualifierServiceStart(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * @return the qualifier
     */
    public String getQualifier() {
        return qualifier;
    }
    
}
