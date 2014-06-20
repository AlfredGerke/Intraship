package intrashipservice.ws.de.isservice_1_0_de;

import intraship.ws.de.BookPickupRequest;
import intraship.ws.de.BookPickupResponse;
import intraship.ws.de.CancelPickupRequest;
import intraship.ws.de.CancelPickupResponse;
import intraship.ws.de.CreateShipmentDDRequest;
import intraship.ws.de.CreateShipmentResponse;
import intraship.ws.de.CreateShipmentTDRequest;
import intraship.ws.de.DeleteShipmentDDRequest;
import intraship.ws.de.DeleteShipmentResponse;
import intraship.ws.de.DeleteShipmentTDRequest;
import intraship.ws.de.DoManifestDDRequest;
import intraship.ws.de.DoManifestResponse;
import intraship.ws.de.DoManifestTDRequest;
import intraship.ws.de.GetExportDocDDRequest;
import intraship.ws.de.GetExportDocResponse;
import intraship.ws.de.GetExportDocTDRequest;
import intraship.ws.de.GetLabelDDRequest;
import intraship.ws.de.GetLabelResponse;
import intraship.ws.de.GetLabelTDRequest;
import intraship.ws.de.GetManifestDDRequest;
import intraship.ws.de.GetManifestDDResponse;
import intraship.ws.de.GetVersionResponse;
import intraship.ws.de.UpdateShipmentDDRequest;
import intraship.ws.de.UpdateShipmentResponse;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.sun.xml.ws.developer.WSBindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;

import de.intraship.cis.Credentials;
import de.intraship.req.MySOAPLoggingHandler;

import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "ISService_1_0_de"
 *  06/02/2014 21:27:26
 * 
 */
public class ISService10De {

    public String serviceId = "ISService_1_0_de";
    private QName isService10DeQName = new QName("http://de.ws.intrashipservice", "ISService_1_0_de");
    private BindingProperties bindingProperties;
    private ISWSServicePortType iswsServicePortTypeService;

    public ISService10De() {
        ISService10DeClient isService10DeClient;
        try {
            URL wsdlLocation = new ClassPathResource("intrashipservice/ws/de/isservice_1_0_de/ISService_1_0_de.wsdl").getURL();
            isService10DeClient = new ISService10DeClient(wsdlLocation, isService10DeQName);
        } catch (IOException e) {
            isService10DeClient = new ISService10DeClient();
        }
        iswsServicePortTypeService = isService10DeClient.getShipmentServiceSOAP11Port0();

        /**
         * LoggingHandler von Hand eingefügt, wurde nicht vom Importer angelegt 
         */
        MySOAPLoggingHandler.addToPort(((BindingProvider) iswsServicePortTypeService).getBinding()); 
    }

    public BookPickupResponse bookPickup(BookPickupRequest part1, Authentification header) {
        BookPickupResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.bookPickup(part1);
        return response;
    }

    public CancelPickupResponse cancelPickup(CancelPickupRequest part1, Authentification header) {
        CancelPickupResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.cancelPickup(part1);
        return response;
    }

    public CreateShipmentResponse createShipmentDD(CreateShipmentDDRequest part1, Authentification header) {
        CreateShipmentResponse response;     
        /**
         * Credentials-Verarbeitung von Hand eingefügt, wurde nicht vom Importer angelegt 
         */
        bindingProperties = Credentials.getInstance().setBindingProperitiesIfNeeded(bindingProperties);
        header = Credentials.getInstance().setAuthentificationIfNeeded(header);
        
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.createShipmentDD(part1);
        return response;
    }

    public CreateShipmentResponse createShipmentTD(CreateShipmentTDRequest part1, Authentification header) {
        CreateShipmentResponse response;
        /**
         * Credentials-Verarbeitung von Hand eingefügt, wurde nicht vom Importer angelegt 
         */
        bindingProperties = Credentials.getInstance().setBindingProperitiesIfNeeded(bindingProperties);
        header = Credentials.getInstance().setAuthentificationIfNeeded(header);
        
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.createShipmentTD(part1);
        return response;
    }

    public DeleteShipmentResponse deleteShipmentDD(DeleteShipmentDDRequest part1, Authentification header) {
        DeleteShipmentResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.deleteShipmentDD(part1);
        return response;
    }

    public DeleteShipmentResponse deleteShipmentTD(DeleteShipmentTDRequest part1, Authentification header) {
        DeleteShipmentResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.deleteShipmentTD(part1);
        return response;
    }

    public DoManifestResponse doManifestDD(DoManifestDDRequest part1, Authentification header) {
        DoManifestResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.doManifestDD(part1);
        return response;
    }

    public DoManifestResponse doManifestTD(DoManifestTDRequest part1, Authentification header) {
        DoManifestResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.doManifestTD(part1);
        return response;
    }

    public GetExportDocResponse getExportDocDD(GetExportDocDDRequest part1, Authentification header) {
        GetExportDocResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.getExportDocDD(part1);
        return response;
    }

    public GetExportDocResponse getExportDocTD(GetExportDocTDRequest part1, Authentification header) {
        GetExportDocResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.getExportDocTD(part1);
        return response;
    }

    public GetLabelResponse getLabelDD(GetLabelDDRequest part1, Authentification header) {
        GetLabelResponse response;
        /**
         * Credentials-Verarbeitung von Hand eingefügt, wurde nicht vom Importer angelegt 
         */
        bindingProperties = Credentials.getInstance().setBindingProperitiesIfNeeded(bindingProperties);
        header = Credentials.getInstance().setAuthentificationIfNeeded(header);
        
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.getLabelDD(part1);
        return response;
    }

    public GetLabelResponse getLabelTD(GetLabelTDRequest part1, Authentification header) {
        GetLabelResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.getLabelTD(part1);
        return response;
    }

    public GetManifestDDResponse getManifestDD(GetManifestDDRequest part1, Authentification header) {
        GetManifestDDResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.getManifestDD(part1);
        return response;
    }

    public GetVersionResponse getVersion(Version part1) {
        GetVersionResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        response = iswsServicePortTypeService.getVersion(part1);
        return response;
    }

    public UpdateShipmentResponse updateShipmentDD(UpdateShipmentDDRequest part1, Authentification header) {
        UpdateShipmentResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
        SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
        response = iswsServicePortTypeService.updateShipmentDD(part1);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
