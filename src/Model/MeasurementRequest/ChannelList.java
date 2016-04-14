/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ChannelList {
    private List<String> serviceIdentifier = new ArrayList<>(); 

    /**
     * @return the serviceIdentifier
     */
    public List<String> getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * @param serviceIdentifier the serviceIdentifier to set
     */
    public void setServiceIdentifier(List<String> serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }
}
