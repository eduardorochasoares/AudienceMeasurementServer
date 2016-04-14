/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

import java.sql.Timestamp;

/**
 *
 * @author Principal
 */
public class DeliveryWindowDelayed {
    private Timestamp StartDeliveryWindowTime;
    private Timestamp EndDeliveryWindowTime;

    /**
     * @return the StartDeliveryWindowTime
     */
    public Timestamp getStartDeliveryWindowTime() {
        return StartDeliveryWindowTime;
    }

    /**
     * @param StartDeliveryWindowTime the StartDeliveryWindowTime to set
     */
    public void setStartDeliveryWindowTime(Timestamp StartDeliveryWindowTime) {
        this.StartDeliveryWindowTime = StartDeliveryWindowTime;
    }

    /**
     * @return the EndDeliveryWindowTime
     */
    public Timestamp getEndDeliveryWindowTime() {
        return EndDeliveryWindowTime;
    }

    /**
     * @param EndDeliveryWindowTime the EndDeliveryWindowTime to set
     */
    public void setEndDeliveryWindowTime(Timestamp EndDeliveryWindowTime) {
        this.EndDeliveryWindowTime = EndDeliveryWindowTime;
    }
}
