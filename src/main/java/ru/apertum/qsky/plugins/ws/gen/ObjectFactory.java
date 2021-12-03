
package ru.apertum.qsky.plugins.ws.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.apertum.qsky.plugins.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PingResponse_QNAME = new QName("http://ws.qsky.apertum.ru/", "pingResponse");
    private final static QName _ChangeCustomerStatus_QNAME = new QName("http://ws.qsky.apertum.ru/", "changeCustomerStatus");
    private final static QName _RemoveCustomer_QNAME = new QName("http://ws.qsky.apertum.ru/", "removeCustomer");
    private final static QName _InsertCustomer_QNAME = new QName("http://ws.qsky.apertum.ru/", "insertCustomer");
    private final static QName _SendUserName_QNAME = new QName("http://ws.qsky.apertum.ru/", "sendUserName");
    private final static QName _Ping_QNAME = new QName("http://ws.qsky.apertum.ru/", "ping");
    private final static QName _SendServiceName_QNAME = new QName("http://ws.qsky.apertum.ru/", "sendServiceName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.apertum.qsky.plugins.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendServiceName }
     * 
     */
    public SendServiceName createSendServiceName() {
        return new SendServiceName();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link InsertCustomer }
     * 
     */
    public InsertCustomer createInsertCustomer() {
        return new InsertCustomer();
    }

    /**
     * Create an instance of {@link SendUserName }
     * 
     */
    public SendUserName createSendUserName() {
        return new SendUserName();
    }

    /**
     * Create an instance of {@link ChangeCustomerStatus }
     * 
     */
    public ChangeCustomerStatus createChangeCustomerStatus() {
        return new ChangeCustomerStatus();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCustomerStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "changeCustomerStatus")
    public JAXBElement<ChangeCustomerStatus> createChangeCustomerStatus(ChangeCustomerStatus value) {
        return new JAXBElement<ChangeCustomerStatus>(_ChangeCustomerStatus_QNAME, ChangeCustomerStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<RemoveCustomer>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "insertCustomer")
    public JAXBElement<InsertCustomer> createInsertCustomer(InsertCustomer value) {
        return new JAXBElement<InsertCustomer>(_InsertCustomer_QNAME, InsertCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "sendUserName")
    public JAXBElement<SendUserName> createSendUserName(SendUserName value) {
        return new JAXBElement<SendUserName>(_SendUserName_QNAME, SendUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendServiceName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.qsky.apertum.ru/", name = "sendServiceName")
    public JAXBElement<SendServiceName> createSendServiceName(SendServiceName value) {
        return new JAXBElement<SendServiceName>(_SendServiceName_QNAME, SendServiceName.class, null, value);
    }

}
