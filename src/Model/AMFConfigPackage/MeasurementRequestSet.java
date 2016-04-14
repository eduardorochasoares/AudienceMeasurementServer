/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import Model.MeasurementRequest.AllContentClassExceptList;
import Model.MeasurementRequest.DayOfTheWeek;
import Model.MeasurementRequest.DeliveryWindowDelayed;
import Model.MeasurementRequest.MeasurementPeriod;
import Model.MeasurementRequest.MeasurementRequest;
import Model.MeasurementRequest.NothingNewReportMode;
import Model.MeasurementRequest.StorageCongestionPolicy;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementRequestSet {

    private AllContentClassExceptList defaultAllContentClassExceptList;
    private List<MeasurementPeriod> defaultMeasurementPeriod = new ArrayList<>();
    private List<DayOfTheWeek> defaultDayOfTheWeek = new ArrayList<>();
    private Timestamp defaultMeasurementStartTime;
    private Timestamp defaultMeasurementEndTime;
    private int periodicity;
    private NothingNewReportMode nothingNewReportMode;
    private int defaultInterval;
    private List<String> defaultDeliveryAddress = new ArrayList<>();
    private int defaultRetransmitNumber;
    private StorageCongestionPolicy defaultStorageCongestionPolicy;
    private int defaultMeasurementReportNumberByPush;
    private int defaultMaxTimeBetweenDelivery;
    private List<DeliveryWindowDelayed> deliveryWindow = new ArrayList<>();
    private String defaultServiceStartPermitBlockedInfo;
    private Timestamp defaultTimeTriggerPermitBlockedInfo;
    private List<MeasurementRequest> measurementRequest = new ArrayList<>();
    private Timestamp defaultStartDeliveryWindowTime;
    private Timestamp defaultEndDeliveryWindowTime;

    /**
     * @return the defaultAllContentClassExceptList
     */
    public AllContentClassExceptList getDefaultAllContentClassExceptList() {
        return defaultAllContentClassExceptList;
    }

    /**
     * @param defaultAllContentClassExceptList the defaultAllContentClassExceptList to set
     */
    public void setDefaultAllContentClassExceptList(AllContentClassExceptList defaultAllContentClassExceptList) {
        this.defaultAllContentClassExceptList = defaultAllContentClassExceptList;
    }

    /**
     * @return the defaultMeasurementPeriod
     */
    public List<MeasurementPeriod> getDefaultMeasurementPeriod() {
        return defaultMeasurementPeriod;
    }

    /**
     * @param defaultMeasurementPeriod the defaultMeasurementPeriod to set
     */
    public void setDefaultMeasurementPeriod(List<MeasurementPeriod> defaultMeasurementPeriod) {
        this.defaultMeasurementPeriod = defaultMeasurementPeriod;
    }

    /**
     * @return the defaultDayOfTheWeek
     */
    public List<DayOfTheWeek> getDefaultDayOfTheWeek() {
        return defaultDayOfTheWeek;
    }

    /**
     * @param defaultDayOfTheWeek the defaultDayOfTheWeek to set
     */
    public void setDefaultDayOfTheWeek(List<DayOfTheWeek> defaultDayOfTheWeek) {
        this.defaultDayOfTheWeek = defaultDayOfTheWeek;
    }

    /**
     * @return the defaultMeasurementStartTime
     */
    public Timestamp getDefaultMeasurementStartTime() {
        return defaultMeasurementStartTime;
    }

    /**
     * @param defaultMeasurementStartTime the defaultMeasurementStartTime to set
     */
    public void setDefaultMeasurementStartTime(Timestamp defaultMeasurementStartTime) {
        this.defaultMeasurementStartTime = defaultMeasurementStartTime;
    }

    /**
     * @return the defaultMeasurementEndTime
     */
    public Timestamp getDefaultMeasurementEndTime() {
        return defaultMeasurementEndTime;
    }

    /**
     * @param defaultMeasurementEndTime the defaultMeasurementEndTime to set
     */
    public void setDefaultMeasurementEndTime(Timestamp defaultMeasurementEndTime) {
        this.defaultMeasurementEndTime = defaultMeasurementEndTime;
    }

    /**
     * @return the periodicity
     */
    public int getPeriodicity() {
        return periodicity;
    }

    /**
     * @param periodicity the periodicity to set
     */
    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    /**
     * @return the nothingNewReportMode
     */
    public NothingNewReportMode getNothingNewReportMode() {
        return nothingNewReportMode;
    }

    /**
     * @param nothingNewReportMode the nothingNewReportMode to set
     */
    public void setNothingNewReportMode(NothingNewReportMode nothingNewReportMode) {
        this.nothingNewReportMode = nothingNewReportMode;
    }

    /**
     * @return the defaultInterval
     */
    public int getDefaultInterval() {
        return defaultInterval;
    }

    /**
     * @param defaultInterval the defaultInterval to set
     */
    public void setDefaultInterval(int defaultInterval) {
        this.defaultInterval = defaultInterval;
    }

    /**
     * @return the defaultDeliveryAddress
     */
    public List<String> getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    /**
     * @param defaultDeliveryAddress the defaultDeliveryAddress to set
     */
    public void setDefaultDeliveryAddress(List<String> defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    /**
     * @return the defaultRetransmitNumber
     */
    public int getDefaultRetransmitNumber() {
        return defaultRetransmitNumber;
    }

    /**
     * @param defaultRetransmitNumber the defaultRetransmitNumber to set
     */
    public void setDefaultRetransmitNumber(int defaultRetransmitNumber) {
        this.defaultRetransmitNumber = defaultRetransmitNumber;
    }

    /**
     * @return the defaultStorageCongestionPolicy
     */
    public StorageCongestionPolicy getDefaultStorageCongestionPolicy() {
        return defaultStorageCongestionPolicy;
    }

    /**
     * @param defaultStorageCongestionPolicy the defaultStorageCongestionPolicy to set
     */
    public void setDefaultStorageCongestionPolicy(StorageCongestionPolicy defaultStorageCongestionPolicy) {
        this.defaultStorageCongestionPolicy = defaultStorageCongestionPolicy;
    }

    /**
     * @return the defaultMeasurementReportNumberByPush
     */
    public int getDefaultMeasurementReportNumberByPush() {
        return defaultMeasurementReportNumberByPush;
    }

    /**
     * @param defaultMeasurementReportNumberByPush the defaultMeasurementReportNumberByPush to set
     */
    public void setDefaultMeasurementReportNumberByPush(int defaultMeasurementReportNumberByPush) {
        this.defaultMeasurementReportNumberByPush = defaultMeasurementReportNumberByPush;
    }

    /**
     * @return the defaultMaxTimeBetweenDelivery
     */
    public int getDefaultMaxTimeBetweenDelivery() {
        return defaultMaxTimeBetweenDelivery;
    }

    /**
     * @param defaultMaxTimeBetweenDelivery the defaultMaxTimeBetweenDelivery to set
     */
    public void setDefaultMaxTimeBetweenDelivery(int defaultMaxTimeBetweenDelivery) {
        this.defaultMaxTimeBetweenDelivery = defaultMaxTimeBetweenDelivery;
    }

    

    /**
     * @return the defaultServiceStartPermitBlockedInfo
     */
    public String getDefaultServiceStartPermitBlockedInfo() {
        return defaultServiceStartPermitBlockedInfo;
    }

    /**
     * @param defaultServiceStartPermitBlockedInfo the defaultServiceStartPermitBlockedInfo to set
     */
    public void setDefaultServiceStartPermitBlockedInfo(String defaultServiceStartPermitBlockedInfo) {
        this.defaultServiceStartPermitBlockedInfo = defaultServiceStartPermitBlockedInfo;
    }

    /**
     * @return the defaultTimeTriggerPermitBlockedInfo
     */
    public Timestamp getDefaultTimeTriggerPermitBlockedInfo() {
        return defaultTimeTriggerPermitBlockedInfo;
    }

    /**
     * @param defaultTimeTriggerPermitBlockedInfo the defaultTimeTriggerPermitBlockedInfo to set
     */
    public void setDefaultTimeTriggerPermitBlockedInfo(Timestamp defaultTimeTriggerPermitBlockedInfo) {
        this.defaultTimeTriggerPermitBlockedInfo = defaultTimeTriggerPermitBlockedInfo;
    }

    /**
     * @return the measurementRequest
     */
    public List<MeasurementRequest> getMeasurementRequest() {
        return measurementRequest;
    }

    /**
     * @param measurementRequest the measurementRequest to set
     */
    public void setMeasurementRequest(List<MeasurementRequest> measurementRequest) {
        this.measurementRequest = measurementRequest;
    }

    /**
     * @return the deliveryWindow
     */
    public List<DeliveryWindowDelayed> getDeliveryWindow() {
        return deliveryWindow;
    }

    /**
     * @param deliveryWindow the deliveryWindow to set
     */
    public void setDeliveryWindow(List<DeliveryWindowDelayed> deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    /**
     * @return the defaultStartDeliveryWindowTime
     */
    public Timestamp getDefaultStartDeliveryWindowTime() {
        return defaultStartDeliveryWindowTime;
    }

    /**
     * @param defaultStartDeliveryWindowTime the defaultStartDeliveryWindowTime to set
     */
    public void setDefaultStartDeliveryWindowTime(Timestamp defaultStartDeliveryWindowTime) {
        this.defaultStartDeliveryWindowTime = defaultStartDeliveryWindowTime;
    }

    /**
     * @return the defaultEndDeliveryWindowTime
     */
    public Timestamp getDefaultEndDeliveryWindowTime() {
        return defaultEndDeliveryWindowTime;
    }

    /**
     * @param defaultEndDeliveryWindowTime the defaultEndDeliveryWindowTime to set
     */
    public void setDefaultEndDeliveryWindowTime(Timestamp defaultEndDeliveryWindowTime) {
        this.defaultEndDeliveryWindowTime = defaultEndDeliveryWindowTime;
    }

}
