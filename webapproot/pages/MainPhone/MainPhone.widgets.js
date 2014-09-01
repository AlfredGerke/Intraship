MainPhone.widgets = {
	navCallCreate: ["wm.NavigationCall", {}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"layCreate","targetProperty":"layer"}, {}]
			}]
		}]
	}],
	navCallDelete: ["wm.NavigationCall", {}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"layDelete","targetProperty":"layer"}, {}]
			}]
		}]
	}],
	srvGetShipmentDDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getShipmentDDRequest","service":"RequestBuilder"}, {"onError":"srvGetShipmentDDRequestError","onSuccess":"srvCreateShipmentDD"}, {
		input: ["wm.ServiceInput", {"type":"getShipmentDDRequestInputs"}, {}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDetail","targetProperty":"loadingDialog"}, {}]
		}]
	}],
	srvCreateShipmentDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"createShipmentDD","service":"ISService_1_0_de"}, {"onError":"srvCreateShipmentDDError","onResult":"srvCreateShipmentDDResult"}, {
		input: ["wm.ServiceInput", {"type":"createShipmentDDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"varResultByGetShipmentDDRequest","targetProperty":"part1"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}]
			}]
		}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDetail","targetProperty":"loadingDialog"}, {}]
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
	varShipmentNrByResponse: ["wm.Variable", {"type":"StringData"}, {}],
	srvDeleteShipmentDD: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"deleteShipmentDD","service":"ISService_1_0_de"}, {"onError":"srvDeleteShipmentDDError"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDetail","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"deleteShipmentDDInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetAuthentication","targetProperty":"header"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"srvGetDeleteShipmentDDRequest","targetProperty":"part1"}, {}]
			}]
		}]
	}],
	srvGetDeleteShipmentDDRequest: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDeleteShipmentDDRequest","service":"RequestBuilder"}, {"onError":"srvGetDeleteShipmentDDRequestError","onSuccess":"srvDeleteShipmentDD"}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"pnlDetail","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"getDeleteShipmentDDRequestInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"app.varResultByGetShipmentNr.dataValue","targetProperty":"shipmentNr"}, {}]
			}]
		}]
	}],
	lbxMain: ["wm.Layout", {"deviceSizes":["450","300","200"],"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlTop: ["wm.Panel", {"deviceSizes":null,"deviceType":["phone"],"height":"50px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			pnlToggleButtons: ["wm.ToggleButtonPanel", {"deviceSizes":null,"deviceType":["phone"],"height":"100%","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"btnCreate","targetProperty":"currentButton"}, {}]
				}],
				btnCreate: ["wm.Button", {"border":"0,1,0,0","caption":"Create","deviceSizes":null,"deviceType":["phone"],"height":"100%","margin":"0","width":"100%"}, {"onclick":"navCallCreate"}],
				btnDelete: ["wm.Button", {"border":"0","caption":"Delete","deviceSizes":null,"deviceType":["phone"],"height":"100%","margin":"0","width":"100%"}, {"onclick":"navCallDelete"}]
			}]
		}],
		pnlDetail: ["wm.Panel", {"deviceSizes":null,"deviceType":["phone"],"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			layRequestPanel: ["wm.Panel", {"deviceSizes":null,"deviceType":["phone"],"height":"60px","horizontalAlign":"left","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
				layRequest: ["wm.Layers", {"defaultLayer":0,"deviceSizes":null,"deviceType":["phone"],"height":"55px"}, {}, {
					layCreate: ["wm.Layer", {"borderColor":"","caption":"layer1","deviceSizes":null,"deviceType":["phone"],"horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
						btnCreateDD: ["wm.Button", {"caption":"Execute","deviceSizes":null,"deviceType":["phone"],"enableTouchHeight":false,"height":"100%","margin":"4","styles":{},"width":"100%"}, {"onclick":"btnCreateDDClick"}]
					}],
					layDelete: ["wm.Layer", {"borderColor":"","caption":"layer3","deviceSizes":null,"deviceType":["phone"],"horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
						btnDeleteDD: ["wm.Button", {"caption":"Execute","deviceSizes":null,"deviceType":["phone"],"enableTouchHeight":false,"height":"100%","margin":"4","width":"100%"}, {"onclick":"btnDeleteDDClick"}]
					}]
				}]
			}],
			pnlResponse: ["wm.Panel", {"deviceSizes":null,"deviceType":["phone"],"height":"100%","horizontalAlign":"left","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
				edtStatusCode: ["wm.Text", {"caption":"Code","captionSize":"70px","desktopHeight":"50px","displayValue":"","height":"50px","mobileHeight":"50px","width":"125px"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.status.statusCode","targetProperty":"dataValue"}, {}]
					}]
				}],
				edtStatusMessage: ["wm.Text", {"caption":"Message","captionSize":"70px","desktopHeight":"50px","displayValue":"","height":"50px","mobileHeight":"50px","styles":{"fontSize":"8px"},"width":"100%"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"varResultByCreateShipmentDD.status.statusMessage","targetProperty":"dataValue"}, {}]
					}]
				}]
			}]
		}],
		pnlButtom: ["wm.Panel", {"desktopHeight":"48px","deviceSizes":null,"deviceType":["phone"],"enableTouchHeight":true,"height":"50px","horizontalAlign":"left","layoutKind":"left-to-right","mobileHeight":"50px","verticalAlign":"top","width":"100%"}, {}, {
			edtShipmentNr: ["wm.Text", {"caption":"Nr.","captionSize":"30px","deviceSizes":null,"deviceType":["phone"],"displayValue":"","emptyValue":"emptyString","height":"100%","width":"100%"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"varShipmentNrByResponse.dataValue","targetProperty":"dataValue"}, {}]
				}]
			}]
		}]
	}]
}