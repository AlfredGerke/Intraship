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
	srvDeleteShipmentDDResult: function(inSender, inDeprecated) {
		
        //app.toastInfo(inDeprecated.deletionStates[0].data.shipmentNumber.data.shipmentNumber);
        //app.toastInfo(inDeprecated.deletionStates[0].data.status.data.statusCode);
        //app.toastInfo(inDeprecated.deletionStates[0].data.status.data.statusMessage);
		
	},
	onShow: function() {
		app.varResultByStatusMessages.clearData();
	},
	_end: 0
});