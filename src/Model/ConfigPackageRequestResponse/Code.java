/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ConfigPackageRequestResponse;

/**
 *
 * @author Principal
 */
public enum Code {
    NoAmRequired(1), NoConfPackageChange(2), ConfPackagePresent(3);
    private final int code;

     Code(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    
    
    
}
