
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Item/Piece data of a DD shipment.
 * 			
 * 
 * <p>Java-Klasse für ShipmentItemDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentItemDDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ShipmentItemType">
 *       &lt;sequence>
 *         &lt;element name="PackageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentItemDDType", namespace = "http://de.ws.intraship", propOrder = {
    "packageType"
})
public class ShipmentItemDDType
    extends ShipmentItemType
{

    @XmlElement(name = "PackageType", required = true)
    protected String packageType;

    /**
     * Ruft den Wert der packageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Legt den Wert der packageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

}
