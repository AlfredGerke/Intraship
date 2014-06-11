
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of contact.
 * 
 * <p>Java-Klasse für ContactType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Communication" type="{http://dhl.de/webservice/cisbase}CommunicationType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://dhl.de/webservice/cisbase}NativeAddressType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://dhl.de/webservice/cisbase}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "communication",
    "address",
    "name"
})
public class ContactTypeType {

    @XmlElement(name = "Communication", namespace = "http://dhl.de/webservice/cisbase")
    protected CommunicationTypeType communication;
    @XmlElement(name = "Address", namespace = "http://dhl.de/webservice/cisbase")
    protected NativeAddressTypeType address;
    @XmlElement(name = "Name", namespace = "http://dhl.de/webservice/cisbase")
    protected NameTypeType name;

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
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeType }
     *     
     */
    public NameTypeType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeType }
     *     
     */
    public void setName(NameTypeType value) {
        this.name = value;
    }

}
