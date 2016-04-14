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
public enum ErrorCodeValue {
    ElementNotSuported(1), ElementInformationNotAvaliable(2), ElementNotPermited(3), EventNotSuported(4);
    private int code;
    
    ErrorCodeValue(int code){
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
}
