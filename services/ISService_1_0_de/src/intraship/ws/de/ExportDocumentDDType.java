
package intraship.ws.de;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The data of the export document for a DD
 * 				shipment.
 * 
 * <p>Java-Klasse für ExportDocumentDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExportDocumentDDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="proforma"/>
 *               &lt;enumeration value="commercial"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExportTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfTrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCodeOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalFee" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomsValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomsCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithElectronicExportNtfctn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExportDocPosition" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CountryCodeOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Amount">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetWeightInKG">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GrossWeightInKG">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CustomsValue">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CustomsCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ExportDocumentDDType", namespace = "http://de.ws.intraship", propOrder = {
    "invoiceType",
    "invoiceDate",
    "invoiceNumber",
    "exportType",
    "exportTypeDescription",
    "commodityCode",
    "termsOfTrade",
    "amount",
    "description",
    "countryCodeOrigin",
    "additionalFee",
    "customsValue",
    "customsCurrency",
    "permitNumber",
    "attestationNumber",
    "withElectronicExportNtfctn",
    "exportDocPositions"
})
public class ExportDocumentDDType {

    @XmlElement(name = "InvoiceType")
    protected String invoiceType;
    @XmlElement(name = "InvoiceDate", required = true)
    protected String invoiceDate;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "ExportType")
    protected String exportType;
    @XmlElement(name = "ExportTypeDescription")
    protected String exportTypeDescription;
    @XmlElement(name = "CommodityCode")
    protected String commodityCode;
    @XmlElement(name = "TermsOfTrade", required = true)
    protected String termsOfTrade;
    @XmlElement(name = "Amount", required = true)
    protected BigInteger amount;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "CountryCodeOrigin", required = true)
    protected String countryCodeOrigin;
    @XmlElement(name = "AdditionalFee")
    protected BigDecimal additionalFee;
    @XmlElement(name = "CustomsValue", required = true)
    protected BigDecimal customsValue;
    @XmlElement(name = "CustomsCurrency", required = true)
    protected String customsCurrency;
    @XmlElement(name = "PermitNumber")
    protected String permitNumber;
    @XmlElement(name = "AttestationNumber")
    protected String attestationNumber;
    @XmlElement(name = "WithElectronicExportNtfctn")
    protected Boolean withElectronicExportNtfctn;
    @XmlElement(name = "ExportDocPosition")
    protected List<ExportDocumentDDType.ExportDocPosition> exportDocPositions;

    /**
     * Ruft den Wert der invoiceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Legt den Wert der invoiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Ruft den Wert der invoiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Legt den Wert der invoiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Ruft den Wert der invoiceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Legt den Wert der invoiceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Ruft den Wert der exportType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * Legt den Wert der exportType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportType(String value) {
        this.exportType = value;
    }

    /**
     * Ruft den Wert der exportTypeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportTypeDescription() {
        return exportTypeDescription;
    }

    /**
     * Legt den Wert der exportTypeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportTypeDescription(String value) {
        this.exportTypeDescription = value;
    }

    /**
     * Ruft den Wert der commodityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Legt den Wert der commodityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Ruft den Wert der termsOfTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfTrade() {
        return termsOfTrade;
    }

    /**
     * Legt den Wert der termsOfTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfTrade(String value) {
        this.termsOfTrade = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der countryCodeOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeOrigin() {
        return countryCodeOrigin;
    }

    /**
     * Legt den Wert der countryCodeOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeOrigin(String value) {
        this.countryCodeOrigin = value;
    }

    /**
     * Ruft den Wert der additionalFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalFee() {
        return additionalFee;
    }

    /**
     * Legt den Wert der additionalFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalFee(BigDecimal value) {
        this.additionalFee = value;
    }

    /**
     * Ruft den Wert der customsValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomsValue() {
        return customsValue;
    }

    /**
     * Legt den Wert der customsValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomsValue(BigDecimal value) {
        this.customsValue = value;
    }

    /**
     * Ruft den Wert der customsCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCurrency() {
        return customsCurrency;
    }

    /**
     * Legt den Wert der customsCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCurrency(String value) {
        this.customsCurrency = value;
    }

    /**
     * Ruft den Wert der permitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * Legt den Wert der permitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * Ruft den Wert der attestationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestationNumber() {
        return attestationNumber;
    }

    /**
     * Legt den Wert der attestationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestationNumber(String value) {
        this.attestationNumber = value;
    }

    /**
     * Ruft den Wert der withElectronicExportNtfctn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWithElectronicExportNtfctn() {
        return withElectronicExportNtfctn;
    }

    /**
     * Legt den Wert der withElectronicExportNtfctn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithElectronicExportNtfctn(Boolean value) {
        this.withElectronicExportNtfctn = value;
    }

    /**
     * Gets the value of the exportDocPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportDocPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportDocPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDocumentDDType.ExportDocPosition }
     * 
     * 
     */
    public List<ExportDocumentDDType.ExportDocPosition> getExportDocPositions() {
        if (exportDocPositions == null) {
            exportDocPositions = new ArrayList<ExportDocumentDDType.ExportDocPosition>();
        }
        return this.exportDocPositions;
    }

    /**
     * Sets the value of the exportDocPositions property.
     * 
     * @param exportDocPositions
     *     allowed object is
     *     {@link ExportDocumentDDType.ExportDocPosition }
     *     
     */
    public void setExportDocPositions(List<ExportDocumentDDType.ExportDocPosition> exportDocPositions) {
        this.exportDocPositions = exportDocPositions;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CountryCodeOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Amount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetWeightInKG">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GrossWeightInKG">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CustomsValue">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CustomsCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "description",
        "countryCodeOrigin",
        "commodityCode",
        "amount",
        "netWeightInKG",
        "grossWeightInKG",
        "customsValue",
        "customsCurrency"
    })
    public static class ExportDocPosition {

        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "CountryCodeOrigin", required = true)
        protected String countryCodeOrigin;
        @XmlElement(name = "CommodityCode")
        protected String commodityCode;
        @XmlElement(name = "Amount", required = true)
        protected BigInteger amount;
        @XmlElement(name = "NetWeightInKG", required = true)
        protected BigDecimal netWeightInKG;
        @XmlElement(name = "GrossWeightInKG", required = true)
        protected BigDecimal grossWeightInKG;
        @XmlElement(name = "CustomsValue", required = true)
        protected BigDecimal customsValue;
        @XmlElement(name = "CustomsCurrency", required = true)
        protected String customsCurrency;

        /**
         * Ruft den Wert der description-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Ruft den Wert der countryCodeOrigin-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCodeOrigin() {
            return countryCodeOrigin;
        }

        /**
         * Legt den Wert der countryCodeOrigin-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCodeOrigin(String value) {
            this.countryCodeOrigin = value;
        }

        /**
         * Ruft den Wert der commodityCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommodityCode() {
            return commodityCode;
        }

        /**
         * Legt den Wert der commodityCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommodityCode(String value) {
            this.commodityCode = value;
        }

        /**
         * Ruft den Wert der amount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmount() {
            return amount;
        }

        /**
         * Legt den Wert der amount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmount(BigInteger value) {
            this.amount = value;
        }

        /**
         * Ruft den Wert der netWeightInKG-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetWeightInKG() {
            return netWeightInKG;
        }

        /**
         * Legt den Wert der netWeightInKG-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetWeightInKG(BigDecimal value) {
            this.netWeightInKG = value;
        }

        /**
         * Ruft den Wert der grossWeightInKG-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossWeightInKG() {
            return grossWeightInKG;
        }

        /**
         * Legt den Wert der grossWeightInKG-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossWeightInKG(BigDecimal value) {
            this.grossWeightInKG = value;
        }

        /**
         * Ruft den Wert der customsValue-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCustomsValue() {
            return customsValue;
        }

        /**
         * Legt den Wert der customsValue-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCustomsValue(BigDecimal value) {
            this.customsValue = value;
        }

        /**
         * Ruft den Wert der customsCurrency-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomsCurrency() {
            return customsCurrency;
        }

        /**
         * Legt den Wert der customsCurrency-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomsCurrency(String value) {
            this.customsCurrency = value;
        }

    }

}
