package de.intraship.cis;

import com.wavemaker.runtime.javaservice.JavaServiceSuperClass;
import com.wavemaker.runtime.service.annotations.ExposeToClient;

import intrashipservice.ws.de.isservice_1_0_de.Authentification;

@ExposeToClient
public class AuthentificationHandler extends JavaServiceSuperClass {

  public AuthentificationHandler() {
   
    super(INFO);
  }

  public Authentification getAuthentification() {

    Authentification result = new Authentification();

    return result;
  }

}