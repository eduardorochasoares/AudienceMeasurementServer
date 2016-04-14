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
public class ReportError {
   private List<ReportErrorInfo> reportErrorInfo =  new ArrayList<>();

    /**
     * @return the reportErrorInfo
     */
    public List<ReportErrorInfo> getReportErrorInfo() {
        return reportErrorInfo;
    }

    /**
     * @param reportErrorInfo the reportErrorInfo to set
     */
    public void setReportErrorInfo(List<ReportErrorInfo> reportErrorInfo) {
        this.reportErrorInfo = reportErrorInfo;
    }
}
