/**
 *  Dieser LoggingHandler behebt meine Probleme mit dem LoggingHandler: 
 *  com.wavemaker.runtime.ws.jaxws.SOAPLoggingHandler 
 * 
 *  Der Code stammt von der Seite: 
 *  http://jgeeks.blogspot.de/2013/03/jaxws-handler-example-for-logging.html
 *  
 *  Copyright by Navnit Singh Biring (https://www.blogger.com/profile/05375041876981046471)
 */
package de.intraship.req;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MySOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {

  private static Logger logger = Logger.getLogger("MySOAPLoggingHandler");

  public MySOAPLoggingHandler() {

    logger.setLevel(Level.INFO);
  }

  @Override
  public boolean handleMessage(SOAPMessageContext context) {

    logToSystemOut(context);
    return true;
  }

  @Override
  public boolean handleFault(SOAPMessageContext context) {

    logToSystemOut(context);
    return true;
  }

  private void logToSystemOut(SOAPMessageContext smc) {

    Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

    if (outboundProperty.booleanValue()) {
      logger.info("\nOutbound message:");
      // System.out.println("\nOutbound message:");
    } else {
      logger.info("\nInbound message:");
      // System.out.println("\nInbound message:");
    }

    SOAPMessage message = smc.getMessage();
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      message.writeTo(baos);
      // System.out.println(baos.toString());
      logger.info(baos.toString());
    } catch (Exception e) {
      logger.warn("Exception in handler: " + e.getMessage());
      // System.out.println("Exception in handler: " + e);
    }
  }

  @Override
  public void close(MessageContext context) {

  }

  @Override
  public Set<QName> getHeaders() {

    return Collections.emptySet();
  }

  @SuppressWarnings("rawtypes")
  /**
   * This static method adds the handler to the provided port's binding object. 
   * 
   * @param binding - The binding object can be fetched by <code>((BindingProvider) port).getBinding()</code>
   */
  public static void addToPort(Binding binding) {

    List<Handler> handlerChain = binding.getHandlerChain();
    handlerChain.add(new MySOAPLoggingHandler());

    /*
     * Check List<Handler> javax.xml.ws.Binding.getHandlerChain() javadocs. It
     * states: Gets a copy of the handler chain for a protocol binding instance.
     * If the returned chain is modified a call to setHandlerChain is required
     * to configure the binding instance with the new chain.
     */
    binding.setHandlerChain(handlerChain);
  }
}
