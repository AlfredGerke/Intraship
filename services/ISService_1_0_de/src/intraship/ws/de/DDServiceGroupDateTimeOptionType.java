
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Group Date Time Option. 
 * 			
 * 
 * <p>Java-Klasse für DDServiceGroupDateTimeOptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDServiceGroupDateTimeOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DeliveryOnTime">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DeliveryEarly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Express0900" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Express1000" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Express1200" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="DeliveryAfternoon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="DeliveryEvening" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ExpressSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="ExpressSunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "DDServiceGroupDateTimeOptionType", namespace = "http://de.ws.intraship", propOrder = {
    "expressSunday",
    "expressSaturday",
    "deliveryEvening",
    "deliveryAfternoon",
    "express1200",
    "express1000",
    "express0900",
    "deliveryEarly",
    "deliveryOnTime"
})
public class DDServiceGroupDateTimeOptionType {

    @XmlElement(name = "ExpressSunday")
    protected Boolean expressSunday;
    @XmlElement(name = "ExpressSaturday")
    protected Boolean expressSaturday;
    @XmlElement(name = "DeliveryEvening")
    protected Boolean deliveryEvening;
    @XmlElement(name = "DeliveryAfternoon")
    protected Boolean deliveryAfternoon;
    @XmlElement(name = "Express1200")
    protected Boolean express1200;
    @XmlElement(name = "Express1000")
    protected Boolean express1000;
    @XmlElement(name = "Express0900")
    protected Boolean express0900;
    @XmlElement(name = "DeliveryEarly")
    protected Boolean deliveryEarly;
    @XmlElement(name = "DeliveryOnTime")
    protected DDServiceGroupDateTimeOptionType.DeliveryOnTime deliveryOnTime;

    /**
     * Ruft den Wert der expressSunday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpressSunday() {
        return expressSunday;
    }

    /**
     * Legt den Wert der expressSunday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressSunday(Boolean value) {
        this.expressSunday = value;
    }

    /**
     * Ruft den Wert der expressSaturday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpressSaturday() {
        return expressSaturday;
    }

    /**
     * Legt den Wert der expressSaturday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressSaturday(Boolean value) {
        this.expressSaturday = value;
    }

    /**
     * Ruft den Wert der deliveryEvening-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeliveryEvening() {
        return deliveryEvening;
    }

    /**
     * Legt den Wert der deliveryEvening-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryEvening(Boolean value) {
        this.deliveryEvening = value;
    }

    /**
     * Ruft den Wert der deliveryAfternoon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeliveryAfternoon() {
        return deliveryAfternoon;
    }

    /**
     * Legt den Wert der deliveryAfternoon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryAfternoon(Boolean value) {
        this.deliveryAfternoon = value;
    }

    /**
     * Ruft den Wert der express1200-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpress1200() {
        return express1200;
    }

    /**
     * Legt den Wert der express1200-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpress1200(Boolean value) {
        this.express1200 = value;
    }

    /**
     * Ruft den Wert der express1000-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpress1000() {
        return express1000;
    }

    /**
     * Legt den Wert der express1000-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpress1000(Boolean value) {
        this.express1000 = value;
    }

    /**
     * Ruft den Wert der express0900-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpress0900() {
        return express0900;
    }

    /**
     * Legt den Wert der express0900-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpress0900(Boolean value) {
        this.express0900 = value;
    }

    /**
     * Ruft den Wert der deliveryEarly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeliveryEarly() {
        return deliveryEarly;
    }

    /**
     * Legt den Wert der deliveryEarly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryEarly(Boolean value) {
        this.deliveryEarly = value;
    }

    /**
     * Ruft den Wert der deliveryOnTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupDateTimeOptionType.DeliveryOnTime }
     *     
     */
    public DDServiceGroupDateTimeOptionType.DeliveryOnTime getDeliveryOnTime() {
        return deliveryOnTime;
    }

    /**
     * Legt den Wert der deliveryOnTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupDateTimeOptionType.DeliveryOnTime }
     *     
     */
    public void setDeliveryOnTime(DDServiceGroupDateTimeOptionType.DeliveryOnTime value) {
        this.deliveryOnTime = value;
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
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "time"
    })
    public static class DeliveryOnTime {

        @XmlElement(required = true)
        protected String time;

        /**
         * Ruft den Wert der time-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Legt den Wert der time-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

    }

}
