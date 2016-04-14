/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

/**
 *
 * @author Principal
 */
public class ImmediatePush {
    private int measurementReportNumberByPush;
    private int maxTimeBetweenDelivery;
    /**
     * @return the measurementReportNumberByPush
     */
    public int getMeasurementReportNumberByPush() {
        return measurementReportNumberByPush;
    }

    /**
     * @param measurementReportNumberByPush the measurementReportNumberByPush to set
     */
    public void setMeasurementReportNumberByPush(int measurementReportNumberByPush) {
        this.measurementReportNumberByPush = measurementReportNumberByPush;
    }

    /**
     * @return the maxTimeBetweenDelivery
     */
    public int getMaxTimeBetweenDelivery() {
        return maxTimeBetweenDelivery;
    }

    /**
     * @param maxTimeBetweenDelivery the maxTimeBetweenDelivery to set
     */
    public void setMaxTimeBetweenDelivery(int maxTimeBetweenDelivery) {
        this.maxTimeBetweenDelivery = maxTimeBetweenDelivery;
    }
}
