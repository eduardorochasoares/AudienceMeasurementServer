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
public class MeasurementDeliverySchedule {

    private List<String> deliveryAddres = new ArrayList<>();
    private int retransmitNumber;
    private StorageCongestionPolicy storageCongestionPolicy;
    private ImmediatePush imeImmediatePush;
    private DelayedDelivery delayedDelivery;
    private boolean pull;
    private DelayedPushAndPull delayedPushAndPull;
    /**
     * @return the deliveryAddres
     */
    public List<String> getDeliveryAddres() {
        return deliveryAddres;
    }

    /**
     * @param deliveryAddres the deliveryAddres to set
     */
    public void setDeliveryAddres(List<String> deliveryAddres) {
        this.deliveryAddres = deliveryAddres;
    }

    /**
     * @return the retransmitNumber
     */
    public int getRetransmitNumber() {
        return retransmitNumber;
    }

    /**
     * @param retransmitNumber the retransmitNumber to set
     */
    public void setRetransmitNumber(int retransmitNumber) {
        this.retransmitNumber = retransmitNumber;
    }

    /**
     * @return the storageCongestionPolicy
     */
    public StorageCongestionPolicy getStorageCongestionPolicy() {
        return storageCongestionPolicy;
    }

    /**
     * @param storageCongestionPolicy the storageCongestionPolicy to set
     */
    public void setStorageCongestionPolicy(StorageCongestionPolicy storageCongestionPolicy) {
        this.storageCongestionPolicy = storageCongestionPolicy;
    }

    /**
     * @return the imeImmediatePush
     */
    public ImmediatePush getImeImmediatePush() {
        return imeImmediatePush;
    }

    /**
     * @param imeImmediatePush the imeImmediatePush to set
     */
    public void setImeImmediatePush(ImmediatePush imeImmediatePush) {
        this.imeImmediatePush = imeImmediatePush;
    }

    /**
     * @return the delayedDelivery
     */
    public DelayedDelivery getDelayedDelivery() {
        return delayedDelivery;
    }

    /**
     * @param delayedDelivery the delayedDelivery to set
     */
    public void setDelayedDelivery(DelayedDelivery delayedDelivery) {
        this.delayedDelivery = delayedDelivery;
    }

    /**
     * @return the pull
     */
    public boolean isPull() {
        return pull;
    }

    /**
     * @param pull the pull to set
     */
    public void setPull(boolean pull) {
        this.pull = pull;
    }

    /**
     * @return the delayedPushAndPull
     */
    public DelayedPushAndPull getDelayedPushAndPull() {
        return delayedPushAndPull;
    }

    /**
     * @param delayedPushAndPull the delayedPushAndPull to set
     */
    public void setDelayedPushAndPull(DelayedPushAndPull delayedPushAndPull) {
        this.delayedPushAndPull = delayedPushAndPull;
    }

   
}
