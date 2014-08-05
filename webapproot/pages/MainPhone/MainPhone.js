dojo.declare("MainPhone", wm.Page, {
    "enableMobileFolding": true,
    start: function() {

    },
    "preferredDevice": "phone",
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
    btnCreateDDClick: function(inSender) {
        app.getAuthentificationHeader("CreateShipmentDD");
    },
    onStart: function(inPage) {
        app.addGetShipmentDDRequestHandler(this.getShipmentDDRequestHandler());
        app.addSetCredentialsHandler(this.setCredentialsHandler());
    },
    srvCreateShipmentDDError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetShipmentDDRequest failed: " + inError);
    },
    srvCreateShipmentDDResult: function(inSender, inDeprecated) {
        var ds = app.utils.getMessagesByCreationState(inDeprecated.creationStates);

        app.varResultByStatusMessages.clearData();
        app.varResultByStatusMessages.setData(ds);
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
    _end: 0
});