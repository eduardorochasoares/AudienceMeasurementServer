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
public class ReportRequestErrorInfo {
    
   private ReportRequestErrorCode reportRequestErrorCode;

    /**
     * @return the reportRequestErrorCode
     */
    public ReportRequestErrorCode getReportRequestErrorCode() {
        return reportRequestErrorCode;
    }

    /**
     * @param reportRequestErrorCode the reportRequestErrorCode to set
     */
    public void setReportRequestErrorCode(ReportRequestErrorCode reportRequestErrorCode) {
        this.reportRequestErrorCode = reportRequestErrorCode;
    }
}
