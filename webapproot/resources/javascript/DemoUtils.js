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
  },
  getMessagesByCreationState: function(creStates) {
    var messages = new Array();
    var anz_states = creStates.length;
    var z = 0;
        
    for (i = 0; i < anz_states; i++) {
      var creState = creStates[i].data;
      var anz_messages = creState.statusMessages.data._list.length;
      
      for (j = 0; j < anz_messages; j++) {
        var message = creState.statusMessages.data._list[j];
        
        messages.push(message.data.dataValue);
      }
    }
    
    return messages;    
  }
});