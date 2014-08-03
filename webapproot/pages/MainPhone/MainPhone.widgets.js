MainPhone.widgets = {
	navCallCreate: ["wm.NavigationCall", {}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"layCreate","targetProperty":"layer"}, {}]
			}]
		}]
	}],
	navCallGet: ["wm.NavigationCall", {}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"layGet","targetProperty":"layer"}, {}]
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
	lbxMain: ["wm.Layout", {"deviceSizes":["300"],"enableTouchHeight":true,"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlTop: ["wm.Panel", {"deviceSizes":["300"],"deviceType":["phone"],"height":"50px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			pnlToggleButtons: ["wm.ToggleButtonPanel", {"deviceSizes":["300"],"deviceType":["phone"],"height":"100%","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"btnCreate","targetProperty":"currentButton"}, {}]
				}],
				btnCreate: ["wm.Button", {"border":"0,1,0,0","caption":"Create","deviceSizes":["300"],"deviceType":["phone"],"height":"100%","margin":"0","width":"100%"}, {"onclick":"navCallCreate"}],
				btnGet: ["wm.Button", {"border":"0,1,0,0","caption":"Get","deviceSizes":["300"],"deviceType":["phone"],"height":"100%","margin":"0","width":"100%"}, {"onclick":"navCallGet"}],
				btnDelete: ["wm.Button", {"border":"0","caption":"Delete","deviceSizes":["300"],"deviceType":["phone"],"height":"100%","margin":"0","width":"100%"}, {"onclick":"navCallDelete"}]
			}]
		}],
		pnlDetail: ["wm.Panel", {"deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			layRequestPanel: ["wm.Panel", {"desktopHeight":"100px","deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"height":"100px","horizontalAlign":"left","mobileHeight":"100px","verticalAlign":"top","width":"100%"}, {}, {
				layRequest: ["wm.Layers", {"defaultLayer":0,"deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true}, {}, {
					layCreate: ["wm.Layer", {"borderColor":"","caption":"layer1","deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
						btnCreateDD: ["wm.Button", {"caption":"Execute","desktopHeight":"100px","deviceSizes":["300"],"deviceType":["phone"],"height":"48px","margin":"4","mobileHeight":"48px","width":"100%"}, {}],
						btnShowLabelByCreate: ["wm.Button", {"caption":"Label","height":"48px","margin":"4","mobileHeight":"48px","width":"100%"}, {}]
					}],
					layGet: ["wm.Layer", {"borderColor":"","caption":"layer2","deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
						btnGetDD: ["wm.Button", {"caption":"Execute","desktopHeight":"100px","deviceSizes":["300"],"deviceType":["phone"],"height":"48px","margin":"4","mobileHeight":"48px","width":"100%"}, {}],
						btnShowLabelByGet: ["wm.Button", {"caption":"Label","height":"48px","margin":"4","mobileHeight":"48px","width":"100%"}, {}]
					}],
					layDelete: ["wm.Layer", {"borderColor":"","caption":"layer3","deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
						btnDeleteDD: ["wm.Button", {"caption":"Execute","desktopHeight":"100px","deviceSizes":["300"],"deviceType":["phone"],"height":"48px","margin":"4","mobileHeight":"48px","width":"100%"}, {}]
					}]
				}]
			}],
			pnlResponse: ["wm.Panel", {"deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}]
		}],
		pnlButtom: ["wm.Panel", {"desktopHeight":"48px","deviceSizes":["300"],"deviceType":["phone"],"enableTouchHeight":true,"height":"50px","horizontalAlign":"left","layoutKind":"left-to-right","mobileHeight":"50px","verticalAlign":"top","width":"100%"}, {}, {
			edtShipmentNr: ["wm.Text", {"caption":"Nr.","captionSize":"30px","dataValue":undefined,"deviceSizes":["300"],"deviceType":["phone"],"displayValue":"","height":"100%","width":"100%"}, {}]
		}]
	}]
}