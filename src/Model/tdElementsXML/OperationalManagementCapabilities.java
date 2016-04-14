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
public class OperationalManagementCapabilities {
    private ArrayList<String> OperationalManagement = new ArrayList<>();

    /**
     * @return the OperationalManagement
     */
    public ArrayList<String> getOperationalManagement() {
        return OperationalManagement;
    }

    /**
     * @param OperationalManagement the OperationalManagement to set
     */
    public void setOperationalManagement(ArrayList<String> OperationalManagement) {
        this.OperationalManagement = OperationalManagement;
    }
}
