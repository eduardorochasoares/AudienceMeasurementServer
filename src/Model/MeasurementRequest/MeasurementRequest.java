/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

import java.io.File;
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
public class MeasurementRequest {

    private int measurementRequestID;
    private LinearTVQualifier linearTVQualifier;
    private AllContentClassExceptList allContentClassExceptList;
    private Element rootElement;
    private MeasurementRequest measurementRequest;
    private List<MeasurementSchedule> measurementSchedule = new ArrayList<>();
    private MeasurementDeliverySchedule measurementDeliverySchedule;

    public MeasurementRequest(LinearTVQualifier linearTVQualifier
    ) {
        this.measurementRequestID = measurementRequestID;
        this.linearTVQualifier = linearTVQualifier;

    }

    /**
     * @return the measurementRequestID
     */
    public int getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(int measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    /**
     * @return the linearTVQualifier
     */
    public LinearTVQualifier getLinearTVQualifier() {
        return linearTVQualifier;
    }

    /**
     * @param linearTVQualifier the linearTVQualifier to set
     */
    public void setLinearTVQualifier(LinearTVQualifier linearTVQualifier) {
        this.linearTVQualifier = linearTVQualifier;
    }

    /**
     * @return the allContentClassExceptList
     */
    public AllContentClassExceptList getAllContentClassExceptList() {
        return allContentClassExceptList;
    }

    /**
     * @param allContentClassExceptList the allContentClassExceptList to set
     */
    public void setAllContentClassExceptList(AllContentClassExceptList allContentClassExceptList) {
        this.allContentClassExceptList = allContentClassExceptList;
    }

    public Element createMensuramentRequestDocument(Document doc, Element principal) {

        setRootElement(doc.createElement("MeasurementRequest"));
        principal.appendChild(getRootElement());
        addMensurementRequest(doc);
        if (getLinearTVQualifier() != null) {
            addLinearTvQualifier(doc);
        }
        if (getAllContentClassExceptList() != null) {
            addAllContentClassExceptList(doc);
        }
        if (getMeasurementSchedule() != null) {
            addMeasurementSchedule(doc);
        }
        if (getMeasurementDeliverySchedule() != null) {
            addMeasurementDeliverySchedule(doc);
        }
        return principal;
    }

    public void addMensurementRequest(Document doc) {
        Element filho = doc.createElement("MeasurementRequestID");
        getRootElement().appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(this.getMeasurementRequestID())));

    }

    public void addLinearTvQualifier(Document doc) {
        Element ltq = doc.createElement("LinearTvQualifier");
        getRootElement().appendChild(ltq);
        Element filho;
        if (getLinearTVQualifier().getNavMethod() != null) {
            filho = doc.createElement("NavMethod");
            filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getNavMethod().getCode())));
            ltq.appendChild(filho);
        }
        if (getLinearTVQualifier().getControlDevice() != null) {
            filho = doc.createElement("ControlDevice");
            filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getControlDevice().getValorCodigo())));
            ltq.appendChild(filho);
        }
        if (getLinearTVQualifier().getViewMode() != null) {
            filho = doc.createElement("ViewMode");
            filho.appendChild(doc.createTextNode(Integer.toHexString(getLinearTVQualifier().getViewMode().getCode())));
            ltq.appendChild(filho);
        }

        if (getLinearTVQualifier().getObscuration() != null) {

            filho = doc.createElement("Obscuration");
            filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getObscuration().getCode())));
            ltq.appendChild(filho);
        }

        if (getLinearTVQualifier().getChannelQualifier() != null) {
            Element cq = doc.createElement("ChannelQualifier");
            ltq.appendChild(cq);
            Element cl = doc.createElement("ChannelList");
            cq.appendChild(cl);
            for (String s : getLinearTVQualifier().getChannelQualifier().getChannelList().getServiceIdentifier()) {
                Element aux = doc.createElement("ServiceIdentifier");
                cl.appendChild(aux);
                aux.appendChild(doc.createTextNode(s));
            }
            if (getLinearTVQualifier().getChannelQualifier().getAllChannelsExceptList() != null) {
                Element ael = doc.createElement("AllChannelsExceptList");
                cq.appendChild(ael);

                for (String s : getLinearTVQualifier().getChannelQualifier().getAllChannelsExceptList().getServiceIdentifier()) {
                    Element aux = doc.createElement("ServiceIdentifier");
                    ael.appendChild(aux);
                    aux.appendChild(doc.createTextNode(s));
                }
            }
        }

        filho = doc.createElement("ChannelChangeFilter");
        ltq.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getChannelChangeFilter())));

    }

    public void addAllContentClassExceptList(Document doc) {
        if (getAllContentClassExceptList() != null) {
            Element acce = doc.createElement("AllContentClassExceptList");
            getRootElement().appendChild(acce);

            for (ContentClassDomain c : getAllContentClassExceptList().getContentClassDomain()) {
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

    private String timeStampToString(Timestamp t) {
        String s = new SimpleDateFormat("HH:mm:ss").format(t);
        return s;
    }

    private String timeStampToString(Time t) {
        String s = new SimpleDateFormat("HH:mm:ss").format(t);
        return s;
    }

    public void addMeasurementSchedule(Document doc) {
        for (MeasurementSchedule m : getMeasurementSchedule()) {
            Element ms = doc.createElement("MeasurementSchedule");
            getRootElement().appendChild(ms);
            for (MeasurementPeriod mp : m.getMeasurementPeriod()) {
                Element mperiod = doc.createElement("MeasurementPeriod");
                ms.appendChild(mperiod);
                for (DayOfTheWeek d : mp.getDayOfTheWeek()) {
                    Element dayOfWeek = doc.createElement("DayOfTheWeek");
                    mperiod.appendChild(dayOfWeek);
                    dayOfWeek.appendChild(doc.createTextNode(Integer.toString(d.getCode())));
                }
                for (Time t : mp.getStartTime()) {
                    Element timeStart = doc.createElement("StartTime");
                    mperiod.appendChild(timeStart);
                    timeStart.appendChild(doc.createTextNode(timeStampToString(t)));
                }
                for (Time t : mp.getEndTime()) {
                    Element endTime = doc.createElement("EndTime");
                    endTime.appendChild(doc.createTextNode(timeStampToString(t)));
                    mperiod.appendChild(endTime);
                }
            }
            for (EventTrigger et : m.getEventTrigger()) {
                Element eventTrigger = doc.createElement("EventTrigger");
                ms.appendChild(eventTrigger);
                for (Event e : et.getEvent()) {
                    Element event = doc.createElement("Event");
                    eventTrigger.appendChild(event);
                    event.appendChild(doc.createTextNode(e.getEventValue().getEvent()));
                    Element son = doc.createElement("EventParameter1");
                    event.appendChild(son);
                    son.appendChild(doc.createTextNode(e.getEventParameter1()));
                }
                Element aux = doc.createElement("Priority");
                eventTrigger.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(et.getPriority().getPriority())));

            }
            Element aux;
            if (m.getTimeTrigger() != null) {
                Element timeTrigger = doc.createElement("TimeTrigger");
                ms.appendChild(timeTrigger);

                for (SampleSetTimeTrigger sstt : m.getTimeTrigger().getSampleSet()) {
                    Element sampleSet = doc.createElement("SampleSet");
                    timeTrigger.appendChild(sampleSet);
                    Element ssi = doc.createElement("SampleSetIdentifier");
                    ssi.appendChild(doc.createTextNode(sstt.getSampleSetIdentifier().getIdentifier()));
                    sampleSet.appendChild(ssi);
                    for (SampleSetQualifierTimeTrigger s : sstt.getSampleSetQualifierTimeTrigger()) {
                        Element ssq = doc.createElement("SampleSetQualifier");
                        sampleSet.appendChild(ssq);
                        ssq.appendChild(doc.createTextNode(s.getQualifier()));

                    }
                }

                aux = doc.createElement("Periodicity");
                timeTrigger.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getTimeTrigger().getPeriodicity())));
                if (m.getTimeTrigger().getPriorityTimeTrigger() != null) {
                    aux = doc.createElement("Priority");
                    timeTrigger.appendChild(aux);
                    aux.appendChild(doc.createTextNode(Integer.toString(m.getTimeTrigger().getPriorityTimeTrigger().getPriority())));
                }
                if (m.getTimeTrigger().getNothingNewReportMode() != null) {
                    aux = doc.createElement("NothingNewReportMode");
                    timeTrigger.appendChild(aux);
                    aux.appendChild(doc.createTextNode(Integer.toString(m.getTimeTrigger().getNothingNewReportMode().getCode())));
                }
            }

            if (m.getServiceStartTrigger() != null) {
                Element sst = doc.createElement("ServiceStartTrigger");
                ms.appendChild(sst);
                aux = doc.createElement("Interval");
                sst.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getServiceStartTrigger().getInterval())));
                for (SampleSetServiceStartTrigger s : m.getServiceStartTrigger().getSampleset()) {
                    Element sampleSet = doc.createElement("SampleSet");
                    sst.appendChild(sampleSet);

                    aux = doc.createElement("SampleSetIdentifier");
                    sampleSet.appendChild(aux);
                    aux.appendChild(doc.createTextNode(s.getSampleSetIdentifierServiceStart().getIdentifier()));
                    for (SampleSetQualifierServiceStart v : s.getSampleSetQualifierServiceStart()) {
                        aux = doc.createElement("SampleSetQualifier");
                        sampleSet.appendChild(aux);
                        aux.appendChild(doc.createTextNode(v.getQualifier()));
                    }

                }
                aux = doc.createElement("Priority");
                sst.appendChild(aux);
                aux.appendChild(doc.createTextNode(Integer.toString(m.getServiceStartTrigger().getPriorityServiceStart().getPriority())));

            }
        }

    }

    public void addMeasurementDeliverySchedule(Document doc) {
        Element mds = doc.createElement("MeasurementDeliverySchedule");
        getRootElement().appendChild(mds);
        Element aux;
        for (String s : getMeasurementDeliverySchedule().getDeliveryAddres()) {
            aux = doc.createElement("DeliveryAddres");
            mds.appendChild(aux);
            aux.appendChild(doc.createTextNode(s));
        }
        if (getMeasurementDeliverySchedule().getRetransmitNumber() != 0) {
            aux = doc.createElement("RetransmitNumber");
            mds.appendChild(aux);
            aux.appendChild(doc.createTextNode(Integer.toString(getMeasurementDeliverySchedule().getRetransmitNumber())));
        }
        if (getMeasurementDeliverySchedule().getStorageCongestionPolicy() != null) {
            aux = doc.createElement("StorageCongestionPolicy");

            mds.appendChild(aux);
            aux.appendChild(doc.createTextNode(Integer.toString(getMeasurementDeliverySchedule().getStorageCongestionPolicy().getCode())));
        }
        if (getMeasurementDeliverySchedule().getImeImmediatePush() != null) {

            Element ip = doc.createElement("ImmediatePush");
            mds.appendChild(ip);
            aux = doc.createElement("MeasurementReportNumberByPush");
            ip.appendChild(aux);
            aux.appendChild(doc.createTextNode(Integer.toString(getMeasurementDeliverySchedule().getImeImmediatePush().getMeasurementReportNumberByPush())));
            aux = doc.createElement("MaxTimeBetweenDelivery");
            ip.appendChild(aux);
            aux.appendChild(doc.createTextNode(Integer.toString(getMeasurementDeliverySchedule().getImeImmediatePush().getMaxTimeBetweenDelivery())));
        }
        if (getMeasurementDeliverySchedule().getDelayedDelivery() != null) {
            Element dd = doc.createElement("DelayedDelivery");
            mds.appendChild(dd);
            if (getMeasurementDeliverySchedule().getDelayedDelivery() != null) {
                for (DeliveryWindowDelayed t : getMeasurementDeliverySchedule().getDelayedDelivery().getDeliveryWindow()) {
                    Element dw = doc.createElement("DeliveryWindow");
                    dd.appendChild(dw);
                    aux = doc.createElement("StartDeliveryWindowTime");
                    dw.appendChild(aux);

                    String StartTime = timeStampToString(t.getStartDeliveryWindowTime());
                    aux.appendChild(doc.createTextNode(StartTime));

                    aux = doc.createElement("EndDeliveryWindowTime");
                    dw.appendChild(aux);

                    String endTime = timeStampToString(t.getEndDeliveryWindowTime());
                    aux.appendChild(doc.createTextNode(endTime));

                }
            }
        }
        if (getMeasurementDeliverySchedule().isPull()) {
            Element pull = doc.createElement("Pull");
            mds.appendChild(pull);
        }
        if (getMeasurementDeliverySchedule().getDelayedPushAndPull() != null) {
            Element dpp = doc.createElement("DelayedPushAndPull");
            mds.appendChild(dpp);

            for (DeliveryWindowDelayedPushAndPull c : getMeasurementDeliverySchedule().getDelayedPushAndPull().getDeliveryWindowDelayedPushAndPull()) {
                Element dwdpp = doc.createElement("DeliveryWindow");
                dpp.appendChild(dwdpp);
                aux = doc.createElement("StartDeliveryWindowTime");
                dwdpp.appendChild(aux);
                String startTime = timeStampToString(c.getStartDeliveryWindowTime());
                aux.appendChild(doc.createTextNode(startTime));

                aux = doc.createElement("EndDeliveryWindowTime");
                dwdpp.appendChild(aux);
                String endTime = timeStampToString(c.getEndDeliveryWindowTime());
                aux.appendChild(doc.createTextNode(endTime));

            }
        }

    }

    /**
     * @return the docFactory
     */
    /**
     * @return the rootElement
     */
    public Element getRootElement() {
        return rootElement;
    }

    /**
     * @param rootElement the rootElement to set
     */
    public void setRootElement(Element rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * @return the measurementRequest
     */
    public MeasurementRequest getMeasurementRequest() {
        return measurementRequest;
    }

    /**
     * @param measurementRequest the measurementRequest to set
     */
    public void setMeasurementRequest(MeasurementRequest measurementRequest) {
        this.measurementRequest = measurementRequest;
    }

    /**
     * @return the measurementSchedule
     */
    public List<MeasurementSchedule> getMeasurementSchedule() {
        return measurementSchedule;
    }

    /**
     * @param measurementSchedule the measurementSchedule to set
     */
    public void setMeasurementSchedule(List<MeasurementSchedule> measurementSchedule) {
        this.measurementSchedule = measurementSchedule;
    }

    /**
     * @return the measurementDeliverySchedule
     */
    public MeasurementDeliverySchedule getMeasurementDeliverySchedule() {
        return measurementDeliverySchedule;
    }

    /**
     * @param measurementDeliverySchedule the measurementDeliverySchedule to set
     */
    public void setMeasurementDeliverySchedule(MeasurementDeliverySchedule measurementDeliverySchedule) {
        this.measurementDeliverySchedule = measurementDeliverySchedule;
    }
}
