dojo.declare("MainTablet", wm.Page, {
    "enableMobileFolding": true,
    "preferredDevice": "tablet",
    start: function() {

    },
    setCredentialsHandler: function() {
        return function() {
            var emptyStr = "";

            app.varResultByGetAuthentication.setValue("user", emptyStr);
            app.varResultByGetAuthentication.setValue("signature", emptyStr);
            app.varResultByGetAuthentication.setValue("type", 0);
            app.varResultByGetAuthentication.setValue("accountNumber", 0);
        };
    },
    getShipmentNrHandler: function() {
        var scope = this;

        return function() {
            var snr = scope.edtShipmentNr.dataValue;

            return snr;
        };
    },
    setShipmentNrByResponseHandler: function() {
        var scope = this;

        return function(snr) {
            scope.edtShipmentNr.setValue("dataValue", snr);
        };
    },
    onStart: function(inPage) {
        app.addSetCredentialsHandler(this.setCredentialsHandler());
        app.addSetShipmentNrHandler(this.setShipmentNrByResponseHandler());
        app.addGetShipmentNrHandler(this.getShipmentNrHandler());
    },
    lstNavigationSelect: function(inSender, inItem) {
        var mod = this.varResultByNavItems.getValue("dataValue");

        switch (mod) {
        case "CreateShipmentDD":
            this.navCallCreateShipmentDD.update();

            break;
        case "GetLabelDD":
            this.navCallGetShipmentDD.update();

            break;
        case "DeleteShipmentDD":
            this.navCallDeleteShipmentDD.update();

            break;
        default:
            app.toastError("Kein gültiges Modul gewählt: " + mod);

            break;
        }
    },
    btnInfoClick1: function(inSender) {
        this.lstNavigation.deselectAll();
    },
    _end: 0
});