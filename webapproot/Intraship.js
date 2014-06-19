dojo.declare("Intraship", wm.Application, {
	"disableDirtyEditorTracking": false, 
	"eventDelay": 0, 
	"hintDelay": 1500, 
	"i18n": false, 
	"isSecurityEnabled": false, 
	"main": "Main", 
	"manageHistory": true, 
	"manageURL": false, 
	"name": "", 
	"phoneGapLoginPage": "Login", 
	"phoneMain": "", 
	"projectSubVersion": "Alpha6", 
	"projectVersion": 1, 
	"sessionExpirationHandler": "navigateToLogin", 
	"studioVersion": "6.7.0.RELEASE", 
	"tabletMain": "", 
	"theme": "wm.base.widget.themes.wm_default", 
	"toastPosition": "br", 
	"touchToClickDelay": 500, 
	"touchToRightClickDelay": 1500,
	"widgets": {
		silkIconList: ["wm.ImageList", {"colCount":39,"height":16,"iconCount":90,"url":"lib/images/silkIcons/silk.png","width":16}, {}], 
		dlgLoading: ["wm.LoadingDialog", {"serviceVariableToTrack":["app.srvGetAuthentication"],"widgetToCover":""}, {}], 
		srvGetAuthentication: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getAuthentification","service":"CISBase"}, {"onSuccess":"srvGetAuthenticationSuccess"}, {
			input: ["wm.ServiceInput", {"type":"getAuthentificationInputs"}, {}]
		}], 
		varResultByGetAuthentication: ["wm.Variable", {"type":"intrashipservice.ws.de.isservice_1_0_de.Authentification"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.srvGetAuthentication","targetProperty":"dataSet"}, {}]
			}]
		}]
	},
	_end: 0
});

Intraship.extend({
    addGetShipmentNrHandler: function(gsnr) {
        this.onGetShipmentNr = gsnr;
    },
    addSetShipmentNrHandler: function(gsbr) {
        this.onSetShipmentNrByResponse = gsbr;
    },
    addSetCredentialsHandler: function(osc) {
        this.onSetCredentials = osc;
    },
    addGetShipmentDDRequestHandler: function(rsddr) {
        this.onGetShipmentDDRequest = rsddr;
    },
    addGetShipmentTDRequestHandler: function(rstdr) {
        this.onGetShipmentTDRequest = rstdr;
    },    
    getAuthentificationHeader: function(flag) {
        try {
            console.debug('Start srvGetAuthentication: ' + flag);

            this.currentMod = flag;

            if (this.srvGetAuthentication.canUpdate()) {
                this.srvGetAuthentication.update();
            } else {
                this.toastError("Keine Athentification-Object erstellt!");
            }

            console.debug('End srvGetAuthentication');
        } catch (e) {
            this.toastError(this.name + ".srvGetAuthentication failed: " + e.toString());
        }
    },
    srvGetAuthenticationSuccess: function(inSender, inDeprecated) {
        var mod = this.currentMod;

        this.onSetCredentials();

        switch (mod) {
        case "CreateShipmentDD":
            this.onGetShipmentDDRequest();

            break;
        case "CreateShipmentTD":
            this.onGetShipmentTDRequest();

            break;
        default:
            this.toastError("Kein gültiges Modul gewählt: " + mod);

            break;
        }
    },
    setShipmentNrByResponse: function(shipNr) {
        this.onSetShipmentNrByResponse(shipNr);
    },
    _end: 0
});