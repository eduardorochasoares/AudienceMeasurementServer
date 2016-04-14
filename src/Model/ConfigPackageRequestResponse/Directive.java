/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ConfigPackageRequestResponse;

import Model.AMFConfigPackage.AMFConfigPackage;

/**
 *
 * @author Principal
 */
public class Directive {
    private Code code;
    private AMFConfigPackage aMFConfigPackage;

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @return the aMFConfigPackage
     */
    public AMFConfigPackage getaMFConfigPackage() {
        return aMFConfigPackage;
    }

    /**
     * @param aMFConfigPackage the aMFConfigPackage to set
     */
    public void setaMFConfigPackage(AMFConfigPackage aMFConfigPackage) {
        this.aMFConfigPackage = aMFConfigPackage;
    }
    
}
