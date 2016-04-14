/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import Model.tdElementsXML.EndUserElementsXML;

/**
 *
 * @author Principal
 */
public class Error {

    private boolean accepted;
    private HighLevelError highLevelError;
    private ConfigPackageError configPackageError;
    private ReportRequestError reportRequestError;
    private ReportError reportError;
    private ConfigRequestError configRequestError;
    private DocumentBuilderFactory docFactory;
    private Element rootElement;

    public Error(boolean accepted, HighLevelError highLevelError, ConfigPackageError configPackageError,
            ReportRequestError reportRequestError, ReportError reportError, ConfigRequestError configRequestError) {
        this.accepted = accepted;
        this.configPackageError = configPackageError;
        this.configRequestError = configRequestError;
        this.highLevelError = highLevelError;
        this.reportError = reportError;
        this.reportRequestError = reportRequestError;
    }

    public void createErrorDocument() {
        setDocFactory(DocumentBuilderFactory.newInstance());
        Document doc = null;

        DocumentBuilder docBuilder;
        try {
            docBuilder = getDocFactory().newDocumentBuilder();
            doc = docBuilder.newDocument();
            setRootElement(doc.createElement("Error"));
            doc.appendChild(rootElement);

            addError(doc);
            addHighLevelError(doc);
            addConfigPackageError(doc);
            addReportRequestError(doc);
            addReportError(doc);
            addConfigRequestError(doc);
            writeXML(doc);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeXML(Document doc) {
        TransformerFactory transformerFactory
                = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        DOMSource source = new DOMSource(doc);
        StreamResult result
                = new StreamResult(new File("C:\\Users\\Principal\\Desktop\\cars.xml"));
        try {
            transformer.transform(source, result);
        } catch (TransformerException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Output to console for testing
        StreamResult consoleResult
                = new StreamResult(System.out);
        try {
            transformer.transform(source, consoleResult);
        } catch (TransformerException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Add os elementos folha de Error
    public void addError(Document doc) {
        Element filho = doc.createElement("Accepted");
        filho.appendChild(doc.createTextNode(Boolean.toString(this.isAccepted())));
        getRootElement().appendChild(filho);
    }

    //add os elementos de HighLevelError 
    public void addHighLevelError(Document doc) {
        Element hle = doc.createElement("HighLevelError");
        getRootElement().appendChild(hle);
        Element filho = doc.createElement("RootElement");
        filho.appendChild(doc.createTextNode(getHighLevelError().getRootElement()));
        hle.appendChild(filho);

        filho = doc.createElement("HighLevelErrorCode");
        filho.appendChild(doc.createTextNode(Integer.toString(getHighLevelError().getHighLevelErrorCode().getCode())));
        hle.appendChild(filho);

    }

    public void addConfigPackageError(Document doc) {
        Element cpe = doc.createElement("ConfigPackegeError");
        getRootElement().appendChild(cpe);
        Element filho = doc.createElement("PackageID");
        filho.appendChild(doc.createTextNode(Integer.toString(getConfigPackageError().getPackageID())));
        cpe.appendChild(filho);
        filho = doc.createElement("PackageVersion");
        filho.appendChild(doc.createTextNode(Integer.toString(getConfigPackageError().getPackageVersion())));
        cpe.appendChild(filho);
        for (ConfigPackageErrorInfo c : getConfigPackageError().getConfigPackageErrorInfo()) {
            Element ei = doc.createElement("ConfigPackageErrorInfo");
            cpe.appendChild(ei);
            Element ec = doc.createElement("ErrorCode");
            ec.appendChild(doc.createTextNode(Integer.toString(c.getErrorCode().getErrorCodeValue().getCode())));
            ei.appendChild(ec);
            for (String s : c.getErrorCode().getErrorElement()) {
                filho = doc.createElement("ErrorElement");
                filho.appendChild(doc.createTextNode(s));
                ec.appendChild(filho);

            }
            for (ErrorEvent e : c.getErrorCode().getErrorEvent()) {
                filho = doc.createElement("ErrorEvent");
                filho.appendChild(doc.createTextNode(e.name()));
                ec.appendChild(filho);

            }
        }

    }

    public void addReportRequestError(Document doc) {
        Element rre = doc.createElement("ReportRequestError");
        getRootElement().appendChild(rre);
        for (ReportRequestErrorInfo c : getReportRequestError().getReportRequestErrorInfo()) {
            Element ei = doc.createElement("ReportRequestErrorInfo");
            rre.appendChild(ei);
            Element ec = doc.createElement("ErrorCode");
            ec.appendChild(doc.createTextNode(Integer.toString(c.getReportRequestErrorCode().getReportRequestErrorCodeValue().getCode())));
            ei.appendChild(ec);
            for (String s : c.getReportRequestErrorCode().getErrorElement()) {
                Element f = doc.createElement("ErrorElement");
                ec.appendChild(f);
                f.appendChild(doc.createTextNode(s));

            }
            for (Integer i : c.getReportRequestErrorCode().getMeasurementRequestID()) {
                Element filho = doc.createElement("MeasurementRequestID");
                ec.appendChild(filho);
                filho.appendChild(doc.createTextNode(Integer.toString(i)));
            }

        }
    }

    public void addReportError(Document doc) {
        Element re = doc.createElement("ReportError");
        getRootElement().appendChild(re);
        for (ReportErrorInfo c : getReportError().getReportErrorInfo()) {
            Element ei = doc.createElement("ReportErrorInfo");
            re.appendChild(ei);
            Element ec = doc.createElement("ErrorCode");
            ec.appendChild(doc.createTextNode(Integer.toString(c.getReportErrorCode().getErrorCodeValue().getCode())));
            re.appendChild(ec);
            for (String s : c.getReportErrorCode().getErrorElement()) {
                Element f = doc.createElement("ErrorElement");
                ec.appendChild(f);
                f.appendChild(doc.createTextNode(s));
            }
            for (Integer i : c.getReportErrorCode().getMeasurementRequestID()) {
                Element filho = doc.createElement("MeasurementRequestID");
                ec.appendChild(filho);
                filho.appendChild(doc.createTextNode(Integer.toString(i)));
            }
        }

    }

    public void addConfigRequestError(Document doc) {
        Element cre = doc.createElement("ConfigRequestErrorInfo");
        getRootElement().appendChild(cre);
        for (ConfigRequestErrorInfo c : getConfigRequestError().getConfigRequestErrorInfo()) {
            Element ei = doc.createElement("ReportErrorInfo");
            cre.appendChild(ei);
            Element ec = doc.createElement("ErrorCode");
            ec.appendChild(doc.createTextNode(Integer.toString(c.getConfigRequestErrorCode().getConfigRequestErrorCodeValue().getCode())));
            cre.appendChild(ec);
            for (String s : c.getConfigRequestErrorCode().getErrorElement()) {
                Element f = doc.createElement("ErrorElement");
                ec.appendChild(f);
                f.appendChild(doc.createTextNode(s));
            }

        }
    }

    /**
     * @return the accepted
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * @param accepted the accepted to set
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    /**
     * @return the highLevelError
     */
    public HighLevelError getHighLevelError() {
        return highLevelError;
    }

    /**
     * @param highLevelError the highLevelError to set
     */
    public void setHighLevelError(HighLevelError highLevelError) {
        this.highLevelError = highLevelError;
    }

    /**
     * @return the configPackageError
     */
    public ConfigPackageError getConfigPackageError() {
        return configPackageError;
    }

    /**
     * @param configPackageError the configPackageError to set
     */
    public void setConfigPackageError(ConfigPackageError configPackageError) {
        this.configPackageError = configPackageError;
    }

    /**
     * @return the reportRequestError
     */
    public ReportRequestError getReportRequestError() {
        return reportRequestError;
    }

    /**
     * @param reportRequestError the reportRequestError to set
     */
    public void setReportRequestError(ReportRequestError reportRequestError) {
        this.reportRequestError = reportRequestError;
    }

    /**
     * @return the reportError
     */
    public ReportError getReportError() {
        return reportError;
    }

    /**
     * @param reportError the reportError to set
     */
    public void setReportError(ReportError reportError) {
        this.reportError = reportError;
    }

    /**
     * @return the configRequestError
     */
    public ConfigRequestError getConfigRequestError() {
        return configRequestError;
    }

    /**
     * @param configRequestError the configRequestError to set
     */
    public void setConfigRequestError(ConfigRequestError configRequestError) {
        this.configRequestError = configRequestError;
    }

    /**
     * @return the docFactory
     */
    public DocumentBuilderFactory getDocFactory() {
        return docFactory;
    }

    /**
     * @param docFactory the docFactory to set
     */
    public void setDocFactory(DocumentBuilderFactory docFactory) {
        this.docFactory = docFactory;
    }

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
}
