dojo.declare("MainTablet", wm.Page, {
    "enableMobileFolding": true,
    "preferredDevice": "tablet",
    start: function() {

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
        app.addSetShipmentNrHandler(this.setShipmentNrByResponseHandler());
        app.addGetShipmentNrHandler(this.getShipmentNrHandler());
    },
	lstNavigationSelect: function(inSender, inItem) {
        var mod = this.varResultByNavItems.getValue("dataValue");

        switch (mod) {
        case "CreateShipmentDD":
            this.navCallCreateShipmentDD.update();

            break;
        case "GetShipmentDD":
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
	_end: 0
});