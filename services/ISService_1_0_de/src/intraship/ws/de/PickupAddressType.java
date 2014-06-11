
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.CommunicationTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NativeAddressTypeType;


/**
 * 
 * The pickup address. In the PickupType the following data fields are processed/mandatory/optional:
 * ----------------------------------------------------------------------------------------------
 * Company Name 1   (mandatory): cis:NameType->Company->name1
 * Contact Name     (mandatory): cis:CommunicationType->contactPerson
 * Street Name      (mandatory): cis:NativeAddressType->streetName
 * Street Number    (mandatory): cis:NativeAddressType->streetNumber
 * Add. Address 	 (optional) : cis:NativeAddressType->careOfName
 * Postcode         (mandatory): cis:NativeAddressType->zip
 * City Name		 (mandatory): cis:NativeAddressType->city
 * ISO Country Code (mandatory): cis:NativeAddressType->Origin->CountryType->countryISOType 
 * Phone Number     (mandatory): cis:CommunicationType->phone
 * Email Address    (mandatory): cis:CommunicationType->email
 * 			
 * 
 * <p>Java-Klasse für PickupAddressType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PickupAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://dhl.de/webservice/cisbase}NameType"/>
 *         &lt;element name="Address" type="{http://dhl.de/webservice/cisbase}NativeAddressType"/>
 *         &lt;element name="Communication" type="{http://dhl.de/webservice/cisbase}CommunicationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupAddressType", namespace = "http://de.ws.intraship", propOrder = {
    "company",
    "address",
    "communication"
})
public class PickupAddressType {

    @XmlElement(name = "Company", required = true)
    protected NameTypeType company;
    @XmlElement(name = "Address", required = true)
    protected NativeAddressTypeType address;
    @XmlElement(name = "Communication", required = true)
    protected CommunicationTypeType communication;

    /**
     * Ruft den Wert der company-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeType }
     *     
     */
    public NameTypeType getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeType }
     *     
     */
    public void setCompany(NameTypeType value) {
        this.company = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public NativeAddressTypeType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public void setAddress(NativeAddressTypeType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der communication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationTypeType }
     *     
     */
    public CommunicationTypeType getCommunication() {
        return communication;
    }

    /**
     * Legt den Wert der communication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationTypeType }
     *     
     */
    public void setCommunication(CommunicationTypeType value) {
        this.communication = value;
    }

}
