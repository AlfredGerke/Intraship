dojo.declare("CreateShipmentDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader();
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
    _end: 0
});