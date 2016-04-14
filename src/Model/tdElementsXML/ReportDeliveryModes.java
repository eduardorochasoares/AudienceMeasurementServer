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
public class ReportDeliveryModes {
    private ArrayList<String> DeliveryMode = new ArrayList<>();

    /**
     * @return the DeliveryMode
     */
    public ArrayList<String> getDeliveryMode() {
        return DeliveryMode;
    }

    /**
     * @param DeliveryMode the DeliveryMode to set
     */
    public void setDeliveryMode(ArrayList<String> DeliveryMode) {
        this.DeliveryMode = DeliveryMode;
    }
}
