package de.intraship.cis;

import intrashipservice.ws.de.isservice_1_0_de.Authentification;

import com.wavemaker.runtime.ws.BindingProperties;

public class Credentials {

  private static Credentials instance = null;

  private CredentialOutputHandler outputHandler = null;

  private String username = "";
  private String pass = "";
  private String cig_username = "";
  private String cig_pass = "";

  public static Credentials getInstance() {

    if (instance == null) {
      instance = new Credentials();
    }
    
    return instance;
  }

  private void GetDataByOutputHandler() {

    if (outputHandler != null) {
      outputHandler.getCredentialByStorage();

      username = outputHandler.getUsername();
      pass = outputHandler.getPass();
      cig_username = outputHandler.getCig_username();
      cig_pass = outputHandler.getCig_pass();
    } else {
      username = "";
      pass = "";
      cig_username = "";
      cig_pass = "";
    }
  }

  public Credentials() {

    if (outputHandler == null) {
      outputHandler = new CredentialsBySettings();
    }

    GetDataByOutputHandler();
  }

  public void addCredentialOutputHandler(CredentialOutputHandler outHandler) {

    outputHandler = outHandler;
  }

  public String getUsername() {

    return username;
  }

  public String getPass() {

    return pass;
  }

  public String getCig_username() {

    return cig_username;
  }

  public String getCig_pass() {

    return cig_pass;
  }

  /**
   * Über Bindingproperties können HTTPAuth und Endpoint geändert werden
   * 
   * bindingProperties = new BindingProperties();
   * 
   * bindingProperties.setHttpBasicAuthUsername(""); //Developer-ID
   * bindingProperties.setHttpBasicAuthPassword(""); //Signature
   * bindingProperties.setEndpointAddress(""); //Sandbox oder Produktion
   * 
   */
  public BindingProperties setBindingProperitiesIfNeeded(BindingProperties bindingProperties) {

    BindingProperties bp = bindingProperties;

    String httpBasicAuthUsername = bp.getHttpBasicAuthUsername();
    if (httpBasicAuthUsername == null) {
      bp.setHttpBasicAuthUsername(this.getCig_username());
    }

    String httpBasicAuthPassword = bp.getHttpBasicAuthPassword();
    if (httpBasicAuthPassword == null) {
      bp.setHttpBasicAuthPassword(this.getCig_pass());
    }

    return bp;
  }
  
  public BindingProperties setBindingProperities(BindingProperties bindingProperties) {

    BindingProperties bp = bindingProperties;

    bp.setHttpBasicAuthUsername(this.getCig_username());
    bp.setHttpBasicAuthPassword(this.getCig_pass());

    return bp;
  } 

  public Authentification setAuthentificationIfNeeded(Authentification authentication) {

    Authentification auth = authentication;

    if (auth != null) {      

      String devId = auth.getUser();
      if (devId.isEmpty()) {
        auth.setUser(this.getUsername());
      }

      String sig = auth.getSignature();
      if (sig.isEmpty()) {
        auth.setSignature(this.getPass());
      }
    }

    return auth;
  }

}
