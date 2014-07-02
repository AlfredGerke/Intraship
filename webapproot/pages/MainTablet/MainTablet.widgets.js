MainTablet.widgets = {
	varNavItems: ["wm.Variable", {"isList":true,"json":"[{\"dataValue\":\"CreateShipmentDD\"},{\"dataValue\":\"GetShipmentDD\"},{\"dataValue\":\"DeleteShipmentDD\"}]","type":"StringData"}, {}],
	navCallInformation: ["wm.NavigationCall", {"operation":"gotoPageContainerPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoPageContainerPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Information\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	varResultByNavItems: ["wm.Variable", {"dataSet":"","type":"StringData"}, {"onSetData":"varResultByNavItemsSetData"}, {
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
				wire: ["wm.Wire", {"expression":"\"DeleteShipmentTD\"","targetProperty":"pageName"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"pagContainer","targetProperty":"pageContainer"}, {}]
			}]
		}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","styles":{},"verticalAlign":"top"}, {}, {
		pnlDesktop: ["wm.Panel", {"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			pnlLeft: ["wm.Panel", {"deviceSizes":null,"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"270px"}, {}, {
				lstNavigation: ["wm.List", {"_classes":{"domNode":["GridListStyle","MobileListStyle"]},"border":"1","columns":[
{"show":true,"field":"dataValue","title":"Geschäftskundenversand API","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"Geschäftskundenversand API: \" + ${dataValue} +\n\"</div>\"\n\n","mobileColumn":true},
{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}
],"deviceSizes":["900","650","450"],"deviceType":["tablet"],"height":"100%","isNavigationMenu":true,"minDesktopHeight":60,"primaryKeyFields":["dataValue"],"rightNavArrow":true,"scrollToSelection":true,"styleAsGrid":false,"styles":{},"toggleSelect":true}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"varNavItems","targetProperty":"dataSet"}, {}],
						wire1: ["wm.Wire", {"expression":undefined,"source":"varNavItems.queryVar","targetProperty":"selectedItem"}, {}]
					}]
				}]
			}],
			pnlDetail: ["wm.Panel", {"deviceType":["tablet"],"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
				pnlDetailTop: ["wm.Panel", {"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
					edtShipmentNr: ["wm.Text", {"caption":"ShipmentNr","dataValue":"","displayValue":"","emptyValue":"emptyString","height":"100%","helpText":undefined,"placeHolder":"Number for DD-Services","width":"343px"}, {}]
				}],
				pagContainer: ["wm.PageContainer", {"deferLoad":true,"deviceType":["tablet"],"styles":{}}, {}],
				pnlDetailButtom: ["wm.Panel", {"height":"40px","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
					btnInfo: ["wm.Button", {"caption":"About","height":"100%","margin":"4"}, {"onclick":"navCallInformation"}]
				}]
			}]
		}]
	}]
}