dojo.declare("CreateShipmentDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader();
    },
    getShipmentDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetShipmentDDRequest');

                if (scope.srvGetShipmentDDRequest.canUpdate()) {
                    scope.srvGetShipmentDDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvGetShipmentDDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetShipmentDDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        app.addGetShipmentDDRequestHandler(this.getShipmentDDRequestHandler());
    },
    srvCreateShipmentDDError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetShipmentDDRequest failed: " + inError);
    },
    getSipmentNumberByXML: function() {
        var xml = this.edtXMLLabel.getDataValue();
        var jsdom = dojox.xml.parser.parse(xml);
        var nodeList = jsdom.getElementsByTagName("SHIPMENTNR");
        var node = nodeList[0].childNodes[0];
        
        app.setShipmentNrByResponse(node.nodeValue);
    },
    edtXMLLabelChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
        dojo.require("dojox.xml.parser");
        dojo.ready(this, "getSipmentNumberByXML");
    },
    _end: 0
});