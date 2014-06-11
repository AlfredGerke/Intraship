
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Group DHL Paket.
 * 
 * <p>Java-Klasse für DDServiceGroupDHLPaketType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDServiceGroupDHLPaketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Multipack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="RegioPacket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ParticularDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ShipmentAdvisory">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AdvisoryData" maxOccurs="999">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ModuleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="MobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Endorsement">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="UZN" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
 *                     &lt;element name="KeNa" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
 *                     &lt;element name="NSI" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
 *                     &lt;element name="TeZu" type="{http://de.ws.intraship}EndorsementServiceconfigurationTeZu" minOccurs="0"/>
 *                     &lt;element name="SoZue" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
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
@XmlType(name = "DDServiceGroupDHLPaketType", namespace = "http://de.ws.intraship", propOrder = {
    "endorsement",
    "shipmentAdvisory",
    "particularDelivery",
    "regioPacket",
    "multipack"
})
public class DDServiceGroupDHLPaketType {

    @XmlElement(name = "Endorsement")
    protected DDServiceGroupDHLPaketType.Endorsement endorsement;
    @XmlElement(name = "ShipmentAdvisory")
    protected DDServiceGroupDHLPaketType.ShipmentAdvisory shipmentAdvisory;
    @XmlElement(name = "ParticularDelivery")
    protected Boolean particularDelivery;
    @XmlElement(name = "RegioPacket")
    protected Boolean regioPacket;
    @XmlElement(name = "Multipack")
    protected Boolean multipack;

    /**
     * Ruft den Wert der endorsement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupDHLPaketType.Endorsement }
     *     
     */
    public DDServiceGroupDHLPaketType.Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Legt den Wert der endorsement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupDHLPaketType.Endorsement }
     *     
     */
    public void setEndorsement(DDServiceGroupDHLPaketType.Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Ruft den Wert der shipmentAdvisory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupDHLPaketType.ShipmentAdvisory }
     *     
     */
    public DDServiceGroupDHLPaketType.ShipmentAdvisory getShipmentAdvisory() {
        return shipmentAdvisory;
    }

    /**
     * Legt den Wert der shipmentAdvisory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupDHLPaketType.ShipmentAdvisory }
     *     
     */
    public void setShipmentAdvisory(DDServiceGroupDHLPaketType.ShipmentAdvisory value) {
        this.shipmentAdvisory = value;
    }

    /**
     * Ruft den Wert der particularDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParticularDelivery() {
        return particularDelivery;
    }

    /**
     * Legt den Wert der particularDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticularDelivery(Boolean value) {
        this.particularDelivery = value;
    }

    /**
     * Ruft den Wert der regioPacket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRegioPacket() {
        return regioPacket;
    }

    /**
     * Legt den Wert der regioPacket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegioPacket(Boolean value) {
        this.regioPacket = value;
    }

    /**
     * Ruft den Wert der multipack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMultipack() {
        return multipack;
    }

    /**
     * Legt den Wert der multipack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipack(Boolean value) {
        this.multipack = value;
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
     *         &lt;element name="UZN" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
     *         &lt;element name="KeNa" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
     *         &lt;element name="NSI" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
     *         &lt;element name="TeZu" type="{http://de.ws.intraship}EndorsementServiceconfigurationTeZu" minOccurs="0"/>
     *         &lt;element name="SoZue" type="{http://de.ws.intraship}EndorsementServiceconfiguration" minOccurs="0"/>
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
        "uzn",
        "keNa",
        "nsi",
        "teZu",
        "soZue"
    })
    public static class Endorsement {

        @XmlElement(name = "UZN")
        protected EndorsementServiceconfiguration uzn;
        @XmlElement(name = "KeNa")
        protected EndorsementServiceconfiguration keNa;
        @XmlElement(name = "NSI")
        protected EndorsementServiceconfiguration nsi;
        @XmlElement(name = "TeZu")
        protected EndorsementServiceconfigurationTeZu teZu;
        @XmlElement(name = "SoZue")
        protected EndorsementServiceconfiguration soZue;

        /**
         * Ruft den Wert der uzn-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public EndorsementServiceconfiguration getUZN() {
            return uzn;
        }

        /**
         * Legt den Wert der uzn-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public void setUZN(EndorsementServiceconfiguration value) {
            this.uzn = value;
        }

        /**
         * Ruft den Wert der keNa-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public EndorsementServiceconfiguration getKeNa() {
            return keNa;
        }

        /**
         * Legt den Wert der keNa-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public void setKeNa(EndorsementServiceconfiguration value) {
            this.keNa = value;
        }

        /**
         * Ruft den Wert der nsi-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public EndorsementServiceconfiguration getNSI() {
            return nsi;
        }

        /**
         * Legt den Wert der nsi-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public void setNSI(EndorsementServiceconfiguration value) {
            this.nsi = value;
        }

        /**
         * Ruft den Wert der teZu-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EndorsementServiceconfigurationTeZu }
         *     
         */
        public EndorsementServiceconfigurationTeZu getTeZu() {
            return teZu;
        }

        /**
         * Legt den Wert der teZu-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EndorsementServiceconfigurationTeZu }
         *     
         */
        public void setTeZu(EndorsementServiceconfigurationTeZu value) {
            this.teZu = value;
        }

        /**
         * Ruft den Wert der soZue-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public EndorsementServiceconfiguration getSoZue() {
            return soZue;
        }

        /**
         * Legt den Wert der soZue-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EndorsementServiceconfiguration }
         *     
         */
        public void setSoZue(EndorsementServiceconfiguration value) {
            this.soZue = value;
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
     *         &lt;element name="AdvisoryData" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ModuleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "advisoryDatas"
    })
    public static class ShipmentAdvisory {

        @XmlElement(name = "AdvisoryData", required = true)
        protected List<DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData> advisoryDatas;

        /**
         * Gets the value of the advisoryDatas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advisoryDatas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvisoryDatas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData }
         * 
         * 
         */
        public List<DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData> getAdvisoryDatas() {
            if (advisoryDatas == null) {
                advisoryDatas = new ArrayList<DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData>();
            }
            return this.advisoryDatas;
        }

        /**
         * Sets the value of the advisoryDatas property.
         * 
         * @param advisoryDatas
         *     allowed object is
         *     {@link DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData }
         *     
         */
        public void setAdvisoryDatas(List<DDServiceGroupDHLPaketType.ShipmentAdvisory.AdvisoryData> advisoryDatas) {
            this.advisoryDatas = advisoryDatas;
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
         *         &lt;element name="ModuleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "moduleType",
            "mobilePhoneNumber",
            "emailAddress",
            "reference",
            "language"
        })
        public static class AdvisoryData {

            @XmlElement(name = "ModuleType")
            protected String moduleType;
            @XmlElement(name = "MobilePhoneNumber")
            protected String mobilePhoneNumber;
            @XmlElement(name = "EmailAddress")
            protected String emailAddress;
            @XmlElement(name = "Reference")
            protected String reference;
            @XmlElement(name = "Language")
            protected String language;

            /**
             * Ruft den Wert der moduleType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModuleType() {
                return moduleType;
            }

            /**
             * Legt den Wert der moduleType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModuleType(String value) {
                this.moduleType = value;
            }

            /**
             * Ruft den Wert der mobilePhoneNumber-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMobilePhoneNumber() {
                return mobilePhoneNumber;
            }

            /**
             * Legt den Wert der mobilePhoneNumber-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMobilePhoneNumber(String value) {
                this.mobilePhoneNumber = value;
            }

            /**
             * Ruft den Wert der emailAddress-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Legt den Wert der emailAddress-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
            }

            /**
             * Ruft den Wert der reference-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Legt den Wert der reference-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * Ruft den Wert der language-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguage() {
                return language;
            }

            /**
             * Legt den Wert der language-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguage(String value) {
                this.language = value;
            }

        }

    }

}
