MainTablet.widgets = {
	varNavItems: ["wm.Variable", {"isList":true,"json":"[{\"dataValue\":\"CreateShipmentDD\"},{\"dataValue\":\"CreateShipmentTD\"},{\"dataValue\":\"GetShipmentDD\"},{\"dataValue\":\"DeleteShipmentDD\"},{\"dataValue\":\"DeleteShipmentTD\"}]","type":"StringData"}, {}],
	navigationCall1: ["wm.NavigationCall", {}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}]
	}],
	lbxMain: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		pnlDesktop: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			pnlLeft: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"270px"}, {}, {
				lstNavigation: ["wm.List", {"_classes":{"domNode":["GridListStyle","MobileListStyle"]},"columns":[
{"show":true,"field":"dataValue","title":"Geschäftskundenversand API","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"Geschäftskundenversand API: \" + ${dataValue} +\n\"</div>\"\n\n","mobileColumn":true},
{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}
],"deviceType":["tablet"],"height":"100%","isNavigationMenu":true,"minDesktopHeight":60,"primaryKeyFields":["dataValue"],"rightNavArrow":true,"styleAsGrid":false}, {"onSelect":"lstNavigationSelect"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"varNavItems","targetProperty":"dataSet"}, {}],
						wire1: ["wm.Wire", {"expression":undefined,"source":"varNavItems.queryVar","targetProperty":"selectedItem"}, {}]
					}]
				}]
			}],
			pnlDetail: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
				pagContainer: ["wm.PageContainer", {"deferLoad":true}, {}]
			}]
		}]
	}]
}