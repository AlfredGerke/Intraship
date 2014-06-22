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
    _end: 0
});