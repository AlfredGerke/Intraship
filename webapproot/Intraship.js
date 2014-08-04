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
	"phoneMain": "MainPhone", 
	"phoneTheme": "wm.base.widget.themes.wm_wireframe", 
	"projectSubVersion": "Alpha6", 
	"projectVersion": 1, 
	"sessionExpirationHandler": "navigateToLogin", 
	"studioVersion": "6.7.0.RELEASE", 
	"tabletMain": "MainTablet", 
	"tabletTheme": "wm.base.widget.themes.wm_wireframe", 
	"theme": "wm.base.widget.themes.wm_wireframe", 
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
		}], 
		varResultByGetShipmentNr: ["wm.Variable", {"type":"StringData"}, {}], 
		varResultByStatusMessages: ["wm.Variable", {"isList":true,"type":"AnyData"}, {}]
	},
	_end: 0
});

Intraship.extend({
    start: function() {
        this.utils = new DemoUtils();
    },
    addDeleteShipmentTDRequestHandler: function(gdstdr) {
        this.onGetDeleteShipmentTDRequest = gdstdr;
    },
    addDeleteShipmentDDRequestHandler: function(gdsddr) {
        this.onGetDeleteShipmentDDRequest = gdsddr;
    },
    addGetLabelDDRequestHandler: function(glddr) {
        this.onGetLabelDDRequest = glddr;
    },
    addGetAirwayBillHandler: function(gawb) {
        this.getAriwayBill = gawb;
    },
    addGetShipmentNrHandler: function(gsnr) {
        this.getShipmentNr = gsnr;
    },
    addSetShipmentNrHandler: function(gsbr) {
        this.onSetShipmentNrByResponse = gsbr;
    },
    addSetAirwayBillHandler: function(gabr) {
        this.onSetAirwayBillByResponse = gabr;
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
        var shipnr = "";

        this.onSetCredentials();

        switch (mod) {
        case "CreateShipmentDD":
            this.onGetShipmentDDRequest();

            break;
        case "CreateShipmentTD":
            this.onGetShipmentTDRequest();

            break;
        case "GetLabelDD":
            shipnr = this.getShipmentNr();

            this.varResultByGetShipmentNr.setValue("dataValue", shipnr);

            this.onGetLabelDDRequest();

            break;
        case "DeleteShipmentDD":
            shipnr = this.getShipmentNr();

            this.varResultByGetShipmentNr.setValue("dataValue", shipnr);

            this.onGetDeleteShipmentDDRequest();

            break;
        case "DeleteShipmentTD":
            airwaybill = this.getAriwayBill();

            this.varResultByGetShipmentNr.setValue("dataValue", airwaybill);

            this.onGetDeleteShipmentTDRequest();
            break;
        default:
            this.toastError("Kein gültiges Modul gewählt: " + mod);

            break;
        }
    },
    setShipmentNrByResponse: function(nr) {
        this.onSetShipmentNrByResponse(nr);
    },
    setAirwayBillByResponse: function(air) {
        this.onSetAirwayBillByResponse(air);
    },
    _end: 0
});