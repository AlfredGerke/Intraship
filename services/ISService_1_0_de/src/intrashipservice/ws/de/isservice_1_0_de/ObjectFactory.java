
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the intrashipservice.ws.de.isservice_1_0_de package. 
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

    private final static QName _ProcedureID_QNAME = new QName("http://dhl.de/webservice/cisbase", "procedureID");
    private final static QName _PartnerID_QNAME = new QName("http://dhl.de/webservice/cisbase", "partnerID");
    private final static QName _AirwayBill_QNAME = new QName("http://dhl.de/webservice/cisbase", "airwayBill");
    private final static QName _AccountNumber_QNAME = new QName("http://dhl.de/webservice/cisbase", "accountNumber");
    private final static QName _StreetNameCode_QNAME = new QName("http://dhl.de/webservice/cisbase", "streetNameCode");
    private final static QName _ShipmentNumber_QNAME = new QName("http://dhl.de/webservice/cisbase", "shipmentNumber");
    private final static QName _IdentCode_QNAME = new QName("http://dhl.de/webservice/cisbase", "identCode");
    private final static QName _RouteCode_QNAME = new QName("http://dhl.de/webservice/cisbase", "routeCode");
    private final static QName _ProductKey_QNAME = new QName("http://dhl.de/webservice/cisbase", "productKey");
    private final static QName _AccountNumberExpress_QNAME = new QName("http://dhl.de/webservice/cisbase", "accountNumberExpress");
    private final static QName _StreetNumberCode_QNAME = new QName("http://dhl.de/webservice/cisbase", "streetNumberCode");
    private final static QName _LicensePlate_QNAME = new QName("http://dhl.de/webservice/cisbase", "licensePlate");
    private final static QName _City_QNAME = new QName("http://dhl.de/webservice/cisbase", "city");
    private final static QName _RoutingCode_QNAME = new QName("http://dhl.de/webservice/cisbase", "routingCode");
    private final static QName _EKP_QNAME = new QName("http://dhl.de/webservice/cisbase", "EKP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: intrashipservice.ws.de.isservice_1_0_de
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameTypeType }
     * 
     */
    public NameTypeType createNameTypeType() {
        return new NameTypeType();
    }

    /**
     * Create an instance of {@link Authentification }
     * 
     */
    public Authentification createAuthentification() {
        return new Authentification();
    }

    /**
     * Create an instance of {@link Dimension }
     * 
     */
    public Dimension createDimension() {
        return new Dimension();
    }

    /**
     * Create an instance of {@link Origin }
     * 
     */
    public Origin createOrigin() {
        return new Origin();
    }

    /**
     * Create an instance of {@link TimeFrame }
     * 
     */
    public TimeFrame createTimeFrame() {
        return new TimeFrame();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Zip }
     * 
     */
    public Zip createZip() {
        return new Zip();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link ErrorTypeType }
     * 
     */
    public ErrorTypeType createErrorTypeType() {
        return new ErrorTypeType();
    }

    /**
     * Create an instance of {@link BankTypeType }
     * 
     */
    public BankTypeType createBankTypeType() {
        return new BankTypeType();
    }

    /**
     * Create an instance of {@link CustomerTypeType }
     * 
     */
    public CustomerTypeType createCustomerTypeType() {
        return new CustomerTypeType();
    }

    /**
     * Create an instance of {@link CommunicationTypeType }
     * 
     */
    public CommunicationTypeType createCommunicationTypeType() {
        return new CommunicationTypeType();
    }

    /**
     * Create an instance of {@link DeliveryAddressTypeType }
     * 
     */
    public DeliveryAddressTypeType createDeliveryAddressTypeType() {
        return new DeliveryAddressTypeType();
    }

    /**
     * Create an instance of {@link PostOfficeTypeType }
     * 
     */
    public PostOfficeTypeType createPostOfficeTypeType() {
        return new PostOfficeTypeType();
    }

    /**
     * Create an instance of {@link ShipmentNumberTypeType }
     * 
     */
    public ShipmentNumberTypeType createShipmentNumberTypeType() {
        return new ShipmentNumberTypeType();
    }

    /**
     * Create an instance of {@link PackStationTypeType }
     * 
     */
    public PackStationTypeType createPackStationTypeType() {
        return new PackStationTypeType();
    }

    /**
     * Create an instance of {@link PickupAddressTypeType }
     * 
     */
    public PickupAddressTypeType createPickupAddressTypeType() {
        return new PickupAddressTypeType();
    }

    /**
     * Create an instance of {@link ContactTypeType }
     * 
     */
    public ContactTypeType createContactTypeType() {
        return new ContactTypeType();
    }

    /**
     * Create an instance of {@link NativeAddressTypeType }
     * 
     */
    public NativeAddressTypeType createNativeAddressTypeType() {
        return new NativeAddressTypeType();
    }

    /**
     * Create an instance of {@link NameTypeType.Company }
     * 
     */
    public NameTypeType.Company createNameTypeTypeCompany() {
        return new NameTypeType.Company();
    }

    /**
     * Create an instance of {@link NameTypeType.Person }
     * 
     */
    public NameTypeType.Person createNameTypeTypePerson() {
        return new NameTypeType.Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "procedureID")
    public JAXBElement<String> createProcedureID(String value) {
        return new JAXBElement<String>(_ProcedureID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "partnerID")
    public JAXBElement<String> createPartnerID(String value) {
        return new JAXBElement<String>(_PartnerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "airwayBill")
    public JAXBElement<String> createAirwayBill(String value) {
        return new JAXBElement<String>(_AirwayBill_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "accountNumber")
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<String>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "streetNameCode")
    public JAXBElement<String> createStreetNameCode(String value) {
        return new JAXBElement<String>(_StreetNameCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "shipmentNumber")
    public JAXBElement<String> createShipmentNumber(String value) {
        return new JAXBElement<String>(_ShipmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "identCode")
    public JAXBElement<String> createIdentCode(String value) {
        return new JAXBElement<String>(_IdentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "routeCode")
    public JAXBElement<String> createRouteCode(String value) {
        return new JAXBElement<String>(_RouteCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "productKey")
    public JAXBElement<String> createProductKey(String value) {
        return new JAXBElement<String>(_ProductKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "accountNumberExpress")
    public JAXBElement<String> createAccountNumberExpress(String value) {
        return new JAXBElement<String>(_AccountNumberExpress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "streetNumberCode")
    public JAXBElement<String> createStreetNumberCode(String value) {
        return new JAXBElement<String>(_StreetNumberCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "licensePlate")
    public JAXBElement<String> createLicensePlate(String value) {
        return new JAXBElement<String>(_LicensePlate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "city")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "routingCode")
    public JAXBElement<String> createRoutingCode(String value) {
        return new JAXBElement<String>(_RoutingCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhl.de/webservice/cisbase", name = "EKP")
    public JAXBElement<String> createEKP(String value) {
        return new JAXBElement<String>(_EKP_QNAME, String.class, null, value);
    }

}
