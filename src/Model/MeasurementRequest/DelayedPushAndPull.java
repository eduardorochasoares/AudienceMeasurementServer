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
public class DelayedPushAndPull {
    private List<DeliveryWindowDelayedPushAndPull> deliveryWindowDelayedPushAndPull = new ArrayList<>();

    /**
     * @return the deliveryWindowDelayedPushAndPull
     */
    public List<DeliveryWindowDelayedPushAndPull> getDeliveryWindowDelayedPushAndPull() {
        return deliveryWindowDelayedPushAndPull;
    }

    /**
     * @param deliveryWindowDelayedPushAndPull the deliveryWindowDelayedPushAndPull to set
     */
    public void setDeliveryWindowDelayedPushAndPull(List<DeliveryWindowDelayedPushAndPull> deliveryWindowDelayedPushAndPull) {
        this.deliveryWindowDelayedPushAndPull = deliveryWindowDelayedPushAndPull;
    }
    
}
