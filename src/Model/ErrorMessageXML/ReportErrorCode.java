/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ReportErrorCode {
    private ErrorCodeValue errorCodeValue;
    private List<String> errorElement = new ArrayList<>();
    private List<Integer> measurementRequestID;

    /**
     * @return the errorCodeValue
     */
    public ErrorCodeValue getErrorCodeValue() {
        return errorCodeValue;
    }

    /**
     * @param errorCodeValue the errorCodeValue to set
     */
    public void setErrorCodeValue(ErrorCodeValue errorCodeValue) {
        this.errorCodeValue = errorCodeValue;
    }

    /**
     * @return the errorElement
     */
    public List<String> getErrorElement() {
        return errorElement;
    }

    /**
     * @param errorElement the errorElement to set
     */
    public void setErrorElement(List<String> errorElement) {
        this.errorElement = errorElement;
    }

    /**
     * @return the measurementRequestID
     */
    public List<Integer> getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(List<Integer> measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }
}
