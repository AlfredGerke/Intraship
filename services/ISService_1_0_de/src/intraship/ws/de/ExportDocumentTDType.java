
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
 * The data of the export document for a TD
 * 				shipment.
 * 
 * <p>Java-Klasse für ExportDocumentTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExportDocumentTDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceType">
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
 *         &lt;element name="ExportType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="T"/>
 *               &lt;enumeration value="R"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SignerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportDocPosition" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Amount">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValuePerPiece">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
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
 *                   &lt;element name="ISOCountryCodeOfOrigin">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExportDocumentTDType", namespace = "http://de.ws.intraship", propOrder = {
    "invoiceType",
    "invoiceDate",
    "invoiceNumber",
    "exportType",
    "signerTitle",
    "remark",
    "commodityCode",
    "exportReason",
    "exportDocPositions"
})
public class ExportDocumentTDType {

    @XmlElement(name = "InvoiceType", required = true)
    protected String invoiceType;
    @XmlElement(name = "InvoiceDate", required = true)
    protected String invoiceDate;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "ExportType", required = true)
    protected String exportType;
    @XmlElement(name = "SignerTitle")
    protected String signerTitle;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "CommodityCode")
    protected String commodityCode;
    @XmlElement(name = "ExportReason")
    protected String exportReason;
    @XmlElement(name = "ExportDocPosition")
    protected List<ExportDocumentTDType.ExportDocPosition> exportDocPositions;

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
     * Ruft den Wert der signerTitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerTitle() {
        return signerTitle;
    }

    /**
     * Legt den Wert der signerTitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerTitle(String value) {
        this.signerTitle = value;
    }

    /**
     * Ruft den Wert der remark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Legt den Wert der remark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     * Ruft den Wert der exportReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportReason() {
        return exportReason;
    }

    /**
     * Legt den Wert der exportReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReason(String value) {
        this.exportReason = value;
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
     * {@link ExportDocumentTDType.ExportDocPosition }
     * 
     * 
     */
    public List<ExportDocumentTDType.ExportDocPosition> getExportDocPositions() {
        if (exportDocPositions == null) {
            exportDocPositions = new ArrayList<ExportDocumentTDType.ExportDocPosition>();
        }
        return this.exportDocPositions;
    }

    /**
     * Sets the value of the exportDocPositions property.
     * 
     * @param exportDocPositions
     *     allowed object is
     *     {@link ExportDocumentTDType.ExportDocPosition }
     *     
     */
    public void setExportDocPositions(List<ExportDocumentTDType.ExportDocPosition> exportDocPositions) {
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
     *         &lt;element name="Amount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ValuePerPiece">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
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
     *         &lt;element name="ISOCountryCodeOfOrigin">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "amount",
        "valuePerPiece",
        "netWeightInKG",
        "grossWeightInKG",
        "isoCountryCodeOfOrigin",
        "commodityCode"
    })
    public static class ExportDocPosition {

        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "Amount", required = true)
        protected BigInteger amount;
        @XmlElement(name = "ValuePerPiece", required = true)
        protected BigDecimal valuePerPiece;
        @XmlElement(name = "NetWeightInKG", required = true)
        protected BigDecimal netWeightInKG;
        @XmlElement(name = "GrossWeightInKG", required = true)
        protected BigDecimal grossWeightInKG;
        @XmlElement(name = "ISOCountryCodeOfOrigin", required = true)
        protected String isoCountryCodeOfOrigin;
        @XmlElement(name = "CommodityCode")
        protected String commodityCode;

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
         * Ruft den Wert der valuePerPiece-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValuePerPiece() {
            return valuePerPiece;
        }

        /**
         * Legt den Wert der valuePerPiece-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValuePerPiece(BigDecimal value) {
            this.valuePerPiece = value;
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
         * Ruft den Wert der isoCountryCodeOfOrigin-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCountryCodeOfOrigin() {
            return isoCountryCodeOfOrigin;
        }

        /**
         * Legt den Wert der isoCountryCodeOfOrigin-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCountryCodeOfOrigin(String value) {
            this.isoCountryCodeOfOrigin = value;
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

    }

}
