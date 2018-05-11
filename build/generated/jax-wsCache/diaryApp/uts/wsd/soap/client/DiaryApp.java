
package uts.wsd.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "diaryApp", targetNamespace = "http://soap.wsd.uts/", wsdlLocation = "http://localhost:8080/wsd-labs/diaryApp?wsdl")
public class DiaryApp
    extends Service
{

    private final static URL DIARYAPP_WSDL_LOCATION;
    private final static WebServiceException DIARYAPP_EXCEPTION;
    private final static QName DIARYAPP_QNAME = new QName("http://soap.wsd.uts/", "diaryApp");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wsd-labs/diaryApp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIARYAPP_WSDL_LOCATION = url;
        DIARYAPP_EXCEPTION = e;
    }

    public DiaryApp() {
        super(__getWsdlLocation(), DIARYAPP_QNAME);
    }

    public DiaryApp(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIARYAPP_QNAME, features);
    }

    public DiaryApp(URL wsdlLocation) {
        super(wsdlLocation, DIARYAPP_QNAME);
    }

    public DiaryApp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIARYAPP_QNAME, features);
    }

    public DiaryApp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiaryApp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DiarySOAP
     */
    @WebEndpoint(name = "DiarySOAPPort")
    public DiarySOAP getDiarySOAPPort() {
        return super.getPort(new QName("http://soap.wsd.uts/", "DiarySOAPPort"), DiarySOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DiarySOAP
     */
    @WebEndpoint(name = "DiarySOAPPort")
    public DiarySOAP getDiarySOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.wsd.uts/", "DiarySOAPPort"), DiarySOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIARYAPP_EXCEPTION!= null) {
            throw DIARYAPP_EXCEPTION;
        }
        return DIARYAPP_WSDL_LOCATION;
    }

}
