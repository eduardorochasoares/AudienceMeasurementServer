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
public class ContentClassDomain {
   private String contentClassDomainValue;
   private List contentclassID = new ArrayList<>();

    /**
     * @return the contentClassDomainValue
     */
    public String getContentClassDomainValue() {
        return contentClassDomainValue;
    }

    /**
     * @param contentClassDomainValue the contentClassDomainValue to set
     */
    public void setContentClassDomainValue(String contentClassDomainValue) {
        this.contentClassDomainValue = contentClassDomainValue;
    }

    /**
     * @return the contentclassID
     */
    public List<String> getContentclassID() {
        return contentclassID;
    }

    /**
     * @param contentclassID the contentclassID to set
     */
    public void setContentclassID(List<String> contentclassID) {
        this.contentclassID = contentclassID;
    }
}
