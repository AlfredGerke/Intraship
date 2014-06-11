
package intraship.ws.de;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DDShipmentServiceGroupIdentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDShipmentServiceGroupIdentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Ident">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="DateOfBirth">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="10"/>
 *                           &lt;maxLength value="10"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="IdentityCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="IdentityCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="IdentExtra">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Group1" type="{http://de.ws.intraship}IdentityData"/>
 *                     &lt;element name="Group2" type="{http://de.ws.intraship}IdentityData"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="IdentPremium">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="IdentityCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="IdentityCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="DateOfBirth" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="10"/>
 *                           &lt;maxLength value="10"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="StreetAndHouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="PostcodeAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="WithIDPContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="FreeText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="FreeText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="CorrOfNameAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfFirstNameAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfDayOfBirthAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfMinimumAgeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfIdentityCardTypeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfIdentityCardNumberAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfAddressAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfContractAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfContractIdAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfNationalityAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="CorrOfFreetextsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Personally" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ProofOfDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ContractSubmission">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TotalPages">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minInclusive value="0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="TotalSignatures">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minInclusive value="0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="TotalDocsSender">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minInclusive value="0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="TotalDocsReceiver">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minInclusive value="0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SMSAviso">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="MobilePhoneNumberSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="MobilePhoneNumberReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="AvisoIdent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="CheckMinimumAge">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDShipmentServiceGroupIdentType", namespace = "http://de.ws.intraship", propOrder = {
    "checkMinimumAge",
    "smsAviso",
    "contractSubmission",
    "proofOfDelivery",
    "returnReceipt",
    "personally",
    "identPremium",
    "identExtra",
    "ident"
})
public class DDShipmentServiceGroupIdentType {

    @XmlElement(name = "CheckMinimumAge")
    protected DDShipmentServiceGroupIdentType.CheckMinimumAge checkMinimumAge;
    @XmlElement(name = "SMSAviso")
    protected DDShipmentServiceGroupIdentType.SMSAviso smsAviso;
    @XmlElement(name = "ContractSubmission")
    protected DDShipmentServiceGroupIdentType.ContractSubmission contractSubmission;
    @XmlElement(name = "ProofOfDelivery")
    protected Boolean proofOfDelivery;
    @XmlElement(name = "ReturnReceipt")
    protected Boolean returnReceipt;
    @XmlElement(name = "Personally")
    protected Boolean personally;
    @XmlElement(name = "IdentPremium")
    protected DDShipmentServiceGroupIdentType.IdentPremium identPremium;
    @XmlElement(name = "IdentExtra")
    protected DDShipmentServiceGroupIdentType.IdentExtra identExtra;
    @XmlElement(name = "Ident")
    protected DDShipmentServiceGroupIdentType.Ident ident;

    /**
     * Ruft den Wert der checkMinimumAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.CheckMinimumAge }
     *     
     */
    public DDShipmentServiceGroupIdentType.CheckMinimumAge getCheckMinimumAge() {
        return checkMinimumAge;
    }

    /**
     * Legt den Wert der checkMinimumAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.CheckMinimumAge }
     *     
     */
    public void setCheckMinimumAge(DDShipmentServiceGroupIdentType.CheckMinimumAge value) {
        this.checkMinimumAge = value;
    }

    /**
     * Ruft den Wert der smsAviso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.SMSAviso }
     *     
     */
    public DDShipmentServiceGroupIdentType.SMSAviso getSMSAviso() {
        return smsAviso;
    }

    /**
     * Legt den Wert der smsAviso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.SMSAviso }
     *     
     */
    public void setSMSAviso(DDShipmentServiceGroupIdentType.SMSAviso value) {
        this.smsAviso = value;
    }

    /**
     * Ruft den Wert der contractSubmission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.ContractSubmission }
     *     
     */
    public DDShipmentServiceGroupIdentType.ContractSubmission getContractSubmission() {
        return contractSubmission;
    }

    /**
     * Legt den Wert der contractSubmission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.ContractSubmission }
     *     
     */
    public void setContractSubmission(DDShipmentServiceGroupIdentType.ContractSubmission value) {
        this.contractSubmission = value;
    }

    /**
     * Ruft den Wert der proofOfDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProofOfDelivery() {
        return proofOfDelivery;
    }

    /**
     * Legt den Wert der proofOfDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProofOfDelivery(Boolean value) {
        this.proofOfDelivery = value;
    }

    /**
     * Ruft den Wert der returnReceipt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnReceipt() {
        return returnReceipt;
    }

    /**
     * Legt den Wert der returnReceipt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnReceipt(Boolean value) {
        this.returnReceipt = value;
    }

    /**
     * Ruft den Wert der personally-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPersonally() {
        return personally;
    }

    /**
     * Legt den Wert der personally-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonally(Boolean value) {
        this.personally = value;
    }

    /**
     * Ruft den Wert der identPremium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.IdentPremium }
     *     
     */
    public DDShipmentServiceGroupIdentType.IdentPremium getIdentPremium() {
        return identPremium;
    }

    /**
     * Legt den Wert der identPremium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.IdentPremium }
     *     
     */
    public void setIdentPremium(DDShipmentServiceGroupIdentType.IdentPremium value) {
        this.identPremium = value;
    }

    /**
     * Ruft den Wert der identExtra-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.IdentExtra }
     *     
     */
    public DDShipmentServiceGroupIdentType.IdentExtra getIdentExtra() {
        return identExtra;
    }

    /**
     * Legt den Wert der identExtra-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.IdentExtra }
     *     
     */
    public void setIdentExtra(DDShipmentServiceGroupIdentType.IdentExtra value) {
        this.identExtra = value;
    }

    /**
     * Ruft den Wert der ident-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType.Ident }
     *     
     */
    public DDShipmentServiceGroupIdentType.Ident getIdent() {
        return ident;
    }

    /**
     * Legt den Wert der ident-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType.Ident }
     *     
     */
    public void setIdent(DDShipmentServiceGroupIdentType.Ident value) {
        this.ident = value;
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
     *         &lt;element name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "minimumAge"
    })
    public static class CheckMinimumAge {

        @XmlElement(name = "MinimumAge", required = true)
        protected String minimumAge;

        /**
         * Ruft den Wert der minimumAge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinimumAge() {
            return minimumAge;
        }

        /**
         * Legt den Wert der minimumAge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinimumAge(String value) {
            this.minimumAge = value;
        }

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
     *         &lt;element name="TotalPages">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalSignatures">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalDocsSender">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalDocsReceiver">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "totalPages",
        "totalSignatures",
        "totalDocsSender",
        "totalDocsReceiver"
    })
    public static class ContractSubmission {

        @XmlElement(name = "TotalPages", required = true)
        protected BigInteger totalPages;
        @XmlElement(name = "TotalSignatures", required = true)
        protected BigInteger totalSignatures;
        @XmlElement(name = "TotalDocsSender", required = true)
        protected BigInteger totalDocsSender;
        @XmlElement(name = "TotalDocsReceiver", required = true)
        protected BigInteger totalDocsReceiver;

        /**
         * Ruft den Wert der totalPages-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalPages() {
            return totalPages;
        }

        /**
         * Legt den Wert der totalPages-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalPages(BigInteger value) {
            this.totalPages = value;
        }

        /**
         * Ruft den Wert der totalSignatures-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalSignatures() {
            return totalSignatures;
        }

        /**
         * Legt den Wert der totalSignatures-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalSignatures(BigInteger value) {
            this.totalSignatures = value;
        }

        /**
         * Ruft den Wert der totalDocsSender-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalDocsSender() {
            return totalDocsSender;
        }

        /**
         * Legt den Wert der totalDocsSender-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalDocsSender(BigInteger value) {
            this.totalDocsSender = value;
        }

        /**
         * Ruft den Wert der totalDocsReceiver-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalDocsReceiver() {
            return totalDocsReceiver;
        }

        /**
         * Legt den Wert der totalDocsReceiver-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalDocsReceiver(BigInteger value) {
            this.totalDocsReceiver = value;
        }

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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DateOfBirth">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="10"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IdentityCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IdentityCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "dateOfBirth",
        "identityCardType",
        "identityCardNumber"
    })
    public static class Ident {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "DateOfBirth", required = true)
        protected String dateOfBirth;
        @XmlElement(name = "IdentityCardType", required = true)
        protected String identityCardType;
        @XmlElement(name = "IdentityCardNumber", required = true)
        protected String identityCardNumber;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der dateOfBirth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Legt den Wert der dateOfBirth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(String value) {
            this.dateOfBirth = value;
        }

        /**
         * Ruft den Wert der identityCardType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityCardType() {
            return identityCardType;
        }

        /**
         * Legt den Wert der identityCardType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityCardType(String value) {
            this.identityCardType = value;
        }

        /**
         * Ruft den Wert der identityCardNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityCardNumber() {
            return identityCardNumber;
        }

        /**
         * Legt den Wert der identityCardNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityCardNumber(String value) {
            this.identityCardNumber = value;
        }

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
     *         &lt;element name="Group1" type="{http://de.ws.intraship}IdentityData"/>
     *         &lt;element name="Group2" type="{http://de.ws.intraship}IdentityData"/>
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
        "group1",
        "group2"
    })
    public static class IdentExtra {

        @XmlElement(name = "Group1", required = true)
        protected IdentityData group1;
        @XmlElement(name = "Group2", required = true)
        protected IdentityData group2;

        /**
         * Ruft den Wert der group1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link IdentityData }
         *     
         */
        public IdentityData getGroup1() {
            return group1;
        }

        /**
         * Legt den Wert der group1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentityData }
         *     
         */
        public void setGroup1(IdentityData value) {
            this.group1 = value;
        }

        /**
         * Ruft den Wert der group2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link IdentityData }
         *     
         */
        public IdentityData getGroup2() {
            return group2;
        }

        /**
         * Legt den Wert der group2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentityData }
         *     
         */
        public void setGroup2(IdentityData value) {
            this.group2 = value;
        }

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
     *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IdentityCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IdentityCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DateOfBirth" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="10"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StreetAndHouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostcodeAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WithIDPContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FreeText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FreeText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CorrOfNameAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfFirstNameAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfDayOfBirthAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfMinimumAgeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfIdentityCardTypeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfIdentityCardNumberAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfAddressAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfContractAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfContractIdAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfNationalityAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CorrOfFreetextsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "firstname",
        "name",
        "identityCardType",
        "identityCardNumber",
        "minimumAge",
        "dateOfBirth",
        "streetAndHouseNumber",
        "postcodeAndCity",
        "district",
        "withIDPContract",
        "contractID",
        "nationality",
        "freeText1",
        "freeText2",
        "corrOfNameAllowed",
        "corrOfFirstNameAllowed",
        "corrOfDayOfBirthAllowed",
        "corrOfMinimumAgeAllowed",
        "corrOfIdentityCardTypeAllowed",
        "corrOfIdentityCardNumberAllowed",
        "corrOfAddressAllowed",
        "corrOfContractAllowed",
        "corrOfContractIdAllowed",
        "corrOfNationalityAllowed",
        "corrOfFreetextsAllowed"
    })
    public static class IdentPremium {

        @XmlElement(name = "Firstname")
        protected String firstname;
        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "IdentityCardType")
        protected String identityCardType;
        @XmlElement(name = "IdentityCardNumber")
        protected String identityCardNumber;
        @XmlElement(name = "MinimumAge")
        protected String minimumAge;
        @XmlElement(name = "DateOfBirth")
        protected String dateOfBirth;
        @XmlElement(name = "StreetAndHouseNumber", required = true)
        protected String streetAndHouseNumber;
        @XmlElement(name = "PostcodeAndCity")
        protected String postcodeAndCity;
        @XmlElement(name = "District")
        protected String district;
        @XmlElement(name = "WithIDPContract")
        protected Boolean withIDPContract;
        @XmlElement(name = "ContractID")
        protected String contractID;
        @XmlElement(name = "Nationality")
        protected String nationality;
        @XmlElement(name = "FreeText1")
        protected String freeText1;
        @XmlElement(name = "FreeText2")
        protected String freeText2;
        @XmlElement(name = "CorrOfNameAllowed")
        protected Boolean corrOfNameAllowed;
        @XmlElement(name = "CorrOfFirstNameAllowed")
        protected Boolean corrOfFirstNameAllowed;
        @XmlElement(name = "CorrOfDayOfBirthAllowed")
        protected Boolean corrOfDayOfBirthAllowed;
        @XmlElement(name = "CorrOfMinimumAgeAllowed")
        protected Boolean corrOfMinimumAgeAllowed;
        @XmlElement(name = "CorrOfIdentityCardTypeAllowed")
        protected Boolean corrOfIdentityCardTypeAllowed;
        @XmlElement(name = "CorrOfIdentityCardNumberAllowed")
        protected Boolean corrOfIdentityCardNumberAllowed;
        @XmlElement(name = "CorrOfAddressAllowed")
        protected Boolean corrOfAddressAllowed;
        @XmlElement(name = "CorrOfContractAllowed")
        protected Boolean corrOfContractAllowed;
        @XmlElement(name = "CorrOfContractIdAllowed")
        protected Boolean corrOfContractIdAllowed;
        @XmlElement(name = "CorrOfNationalityAllowed")
        protected Boolean corrOfNationalityAllowed;
        @XmlElement(name = "CorrOfFreetextsAllowed")
        protected Boolean corrOfFreetextsAllowed;

        /**
         * Ruft den Wert der firstname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         * Legt den Wert der firstname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstname(String value) {
            this.firstname = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der identityCardType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityCardType() {
            return identityCardType;
        }

        /**
         * Legt den Wert der identityCardType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityCardType(String value) {
            this.identityCardType = value;
        }

        /**
         * Ruft den Wert der identityCardNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityCardNumber() {
            return identityCardNumber;
        }

        /**
         * Legt den Wert der identityCardNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityCardNumber(String value) {
            this.identityCardNumber = value;
        }

        /**
         * Ruft den Wert der minimumAge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinimumAge() {
            return minimumAge;
        }

        /**
         * Legt den Wert der minimumAge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinimumAge(String value) {
            this.minimumAge = value;
        }

        /**
         * Ruft den Wert der dateOfBirth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Legt den Wert der dateOfBirth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(String value) {
            this.dateOfBirth = value;
        }

        /**
         * Ruft den Wert der streetAndHouseNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetAndHouseNumber() {
            return streetAndHouseNumber;
        }

        /**
         * Legt den Wert der streetAndHouseNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetAndHouseNumber(String value) {
            this.streetAndHouseNumber = value;
        }

        /**
         * Ruft den Wert der postcodeAndCity-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcodeAndCity() {
            return postcodeAndCity;
        }

        /**
         * Legt den Wert der postcodeAndCity-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcodeAndCity(String value) {
            this.postcodeAndCity = value;
        }

        /**
         * Ruft den Wert der district-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrict() {
            return district;
        }

        /**
         * Legt den Wert der district-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrict(String value) {
            this.district = value;
        }

        /**
         * Ruft den Wert der withIDPContract-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getWithIDPContract() {
            return withIDPContract;
        }

        /**
         * Legt den Wert der withIDPContract-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWithIDPContract(Boolean value) {
            this.withIDPContract = value;
        }

        /**
         * Ruft den Wert der contractID-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractID() {
            return contractID;
        }

        /**
         * Legt den Wert der contractID-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractID(String value) {
            this.contractID = value;
        }

        /**
         * Ruft den Wert der nationality-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Legt den Wert der nationality-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Ruft den Wert der freeText1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeText1() {
            return freeText1;
        }

        /**
         * Legt den Wert der freeText1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeText1(String value) {
            this.freeText1 = value;
        }

        /**
         * Ruft den Wert der freeText2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeText2() {
            return freeText2;
        }

        /**
         * Legt den Wert der freeText2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeText2(String value) {
            this.freeText2 = value;
        }

        /**
         * Ruft den Wert der corrOfNameAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfNameAllowed() {
            return corrOfNameAllowed;
        }

        /**
         * Legt den Wert der corrOfNameAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfNameAllowed(Boolean value) {
            this.corrOfNameAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfFirstNameAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfFirstNameAllowed() {
            return corrOfFirstNameAllowed;
        }

        /**
         * Legt den Wert der corrOfFirstNameAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfFirstNameAllowed(Boolean value) {
            this.corrOfFirstNameAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfDayOfBirthAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfDayOfBirthAllowed() {
            return corrOfDayOfBirthAllowed;
        }

        /**
         * Legt den Wert der corrOfDayOfBirthAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfDayOfBirthAllowed(Boolean value) {
            this.corrOfDayOfBirthAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfMinimumAgeAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfMinimumAgeAllowed() {
            return corrOfMinimumAgeAllowed;
        }

        /**
         * Legt den Wert der corrOfMinimumAgeAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfMinimumAgeAllowed(Boolean value) {
            this.corrOfMinimumAgeAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfIdentityCardTypeAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfIdentityCardTypeAllowed() {
            return corrOfIdentityCardTypeAllowed;
        }

        /**
         * Legt den Wert der corrOfIdentityCardTypeAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfIdentityCardTypeAllowed(Boolean value) {
            this.corrOfIdentityCardTypeAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfIdentityCardNumberAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfIdentityCardNumberAllowed() {
            return corrOfIdentityCardNumberAllowed;
        }

        /**
         * Legt den Wert der corrOfIdentityCardNumberAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfIdentityCardNumberAllowed(Boolean value) {
            this.corrOfIdentityCardNumberAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfAddressAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfAddressAllowed() {
            return corrOfAddressAllowed;
        }

        /**
         * Legt den Wert der corrOfAddressAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfAddressAllowed(Boolean value) {
            this.corrOfAddressAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfContractAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfContractAllowed() {
            return corrOfContractAllowed;
        }

        /**
         * Legt den Wert der corrOfContractAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfContractAllowed(Boolean value) {
            this.corrOfContractAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfContractIdAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfContractIdAllowed() {
            return corrOfContractIdAllowed;
        }

        /**
         * Legt den Wert der corrOfContractIdAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfContractIdAllowed(Boolean value) {
            this.corrOfContractIdAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfNationalityAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfNationalityAllowed() {
            return corrOfNationalityAllowed;
        }

        /**
         * Legt den Wert der corrOfNationalityAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfNationalityAllowed(Boolean value) {
            this.corrOfNationalityAllowed = value;
        }

        /**
         * Ruft den Wert der corrOfFreetextsAllowed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCorrOfFreetextsAllowed() {
            return corrOfFreetextsAllowed;
        }

        /**
         * Legt den Wert der corrOfFreetextsAllowed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorrOfFreetextsAllowed(Boolean value) {
            this.corrOfFreetextsAllowed = value;
        }

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
     *         &lt;element name="MobilePhoneNumberSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MobilePhoneNumberReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AvisoIdent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "mobilePhoneNumberSender",
        "mobilePhoneNumberReceiver",
        "avisoIdent"
    })
    public static class SMSAviso {

        @XmlElement(name = "MobilePhoneNumberSender", required = true)
        protected String mobilePhoneNumberSender;
        @XmlElement(name = "MobilePhoneNumberReceiver", required = true)
        protected String mobilePhoneNumberReceiver;
        @XmlElement(name = "AvisoIdent", required = true)
        protected String avisoIdent;

        /**
         * Ruft den Wert der mobilePhoneNumberSender-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilePhoneNumberSender() {
            return mobilePhoneNumberSender;
        }

        /**
         * Legt den Wert der mobilePhoneNumberSender-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilePhoneNumberSender(String value) {
            this.mobilePhoneNumberSender = value;
        }

        /**
         * Ruft den Wert der mobilePhoneNumberReceiver-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilePhoneNumberReceiver() {
            return mobilePhoneNumberReceiver;
        }

        /**
         * Legt den Wert der mobilePhoneNumberReceiver-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilePhoneNumberReceiver(String value) {
            this.mobilePhoneNumberReceiver = value;
        }

        /**
         * Ruft den Wert der avisoIdent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvisoIdent() {
            return avisoIdent;
        }

        /**
         * Legt den Wert der avisoIdent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvisoIdent(String value) {
            this.avisoIdent = value;
        }

    }

}
