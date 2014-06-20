dojo.declare("DeleteShipmentDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnDeleteShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader("DeleteShipmentDD");
    },
    getDeleteShipmentDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetDeleteShipmentDDRequest');

                if (scope.srvDeleteShipmentDDRequest.canUpdate()) {
                    scope.srvDeleteShipmentDDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvDeleteShipmentDDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvDeleteShipmentDDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        app.addDeleteShipmentDDRequestHandler(this.getDeleteShipmentDDRequestHandler());
    },
    _end: 0
});