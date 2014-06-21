DeleteShipmentDD.widgets = {
	srvDeleteShipmentDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"deleteShipmentDD","service":"ISService_1_0_de"}, {"onResult":"srvDeleteShipmentDDResult"}, {
		input: ["wm.ServiceInput", {"type":"deleteShipmentDDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"varResultByGetDeleteShipmentDDRequest","targetProperty":"part1"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDeleteResponse","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	srvGetDeleteShipmentDDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDeleteShipmentDDRequest","service":"RequestBuilder"}, {"onSuccess":"srvDeleteShipmentDD"}, {
		input: ["wm.ServiceInput", {"type":"getDeleteShipmentDDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetShipmentNr.dataValue","targetProperty":"shipmentNr"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDeleteResponse","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	varResultByDeleteShipmentDD: ["wm.Variable", {"type":"intraship.ws.de.DeleteShipmentResponse"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvDeleteShipmentDD","targetProperty":"dataSet"}, {}]
		}]
	}],
	varResultByGetDeleteShipmentDDRequest: ["wm.Variable", {"type":"intraship.ws.de.DeleteShipmentDDRequest"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetDeleteShipmentDDRequest","targetProperty":"dataSet"}, {}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlDeleteShipmentDD: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"DeleteShipmentDD"}, {}, {
			pnlTop: ["wm.Panel", {"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				btnDeleteShipmentDD: ["wm.Button", {"caption":"Execute","margin":"4","width":"154px"}, {"onclick":"btnDeleteShipmentDDClick"}]
			}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				pnlResponse: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"Response by DeleteShipmentDD"}, {}, {
					pnlDeleteResponse: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlWSVersion: ["wm.Panel", {"height":"28px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtMajorVersion: ["wm.Text", {"caption":"Major","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionshauptnummer des verarbeitenden WebService","placeHolder":"Major","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.version.majorRelease","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtMinorVersion: ["wm.Text", {"caption":"Minor","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionsunternummer des verarbeitenden WebService","placeHolder":"Minor","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.version.minorRelease","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						gridResponse: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"shipmentNumber.shipmentNumber","title":"ShipmentNr","width":"300px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusCode","title":"StatusCode","width":"100px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusMessage","title":"StatusMessage","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"ShipmentNr: \" + ${shipmentNumber.shipmentNumber} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusCode: \" + ${status.statusCode}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusMessage: \" + ${status.statusMessage}\n + \"</div>\"\n\n","mobileColumn":false},
{"show":false,"field":"shipmentNumber.identCode","title":"ShipmentNumber.identCode","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},
{"show":false,"field":"shipmentNumber.licensePlate","title":"ShipmentNumber.licensePlate","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},
{"show":false,"field":"shipmentNumber.airwayBill","title":"ShipmentNumber.airwayBill","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""}
],"dsType":"intraship.ws.de.DeletionState","height":"100%","margin":"4","minDesktopHeight":60,"singleClickEdit":true}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.deletionStates","targetProperty":"dataSet"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"height":"28px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"height":"25px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Allgemeiner StatusCode","placeHolder":"Code","width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"150px","displayValue":"","emptyValue":"emptyString","helpText":"Allgemeine Statusmessage","placeHolder":"Message","width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}