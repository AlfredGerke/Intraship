dojo.declare("DeleteShipmentTD", wm.Page, {
	start: function() {
		
	},
	"preferredDevice": "desktop",
    getDeleteShipmentTDRequestHandler: function() {
        var scope = this;

        return function() {
            try {
                console.debug('Start srvGetDeleteShipmentTDRequest');
                          
                if (scope.srvGetDeleteShipmentTDRequest.canUpdate()) {
                    scope.srvGetDeleteShipmentTDRequest.update();
                } else {
                    app.toastError("Keine Request-Object erstellt!");
                }

                console.debug('End srvGetDeleteShipmentTDRequest');
            } catch (e) {
                app.toastError(scope.name + ".srvGetDeleteShipmentTDRequest failed: " + e.toString());
            }
        };
    },
	onShow: function() {
		app.varResultByStatusMessages.clearData();
	},
	btnDeleteShipmentTDClick: function(inSender) {
		app.getAuthentificationHeader("DeleteShipmentTD");
	},
	onStart: function( inPage) {
		app.addDeleteShipmentTDRequestHandler(this.getDeleteShipmentTDRequestHandler());
	},
	srvDeleteShipmentTDError: function(inSender, inError) {
		app.toastError(this.name + ".srvDeleteShipmentTD failed: " + inError);
	},
	_end: 0
});