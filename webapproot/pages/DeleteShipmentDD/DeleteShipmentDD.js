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
    onStart: function(inPage) {
        app.addDeleteShipmentDDRequestHandler(this.getDeleteShipmentDDRequestHandler());
    },
    onShow: function() {
        app.varResultByStatusMessages.clearData();
    },
    srvDeleteShipmentDDError: function(inSender, inError) {
    	app.toastError(this.name + ".srvDeleteShipmentDD failed: " + inError);
	},
	_end: 0
});