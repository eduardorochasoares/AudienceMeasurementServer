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
public class ReportRequestErrorCode {
   private ReportRequestErrorCodeValue reportRequestErrorCodeValue;
   private List<String> ErrorElement;
   private List<Integer> MeasurementRequestID;
    public ReportRequestErrorCode() {
        ErrorElement = new ArrayList<>();
        MeasurementRequestID = new ArrayList<>();
    }

    /**
     * @return the reportRequestErrorCodeValue
     */
    public ReportRequestErrorCodeValue getReportRequestErrorCodeValue() {
        return reportRequestErrorCodeValue;
    }

    /**
     * @param reportRequestErrorCodeValue the reportRequestErrorCodeValue to set
     */
    public void setReportRequestErrorCodeValue(ReportRequestErrorCodeValue reportRequestErrorCodeValue) {
        this.reportRequestErrorCodeValue = reportRequestErrorCodeValue;
    }

    /**
     * @return the ErrorElement
     */
    public List<String> getErrorElement() {
        return ErrorElement;
    }

    /**
     * @param ErrorElement the ErrorElement to set
     */
    public void setErrorElement(List<String> ErrorElement) {
        this.ErrorElement = ErrorElement;
    }

    /**
     * @return the MeasurementRequestID
     */
    public List<Integer> getMeasurementRequestID() {
        return MeasurementRequestID;
    }

    /**
     * @param MeasurementRequestID the MeasurementRequestID to set
     */
    public void setMeasurementRequestID(List<Integer> MeasurementRequestID) {
        this.MeasurementRequestID = MeasurementRequestID;
    }
   
   
}
