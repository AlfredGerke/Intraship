***(in Progress...)***

Intraship trifft WaveMaker
==========================

Dieses Testprogramm demonstriert eine mögliche Einbindung von DHL Intraship in eine WaveMaker-Anwendung. 


**Inhaltsangabe:**

- Voraussetzungen
- Versionen
- Zielvorgabe und Realisierung
- wsdl4j.jar
- Fehler nach Aufbau der Schnittstelle
- Änderungen an der Schnittstelle


Voraussetzungen
--------------

### Entwicklerportal der DHL
Um Informationen über die verschiedenen APIs von DHL Intraship zu erhalten, sowie 
Zugang zum Testsystem zu erlangen, muss jeder Entwickler sich auf dem Entwicklerportal registrieren.

* [Entwicklerportal der DHL](https://entwickler.dhl.de/ "Entwicklerportal der DHL")

Diese Testanwendung wird ohne Zugang zum Testsystem nicht funktionieren. 

Allerdings kann man jede Web API durch entsprechende Testsysteme simulieren, was 
aber den logischen Anteil, der bei der Nutzung des Logistikportals zum tragen kommt,
nur unzureichend berücksichtigt.

### Entwicklung unter WaveMaker      
Die Anforderungen um den Code, der in der WaveMaker IDE bearbeitet wird zu verstehen,
sind sehr gering. Ein Anwender mit Grundkenntnissen wird keine Probleme habe zu verstehen,
wie die Komponenten zusammenwirken. 

Allerdings sollte der Gebrauch von ServiceVariablen und einfachen Variablen sowie
Pages und Controls im Prinzip bekannt sein.

Neben dem Gebrauch von Komponenten muss auch ein Grundverständnis für JavaScript 
vorhanden sein.

### Entwicklung von JavaServices      
Die Entwicklung von JavaServices unter WaveMaker sollten im Prinzip verstanden sein.
Es empfiehlt sich mit einer externen Entwicklungsumgebung zu arbeiten.
 
Dieses Projekt wurde mit Eclipse bearbeitet. Besonders die notwendigkeit den 
Server zu debuggen macht ein externes Tool unumgänglich.


Versionen
---------

* WaveMaker 6.7.0
* Eclpise (Juno)


Zielvorgabe und Realisierung
----------------------------

Bei dieser Anwendung handelt es sich um ein reines Testprogramm. Es ist den 
Testprogrammen nachempfunden, welche auf dem [Entwicklerportal der DHL](https://entwickler.dhl.de/ "Entwicklerportal der DHL") zur Verfügung
gestellt werden.

Die Requests die dieses Testprogramm erstellt, sind vom Aufbau identisch mit den Requests 
welches das Java-Testprogramm des Entwicklerportals erstellt. 

Das Java-Testprogramm des Entwicklerportals kann somit als Referenz zu diesem Testprogramm genutzt werden.

Eine erste Version dieses Testprogrammes soll die Geschäftskundenversand API vollständig implementieren.

Dieses Testprogramm soll folgende Fragen klären:

* Ob und wie man mit WaveMaker auf Intraship zugreifen kann
* Ob man Request-Objecte im Client vorhalten kann um Serverzugriffe zu minimieren
* Wie man den Response im Client am besten verarbeiten kann (z.B.: XML-Label)
* Wie man die Schnittstelle in eine Anwendung einbindet
* Wie man Änderungen an der Schnittstelle vermeidet oder zumindest minimiert

### Request-Objecte
Ein Request-Object wird einer Methode des DHL-Service übergeben und 
enthält eine logische Struktur auf Grund derer ein Vorgang über die DHL-API in 
Gang gesetzt wird.

* Ein Request-Object wird vom RequestBuilder erstellt
* Der RequestBuilder ist ein JavaService (mit gleichem Namen) 
* Der Response wird in eine Variable gesichert 
* Diese Variable wird der Methode des DHL-Service als Parameter übergeben 
* Die Datenwerte der Variable können beliebig im Client geändert werden
* Eine Variable ist im Fall von Request-Objecten kein einfacher Wert, sondern immer eine komplexe Struktur 

Somit kann ein Request-Object für eine Methode des DHL-Service beliebig oft initialisiert 
werden, ohne das hierzu der RequstBuilder erneut aufgerufen werden muss.

### Authentification Header
Es wird ein Authendification-Object erstellt werden, welches wie das 
Request-Object der Methode des DHL-Service übergeben wird. Während aber das Request-Object 
direkt an die DHL-API weiter geleitet wird, wird das Authentification-Object als 
SOAPHeader dem Webservicecontext hinzu gefügt.

* Ein Authentication-Object wird vom JavaService CISBase erstellt
* Der Response wird in eine Variable gesichert
* Diese Variable wird der Methode des DHL-Service als Parameter übergeben
* Die Datenwerte der Variable können beliebig im Client geändert werden
* Eine Variable ist im Fall von Authentication-Object kein einfacher Wert, sondern immer eine komplexe Struktur 
  
Somit kann wie im Fall eines Request-Objectes, das Authentication-Object beliebig oft initialisiert
werden, ohne hierzu den JavaService erneut aufrufen zu müssen. 

### Zugangsdaten
Der Zugriff auf die Intraship-APIs wird durch Zugangsdaten gesichert. Diese Zugangsdaten 
erhält nur, wer sich auf dem Entwicklerportal der DHL registrieren lässt.

Im ersten Schritt kommt es zu eine Anmeldung basierend auf HTTP Basis Authentication.
Zusätzlich werden noch Credentials für den Zugriff auf die jeweilige API benötigt.

Die Anmeldedaten für die HTTP Basis Authentication können in den Projekteigenschaften 
des Webservice hinterlegt werden. Die zusätzlichen Credentials können nach dem Start der 
Anwendung in die Maske eingetragen werden.

Alternativ dazu kann eine *settings.ini* im Ordern *resources/settings* hinterlegt 
werden. Der Aufbau dieser Datei ist identisch mit dem Aufbau der Zugangsdatendatei 
aus dem Java-Testprogramm, welches auf dem Entwicklerportal der DHL bezogen werden kann. 

Wenn keine HTTP Basis Authentication und/oder Credentials vorhanden sind, werden 
diese mit den Zugangsdaten aus der Datei *settings.ini* ergänzt.


wsdl4j.jar
----------

Zu jeder SOAP-API wird eine entsprechende URL bereitgestellt, welche auf eine WSDL-Resource verweist.
Mit dieser URL wurde die Schnittstelle dieser Testanwendung mit Service und Proxy-Klassen eingerichtet.

Da der Aufbau einer solchen Schnittstelle über eine WSDL-Resource in der WaveMaker-Online-Dokumentation 
ausführlich beschrieben ist, verweise ich hier nur auf die für mich hilfreichsten Links:
 
* [Importing and Calling Web Services](http://dev.wavemaker.com/wiki/bin/wmdoc_6.6/WebServices#HImportingandCallingaSOAPService "Importing and Calling Web Services")  
* [Add a Web Service Call](http://dev.wavemaker.com/wiki/bin/view/Documentation/AddaWebServiceCall "Add a Web Service Call")

Damit ein Import unter WaveMaker grundsätzlich durchgeführt werden kann, ist ein WSDL-Importer notwendig.
Beim Einrichten des Webservice weist die IDE auf die Bibliothek *wsdl4j.jar* hin:

* [Download wsdl4j.jar von SourceForge](http://sourceforge.net/projects/wsdl4j/ "Download wsdl4j.jar von SourceForge")

Diese Bibliothek wird in den *lib*-Ordner des jeweiligen Projektes kopiert und 
von dort automatisch durch die IDE den notwendigen Sourcen beim Ausführen der 
Anwendung zur Verfügung gestellt.

Neben dem Import, wird die gesamte Repräsentation und Manipulation der Service- und Proxy-Klassen 
ausgehend von dieser Bibliothek vorgenommen.


Fehler nach Aufbau der Schnittstelle
------------------------------------

### DHL-Websercie: `ISService_1_0_de`
Der gleichnamige Webservice wurde durch den WSDL-Import angelegt und stellt alle 
notwendigen Methoden für die Arbeit mit der Geschäftskundenversand API zur Verfügung.
 
Allerdings haben sich in der Datei *ISService10De.java* Fehler vorgefunden. Ob diese 
Fehler durch einen unsachgemäßen Umgang mit dem Importer oder aber durch fehlerhafte Interpretation durch den Importer
zustande kamen, wurde nicht näher untersucht.

Diese Fehler fanden ebenfalls Einzug die die zugehörige *servicedef.xml* des Webservice und 
somit auch in die *types.js* der Testanwendung.

Sämtliche Request-Klassen und einige Proxy-Klassen wurden einem falschen Package zugeordnet.   
Es wurden zwei Packages angelegt:

* `intraship.ws.de`
* `intrashipservice.ws.de.isservice_1_0_de`

Beim Auflösen der Fehler wurde wie folgt vorgegangen:

* Über QuickFix (Eclipse) die falschen Packagezuordnungen korrigieren
* In Eclipse die `servciedef.xml` entsprechend anpassen
* `types.js` durch kompilieren der Java-Sourcen aus der WaveMaker-IDE heraus neu bilden

Solange in `types.js` die falschen Packagezuordnungen für einige Ressourcen des Webservice vorhanden sind,
kann der Service nicht fehlerfrei ausgeführt werden.

Außer der Datei `ISService10De.java` musste keine weitere Java-Source angepasst werden.    

Beispiel für falsche Packagezuordnung in `ISService10De.java`:

Vorher:

        public CreateShipmentResponse createShipmentDD(intrashipservice.ws.de.isservice_1_0_de.CreateShipmentDDRequest part1, Authentification header) {
          CreateShipmentResponse response;     
          SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
          SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
          response = iswsServicePortTypeService.createShipmentDD(part1);
          return response;
        }

Nachher:

        import intraship.ws.de.CreateShipmentDDRequest;

        public CreateShipmentResponse createShipmentDD(CreateShipmentDDRequest part1, Authentification header) {
          CreateShipmentResponse response;     
          SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
          SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
          response = iswsServicePortTypeService.createShipmentDD(part1);
          return response;
        }


Änderungen an der Schnittstelle
-------------------------------

### Zugangsdaten     
Um von Server aus Zugriff auf die Zugansdaten der Datei `settings.ini` zu erlangen
habe ich die Schnittstelle des Service `ISService_1_0_de` angepasst.

        public CreateShipmentResponse createShipmentDD(CreateShipmentDDRequest part1, Authentification header) {
          CreateShipmentResponse response;
          
          /** 
           * Anpassung durch den Entwickler, wird nicht vom Importer ersetllt
           */            
          bindingProperties = Credentials.getInstance().setBindingProperitiesIfNeeded(bindingProperties);
          header = Credentials.getInstance().setAuthentificationIfNeeded(header);
               
          SOAPBindingResolver.setBindingProperties(((BindingProvider) iswsServicePortTypeService), bindingProperties);
          SOAPBindingResolver.setHeaders(((WSBindingProvider) iswsServicePortTypeService), header);
          response = iswsServicePortTypeService.createShipmentDD(part1);
          return response;
        }
           
### SOAPLoggingHandler     
Über einen SOAPLoggingHandler kann ein Request und ein Response zur Analyse von Fehler komplett geloggt werden.
Im Constructor des Webservice wurde zu diesem Zweck dessen Context ein SOAPLoggingHandler zugeführt. 

Allerdings hat es Problem beim Einsatz des dafür vorgesehen SOAPHandlers gegeben:

* com.wavemaker.runtime.ws.jaxws.SOAPLoggingHandler

Ob dies von einem falschen Verständnis des Handlers oder einem Bug herrührte, wurde nicht näher untersucht.
Stattdessen wurde ein anderer LoggingHandler zum Einsatz gebracht:

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
           * Anpassung durch den Entwickler, wird nicht vom Importer ersetllt
           */            
          MySOAPLoggingHandler.addToPort(((BindingProvider) iswsServicePortTypeService).getBinding()); 
        }         

Der LoggingHandler stammt von der Seite: [http://jgeeks.blogspot.de/2013/03/jaxws-handler-example-for-logging.html](http://jgeeks.blogspot.de/2013/03/jaxws-handler-example-for-logging.html, "http://jgeeks.blogspot.de/2013/03/jaxws-handler-example-for-logging.html")
von Navnit Singh Biring.
 
Der Request und der Response werden im Wavemaker-Log abgelegt. 

Da es sich hier um ein Testprogramm handelt, wurde kein Wert darauf gelegt den 
Logger ein- oder ausschalten zu können. Das loggen dieser Werte macht natürlich 
nur im Testbetrieb Sinn. Im Produktivbetrieb sollte man darauf verzichten. 