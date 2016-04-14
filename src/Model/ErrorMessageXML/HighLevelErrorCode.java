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
public enum HighLevelErrorCode {
    SyntaxError(0), SchemaError(1),VersionError(2);
    private final int code;
    
    HighLevelErrorCode(int code){
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

  
    
}
