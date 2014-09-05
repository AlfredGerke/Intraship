dojo.declare("CreateShipmentDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentDD");
    },
    getShipmentDD: function(scope) {
        try {
            if (scope.srvCreateShipmentDD.canUpdate()) {
                scope.srvCreateShipmentDD.update();
            } else {
                app.toastError("Keine Sendung erstellt!");
            }
        } catch (e) {
            app.toastError(this.name + ".getShipmentDD failed: " + e.toString());
        }
    },
    getShipmentDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetShipmentDDRequest');

                // Wenn der Request schon vorhanden direkt die Intraship-Methode aufrufen           
                // Die Funktion lässt sich verbessern wenn man das Request-Object in den globalen Teil verschiebt
                if ((scope.varResultByGetShipmentDDRequest.getCount() > 0) && (scope.reuseRequest)) {
                    scope.getShipmentDD(scope);
                } else {
                    if (scope.srvGetShipmentDDRequest.canUpdate()) {
                        scope.srvGetShipmentDDRequest.update();
                    } else {
                        app.toastError("Keine Request-Object erstellt!");
                    }
                }

                console.debug('End srvGetShipmentDDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetShipmentDDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        this.reuseRequest = false;
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
    srvCreateShipmentDDResult: function(inSender, inDeprecated) {
        var ds = app.utils.getMessagesByCreationState(inDeprecated.creationStates);

        if (this.cbxDoXMLLabel.getChecked() === false) {
            var s_nr = app.utils.getShipmentNrByCreationState(inDeprecated.creationStates, 0);
            app.setShipmentNrByResponse(s_nr);
        }

        app.varResultByStatusMessages.clearData();
        app.varResultByStatusMessages.setData(ds);
    },
    onShow: function() {
        app.varResultByStatusMessages.clearData();
    },
    gridDetailsSelect: function(inSender) {
        var shipmentNr = this.varSelectedItemShipmentNr.getValue("dataValue");

        if (shipmentNr) {
            app.setShipmentNrByResponse(shipmentNr);
        } else {
            app.toastWarning("Keine Sendungsinformationen vorhanden...");
        }
    },
    cbxDoXMLLabelChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
        this.reuseRequest = false;
    },
    srvGetShipmentDDRequestSuccess1: function(inSender, inDeprecated) {
        this.reuseRequest = true;
    },
    _end: 0
});