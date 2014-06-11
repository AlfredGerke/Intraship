
package intraship.ws.de;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Other DD Services.
 * 
 * <p>Java-Klasse für DDServiceGroupOtherType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDServiceGroupOtherType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="HigherInsurance">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="InsuranceAmount">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="0.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="InsuranceCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="COD">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="CODAmount">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="0.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="CODCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Unfree">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PaymentType">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="0"/>
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DangerousGoods">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="DangerousGoodsClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="DangerousGoodsPackagingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="DangerousGoodsUNCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Bulkfreight">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="BulkfreightType" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="Lang"/>
 *                           &lt;enumeration value="L"/>
 *                           &lt;enumeration value="XL"/>
 *                           &lt;enumeration value="XXL"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DirectInjection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Bypass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "DDServiceGroupOtherType", namespace = "http://de.ws.intraship", propOrder = {
    "bypass",
    "directInjection",
    "bulkfreight",
    "dangerousGoods",
    "unfree",
    "cod",
    "higherInsurance"
})
public class DDServiceGroupOtherType {

    @XmlElement(name = "Bypass")
    protected Boolean bypass;
    @XmlElement(name = "DirectInjection")
    protected Boolean directInjection;
    @XmlElement(name = "Bulkfreight")
    protected DDServiceGroupOtherType.Bulkfreight bulkfreight;
    @XmlElement(name = "DangerousGoods")
    protected DDServiceGroupOtherType.DangerousGoods dangerousGoods;
    @XmlElement(name = "Unfree")
    protected DDServiceGroupOtherType.Unfree unfree;
    @XmlElement(name = "COD")
    protected DDServiceGroupOtherType.COD cod;
    @XmlElement(name = "HigherInsurance")
    protected DDServiceGroupOtherType.HigherInsurance higherInsurance;

    /**
     * Ruft den Wert der bypass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBypass() {
        return bypass;
    }

    /**
     * Legt den Wert der bypass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypass(Boolean value) {
        this.bypass = value;
    }

    /**
     * Ruft den Wert der directInjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDirectInjection() {
        return directInjection;
    }

    /**
     * Legt den Wert der directInjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectInjection(Boolean value) {
        this.directInjection = value;
    }

    /**
     * Ruft den Wert der bulkfreight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType.Bulkfreight }
     *     
     */
    public DDServiceGroupOtherType.Bulkfreight getBulkfreight() {
        return bulkfreight;
    }

    /**
     * Legt den Wert der bulkfreight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType.Bulkfreight }
     *     
     */
    public void setBulkfreight(DDServiceGroupOtherType.Bulkfreight value) {
        this.bulkfreight = value;
    }

    /**
     * Ruft den Wert der dangerousGoods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType.DangerousGoods }
     *     
     */
    public DDServiceGroupOtherType.DangerousGoods getDangerousGoods() {
        return dangerousGoods;
    }

    /**
     * Legt den Wert der dangerousGoods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType.DangerousGoods }
     *     
     */
    public void setDangerousGoods(DDServiceGroupOtherType.DangerousGoods value) {
        this.dangerousGoods = value;
    }

    /**
     * Ruft den Wert der unfree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType.Unfree }
     *     
     */
    public DDServiceGroupOtherType.Unfree getUnfree() {
        return unfree;
    }

    /**
     * Legt den Wert der unfree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType.Unfree }
     *     
     */
    public void setUnfree(DDServiceGroupOtherType.Unfree value) {
        this.unfree = value;
    }

    /**
     * Ruft den Wert der cod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType.COD }
     *     
     */
    public DDServiceGroupOtherType.COD getCOD() {
        return cod;
    }

    /**
     * Legt den Wert der cod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType.COD }
     *     
     */
    public void setCOD(DDServiceGroupOtherType.COD value) {
        this.cod = value;
    }

    /**
     * Ruft den Wert der higherInsurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType.HigherInsurance }
     *     
     */
    public DDServiceGroupOtherType.HigherInsurance getHigherInsurance() {
        return higherInsurance;
    }

    /**
     * Legt den Wert der higherInsurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType.HigherInsurance }
     *     
     */
    public void setHigherInsurance(DDServiceGroupOtherType.HigherInsurance value) {
        this.higherInsurance = value;
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
     *         &lt;element name="BulkfreightType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Lang"/>
     *               &lt;enumeration value="L"/>
     *               &lt;enumeration value="XL"/>
     *               &lt;enumeration value="XXL"/>
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
        "bulkfreightType"
    })
    public static class Bulkfreight {

        @XmlElement(name = "BulkfreightType")
        protected String bulkfreightType;

        /**
         * Ruft den Wert der bulkfreightType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBulkfreightType() {
            return bulkfreightType;
        }

        /**
         * Legt den Wert der bulkfreightType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBulkfreightType(String value) {
            this.bulkfreightType = value;
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
     *         &lt;element name="CODAmount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CODCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "codAmount",
        "codCurrency"
    })
    public static class COD {

        @XmlElement(name = "CODAmount", required = true)
        protected BigDecimal codAmount;
        @XmlElement(name = "CODCurrency", required = true)
        protected String codCurrency;

        /**
         * Ruft den Wert der codAmount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCODAmount() {
            return codAmount;
        }

        /**
         * Legt den Wert der codAmount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCODAmount(BigDecimal value) {
            this.codAmount = value;
        }

        /**
         * Ruft den Wert der codCurrency-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODCurrency() {
            return codCurrency;
        }

        /**
         * Legt den Wert der codCurrency-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODCurrency(String value) {
            this.codCurrency = value;
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
     *         &lt;element name="DangerousGoodsClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DangerousGoodsPackagingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DangerousGoodsUNCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dangerousGoodsClass",
        "dangerousGoodsPackagingType",
        "dangerousGoodsUNCode"
    })
    public static class DangerousGoods {

        @XmlElement(name = "DangerousGoodsClass", required = true)
        protected String dangerousGoodsClass;
        @XmlElement(name = "DangerousGoodsPackagingType", required = true)
        protected String dangerousGoodsPackagingType;
        @XmlElement(name = "DangerousGoodsUNCode", required = true)
        protected String dangerousGoodsUNCode;

        /**
         * Ruft den Wert der dangerousGoodsClass-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDangerousGoodsClass() {
            return dangerousGoodsClass;
        }

        /**
         * Legt den Wert der dangerousGoodsClass-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDangerousGoodsClass(String value) {
            this.dangerousGoodsClass = value;
        }

        /**
         * Ruft den Wert der dangerousGoodsPackagingType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDangerousGoodsPackagingType() {
            return dangerousGoodsPackagingType;
        }

        /**
         * Legt den Wert der dangerousGoodsPackagingType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDangerousGoodsPackagingType(String value) {
            this.dangerousGoodsPackagingType = value;
        }

        /**
         * Ruft den Wert der dangerousGoodsUNCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDangerousGoodsUNCode() {
            return dangerousGoodsUNCode;
        }

        /**
         * Legt den Wert der dangerousGoodsUNCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDangerousGoodsUNCode(String value) {
            this.dangerousGoodsUNCode = value;
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
     *         &lt;element name="InsuranceAmount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InsuranceCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "insuranceAmount",
        "insuranceCurrency"
    })
    public static class HigherInsurance {

        @XmlElement(name = "InsuranceAmount", required = true)
        protected BigDecimal insuranceAmount;
        @XmlElement(name = "InsuranceCurrency", required = true)
        protected String insuranceCurrency;

        /**
         * Ruft den Wert der insuranceAmount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInsuranceAmount() {
            return insuranceAmount;
        }

        /**
         * Legt den Wert der insuranceAmount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInsuranceAmount(BigDecimal value) {
            this.insuranceAmount = value;
        }

        /**
         * Ruft den Wert der insuranceCurrency-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceCurrency() {
            return insuranceCurrency;
        }

        /**
         * Legt den Wert der insuranceCurrency-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceCurrency(String value) {
            this.insuranceCurrency = value;
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
     *         &lt;element name="PaymentType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paymentType",
        "customerNumber"
    })
    public static class Unfree {

        @XmlElement(name = "PaymentType", required = true)
        protected String paymentType;
        @XmlElement(name = "CustomerNumber")
        protected String customerNumber;

        /**
         * Ruft den Wert der paymentType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * Legt den Wert der paymentType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
        }

        /**
         * Ruft den Wert der customerNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerNumber() {
            return customerNumber;
        }

        /**
         * Legt den Wert der customerNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerNumber(String value) {
            this.customerNumber = value;
        }

    }

}
