Main.widgets = {
	navCallCreateShipmentDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"CreateShipmentDD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","styles":{},"verticalAlign":"top"}, {}, {
		pnlCredentials: ["wm.FancyPanel", {"height":"104px","margin":"5,5,5,5","styles":{},"title":"Credentials"}, {}, {
			edtDevID: ["wm.Text", {"caption":"DeveloperID","dataValue":"","displayValue":"","emptyValue":"emptyString","required":true}, {}],
			edtPass: ["wm.Text", {"caption":"Password","dataValue":"","displayValue":"","emptyValue":"emptyString","password":true,"required":true}, {}]
		}],
		pnlDesktop: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
			pnlLeft: ["wm.Panel", {"height":"100%","horizontalAlign":"left","margin":"5,5,5,5","styles":{},"verticalAlign":"top","width":"297px"}, {}, {
				alyLeft: ["wm.AccordionLayers", {"styles":{}}, {}, {
					layBusinessApi: ["wm.Layer", {"borderColor":"","caption":"Geschäftskundenversand API","horizontalAlign":"left","styles":{},"themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
						btnCreateShipmentDD: ["wm.Button", {"caption":"CreateShipmentDD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallCreateShipmentDD"}]
					}]
				}]
			}],
			splitter1: ["wm.Splitter", {"height":"100%","maximum":400,"minimum":100,"styles":{},"width":"4px"}, {}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","margin":"5,5,5,5","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
				pagContainer: ["wm.PageContainer", {"deferLoad":true,"pageName":"Information","styles":{},"subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}]
		}]
	}]
}