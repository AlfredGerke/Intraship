package de.intraship.req;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.wavemaker.runtime.javaservice.JavaServiceSuperClass;
import com.wavemaker.runtime.service.annotations.ExposeToClient;

import intrashipservice.ws.de.isservice_1_0_de.CommunicationTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType.Company;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType.Person;
import intrashipservice.ws.de.isservice_1_0_de.NativeAddressTypeType;
import intrashipservice.ws.de.isservice_1_0_de.Origin;
import intrashipservice.ws.de.isservice_1_0_de.Version;
import intrashipservice.ws.de.isservice_1_0_de.Zip;

import intraship.ws.de.CreateShipmentDDRequest;
import intraship.ws.de.ReceiverDDType;
import intraship.ws.de.ShipmentDetailsDDType;
import intraship.ws.de.ShipmentItemDDType;
import intraship.ws.de.ShipmentOrderDDType;
import intraship.ws.de.ShipperDDType;

@ExposeToClient
public class BusinessClientApiRequests extends JavaServiceSuperClass {

  public BusinessClientApiRequests() {
    super(INFO);
  }

  private Version createVersion() {
    Version version = new Version();
    
    version.setMajorRelease(TestConstants.MAJOR_RELEASE);
    version.setMinorRelease(TestConstants.MINOR_RELEASE);

    return version;
  }

  private ShipmentItemDDType createDefaultShipmentItemDDType() {
    ShipmentItemDDType shipmentItem = new ShipmentItemDDType();
    
    shipmentItem.setWeightInKG(new BigDecimal("3"));
    shipmentItem.setLengthInCM(new BigInteger("50"));
    shipmentItem.setWidthInCM(new BigInteger("30"));
    shipmentItem.setHeightInCM(new BigInteger("15"));
    shipmentItem.setPackageType("PK");

    return shipmentItem;
  }

  private ShipmentDetailsDDType createShipmentDetailsDDType(int shipmentItemNb) {
    SimpleDateFormat formatter = new SimpleDateFormat(TestConstants.SDF);
    ShipmentDetailsDDType shipmentDetails = new ShipmentDetailsDDType();
    ShipmentDetailsDDType.Attendance attendance = new ShipmentDetailsDDType.Attendance();
    
    Calendar today = Calendar.getInstance();

    today.add(Calendar.DAY_OF_MONTH,  2);
    
    shipmentDetails.setProductCode(TestConstants.DD_PROD_CODE);
    shipmentDetails.setShipmentDate(formatter.format(today.getTime()));
    shipmentDetails.setEKP(TestConstants.EKP);

    attendance.setPartnerID(TestConstants.PARTNER_ID);
    shipmentDetails.setAttendance(attendance);

    for (int i = 0; i < shipmentItemNb; i++) {
      shipmentDetails.getShipmentItems().add(createDefaultShipmentItemDDType());
    }

    shipmentDetails.setDescription(TestConstants.SHIPMENT_DESC);

    return shipmentDetails;
  }

  private NameTypeType createShipperCompany() {
    Company company = new Company();
    NameTypeType name = new NameTypeType();
    
    company.setName1(TestConstants.SHIPPER_COMPANY_NAME);    
    name.setCompany(company);

    return name;
  }
  
  private NativeAddressTypeType createShipperNativeAddressType() {

    NativeAddressTypeType address = new NativeAddressTypeType();
    Zip zip = new Zip();
    Origin origin = new Origin();
    
    address.setStreetName(TestConstants.SHIPPER_STREET);
    address.setStreetNumber(TestConstants.SHIPPER_STREETNR);
    address.setCity(TestConstants.SHIPPER_CITY);
    
    zip.setGermany(TestConstants.SHIPPER_ZIP);
    address.setZip(zip); 
    
    origin.setCountryISOCode(TestConstants.SHIPPER_COUNTRY_CODE);
    address.setOrigin(origin);

    return address;
  }
 
  private CommunicationTypeType createShipperCommunicationType() {
    CommunicationTypeType communication = new CommunicationTypeType();
    
    communication.setEmail(TestConstants.SHIPPER_CONTACT_EMAIL);
    communication.setContactPerson(TestConstants.SHIPPER_CONTACT_NAME);
    communication.setPhone(TestConstants.SHIPPER_CONTACT_PHONE);
    
    return communication;
  }

  private NameTypeType createReceiverCompany(boolean isPerson) {
    NameTypeType name = new NameTypeType();

    if (isPerson){
      Person person = new Person();
      person.setFirstname(TestConstants.RECEIVER_FIRST_NAME);
      person.setLastname(TestConstants.RECEIVER_LAST_NAME);
      name.setPerson(person);
    } else{
      Company company = new Company();
      company.setName1(TestConstants.RECEIVER_COMPANY_NAME);
      name.setCompany(company);
    }
    
    return name;
  }
  
  private NativeAddressTypeType createReceiverNativeAddressType(boolean worldwide) {

    NativeAddressTypeType address = new NativeAddressTypeType();
    Zip zip = new Zip();
    Origin origin = new Origin();
    
    if (!worldwide){
      address.setStreetName(TestConstants.RECEIVER_LOCAL_STREET);
      address.setStreetNumber(TestConstants.RECEIVER_LOCAL_STREETNR);
      address.setCity(TestConstants.RECEIVER_LOCAL_CITY);
      zip.setGermany(TestConstants.RECEIVER_LOCAL_ZIP);
      origin.setCountryISOCode(TestConstants.RECEIVER_LOCAL_COUNTRY_CODE);
    } else {
      address.setStreetName(TestConstants.RECEIVER_WWIDE_STREET);
      address.setStreetNumber(TestConstants.RECEIVER_WWIDE_STREETNR);
      address.setCity(TestConstants.RECEIVER_WWIDE_CITY);
      zip.setOther(TestConstants.RECEIVER_WWIDE_ZIP);
      origin.setCountry(TestConstants.RECEIVER_WWIDE_COUNTRY);
      origin.setCountryISOCode(TestConstants.RECEIVER_WWIDE_COUNTRY_CODE);
    }
    address.setZip(zip); 
    address.setOrigin(origin);
    
    return address;
  }
    
  private CommunicationTypeType createReceiverCommunicationType() {
    CommunicationTypeType communication = new CommunicationTypeType();
    
    communication.setEmail(TestConstants.RECEIVER_CONTACT_EMAIL);
    communication.setContactPerson(TestConstants.RECEIVER_CONTACT_NAME);
    communication.setPhone(TestConstants.RECEIVER_CONTACT_PHONE);
    
    return communication;
  }
  
  public CreateShipmentDDRequest getShipmentDDRequest(Boolean isXMLLabel) {

    CreateShipmentDDRequest createShipmentDDRequest = new CreateShipmentDDRequest();

    createShipmentDDRequest.setVersion(createVersion());

    ShipmentOrderDDType shipmentOrderDDType = new ShipmentOrderDDType();
    shipmentOrderDDType.setSequenceNumber("1");

    ShipmentOrderDDType.Shipment shipment = new ShipmentOrderDDType.Shipment();
    shipmentOrderDDType.setShipment(shipment);

    shipment.setShipmentDetails(createShipmentDetailsDDType(1));

    ShipperDDType shipper = new ShipperDDType();
    shipment.setShipper(shipper);

    shipper.setCompany(createShipperCompany());

    shipper.setAddress(createShipperNativeAddressType());

    shipper.setCommunication(createShipperCommunicationType());

    ReceiverDDType receiver = new ReceiverDDType();
    shipment.setReceiver(receiver);

    receiver.setCompany(createReceiverCompany(true));

    receiver.setAddress(createReceiverNativeAddressType(false));

    receiver.setCommunication(createReceiverCommunicationType());

    if (isXMLLabel) {
      shipmentOrderDDType.setLabelResponseType("XML");
    } else {
      shipmentOrderDDType.setLabelResponseType("URL");
    }

    createShipmentDDRequest.getShipmentOrders().add(shipmentOrderDDType);

    return createShipmentDDRequest;
  }

}