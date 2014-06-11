
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.Version;


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
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Version"/>
 *         &lt;choice>
 *           &lt;element name="manifestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="manifestDateRange">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "version",
    "manifestDateRange",
    "manifestDate"
})
@XmlRootElement(name = "GetManifestDDRequest", namespace = "http://de.ws.intraship")
public class GetManifestDDRequest {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    protected GetManifestDDRequest.ManifestDateRange manifestDateRange;
    protected String manifestDate;

    /**
     * The version of the webservice implementation for which the requesting client is developed.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der manifestDateRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetManifestDDRequest.ManifestDateRange }
     *     
     */
    public GetManifestDDRequest.ManifestDateRange getManifestDateRange() {
        return manifestDateRange;
    }

    /**
     * Legt den Wert der manifestDateRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetManifestDDRequest.ManifestDateRange }
     *     
     */
    public void setManifestDateRange(GetManifestDDRequest.ManifestDateRange value) {
        this.manifestDateRange = value;
    }

    /**
     * Ruft den Wert der manifestDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestDate() {
        return manifestDate;
    }

    /**
     * Legt den Wert der manifestDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestDate(String value) {
        this.manifestDate = value;
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
     *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "fromDate",
        "toDate"
    })
    public static class ManifestDateRange {

        @XmlElement(required = true)
        protected String fromDate;
        @XmlElement(required = true)
        protected String toDate;

        /**
         * Ruft den Wert der fromDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDate() {
            return fromDate;
        }

        /**
         * Legt den Wert der fromDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDate(String value) {
            this.fromDate = value;
        }

        /**
         * Ruft den Wert der toDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToDate() {
            return toDate;
        }

        /**
         * Legt den Wert der toDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToDate(String value) {
            this.toDate = value;
        }

    }

}
