CreateShipmentDD.widgets = {
	srvCreateShipmentDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"createShipmentDD","service":"ISService_1_0_de"}, {"onError":"srvCreateShipmentDDError","onResult":"srvCreateShipmentDDResult"}, {
		input: ["wm.ServiceInput", {"type":"createShipmentDDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetShipmentDDRequest","targetProperty":"part1"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	srvGetShipmentDDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getShipmentDDRequest","service":"RequestBuilder"}, {"onSuccess":"srvCreateShipmentDD"}, {
		input: ["wm.ServiceInput", {"type":"getShipmentDDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"cbxDoXMLLabel.dataValue","targetProperty":"isXMLLabel"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	varResultByCreateShipmentDD: ["wm.Variable", {"type":"intraship.ws.de.CreateShipmentResponse"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvCreateShipmentDD","targetProperty":"dataSet"}, {}]
		}]
	}],
	varResultByGetShipmentDDRequest: ["wm.Variable", {"type":"intraship.ws.de.CreateShipmentDDRequest"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetShipmentDDRequest","targetProperty":"dataSet"}, {}]
		}]
	}],
	varSelectedItemShipmentNr: ["wm.Variable", {"type":"StringData"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"gridDetails.selectedItem.shipmentNumber.shipmentNumber","targetProperty":"dataSet.dataValue"}, {}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","styles":{},"verticalAlign":"top","width":"1455px"}, {}, {
		pnlCreateShipmentDD: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"CreateShipmentDD"}, {}, {
			pnlTop: ["wm.Panel", {"desktopHeight":"40px","enableTouchHeight":true,"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","mobileHeight":"40px","verticalAlign":"top","width":"100%"}, {}, {
				btnCreateShipmentDD: ["wm.Button", {"caption":"Execute","margin":"4","width":"154px"}, {"onclick":"btnCreateShipmentDDClick"}],
				cbxDoXMLLabel: ["wm.Checkbox", {"caption":"Create XML-Label","captionSize":"300px","dataValue":true,"desktopHeight":"35px","displayValue":true,"height":"35px","startChecked":true,"width":"155px"}, {}]
			}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				pnlResponse: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"Response by CreateShipmentDD"}, {}, {
					pnlLabelResponse: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlWSVersion: ["wm.Panel", {"desktopHeight":"35px","enableTouchHeight":true,"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","mobileHeight":"35px","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
							edtMajorVersion: ["wm.Text", {"caption":"Major","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionshauptnummer des verarbeitenden WebService","placeHolder":"Major","readonly":true,"styles":{},"width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.version.majorRelease","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtMinorVersion: ["wm.Text", {"caption":"Minor","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionsunternummer des verarbeitenden WebService","placeHolder":"Minor","readonly":true,"styles":{},"width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.version.minorRelease","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						edtLabelURL: ["wm.Text", {"caption":undefined,"displayValue":"","emptyValue":"emptyString","helpText":"URL kann über einen PDF-Reader direkt im Browser verarbeitet werden","placeHolder":"Label URL","singleLine":false,"styles":{},"width":"100%"}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.creationStates.labelurl","targetProperty":"dataValue"}, {}]
							}]
						}],
						edtXMLLabel: ["wm.LargeTextArea", {"caption":undefined,"captionPosition":"left","captionSize":"100px","displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"styles":{},"width":"100%"}, {"onchange":"edtXMLLabelChange"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.creationStates.XMLLabel","targetProperty":"dataValue"}, {}]
							}]
						}],
						gridDetails: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"statusCode","title":"StatusCode","width":"125px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"shipmentNumber.shipmentNumber","title":"ShipmentNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"StatusCode: \" + ${statusCode} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"ShipmentNumber: \" + ${shipmentNumber.shipmentNumber}\n + \"</div>\"\n\n","mobileColumn":true},
{"show":false,"field":"shipmentNumber.identCode","title":"ShipmentNumber.identCode","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.licensePlate","title":"ShipmentNumber.licensePlate","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.airwayBill","title":"ShipmentNumber.airwayBill","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"labelurl","title":"Labelurl","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"XMLLabel","title":"XMLLabel","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"sequenceNumber","title":"SequenceNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"pickupConfirmationNumber","title":"PickupConfirmationNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false}
],"desktopHeight":"100px","deviceType":["desktop","tablet"],"enableTouchHeight":true,"height":"100px","localizationStructure":{},"margin":"4","minDesktopHeight":60,"minMobileHeight":60,"minWidth":400,"mobileHeight":"100px","singleClickEdit":true,"styles":{}}, {"onSelect":"gridDetailsSelect"}, {
							binding: ["wm.Binding", {}, {}, {
								wire1: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.creationStates","targetProperty":"dataSet"}, {}]
							}]
						}],
						gridDetailMessages: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"dataValue","title":"StatusMessages","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"StatusMessages: \" + ${dataValue} +\n\"</div>\"\n\n","mobileColumn":true}
],"desktopHeight":"100px","dsType":"AnyData","enableTouchHeight":true,"height":"100px","margin":"4","minDesktopHeight":60,"minMobileHeight":60,"minWidth":400,"mobileHeight":"100px","singleClickEdit":true}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByStatusMessages","targetProperty":"dataSet"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"desktopHeight":"35px","enableTouchHeight":true,"height":"35px","horizontalAlign":"left","mobileHeight":"37px","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Allgemeiner StatusCode","placeHolder":"Code","readonly":true,"width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"150px","displayValue":"","emptyValue":"emptyString","helpText":"Allgemeine Statusmeldung","placeHolder":"Message","readonly":true,"width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}