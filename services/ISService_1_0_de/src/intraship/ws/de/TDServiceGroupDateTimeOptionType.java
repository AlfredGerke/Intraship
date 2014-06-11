
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TDServiceGroupDateTimeOptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TDServiceGroupDateTimeOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpressSaturday">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShippingDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="10"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "TDServiceGroupDateTimeOptionType", namespace = "http://de.ws.intraship", propOrder = {
    "expressSaturday"
})
public class TDServiceGroupDateTimeOptionType {

    @XmlElement(name = "ExpressSaturday", required = true)
    protected TDServiceGroupDateTimeOptionType.ExpressSaturday expressSaturday;

    /**
     * Ruft den Wert der expressSaturday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDServiceGroupDateTimeOptionType.ExpressSaturday }
     *     
     */
    public TDServiceGroupDateTimeOptionType.ExpressSaturday getExpressSaturday() {
        return expressSaturday;
    }

    /**
     * Legt den Wert der expressSaturday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDServiceGroupDateTimeOptionType.ExpressSaturday }
     *     
     */
    public void setExpressSaturday(TDServiceGroupDateTimeOptionType.ExpressSaturday value) {
        this.expressSaturday = value;
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
     *         &lt;element name="ShippingDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="10"/>
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
        "shippingDate"
    })
    public static class ExpressSaturday {

        @XmlElement(name = "ShippingDate", required = true)
        protected String shippingDate;

        /**
         * Ruft den Wert der shippingDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShippingDate() {
            return shippingDate;
        }

        /**
         * Legt den Wert der shippingDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShippingDate(String value) {
            this.shippingDate = value;
        }

    }

}
