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
	"projectSubVersion": "Alpha5", 
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
    addSetCredentialsHandler: function(osc) {
        this.onSetCredentials = osc;
    },
    addGetShipmentDDRequestHandler: function(rsddr) {
        this.onGetShipmentDDRequest = rsddr;
    },
    getAuthentificationHeader: function() {
        try {
            console.debug('Start srvGetAuthentication');

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
        this.onSetCredentials();

        this.onGetShipmentDDRequest();
    },
    _end: 0
});