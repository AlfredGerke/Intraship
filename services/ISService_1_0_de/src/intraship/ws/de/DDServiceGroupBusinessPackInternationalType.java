
package intraship.ws.de;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Group BPI.
 * 
 * <p>Java-Klasse für DDServiceGroupBusinessPackInternationalType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDServiceGroupBusinessPackInternationalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Economy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Seapacket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="CoilWithoutHelp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Endorsement">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AmountInternational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "DDServiceGroupBusinessPackInternationalType", namespace = "http://de.ws.intraship", propOrder = {
    "amountInternational",
    "endorsement",
    "coilWithoutHelp",
    "seapacket",
    "premium",
    "economy"
})
public class DDServiceGroupBusinessPackInternationalType {

    @XmlElement(name = "AmountInternational")
    protected Boolean amountInternational;
    @XmlElement(name = "Endorsement")
    protected DDServiceGroupBusinessPackInternationalType.Endorsement endorsement;
    @XmlElement(name = "CoilWithoutHelp")
    protected Boolean coilWithoutHelp;
    @XmlElement(name = "Seapacket")
    protected Boolean seapacket;
    @XmlElement(name = "Premium")
    protected Boolean premium;
    @XmlElement(name = "Economy")
    protected Boolean economy;

    /**
     * Ruft den Wert der amountInternational-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAmountInternational() {
        return amountInternational;
    }

    /**
     * Legt den Wert der amountInternational-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmountInternational(Boolean value) {
        this.amountInternational = value;
    }

    /**
     * Ruft den Wert der endorsement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupBusinessPackInternationalType.Endorsement }
     *     
     */
    public DDServiceGroupBusinessPackInternationalType.Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Legt den Wert der endorsement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupBusinessPackInternationalType.Endorsement }
     *     
     */
    public void setEndorsement(DDServiceGroupBusinessPackInternationalType.Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Ruft den Wert der coilWithoutHelp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCoilWithoutHelp() {
        return coilWithoutHelp;
    }

    /**
     * Legt den Wert der coilWithoutHelp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoilWithoutHelp(Boolean value) {
        this.coilWithoutHelp = value;
    }

    /**
     * Ruft den Wert der seapacket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSeapacket() {
        return seapacket;
    }

    /**
     * Legt den Wert der seapacket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeapacket(Boolean value) {
        this.seapacket = value;
    }

    /**
     * Ruft den Wert der premium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPremium() {
        return premium;
    }

    /**
     * Legt den Wert der premium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremium(Boolean value) {
        this.premium = value;
    }

    /**
     * Ruft den Wert der economy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEconomy() {
        return economy;
    }

    /**
     * Legt den Wert der economy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEconomy(Boolean value) {
        this.economy = value;
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
     *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "ident",
        "days"
    })
    public static class Endorsement {

        @XmlElement(name = "Ident", required = true)
        protected String ident;
        @XmlElement(name = "Days", required = true)
        protected BigInteger days;

        /**
         * Ruft den Wert der ident-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdent() {
            return ident;
        }

        /**
         * Legt den Wert der ident-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdent(String value) {
            this.ident = value;
        }

        /**
         * Ruft den Wert der days-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDays() {
            return days;
        }

        /**
         * Legt den Wert der days-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDays(BigInteger value) {
            this.days = value;
        }

    }

}
