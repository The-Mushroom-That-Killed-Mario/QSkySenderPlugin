
package ru.apertum.qsky.plugins.ws.gen;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "qskyapi/CustomerEventsWS", targetNamespace = "http://ws.qsky.apertum.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QskyapiCustomerEventsWS {


    /**
     * 
     * @param branchId
     * @param number
     * @param prefix
     * @param customerId
     * @param employeeId
     * @param serviceId
     * @param status
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "changeCustomerStatus", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.ChangeCustomerStatus")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/changeCustomerStatus")
    public void changeCustomerStatus(
        @WebParam(name = "branchId", targetNamespace = "")
        Long branchId,
        @WebParam(name = "serviceId", targetNamespace = "")
        Long serviceId,
        @WebParam(name = "employeeId", targetNamespace = "")
        Long employeeId,
        @WebParam(name = "customerId", targetNamespace = "")
        Long customerId,
        @WebParam(name = "status", targetNamespace = "")
        Integer status,
        @WebParam(name = "number", targetNamespace = "")
        Integer number,
        @WebParam(name = "prefix", targetNamespace = "")
        String prefix);

    /**
     * 
     * @param version
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ping", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.PingResponse")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/pingRequest", output = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/pingResponse")
    public Integer ping(
        @WebParam(name = "version", targetNamespace = "")
        String version);

    /**
     * 
     * @param branchId
     * @param customerId
     * @param serviceId
     * @param beforeCustId
     * @param afterCustId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "insertCustomer", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.InsertCustomer")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/insertCustomer")
    public void insertCustomer(
        @WebParam(name = "branchId", targetNamespace = "")
        Long branchId,
        @WebParam(name = "serviceId", targetNamespace = "")
        Long serviceId,
        @WebParam(name = "customerId", targetNamespace = "")
        Long customerId,
        @WebParam(name = "beforeCustId", targetNamespace = "")
        Long beforeCustId,
        @WebParam(name = "afterCustId", targetNamespace = "")
        Long afterCustId);

    /**
     * 
     * @param branchId
     * @param customerId
     * @param serviceId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeCustomer", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.RemoveCustomer")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/removeCustomer")
    public void removeCustomer(
        @WebParam(name = "branchId", targetNamespace = "")
        Long branchId,
        @WebParam(name = "serviceId", targetNamespace = "")
        Long serviceId,
        @WebParam(name = "customerId", targetNamespace = "")
        Long customerId);

    /**
     * 
     * @param branchId
     * @param name
     * @param serviceId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "sendServiceName", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.SendServiceName")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/sendServiceName")
    public void sendServiceName(
        @WebParam(name = "branchId", targetNamespace = "")
        Long branchId,
        @WebParam(name = "serviceId", targetNamespace = "")
        Long serviceId,
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param branchId
     * @param name
     * @param employeeId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "sendUserName", targetNamespace = "http://ws.qsky.apertum.ru/", className = "ru.apertum.qsky.plugins.ws.SendUserName")
    @Action(input = "http://ws.qsky.apertum.ru/qskyapi/CustomerEventsWS/sendUserName")
    public void sendUserName(
        @WebParam(name = "branchId", targetNamespace = "")
        Long branchId,
        @WebParam(name = "employeeId", targetNamespace = "")
        Long employeeId,
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
