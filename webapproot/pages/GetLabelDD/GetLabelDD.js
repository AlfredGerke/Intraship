dojo.declare("GetLabelDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader("GetLabelDD");
    },
    getLabelDDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetLabelDDRequest');

                if (scope.srvGetLabelDDRequest.canUpdate()) {
                    scope.srvGetLabelDDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvGetLabelDDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetLabelDDRequest failed: " + e.toString());
            }
        };
    },
    onStart: function(inPage) {
        app.addGetLabelDDRequestHandler(this.getLabelDDRequestHandler());
    },
    _end: 0
});