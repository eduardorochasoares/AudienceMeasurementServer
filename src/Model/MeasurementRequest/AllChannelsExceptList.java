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
public class AllChannelsExceptList {
    private List<String> ServiceIdentifier = new ArrayList<>();

    /**
     * @return the ServiceIdentifier
     */
    public List<String> getServiceIdentifier() {
        return ServiceIdentifier;
    }

    /**
     * @param ServiceIdentifier the ServiceIdentifier to set
     */
    public void setServiceIdentifier(List<String> ServiceIdentifier) {
        this.ServiceIdentifier = ServiceIdentifier;
    }
}
