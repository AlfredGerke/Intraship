dojo.provide("project.resources.javascript.DemoUtils");

dojo.declare("DemoUtils", null, {
  getSipmentNumberByXML: function() {
    var xml = this.getXMLLabel();
    var jsdom = dojox.xml.parser.parse(xml);
    var nodeList = jsdom.getElementsByTagName("SHIPMENTNR");
    var node = nodeList[0].childNodes[0];

    this.setShipmentNr(node.nodeValue);  
  },
  getShipmentNrByLabel: function(gxmlh, sshipnr) {
     this.getXMLLabel = gxmlh;
     this.setShipmentNr = sshipnr;
     
     dojo.require("dojox.xml.parser");
     dojo.ready(this, "getSipmentNumberByXML");
  }
});