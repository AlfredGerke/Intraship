dojo.declare("MainPhone", wm.Page, {
    "enableMobileFolding": true,
    start: function() {

    },
    "preferredDevice": "phone",
    clearStatusInfo: function() {
        this.varStatusMessageByResponse.setValue("dataValue", "");
        this.varStatusCodeByResponse.setValue("dataValue", "");
    },
    getShipmentDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetShipmentDDRequest');

                scope.srvGetShipmentDDRequest.input.setValue('isXMLLabel', false);

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
    getShipmentNrHandler: function() {
        var scope = this;

        return function() {
            var snr = scope.edtShipmentNr.dataValue;

            return snr;
        };
    },
    btnCreateDDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentDD");
    },
    onStart: function(inPage) {
        app.addGetShipmentDDRequestHandler(this.getShipmentDDRequestHandler());
        app.addSetCredentialsHandler(this.setCredentialsHandler());
        app.addDeleteShipmentDDRequestHandler(this.getDeleteShipmentDDRequestHandler());
        app.addGetShipmentNrHandler(this.getShipmentNrHandler());
    },
    srvCreateShipmentDDError: function(inSender, inError) {
        app.toastError(this.name + ".srvCreateShipmentDD failed: " + inError);
    },
    srvCreateShipmentDDResult: function(inSender, inDeprecated) {
        var ds = app.utils.getMessagesByCreationState(inDeprecated.creationStates);
        var s_nr = app.utils.getShipmentNrByCreationState(inDeprecated.creationStates, 0);
        var s_code = inDeprecated.status.statusCode;
        var s_message = inDeprecated.status.statusMessage;

        this.varStatusCodeByResponse.setValue("dataValue", s_code);
        this.varStatusMessageByResponse.setValue("dataValue", s_message);
        this.varShipmentNrByResponse.setValue("dataValue", s_nr);

        app.varResultByStatusMessages.clearData();
        app.varResultByStatusMessages.setData(ds);
    },
    getDeleteShipmentDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetDeleteShipmentDDRequest');

                if (scope.srvGetDeleteShipmentDDRequest.canUpdate()) {
                    scope.srvGetDeleteShipmentDDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvGetDeleteShipmentDDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetDeleteShipmentDDRequest failed: " + e.toString());
            }
        };
    },
    onShow: function() {
        app.varResultByStatusMessages.clearData();
    },
    setCredentialsHandler: function() {
        var scope = this;

        return function() {
            var dev_id = "";
            var pass = "";

            app.varResultByGetAuthentication.setValue("user", dev_id);
            app.varResultByGetAuthentication.setValue("signature", pass);
            app.varResultByGetAuthentication.setValue("type", 0);
            app.varResultByGetAuthentication.setValue("accountNumber", 0);
        };
    },
    btnDeleteDDClick: function(inSender) {
        app.getAuthentificationHeader("DeleteShipmentDD");
    },
    srvDeleteShipmentDDError: function(inSender, inError) {
        app.toastError(this.name + ".srvDeleteShipmentDD failed: " + inError);
    },
    srvGetDeleteShipmentDDRequestError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetDeleteShipmentDDRequest failed: " + inError);
    },
    srvGetShipmentDDRequestError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetShipmentDDRequest failed: " + inError);
    },
    srvDeleteShipmentDDResult: function(inSender, inDeprecated) {
        var s_code = inDeprecated.status.statusCode;
        var s_message = inDeprecated.status.statusMessage;

        this.varStatusCodeByResponse.setValue("dataValue", s_code);
        this.varStatusMessageByResponse.setValue("dataValue", s_message);
    },
    btnCreateClick1: function(inSender) {
        this.clearStatusInfo();
    },
    btnDeleteClick1: function(inSender) {
        this.clearStatusInfo();
    },
    _end: 0
});