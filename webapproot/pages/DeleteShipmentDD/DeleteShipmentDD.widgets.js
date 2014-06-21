DeleteShipmentDD.widgets = {
	srvDeleteShipmentDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"deleteShipmentDD","service":"ISService_1_0_de"}, {}, {
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
						pnlShipmentNr: ["wm.Panel", {"height":"28px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtShipmentNr: ["wm.Text", {"caption":"ShipmentNr","displayValue":"","emptyValue":"emptyString","helpText":"Durch den WebService bearbeitete Sendungsnummer","margin":"0,0,0,0","placeHolder":"Number","styles":{},"width":"343px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.deletionStates.shipmentNumber.shipmentNumber","targetProperty":"dataValue"}, {}]
								}]
							}]
						}],
						pnlShipmentDeletStatus: ["wm.Panel", {"height":"28px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							edtStatusCpde1: ["wm.Number", {"caption":"StatusCode","displayValue":"","helpText":"Auf die Sendungsnummer bezogener StatusCode","margin":"0,0,0,0","placeHolder":"Code","styles":{},"width":"165px"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.deletionStates.status.statusCode","targetProperty":"dataValue"}, {}]
								}]
							}],
							edtStatusMessage1: ["wm.Text", {"caption":"StatusMessage","captionSize":"150px","displayValue":"","emptyValue":"emptyString","helpText":"Auf die Sendungsnummer bezogene Statusmeldung","placeHolder":"Message","width":"100%"}, {}, {
								binding: ["wm.Binding", {}, {}, {
									wire: ["wm.Wire", {"expression":undefined,"source":"varResultByDeleteShipmentDD.deletionStates.status.statusMessage","targetProperty":"dataValue"}, {}]
								}]
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