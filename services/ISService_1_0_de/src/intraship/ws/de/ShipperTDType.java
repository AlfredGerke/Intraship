
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The data of the shipper of a TD shipment.
 * 			
 * 
 * <p>Java-Klasse für ShipperTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipperTDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ShipperType">
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
@XmlType(name = "ShipperTDType", namespace = "http://de.ws.intraship")
public class ShipperTDType
    extends ShipperType
{


}
