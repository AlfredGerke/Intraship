dojo.declare("CreateShipmentTD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentTDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentTD");
    },
    getShipmentTD: function() {
        try {
            if (scope.srvCreateShipmentTD.canUpdate()) {
                scope.srvCreateShipmentTD.update();
            } else {
                app.toastError("Keine Sendung erstellt!");
            }
        } catch (e) {
            app.toastError(this.name + ".getShipmentTD failed: " + e.toString());
        }
    },
    getShipmentTDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetShipmentTDRequest');

                // Wenn der Request schon vorhanden direkt die Intraship-Methode aufrufen
                // Die Funktion lässt sich verbessern wenn man das Request-Object in den globalen Teil verschiebt
                if ((scope.varResultByGetShipmentTDRequest.getCount() > 0) && (scope.reuseRequest)) {
                    scope.getShipmentTD(scope);
                } else {

                    if (scope.srvGetShipmentTDRequest.canUpdate()) {
                        scope.srvGetShipmentTDRequest.update();
                    } else {
                        app.toastError("Keine Request-Object erstellt!");
                    }
                }

                console.debug('End srvGetShipmentTDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetShipmentTDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        this.reuseRequest = false;
        app.addGetShipmentTDRequestHandler(this.getShipmentTDRequestHandler());
    },
    srvCreateShipmentTDError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetShipmentTDRequest failed: " + inError);
    },
    setAirwillBillHandler: function() {
        return function(air) {
            app.setAirwayBillByResponse(air);
        };
    },
    getXMLLabelHandler: function() {
        var scope = this;

        return function() {
            return scope.edtXMLLabel.getDataValue();
        };
    },
    edtXMLLabelChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
        app.utils.getAirwayBillByLabel(this.getXMLLabelHandler(), this.setAirwillBillHandler());
    },
    srvCreateShipmentTDResult: function(inSender, inDeprecated) {
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
    gridDetailsCellDblClick: function(inSender, evt, selectedItem, rowId, fieldId, rowNode, cellNode) {
        if (selectedItem.data.shipmentNumber) {
            app.setAirwayBillByResponse(selectedItem.data.shipmentNumber.data.airwayBill);
        } else {
            app.toastWarning("Keine Sendungsinformationen vorhanden...");
        }
    },
    cbxDoXMLLabelChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
        this.reuseRequest = false;
    },
    srvGetShipmentTDRequestSuccess1: function(inSender, inDeprecated) {
        this.reuseRequest = true;
    },
    _end: 0
});