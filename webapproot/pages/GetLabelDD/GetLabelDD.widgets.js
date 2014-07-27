GetLabelDD.widgets = {
	srvGetLabelDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getLabelDD","service":"ISService_1_0_de"}, {"onError":"srvGetLabelDDError"}, {
		input: ["wm.ServiceInput", {"type":"getLabelDDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDDRequest","targetProperty":"part1"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	srvGetLabelDDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"GetLabelDDRequest","service":"RequestBuilder"}, {"onSuccess":"srvGetLabelDD"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlLabelResponse","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"GetLabelDDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetShipmentNr.dataValue","targetProperty":"shipmentNr"}, {}]
			}]
		}]
	}],
	varResultByGetLabelDD: ["wm.Variable", {"type":"intraship.ws.de.GetLabelResponse"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetLabelDD","targetProperty":"dataSet"}, {}]
		}]
	}],
	varResultByGetLabelDDRequest: ["wm.Variable", {"type":"intraship.ws.de.GetLabelDDRequest"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"srvGetLabelDDRequest","targetProperty":"dataSet"}, {}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","styles":{},"verticalAlign":"top"}, {}, {
		pnlGetLabelDD: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"GetLabelDD"}, {}, {
			pnlTop: ["wm.Panel", {"desktopHeight":"40px","enableTouchHeight":true,"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				btnGetLabelDD: ["wm.Button", {"caption":"Execute","margin":"4","width":"154px"}, {"onclick":"btnCreateShipmentDDClick"}],
				cbxXML_Rrequest: ["wm.Checkbox", {"caption":"Created by Labeltype: XML","captionSize":"200px","checkedValue":false,"displayValue":false,"readonly":true,"width":"200px"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":"${edtXMLLabel.dataValue} != \"\"","targetProperty":"dataValue"}, {}]
					}]
				}]
			}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				pnlResponse: ["wm.FancyPanel", {"margin":"0,0,0,0","styles":{},"title":"Response by GetLabelDD"}, {}, {
					pnlLabelResponse: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlWSVersion: ["wm.Panel", {"desktopHeight":"35px","enableTouchHeight":true,"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
							edtMajorVersion: ["wm.Text", {"caption":"Major","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionshauptnummer des verarbeitenden WebService","placeHolder":"Minor","readonly":true,"styles":{},"width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.version.majorRelease","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtMinorVersion: ["wm.Text", {"caption":"Minor","captionSize":"50px","displayValue":"","emptyValue":"emptyString","helpText":"Versionsunternummer des verarbeitenden WebService","placeHolder":"Minor","readonly":true,"styles":{},"width":"125px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.version.minorRelease","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						edtLabelURL: ["wm.Text", {"caption":undefined,"displayValue":"","emptyValue":"emptyString","helpText":"URL kann über einen PDF-Reader direkt im Browser verarbeitet werden","placeHolder":"Label URL","singleLine":false,"styles":{},"width":"100%"}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.labelDatas.labelurl","targetProperty":"dataValue"}, {}]
							}]
						}],
						edtXMLLabel: ["wm.LargeTextArea", {"caption":undefined,"captionPosition":"left","captionSize":"150px","displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"styles":{},"width":"100%"}, {"onchange":"edtXMLLabelChange"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.labelDatas.XMLLabel","targetProperty":"dataValue"}, {}]
							}]
						}],
						gridDetails: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"shipmentNumber.shipmentNumber","title":"ShipmentNumber","width":"300px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusCode","title":"StatusCode","width":"125px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"status.statusMessage","title":"StatusMessage","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"ShipmentNumber: \" + ${shipmentNumber.shipmentNumber} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusCode: \" + ${status.statusCode}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"StatusMessage: \" + ${status.statusMessage}\n + \"</div>\"\n\n","mobileColumn":true},
{"show":false,"field":"shipmentNumber.identCode","title":"ShipmentNumber.identCode","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.licensePlate","title":"ShipmentNumber.licensePlate","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"shipmentNumber.airwayBill","title":"ShipmentNumber.airwayBill","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"labelurl","title":"Labelurl","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"XMLLabel","title":"XMLLabel","width":"100%","align":"left","formatFunc":"","mobileColumn":false}
],"desktopHeight":"100px","dsType":"intraship.ws.de.LabelData","enableTouchHeight":true,"height":"100px","margin":"4","minDesktopHeight":60,"minWidth":875,"singleClickEdit":true}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.labelDatas","targetProperty":"dataSet"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"desktopHeight":"35px","enableTouchHeight":true,"height":"35px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Allgemeiner StatusCode","placeHolder":"Code","readonly":true,"width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"150px","displayValue":"","emptyValue":"emptyString","helpText":"Allgemeine Statusmeldung","placeHolder":"Message","readonly":true,"width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetLabelDD.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}