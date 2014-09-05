dojo.declare("GetLabelDD", wm.Page, {
    start: function() {

    },
    "preferredDevice": "desktop",
    btnCreateShipmentDDClick: function(inSender) {
        app.getAuthentificationHeader("GetLabelDD");
    },
    getLabelDD: function(scope) {
        try {
            if (scope.srvGetLabelDD.canUpdate()) {
                scope.srvGetLabelDD.update();
            } else {
                app.toastError("Keine Sendung gefunden!");
            }
        } catch (e) {
            app.toastError(this.name + ".srvGetLabelDD failed: " + e.toString());
        }
    },
    getLabelDDRequestHandler: function() {
        var scope = this;

        return function(reuse) {
            try {
                console.debug('Start srvGetLabelDDRequest');
                
                // Wenn der Request schon vorhanden direkt die Intraship-Methode aufrufen
                // Die Funktion lässt sich verbessern wenn man das Request-Object in den globalen Teil verschiebt
                if ((scope.varResultByGetLabelDDRequest.getCount() > 0) && (reuse)) {
                    scope.getLabelDD(scope);
                } else {

                    if (scope.srvGetLabelDDRequest.canUpdate()) {
                        scope.srvGetLabelDDRequest.update();
                    } else {
                        app.toastError("Keine Request-Object erstellt!");
                    }
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
    onShow: function() {
        app.varResultByStatusMessages.clearData();
    },
    srvGetLabelDDError: function(inSender, inError) {
        app.toastError(this.name + ".srvGetLabelDD failed: " + inError);
    },
    _end: 0
});