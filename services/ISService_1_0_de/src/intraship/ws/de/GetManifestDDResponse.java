
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
 *         &lt;element name="status" type="{http://de.ws.intraship}Statusinformation"/>
 *         &lt;element name="ManifestPDFData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "status",
    "manifestPDFData"
})
@XmlRootElement(name = "GetManifestDDResponse", namespace = "http://de.ws.intraship")
public class GetManifestDDResponse {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    @XmlElement(required = true)
    protected Statusinformation status;
    @XmlElement(name = "ManifestPDFData")
    protected String manifestPDFData;

    /**
     * The version of the webservice implementation.
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
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Statusinformation }
     *     
     */
    public Statusinformation getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Statusinformation }
     *     
     */
    public void setStatus(Statusinformation value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der manifestPDFData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestPDFData() {
        return manifestPDFData;
    }

    /**
     * Legt den Wert der manifestPDFData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestPDFData(String value) {
        this.manifestPDFData = value;
    }

}
