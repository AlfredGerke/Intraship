dojo.declare("CreateShipmentTD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",

    btnCreateShipmentTDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentTD");
    },
    getShipmentTDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetShipmentTDRequest');

                if (scope.srvGetShipmentTDRequest.canUpdate()) {
                    scope.srvGetShipmentTDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvGetShipmentTDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetShipmentTDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        app.addGetShipmentTDRequestHandler(this.getShipmentTDRequestHandler());
    },
    srvCreateShipmentTDError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetShipmentTDRequest failed: " + inError);
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