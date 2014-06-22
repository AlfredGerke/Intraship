DeleteShipmentTD.widgets = {
	srvDeleteShipmentTD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"deleteShipmentTD","service":"ISService_1_0_de"}, {"onError":"srvDeleteShipmentTDError"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDeleteResponse","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"deleteShipmentTDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetDeleteShipmentTD","targetProperty":"part1"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}]
			}]
		}]
	}],
	varResultByDeleteShipmentTD: ["wm.Variable", {"type":"intraship.ws.de.DeleteShipmentResponse"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvDeleteShipmentTD","targetProperty":"dataSet"}, {}]
		}]
	}],
	srvGetDeleteShipmentTDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDeleteShipmentTDRequest","service":"RequestBuilder"}, {"onSuccess":"srvDeleteShipmentTD"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDeleteResponse","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"getDeleteShipmentTDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetShipmentNr.dataValue","targetProperty":"airwayBill"}, {}]
			}]
		}]
	}],
	varResultByGetDeleteShipmentTD: ["wm.Variable", {"type":"intraship.ws.de.DeleteShipmentTDRequest"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetDeleteShipmentTDRequest","targetProperty":"dataSet"}, {}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlDeleteShipmentTD: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"DeleteShipmentTD"}, {}, {
			pnlTop: ["wm.Panel", {"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				btnDeleteShipmentTD: ["wm.Button", {"caption":"Execute","margin":"4","width":"154px"}, {"onclick":"btnDeleteShipmentTDClick"}]
			}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				pnlResponse: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"Response by DeleteShipmentTD"}, {}, {
					pnlDeleteResponse: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlWSVersion: ["wm.Panel", {"height":"28px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtMajorVersion: ["wm.Text", {"caption":"Major","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionshauptnummer des verarbeitenden WebService","placeHolder":"Major","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentTD.version.majorRelease","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtMinorVersion: ["wm.Text", {"caption":"Minor","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionsunternummer des verarbeitenden WebService","placeHolder":"Minor","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentTD.version.minorRelease","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						gridResponse: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"shipmentNumber.airwayBill","title":"AirwayBill","width":"300px","align":"left","formatFunc":"","editorProps":null,"mobileColumn":false},
{"show":true,"field":"shipmentNumber.shipmentNumber","title":"ShipmentNr","width":"300px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusCode","title":"StatusCode","width":"100px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusMessage","title":"StatusMessage","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"AirwayBill: \" + ${shipmentNumber.airwayBill} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"ShipmentNr: \" + ${shipmentNumber.shipmentNumber}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusCode: \" + ${status.statusCode}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusMessage: \" + ${status.statusMessage}\n + \"</div>\"\n\n","mobileColumn":false},
{"show":false,"field":"shipmentNumber.identCode","title":"ShipmentNumber.identCode","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.licensePlate","title":"ShipmentNumber.licensePlate","width":"100%","align":"left","formatFunc":"","mobileColumn":false}
],"height":"100%","margin":"4","minDesktopHeight":100,"minHeight":100,"minWidth":875,"singleClickEdit":true}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentTD.deletionStates","targetProperty":"dataSet"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"height":"28px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"height":"25px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Allgemeiner StatusCode","placeHolder":"Code","width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentTD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"150px","displayValue":"","emptyValue":"emptyString","helpText":"Allgemeine Statusmessage","placeHolder":"Message","width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentTD.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}