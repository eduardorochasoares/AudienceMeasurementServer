/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import Model.MeasurementRequest.ContentClassDomain;
import Model.MeasurementRequest.DayOfTheWeek;
import Model.MeasurementRequest.DeliveryWindowDelayed;
import Model.MeasurementRequest.MeasurementPeriod;
import Model.MeasurementRequest.MeasurementRequest;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Principal
 */
public class AMFConfigPackage {

    private int packageID;
    private int packageVersion;
    private Timestamp effectivityDateAndTime;
    private List<UserPermitInfo> useerPermitInfo = new ArrayList<>();
    private Element root;
    private List<MeasurementRequestSet> measurementRequestSets = new ArrayList<>();
    private List<MeasurementRequestSetFilter> measurementRequestSetFilters = new ArrayList<>();

    /**
     * @return the packageID
     */
    public int getPackageID() {
        return packageID;
    }

    /**
     * @param packageID the packageID to set
     */
    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    /**
     * @return the packageVersion
     */
    public int getPackageVersion() {
        return packageVersion;
    }

    /**
     * @param packageVersion the packageVersion to set
     */
    public void setPackageVersion(int packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * @return the effectivityDateAndTime
     */
    /**
     * @return the useerPermitInfo
     */
    public List<UserPermitInfo> getUseerPermitInfo() {
        return useerPermitInfo;
    }

    /**
     * @param useerPermitInfo the useerPermitInfo to set
     */
    public void setUseerPermitInfo(List<UserPermitInfo> useerPermitInfo) {
        this.useerPermitInfo = useerPermitInfo;
    }

    public Element createAmfConfig(Document doc, Element principal) {
        setRoot(doc.createElement("AMFConfigPackage"));
        
        principal.appendChild(getRoot());
        addAmfConfig(doc);
        addUserPermitInfo(doc);
        addMeasurementRequestSet(doc);

        return principal;
    }

    public void addAmfConfig(Document doc) {
        Element filho = doc.createElement("PackageID");
        getRoot().appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(getPackageID())));
        filho = doc.createElement("PackageVersion");
        getRoot().appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(getPackageVersion())));
        if (getEffectivityDateAndTime() != null) {
            filho = doc.createElement("EffectivityDateAndTime");
            getRoot().appendChild(filho);
            filho.appendChild(doc.createTextNode(timeStampToString(getEffectivityDateAndTime())));
        }

    }

    public void addUserPermitInfo(Document doc) {
        for (UserPermitInfo upi : getUseerPermitInfo()) {
            Element userPermitInfo = doc.createElement("UserPermitInfo");
            getRoot().appendChild(userPermitInfo);
            Element filho = doc.createElement("EffectivityDateAndTime");
            filho.appendChild(doc.createTextNode(timeStampToString(upi.getLastUpdateDateAndTime())));
            userPermitInfo.appendChild(filho);

            Element up = doc.createElement("UserPermit");
            userPermitInfo.appendChild(up);

            filho = doc.createElement("ExpirationDate");
            filho.appendChild(doc.createTextNode(timeStampToString(upi.getUserPermit().getExpirationDate())));
            up.appendChild(filho);

            filho = doc.createElement("DefaultPermissionLevel");
            up.appendChild(filho);
            filho.appendChild(doc.createTextNode(Integer.toString(upi.getUserPermit().getDefaultPermissionLevel().getCode())));

            Element acce = doc.createElement("AllContentClassExceptList");
            up.appendChild(acce);

            for (ContentClassDomain c : upi.getUserPermit().getDefauAllContentClassExceptList().getContentClassDomain()) {
                Element ccd = doc.createElement("ContentClassDomain");
                acce.appendChild(ccd);
                ccd.appendChild(doc.createTextNode(c.getContentClassDomainValue()));
                for (String s : c.getContentclassID()) {
                    Element aux = doc.createElement("ContentClassID");
                    ccd.appendChild(aux);
                    aux.appendChild(doc.createTextNode(s));
                }
            }

            for (Integer a : upi.getUserPermit().getAnonUserID()) {
                filho = doc.createElement("AnonUserID");
                up.appendChild(filho);
                filho.appendChild(doc.createTextNode(Integer.toString(a)));
            }
            for (String b : upi.getUserPermit().getUserID()) {
                filho = doc.createElement("UserID");
                up.appendChild(filho);
                filho.appendChild(doc.createTextNode(b));
            }
            for (UserPermissionSet ups : upi.getUserPermit().getPermissionSets()) {
                Element u = doc.createElement("UserPermissionSet");
                up.appendChild(u);
                filho = doc.createElement("PermissionLevel");
                u.appendChild(filho);
                filho.appendChild(doc.createTextNode(Integer.toString(ups.getPermissionLevel().getCode())));

                for (UserPermission userPermission : ups.getUserPermission()) {
                    Element permission = doc.createElement("UserPermission");
                    u.appendChild(permission);
                    Element cq = doc.createElement("ChannelQualifier");
                    permission.appendChild(cq);
                    Element cl = doc.createElement("ChannelList");
                    cq.appendChild(cl);
                    for (String s : userPermission.getChannelQualifier().getChannelList().getServiceIdentifier()) {
                        Element aux = doc.createElement("ServiceIdentifier");
                        cl.appendChild(aux);
                        aux.appendChild(doc.createTextNode(s));
                    }
                    Element ael = doc.createElement("AllChannelsExceptList");
                    cq.appendChild(ael);
                    for (String s : userPermission.getChannelQualifier().getAllChannelsExceptList().getServiceIdentifier()) {
                        Element aux = doc.createElement("ServiceIdentifier");
                        ael.appendChild(aux);
                        aux.appendChild(doc.createTextNode(s));
                    }
                    Element tds = doc.createElement("TerminalDeviceSet");
                    permission.appendChild(tds);
                    for (TerminalDeviceType tdt : userPermission.getTerminalDeviceSet().getTerminalDeviceType()) {
                        filho = doc.createElement("TerminalDeviceType");
                        tds.appendChild(filho);
                        filho.appendChild(doc.createTextNode(Integer.toString(tdt.getCode())));
                    }
                    acce = doc.createElement("AllContentClassExceptList");
                    permission.appendChild(acce);

                    for (ContentClassDomain c : userPermission.getAllContentClassExceptList().getContentClassDomain()) {
                        Element ccd = doc.createElement("ContentClassDomain");
                        acce.appendChild(ccd);
                        ccd.appendChild(doc.createTextNode(c.getContentClassDomainValue()));
                        for (String s : c.getContentclassID()) {
                            Element aux = doc.createElement("ContentClassID");
                            ccd.appendChild(aux);
                            aux.appendChild(doc.createTextNode(s));
                        }
                    }

                }
            }
        }

    }

    public void addMeasurementRequestSet(Document doc) {
        for (MeasurementRequestSet m : getMeasurementRequestSets()) {
            Element mrs = doc.createElement("MeasurementRequestSet");
            getRoot().appendChild(mrs);
            Element acce = doc.createElement("DefaultAllContentClassExceptList");
            mrs.appendChild(acce);
            if (m.getDefaultAllContentClassExceptList() != null) {
                for (ContentClassDomain c : m.getDefaultAllContentClassExceptList().getContentClassDomain()) {
                    Element ccd = doc.createElement("ContentClassDomain");
                    acce.appendChild(ccd);
                    ccd.appendChild(doc.createTextNode(c.getContentClassDomainValue()));
                    for (String s : c.getContentclassID()) {
                        Element aux = doc.createElement("ContentClassID");
                        ccd.appendChild(aux);
                        aux.appendChild(doc.createTextNode(s));
                    }
                }
            }
            for (MeasurementPeriod p : m.getDefaultMeasurementPeriod()) {
                Element mp = doc.createElement("DefaultMeasurementPeriod");
                mrs.appendChild(mp);
                for (DayOfTheWeek d : p.getDayOfTheWeek()) {
                    Element dow = doc.createElement("DayOfTheWeek");
                    mp.appendChild(dow);
                    dow.appendChild(doc.createTextNode(Integer.toString(d.getCode())));
                }
                Element aux;
                for (Time t : p.getStartTime()) {
                    aux = doc.createElement("StarTime");
                    mp.appendChild(aux);
                    aux.appendChild(doc.createTextNode(timeStampToString(t)));

                }
                for (Time t : p.getEndTime()) {
                    aux = doc.createElement("EndTime");
                    mp.appendChild(aux);
                    aux.appendChild(doc.createTextNode(timeStampToString(t)));

                }

            }

            for (DayOfTheWeek d : m.getDefaultDayOfTheWeek()) {
                Element dow = doc.createElement("DefaultDayOfTheWeek");
                mrs.appendChild(dow);
                dow.appendChild(doc.createTextNode(Integer.toString(d.getCode())));
            }
            Element aux;
            if (m.getDefaultMeasurementStartTime() != null) {
                aux = doc.createElement("DefaultMeasurementStartTime");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(m.getDefaultMeasurementStartTime())));
            }
            if (m.getDefaultMeasurementEndTime() != null) {
                aux = doc.createElement("DefaultMeasurementEndTime");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(m.getDefaultMeasurementEndTime())));
            }
            if (m.getPeriodicity() != 0) {
                aux = doc.createElement("DefaultTimeDrivenMeasurementPeriodicity");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getPeriodicity())));
            }
            if (m.getNothingNewReportMode() != null) {
                aux = doc.createElement("DefaultNothingNewReportMode");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getNothingNewReportMode().getCode())));
            }
            if (m.getDefaultInterval() != 0) {
                aux = doc.createElement("DefaultInterval");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getDefaultInterval())));
            }
            for (String s : m.getDefaultDeliveryAddress()) {
                aux = doc.createElement("DefaultDeliveryAddress");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(s));
            }
            if (m.getDefaultRetransmitNumber() != 0) {
                aux = doc.createElement("DefaultRetransmitNumber");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getDefaultRetransmitNumber())));
            }
            if (m.getDefaultStorageCongestionPolicy() != null) {
                aux = doc.createElement("DefaultStorageCongestionPolicy");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getDefaultStorageCongestionPolicy().getCode())));
            }
            if (m.getDefaultMeasurementReportNumberByPush() != 0) {
                aux = doc.createElement("DefaultMeasurementReportNumberByPush");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getDefaultMeasurementReportNumberByPush())));
            }
            if (m.getDefaultMaxTimeBetweenDelivery() != 0) {
                aux = doc.createElement("DefaultMaxTimeBetweeDelivery");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getDefaultMaxTimeBetweenDelivery())));
            }
            for (DeliveryWindowDelayed dw : m.getDeliveryWindow()) {
                Element dWindow = doc.createElement("DeliveryWindow");
                mrs.appendChild(dWindow);
                aux = doc.createElement("StartDeliveryWindowTime");
                dWindow.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(dw.getStartDeliveryWindowTime())));
                aux = doc.createElement("EndDeliveryWindowTime");
                dWindow.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(dw.getEndDeliveryWindowTime())));
            }
            if (m.getDefaultStartDeliveryWindowTime() != null) {
                aux = doc.createElement("DefaultStartDeliveryWindowTime");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(m.getDefaultStartDeliveryWindowTime())));
            }

            if (m.getDefaultEndDeliveryWindowTime() != null) {
                aux = doc.createElement("DefaultEndDeliveryWindowTime");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(m.getDefaultEndDeliveryWindowTime())));
            }
            if (m.getDefaultServiceStartPermitBlockedInfo() != null) {
                aux = doc.createElement("DefaultServiceStartPermitBlockedInfo");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(m.getDefaultServiceStartPermitBlockedInfo()));
            }
            if (m.getDefaultTimeTriggerPermitBlockedInfo() != null) {
                aux = doc.createElement("DefaultTimeTriggerPermitBlockedInfo");
                mrs.appendChild(aux);
                aux.appendChild(doc.createTextNode(timeStampToString(m.getDefaultTimeTriggerPermitBlockedInfo())));
            }
            for (MeasurementRequest mrq : m.getMeasurementRequest()) {
                mrq.createMensuramentRequestDocument(doc, mrs);
            }

        }
    }

    public void addMeasurementRequestSetFilter(Document doc) {
        for (MeasurementRequestSetFilter msf : getMeasurementRequestSetFilters()) {
            Element mfilter = doc.createElement("MeasurementRequestSetFilter");
            getRoot().appendChild(mfilter);
            for (UserInfoTarget uit : msf.getUserInfoTarget()) {
                Element uinfoT = doc.createElement("UserInfoTarget");
                mfilter.appendChild(uinfoT);
                Element aux = doc.createElement("UserInfoTypeString");
                uinfoT.appendChild(aux);
                aux.appendChild(doc.createTextNode(uit.getUserInfoTypeString()));

                aux = doc.createElement("IgnoreIfUnavailable");
                uinfoT.appendChild(aux);
                if (uit.isIgnoreIfUnavailable()) {
                    aux.appendChild(doc.createTextNode("True"));
                } else {
                    aux.appendChild(doc.createTextNode("False"));
                }

                aux = doc.createElement("UserInfoValueString");
                uinfoT.appendChild(aux);
                aux.appendChild(doc.createAttribute(uit.getUserInfoValueString()));
            }
            for (Integer i : msf.getMeasurementRequestID()) {
                Element aux = doc.createElement("MeasurementRequestID");
                mfilter.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(i)));
            }

        }
    }

    /**
     * @return the effectivityDateAndTime
     */
    public Timestamp getEffectivityDateAndTime() {
        return effectivityDateAndTime;
    }

    /**
     * @param effectivityDateAndTime the effectivityDateAndTime to set
     */
    public void setEffectivityDateAndTime(Timestamp effectivityDateAndTime) {
        this.effectivityDateAndTime = effectivityDateAndTime;
    }

    /**
     * @return the root
     */
    public Element getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Element root) {
        this.root = root;
    }

    private String timeStampToString(Timestamp t) {
        String s = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(t);
        return s;
    }
     private String timeStampToString(Time t) {
        String s = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(t);
        return s;
    }

    /**
     * @return the measurementRequestSets
     */
    public List<MeasurementRequestSet> getMeasurementRequestSets() {
        return measurementRequestSets;
    }

    /**
     * @param measurementRequestSets the measurementRequestSets to set
     */
    public void setMeasurementRequestSets(List<MeasurementRequestSet> measurementRequestSets) {
        this.measurementRequestSets = measurementRequestSets;
    }

    /**
     * @return the measurementRequestSetFilters
     */
    public List<MeasurementRequestSetFilter> getMeasurementRequestSetFilters() {
        return measurementRequestSetFilters;
    }

    /**
     * @param measurementRequestSetFilters the measurementRequestSetFilters to
     * set
     */
    public void setMeasurementRequestSetFilters(List<MeasurementRequestSetFilter> measurementRequestSetFilters) {
        this.measurementRequestSetFilters = measurementRequestSetFilters;
    }
}
