/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ReportRequestError {
    private List<ReportRequestErrorInfo> reportRequestErrorInfo = new ArrayList<ReportRequestErrorInfo>();

    /**
     * @return the reportRequestErrorInfo
     */
    public List<ReportRequestErrorInfo> getReportRequestErrorInfo() {
        return reportRequestErrorInfo;
    }

    /**
     * @param reportRequestErrorInfo the reportRequestErrorInfo to set
     */
    public void setReportRequestErrorInfo(List<ReportRequestErrorInfo> reportRequestErrorInfo) {
        this.reportRequestErrorInfo = reportRequestErrorInfo;
    }

  
}
