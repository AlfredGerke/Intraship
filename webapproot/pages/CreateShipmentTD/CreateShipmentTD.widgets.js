CreateShipmentTD.widgets = {
	srvCreateShipmentTD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"createShipmentTD","service":"ISService_1_0_de"}, {"onError":"srvCreateShipmentTDError","onResult":"srvCreateShipmentTDResult"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"createShipmentTDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetShipmentTDRequest","targetProperty":"part1"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}]
			}]
		}]
	}],
	srvGetShipmentTDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getShipmentTDRequest","service":"RequestBuilder"}, {"onSuccess":"srvCreateShipmentTD"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"getShipmentTDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"cbxDoXMLLabel.dataValue","targetProperty":"isXMLLabel"}, {}]
			}]
		}]
	}],
	varResultByCreateShipmentTD: ["wm.Variable", {"type":"intraship.ws.de.CreateShipmentResponse"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvCreateShipmentTD","targetProperty":"dataSet"}, {}]
		}]
	}],
	varResultByGetShipmentTDRequest: ["wm.Variable", {"type":"intraship.ws.de.CreateShipmentTDRequest"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetShipmentTDRequest","targetProperty":"dataSet"}, {}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlCreateShipmentTD: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"CreateShipmentTD"}, {}, {
			pnlTop: ["wm.Panel", {"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				btnCreateShipmentTD: ["wm.Button", {"caption":"Execute","margin":"4","width":"154px"}, {"onclick":"btnCreateShipmentTDClick"}],
				cbxDoXMLLabel: ["wm.Checkbox", {"caption":"Create XML-Label","captionSize":"300px","dataValue":true,"displayValue":true,"startChecked":true,"width":"155px"}, {}]
			}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				pnlResponse: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"Response by CreateShipmentTD"}, {}, {
					pnlLabelResponse: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlWSVersion: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtMajorVersion: ["wm.Text", {"caption":"Major","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionshauptnummer des verarbeitenden WebService","placeHolder":"Major","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.version.majorRelease","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtMinorVersion: ["wm.Text", {"caption":"Minor","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionsunternummer des verarbeitenden WebService","placeHolder":"Minor","width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.version.minorRelease","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						edtLabelURL: ["wm.Text", {"caption":undefined,"displayValue":"","emptyValue":"emptyString","helpText":"URL kann über einen PDF-Reader direkt im Browser verarbeitet werden","placeHolder":"Label URL","styles":{},"width":"100%"}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.creationStates.labelurl","targetProperty":"dataValue"}, {}]
							}]
						}],
						edtXMLLabel: ["wm.LargeTextArea", {"caption":undefined,"captionPosition":"left","captionSize":"100px","displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"styles":{},"width":"100%"}, {"onchange":"edtXMLLabelChange"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.creationStates.XMLLabel","targetProperty":"dataValue"}, {}]
							}]
						}],
						gridDetails: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"statusCode","title":"StatusCode","width":"125px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"shipmentNumber.shipmentNumber","title":"ShipmentNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"StatusCode: \" + ${statusCode} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"ShipmentNumber: \" + ${shipmentNumber.shipmentNumber}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"AirwayBill: \" + ${shipmentNumber.airwayBill}\n + \"</div>\"\n\n","mobileColumn":true},
{"show":false,"field":"shipmentNumber.identCode","title":"ShipmentNumber.identCode","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.licensePlate","title":"ShipmentNumber.licensePlate","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"shipmentNumber.airwayBill","title":"AirwayBill","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"labelurl","title":"Labelurl","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"XMLLabel","title":"XMLLabel","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"sequenceNumber","title":"SequenceNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"pickupConfirmationNumber","title":"PickupConfirmationNumber","width":"100%","align":"left","formatFunc":"","mobileColumn":false}
],"height":"100px","localizationStructure":{},"margin":"4","minDesktopHeight":60,"minWidth":875,"singleClickEdit":true}, {"onCellDblClick":"gridDetailsCellDblClick"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.creationStates","targetProperty":"dataSet"}, {}]
							}]
						}],
						gridDetailMessages: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"dataValue","title":"StatusMessages","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"StatusMessages: \" + ${dataValue} +\n\"</div>\"\n\n","mobileColumn":true}
],"dsType":"AnyData","height":"100px","margin":"4","minDesktopHeight":60,"minWidth":875,"singleClickEdit":true}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByStatusMessages","targetProperty":"dataSet"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"height":"30px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Allgemeiner StatusCode","placeHolder":"Code","width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"130px","displayValue":"","emptyValue":"emptyString","helpText":"Allgemeine Statusmeldung","placeHolder":"Message","width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}