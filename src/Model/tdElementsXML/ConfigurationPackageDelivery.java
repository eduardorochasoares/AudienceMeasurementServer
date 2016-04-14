/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ConfigurationPackageDelivery {
    private ArrayList<String> ConfigurationMode = new ArrayList<>();

    /**
     * @return the ConfigurationMode
     */
    public ArrayList<String> getConfigurationMode() {
        return ConfigurationMode;
    }

    /**
     * @param ConfigurationMode the ConfigurationMode to set
     */
    public void setConfigurationMode(ArrayList<String> ConfigurationMode) {
        this.ConfigurationMode = ConfigurationMode;
    }
}
