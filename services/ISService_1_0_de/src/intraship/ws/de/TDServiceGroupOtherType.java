
package intraship.ws.de;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Other TD Services.
 * 
 * <p>Java-Klasse für TDServiceGroupOtherType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TDServiceGroupOtherType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Insurance">
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
 *                     &lt;element name="InsuranceCurrency">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="10"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="GoGreen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "TDServiceGroupOtherType", namespace = "http://de.ws.intraship", propOrder = {
    "goGreen",
    "insurance"
})
public class TDServiceGroupOtherType {

    @XmlElement(name = "GoGreen")
    protected Boolean goGreen;
    @XmlElement(name = "Insurance")
    protected TDServiceGroupOtherType.Insurance insurance;

    /**
     * Ruft den Wert der goGreen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGoGreen() {
        return goGreen;
    }

    /**
     * Legt den Wert der goGreen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoGreen(Boolean value) {
        this.goGreen = value;
    }

    /**
     * Ruft den Wert der insurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDServiceGroupOtherType.Insurance }
     *     
     */
    public TDServiceGroupOtherType.Insurance getInsurance() {
        return insurance;
    }

    /**
     * Legt den Wert der insurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDServiceGroupOtherType.Insurance }
     *     
     */
    public void setInsurance(TDServiceGroupOtherType.Insurance value) {
        this.insurance = value;
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
     *         &lt;element name="InsuranceCurrency">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
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
        "insuranceAmount",
        "insuranceCurrency"
    })
    public static class Insurance {

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

}
