dojo.provide("project.resources.javascript.DemoUtils");

dojo.declare("DemoUtils", null, {
  getValueByTagName: function(tag) {
    var xml = this.getXMLLabel();
    var jsdom = dojox.xml.parser.parse(xml);
    var nodeList = jsdom.getElementsByTagName(tag);
    var node = nodeList[0].childNodes[0];
    
    return node.nodeValue;  
  },
  getSipmentNumberByXML: function() {
    var nodeValue = this.getValueByTagName("SHIPMENTNR");

    this.setShipmentNr(nodeValue);  
  },
  getAirwayBillByXML: function() {
    // In TD wird wie in DD die AIRWAYBILL als SHIPMENTNR geführt
    var nodeValue = this.getValueByTagName("SHIPMENTNR");

    this.setAirwayBill(nodeValue);  
  },  
  getShipmentNrByLabel: function(gxmlh, sshipnr) {
     this.getXMLLabel = gxmlh;
     this.setShipmentNr = sshipnr;
     
     dojo.require("dojox.xml.parser");
     dojo.ready(this, "getSipmentNumberByXML");
  },
  getAirwayBillByLabel: function(gxmlh, sairway) {
     this.getXMLLabel = gxmlh;
     this.setAirwayBill = sairway;
     
     dojo.require("dojox.xml.parser");
     dojo.ready(this, "getAirwayBillByXML");
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
  },
  getShipmentNrByCreationState: function(creStates, stateIdx) {
    var anz_states = creStates.length;
    var shipmentnr = '';
  
    if ((stateIdx > -1) && (stateIdx <= anz_states)) {
      var creState = creStates[stateIdx].data;  
      
      shipmentnr = creState.shipmentNumber.data.shipmentNumber;
    }   
  
    return shipmentnr; 
  },
  getAirwayBillByCreationState: function(creStates, stateIdx) {
    var anz_states = creStates.length;
    var airwaybill = '';
  
    if ((stateIdx > -1) && (stateIdx <= anz_states)) {
      var creState = creStates[stateIdx].data;  
      
      airwaybill = creState.shipmentNumber.data.airwayBill;
    }   
  
    return airwaybill; 
  }      
});