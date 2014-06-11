
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Item/Piece data of a TD shipment.
 * 			
 * 
 * <p>Java-Klasse für ShipmentItemTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentItemTDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ShipmentItemType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentItemTDType", namespace = "http://de.ws.intraship")
public class ShipmentItemTDType
    extends ShipmentItemType
{


}
