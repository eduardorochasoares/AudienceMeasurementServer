/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

/**
 *
 * @author Principal
 */

public class HighLevelError {
    
    private HighLevelErrorCode highLevelErrorCode;
    private String rootElement;

    /**
     * @return the highLevelErrorCode
     */
    public HighLevelErrorCode getHighLevelErrorCode() {
        return highLevelErrorCode;
    }

    /**
     * @param highLevelErrorCode the highLevelErrorCode to set
     */
    public void setHighLevelErrorCode(HighLevelErrorCode highLevelErrorCode) {
        this.highLevelErrorCode = highLevelErrorCode;
    }

    /**
     * @return the rootElement
     */
    public String getRootElement() {
        return rootElement;
    }

    /**
     * @param rootElement the rootElement to set
     */
    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }
}
