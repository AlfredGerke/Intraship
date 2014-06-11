
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Status" type="{http://de.ws.intraship}Statusinformation"/>
 *         &lt;element name="DeletionState" type="{http://de.ws.intraship}DeletionState" maxOccurs="999" minOccurs="0"/>
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
    "deletionStates"
})
@XmlRootElement(name = "DeleteShipmentResponse", namespace = "http://de.ws.intraship")
public class DeleteShipmentResponse {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    @XmlElement(name = "Status", required = true)
    protected Statusinformation status;
    @XmlElement(name = "DeletionState")
    protected List<DeletionState> deletionStates;

    /**
     * The version of the webservice implementation.
     * 						
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
     * Gets the value of the deletionStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletionStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletionStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletionState }
     * 
     * 
     */
    public List<DeletionState> getDeletionStates() {
        if (deletionStates == null) {
            deletionStates = new ArrayList<DeletionState>();
        }
        return this.deletionStates;
    }

    /**
     * Sets the value of the deletionStates property.
     * 
     * @param deletionStates
     *     allowed object is
     *     {@link DeletionState }
     *     
     */
    public void setDeletionStates(List<DeletionState> deletionStates) {
        this.deletionStates = deletionStates;
    }

}
