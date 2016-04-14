/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import java.util.List;

/**
 *
 * @author Principal
 */
public class ConfigRequestErrorCode {
    private ConfigRequestErrorCodeValue configRequestErrorCodeValue;
    private List<String> ErrorElement;

    /**
     * @return the configRequestErrorCodeValue
     */
    public ConfigRequestErrorCodeValue getConfigRequestErrorCodeValue() {
        return configRequestErrorCodeValue;
    }

    /**
     * @param configRequestErrorCodeValue the configRequestErrorCodeValue to set
     */
    public void setConfigRequestErrorCodeValue(ConfigRequestErrorCodeValue configRequestErrorCodeValue) {
        this.configRequestErrorCodeValue = configRequestErrorCodeValue;
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
}
