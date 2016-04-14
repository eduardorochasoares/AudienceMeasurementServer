/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ConfigRequestError {

    private List<ConfigRequestErrorInfo> configRequestErrorInfo = new ArrayList<>();

    /**
     * @return the configRequestErrorInfo
     */
    public List<ConfigRequestErrorInfo> getConfigRequestErrorInfo() {
        return configRequestErrorInfo;
    }

    /**
     * @param configRequestErrorInfo the configRequestErrorInfo to set
     */
    public void setConfigRequestErrorInfo(List<ConfigRequestErrorInfo> configRequestErrorInfo) {
        this.configRequestErrorInfo = configRequestErrorInfo;
    }
}
