
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.CommunicationTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NativeAddressTypeType;


/**
 * Further address information
 * The following data fields from the cis_base-types are processed/mandatory/optional:
 * -------------------------------------------------------------------------------------------------------
 * Salutation		 (optional) : cis:NameType->Person->salutation
 * Company Name 1   (mandatory): cis:NameType->Company->name1
 * Company Name 2   (optional) : cis:NameType->Company->name2
 * Contact Name     (mandatory): cis:CommunicationType->contactPerson
 * Street Name      (mandatory): cis:NativeAddressType->streetName
 * Street Number    (mandatory): cis:NativeAddressType->streetNumber
 * Add. Address     (optional) : cis:NativeAddressType->careOfName
 * Postcode         (mandatory): cis:NativeAddressType->zip
 * City Name		 (mandatory): cis:NativeAddressType->city
 * ISO Country Code (mandatory): cis:NativeAddressType->Origin->CountryType->countryISOType 
 * Phone Number     (mandatory): cis:CommunicationType->phone
 * Email Address    (mandatory): cis:CommunicationType->email						
 * 			
 * 
 * <p>Java-Klasse für FurtherAddressesDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FurtherAddressesDDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryAdress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Company" type="{http://dhl.de/webservice/cisbase}NameType"/>
 *                   &lt;element name="Name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address" type="{http://dhl.de/webservice/cisbase}NativeAddressType"/>
 *                   &lt;element name="Communication" type="{http://dhl.de/webservice/cisbase}CommunicationType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FurtherAddressesDDType", namespace = "http://de.ws.intraship", propOrder = {
    "deliveryAdress"
})
public class FurtherAddressesDDType {

    @XmlElement(name = "DeliveryAdress")
    protected FurtherAddressesDDType.DeliveryAdress deliveryAdress;

    /**
     * Ruft den Wert der deliveryAdress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FurtherAddressesDDType.DeliveryAdress }
     *     
     */
    public FurtherAddressesDDType.DeliveryAdress getDeliveryAdress() {
        return deliveryAdress;
    }

    /**
     * Legt den Wert der deliveryAdress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherAddressesDDType.DeliveryAdress }
     *     
     */
    public void setDeliveryAdress(FurtherAddressesDDType.DeliveryAdress value) {
        this.deliveryAdress = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Company" type="{http://dhl.de/webservice/cisbase}NameType"/>
     *         &lt;element name="Name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "company",
        "name3",
        "address",
        "communication"
    })
    public static class DeliveryAdress {

        @XmlElement(name = "Company", required = true)
        protected NameTypeType company;
        @XmlElement(name = "Name3")
        protected String name3;
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
         * Ruft den Wert der name3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName3() {
            return name3;
        }

        /**
         * Legt den Wert der name3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName3(String value) {
            this.name3 = value;
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

}
