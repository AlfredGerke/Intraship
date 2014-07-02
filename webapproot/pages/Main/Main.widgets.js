Main.widgets = {
	navCallCreateShipmentDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"CreateShipmentDD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallInformationen: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Information\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallCreateShipmentTD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"CreateShipmentTD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallGetLabelDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"GetLabelDD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallDeleteShipmentDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"DeleteShipmentDD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallDeleteShipmentTD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"DeleteShipmentTD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","styles":{},"verticalAlign":"top"}, {}, {
		pnlCredentialsPanel: ["wm.Panel", {"deviceSizes":null,"deviceType":null,"height":"104px","horizontalAlign":"left","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
			pnlCredentials: ["wm.FancyPanel", {"margin":"5,5,5,5","styles":{},"title":"Credentials","width":"50%"}, {}, {
				edtDevID: ["wm.Text", {"caption":"Developer ID","captionSize":"110px","dataValue":"","displayValue":"","emptyValue":"emptyString","enableTouchHeight":false,"helpText":"Wenn kein Eintrag vorhanden, dann wird aus settings.ini ein Eintrag entnommen","placeHolder":"Developer ID","styles":{},"width":"350px"}, {}],
				edtPass: ["wm.Text", {"caption":"Password","captionSize":"110px","dataValue":"","displayValue":"","emptyValue":"emptyString","enableTouchHeight":false,"helpText":"Wenn kein Eintrag vorhanden, dann wird aus settings.ini ein Eintrag entnommen","password":true,"placeHolder":"Signature","width":"350px"}, {}]
			}],
			pnlInputOutput: ["wm.FancyPanel", {"margin":"5,5,5,5","styles":{},"title":"In / Out","width":"50%"}, {}, {
				edtShipmentNr: ["wm.Text", {"caption":"ShipmentNr","dataValue":"","displayValue":"","emptyValue":"emptyString","enableTouchHeight":false,"helpText":"Sendungsnummer wird aus einem XML-Label ausgelesen und GetLabelDD und DeleteShipmentDD zur Verfügung gestellt","placeHolder":"Number","width":"343px"}, {}],
				edtAirwayBill: ["wm.Text", {"caption":"AirwayBill","dataValue":"","displayValue":"","emptyValue":"emptyString","enableTouchHeight":false,"helpText":"Airwaybill wird aus einem XML-Label ausgelesen und DeleteShipmentTD zur Verfügung gestellt","placeHolder":"Airwaybill","width":"343px"}, {}]
			}]
		}],
		pnlDesktop: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
			pnlLeft: ["wm.Panel", {"height":"100%","horizontalAlign":"left","margin":"5,5,5,5","styles":{},"verticalAlign":"top","width":"297px"}, {}, {
				alyLeft: ["wm.AccordionLayers", {"styles":{}}, {}, {
					layBusinessApi: ["wm.Layer", {"border":"1","borderColor":"","caption":"Geschäftskundenversand API","horizontalAlign":"left","styles":{},"themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
						btnCreateShipmentDD: ["wm.Button", {"caption":"CreateShipmentDD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallCreateShipmentDD"}],
						btnCreateShipmentTD: ["wm.Button", {"caption":"CreateShipmentTD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallCreateShipmentTD"}],
						btnGetLabelDD: ["wm.Button", {"caption":"GetLabelDD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallGetLabelDD"}],
						btnDeleteShipmentDD: ["wm.Button", {"caption":"DeleteShipmentDD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallDeleteShipmentDD"}],
						btnDeleteShipmentTD: ["wm.Button", {"caption":"DeleteShipmentTD","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallDeleteShipmentTD"}]
					}],
					layMisc: ["wm.Layer", {"border":"1","borderColor":"","caption":"Miscellaneous","horizontalAlign":"left","styles":{},"themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
						btnInfo: ["wm.Button", {"caption":"About the Program","desktopHeight":"50px","height":"50px","margin":"10,10,10,10","styles":{},"width":"100%"}, {"onclick":"navCallInformationen"}]
					}]
				}]
			}],
			splitter1: ["wm.Splitter", {"height":"100%","maximum":500,"minimum":150,"styles":{},"width":"4px"}, {}],
			pnlClient: ["wm.Panel", {"height":"100%","horizontalAlign":"left","margin":"5,5,5,5","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
				pagContainer: ["wm.PageContainer", {"deferLoad":true,"pageName":"Information","styles":{},"subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}]
		}],
		Footer: ["wm.Panel", {"_classes":{"domNode":["toolbar"]},"border":"1","height":"31px","horizontalAlign":"center","margin":"5,5,5,5","padding":"2","styles":{},"verticalAlign":"middle","width":"100%"}, {}, {
			lblFooter: ["wm.Label", {"align":"center","caption":"Copyright 2014 ExampleFactory 0.1","height":"100%","padding":"4","width":"100%"}, {}]
		}]
	}]
}