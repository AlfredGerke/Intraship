dojo.declare("Main", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
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
    setCredentialsHandler: function() {
        var scope = this;

        return function() {
            var dev_id = scope.edtDevID.dataValue;
            var pass = scope.edtPass.dataValue;

            app.varResultByGetAuthentication.setValue("user", dev_id);
            app.varResultByGetAuthentication.setValue("signature", pass);
            app.varResultByGetAuthentication.setValue("type", 0);
            app.varResultByGetAuthentication.setValue("accountNumber", 0);
        };
    },
    onStart: function(inPage) {
        app.addSetCredentialsHandler(this.setCredentialsHandler());
        app.addSetShipmentNrHandler(this.setShipmentNrByResponseHandler());
        app.addGetShipmentNrHandler(this.getShipmentNrHandler());
    },
    _end: 0
});