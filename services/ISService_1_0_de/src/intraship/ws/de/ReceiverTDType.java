
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The receiver data of a TD shipment.
 * 			
 * 
 * <p>Java-Klasse für ReceiverTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReceiverTDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ReceiverType">
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
@XmlType(name = "ReceiverTDType", namespace = "http://de.ws.intraship")
public class ReceiverTDType
    extends ReceiverType
{


}
