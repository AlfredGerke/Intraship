
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.ShipmentNumberTypeType;


/**
 * Information about each piece (e.g. the generated licence plate). For every piece, a PieceInformation container holds the license plate number.
 * 
 * <p>Java-Klasse für PieceInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PieceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PieceNumber" type="{http://dhl.de/webservice/cisbase}ShipmentNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceInformation", namespace = "http://de.ws.intraship", propOrder = {
    "pieceNumber"
})
public class PieceInformation {

    @XmlElement(name = "PieceNumber")
    protected ShipmentNumberTypeType pieceNumber;

    /**
     * Ruft den Wert der pieceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNumberTypeType }
     *     
     */
    public ShipmentNumberTypeType getPieceNumber() {
        return pieceNumber;
    }

    /**
     * Legt den Wert der pieceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNumberTypeType }
     *     
     */
    public void setPieceNumber(ShipmentNumberTypeType value) {
        this.pieceNumber = value;
    }

}
