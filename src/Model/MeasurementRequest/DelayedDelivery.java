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
public class DelayedDelivery {
    private List<DeliveryWindowDelayed> deliveryWindow = new ArrayList<>();

    /**
     * @return the deliveryWindow
     */
    public List<DeliveryWindowDelayed> getDeliveryWindow() {
        return deliveryWindow;
    }

    /**
     * @param deliveryWindow the deliveryWindow to set
     */
    public void setDeliveryWindow(List<DeliveryWindowDelayed> deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }
}
