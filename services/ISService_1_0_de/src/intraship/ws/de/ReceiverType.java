
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.CommunicationTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NameTypeType;
import intrashipservice.ws.de.isservice_1_0_de.NativeAddressTypeType;


/**
 * The receiver data.
 * 
 * <p>Java-Klasse für ReceiverType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReceiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://dhl.de/webservice/cisbase}NameType"/>
 *         &lt;choice>
 *           &lt;element name="Address" type="{http://dhl.de/webservice/cisbase}NativeAddressType"/>
 *           &lt;element name="Packstation" type="{http://de.ws.intraship}PackstationType"/>
 *           &lt;element name="Postfiliale" type="{http://de.ws.intraship}PostfilialeType"/>
 *         &lt;/choice>
 *         &lt;element name="Communication" type="{http://dhl.de/webservice/cisbase}CommunicationType"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverType", namespace = "http://de.ws.intraship", propOrder = {
    "company",
    "postfiliale",
    "packstation",
    "address",
    "communication",
    "vat"
})
@XmlSeeAlso({
    ReceiverTDType.class,
    ReceiverDDType.class
})
public class ReceiverType {

    @XmlElement(name = "Company", required = true)
    protected NameTypeType company;
    @XmlElement(name = "Postfiliale")
    protected PostfilialeType postfiliale;
    @XmlElement(name = "Packstation")
    protected PackstationType packstation;
    @XmlElement(name = "Address")
    protected NativeAddressTypeType address;
    @XmlElement(name = "Communication", required = true)
    protected CommunicationTypeType communication;
    @XmlElement(name = "VAT")
    protected String vat;

    /**
     * Ruft den Wert der company-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeType }
     *     
     */
    public NameTypeType getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeType }
     *     
     */
    public void setCompany(NameTypeType value) {
        this.company = value;
    }

    /**
     * Ruft den Wert der postfiliale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostfilialeType }
     *     
     */
    public PostfilialeType getPostfiliale() {
        return postfiliale;
    }

    /**
     * Legt den Wert der postfiliale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostfilialeType }
     *     
     */
    public void setPostfiliale(PostfilialeType value) {
        this.postfiliale = value;
    }

    /**
     * Ruft den Wert der packstation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PackstationType }
     *     
     */
    public PackstationType getPackstation() {
        return packstation;
    }

    /**
     * Legt den Wert der packstation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PackstationType }
     *     
     */
    public void setPackstation(PackstationType value) {
        this.packstation = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public NativeAddressTypeType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public void setAddress(NativeAddressTypeType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der communication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationTypeType }
     *     
     */
    public CommunicationTypeType getCommunication() {
        return communication;
    }

    /**
     * Legt den Wert der communication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationTypeType }
     *     
     */
    public void setCommunication(CommunicationTypeType value) {
        this.communication = value;
    }

    /**
     * Ruft den Wert der vat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAT() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAT(String value) {
        this.vat = value;
    }

}
