dojo.declare("CreateShipmentDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentDD");
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
    setSipmentNumberHandler: function() {
        return function(shipnr) {
            app.setShipmentNrByResponse(shipnr);
        };
    },
    getXMLLabelHandler: function() {
        var scope = this;

        return function() {
            return scope.edtXMLLabel.getDataValue();
        };
    },
    edtXMLLabelChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
        app.utils.getShipmentNrByLabel(this.getXMLLabelHandler(), this.setSipmentNumberHandler());
    },
    _end: 0
});