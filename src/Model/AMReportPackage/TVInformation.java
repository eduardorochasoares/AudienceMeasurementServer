/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

/**
 *
 * @author Principal
 */
public class TVInformation {
    private String tvManuf;
    private String tVModel;
    private String tVSerialNum;

    /**
     * @return the tvManuf
     */
    public String getTvManuf() {
        return tvManuf;
    }

    /**
     * @param tvManuf the tvManuf to set
     */
    public void setTvManuf(String tvManuf) {
        this.tvManuf = tvManuf;
    }

    /**
     * @return the tVModel
     */
    public String gettVModel() {
        return tVModel;
    }

    /**
     * @param tVModel the tVModel to set
     */
    public void settVModel(String tVModel) {
        this.tVModel = tVModel;
    }

    /**
     * @return the tVSerialNum
     */
    public String gettVSerialNum() {
        return tVSerialNum;
    }

    /**
     * @param tVSerialNum the tVSerialNum to set
     */
    public void settVSerialNum(String tVSerialNum) {
        this.tVSerialNum = tVSerialNum;
    }
}
