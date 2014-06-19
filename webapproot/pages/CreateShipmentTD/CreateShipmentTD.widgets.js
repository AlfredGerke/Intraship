CreateShipmentTD.widgets = {
	srvCreateShipmentTD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"createShipmentTD","service":"ISService_1_0_de"}, {"onError":"srvCreateShipmentTDError"}, {
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
						edtLabelURL: ["wm.Text", {"caption":undefined,"displayValue":"","emptyValue":"emptyString","helpText":"URL kann über einen PDF-Reader direkt im Browser verarbeitet werden","placeHolder":"Label URL","styles":{},"width":"100%"}, {}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.creationStates.labelurl","targetProperty":"dataValue"}, {}]
							}]
						}],
						edtXMLLabel: ["wm.LargeTextArea", {"caption":undefined,"captionPosition":"left","captionSize":"100px","displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"styles":{},"width":"100%"}, {"onchange":"edtXMLLabelChange"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.creationStates.XMLLabel","targetProperty":"dataValue"}, {}]
							}]
						}]
					}],
					pnlStatusResponse: ["wm.Panel", {"height":"28px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						pnlStatusResponse1: ["wm.Panel", {"height":"25px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde: ["wm.Number", {"caption":"StatusCode","displayValue":"","placeHolder":"Code","width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentTD.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage: ["wm.Text", {"caption":"StatusMessage","captionSize":"130px","displayValue":"","emptyValue":"emptyString","placeHolder":"Message","width":"100%"}, {}, {
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