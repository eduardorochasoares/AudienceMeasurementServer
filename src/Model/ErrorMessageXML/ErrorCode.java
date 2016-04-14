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
public class ErrorCode {

    private ErrorCodeValue errorCodeValue;
    private List<String> ErrorElement;
    private List<ErrorEvent> ErrorEvent;

    public ErrorCode() {
        ErrorElement = new ArrayList<>();
        ErrorElement = new ArrayList<>();
    }

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
     * @return the ErrorEvent
     */
    public List<ErrorEvent> getErrorEvent() {
        return ErrorEvent;
    }

    /**
     * @param ErrorEvent the ErrorEvent to set
     */
    public void setErrorEvent(List<ErrorEvent> ErrorEvent) {
        this.ErrorEvent = ErrorEvent;
    }

}
