
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identity data (used e.g. for ident
 * 				services)
 * 
 * <p>Java-Klasse für IdentityData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IdentityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DrivingLicense">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="Authority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="IdentityCard">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="CardAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="BankCard">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "IdentityData", namespace = "http://de.ws.intraship", propOrder = {
    "bankCard",
    "identityCard",
    "drivingLicense"
})
public class IdentityData {

    @XmlElement(name = "BankCard")
    protected IdentityData.BankCard bankCard;
    @XmlElement(name = "IdentityCard")
    protected IdentityData.IdentityCard identityCard;
    @XmlElement(name = "DrivingLicense")
    protected IdentityData.DrivingLicense drivingLicense;

    /**
     * Ruft den Wert der bankCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityData.BankCard }
     *     
     */
    public IdentityData.BankCard getBankCard() {
        return bankCard;
    }

    /**
     * Legt den Wert der bankCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityData.BankCard }
     *     
     */
    public void setBankCard(IdentityData.BankCard value) {
        this.bankCard = value;
    }

    /**
     * Ruft den Wert der identityCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityData.IdentityCard }
     *     
     */
    public IdentityData.IdentityCard getIdentityCard() {
        return identityCard;
    }

    /**
     * Legt den Wert der identityCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityData.IdentityCard }
     *     
     */
    public void setIdentityCard(IdentityData.IdentityCard value) {
        this.identityCard = value;
    }

    /**
     * Ruft den Wert der drivingLicense-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityData.DrivingLicense }
     *     
     */
    public IdentityData.DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * Legt den Wert der drivingLicense-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityData.DrivingLicense }
     *     
     */
    public void setDrivingLicense(IdentityData.DrivingLicense value) {
        this.drivingLicense = value;
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
     *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "cardType",
        "cardNumber",
        "bankName",
        "bankCode"
    })
    public static class BankCard {

        @XmlElement(name = "CardType", required = true)
        protected String cardType;
        @XmlElement(name = "CardNumber", required = true)
        protected String cardNumber;
        @XmlElement(name = "BankName", required = true)
        protected String bankName;
        @XmlElement(name = "BankCode", required = true)
        protected String bankCode;

        /**
         * Ruft den Wert der cardType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * Legt den Wert der cardType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardType(String value) {
            this.cardType = value;
        }

        /**
         * Ruft den Wert der cardNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Legt den Wert der cardNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Ruft den Wert der bankName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankName() {
            return bankName;
        }

        /**
         * Legt den Wert der bankName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankName(String value) {
            this.bankName = value;
        }

        /**
         * Ruft den Wert der bankCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * Legt den Wert der bankCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCode(String value) {
            this.bankCode = value;
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
     *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Authority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "licenseNumber",
        "authority"
    })
    public static class DrivingLicense {

        @XmlElement(name = "LicenseNumber", required = true)
        protected String licenseNumber;
        @XmlElement(name = "Authority", required = true)
        protected String authority;

        /**
         * Ruft den Wert der licenseNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNumber() {
            return licenseNumber;
        }

        /**
         * Legt den Wert der licenseNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNumber(String value) {
            this.licenseNumber = value;
        }

        /**
         * Ruft den Wert der authority-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthority() {
            return authority;
        }

        /**
         * Legt den Wert der authority-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthority(String value) {
            this.authority = value;
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
     *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "cardNumber",
        "cardAuthority"
    })
    public static class IdentityCard {

        @XmlElement(name = "CardNumber", required = true)
        protected String cardNumber;
        @XmlElement(name = "CardAuthority", required = true)
        protected String cardAuthority;

        /**
         * Ruft den Wert der cardNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Legt den Wert der cardNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Ruft den Wert der cardAuthority-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardAuthority() {
            return cardAuthority;
        }

        /**
         * Legt den Wert der cardAuthority-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardAuthority(String value) {
            this.cardAuthority = value;
        }

    }

}
