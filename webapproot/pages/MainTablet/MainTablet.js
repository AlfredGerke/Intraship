dojo.declare("MainTablet", wm.Page, {
	"enableMobileFolding": true,
	start: function() {
		
	},
	"preferredDevice": "tablet",
	lstNavigationSelect: function(inSender, inItem) {
		app.toastInfo("Test");
	},
	_end: 0
});