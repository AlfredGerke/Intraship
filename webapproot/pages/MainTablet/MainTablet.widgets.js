MainTablet.widgets = {
	varNavItems: ["wm.Variable", {"isList":true,"json":"[{\"dataValue\":\"CreateShipmentDD\"},{\"dataValue\":\"GetLabelDD\"},{\"dataValue\":\"DeleteShipmentDD\"}]","type":"StringData"}, {}],
	navCallInformation: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Information\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	varResultByNavItems: ["wm.Variable", {"dataSet":"","type":"StringData"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"lstNavigation.selectedItem.dataValue","targetProperty":"dataSet.dataValue"}, {}]
		}]
	}],
	navCallCreateShipmentDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"CreateShipmentDD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	navCallGetShipmentDD: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
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
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}],
				wire: ["wm.Wire", {"expression":"\"DeleteShipmentDD\"","targetProperty":"pageName"}, {}]
			}]
		}]
	}],
	lbxMain: ["wm.Layout", {"deviceSizes":null,"enableTouchHeight":true,"horizontalAlign":"left","styles":{},"verticalAlign":"top"}, {}, {
		pnlDesktop: ["wm.Panel", {"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			pnlLeft: ["wm.Panel", {"deviceSizes":null,"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"270px"}, {}, {
				lstNavigation: ["wm.List", {"_classes":{"domNode":["GridListStyle","MobileListStyle"]},"border":"1","columns":[
{"show":true,"field":"dataValue","title":"Geschäftskundenversand API","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"Geschäftskundenversand API: \" + ${dataValue} +\n\"</div>\"\n\n","mobileColumn":true},
{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}
],"deviceSizes":null,"deviceType":["tablet"],"height":"100%","isNavigationMenu":false,"minDesktopHeight":60,"primaryKeyFields":["dataValue"],"rightNavArrow":true,"scrollToSelection":true,"styleAsGrid":false,"styles":{}}, {"onSelect":"lstNavigationSelect"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"varNavItems","targetProperty":"dataSet"}, {}]
					}]
				}]
			}],
			pnlDetail: ["wm.Panel", {"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
				pnlDetailTop: ["wm.Panel", {"deviceType":["tablet"],"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
					edtShipmentNr: ["wm.Text", {"caption":"ShipmentNr","dataValue":"","deviceType":["tablet"],"displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"placeHolder":"Number for DD-Services","width":"343px"}, {}]
				}],
				pagContainer: ["wm.PageContainer", {"deferLoad":true,"deviceType":["tablet"],"styles":{}}, {}],
				pnlDetailButtom: ["wm.Panel", {"deviceType":["tablet"],"height":"40px","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
					btnInfo: ["wm.Button", {"caption":"About","deviceType":["tablet"],"height":"100%","margin":"4"}, {"onclick":"navCallInformation","onclick1":"btnInfoClick1"}]
				}]
			}]
		}]
	}]
}