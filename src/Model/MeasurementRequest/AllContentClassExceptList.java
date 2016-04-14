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
public class AllContentClassExceptList {

    private List<ContentClassDomain> contentClassDomain = new ArrayList<>();

    /**
     * @return the contentClassDomain
     */
    public List<ContentClassDomain> getContentClassDomain() {
        return contentClassDomain;
    }

    /**
     * @param contentClassDomain the contentClassDomain to set
     */
    public void setContentClassDomain(List<ContentClassDomain> contentClassDomain) {
        this.contentClassDomain = contentClassDomain;
    }

}
