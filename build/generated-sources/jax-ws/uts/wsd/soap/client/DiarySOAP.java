
package uts.wsd.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DiarySOAP", targetNamespace = "http://soap.wsd.uts/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DiarySOAP {


    /**
     * 
     * @return
     *     returns uts.wsd.soap.client.Users
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchUsers", targetNamespace = "http://soap.wsd.uts/", className = "uts.wsd.soap.client.FetchUsers")
    @ResponseWrapper(localName = "fetchUsersResponse", targetNamespace = "http://soap.wsd.uts/", className = "uts.wsd.soap.client.FetchUsersResponse")
    @Action(input = "http://soap.wsd.uts/DiarySOAP/fetchUsersRequest", output = "http://soap.wsd.uts/DiarySOAP/fetchUsersResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://soap.wsd.uts/DiarySOAP/fetchUsers/Fault/Exception")
    })
    public Users fetchUsers()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns uts.wsd.soap.client.User
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchUser", targetNamespace = "http://soap.wsd.uts/", className = "uts.wsd.soap.client.FetchUser")
    @ResponseWrapper(localName = "fetchUserResponse", targetNamespace = "http://soap.wsd.uts/", className = "uts.wsd.soap.client.FetchUserResponse")
    @Action(input = "http://soap.wsd.uts/DiarySOAP/fetchUserRequest", output = "http://soap.wsd.uts/DiarySOAP/fetchUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://soap.wsd.uts/DiarySOAP/fetchUser/Fault/Exception")
    })
    public User fetchUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

}
