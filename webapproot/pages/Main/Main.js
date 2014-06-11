dojo.declare("Main", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
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
    },
    _end: 0
});