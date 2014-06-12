package de.intraship.cis;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.wavemaker.runtime.RuntimeAccess;

import de.intraship.req.TestConstants;


public class CredentialsBySettings implements CredentialOutputHandler {

  private static Logger logger = Logger.getLogger("CredentialsBySettings");
  private String username = "";
  private String pass = "";
  private String cig_username = "";
  private String cig_pass = "";  
 
  private String getCredentialFilePath() {

    return RuntimeAccess.getInstance()
        .getSession()
        .getServletContext()
        .getRealPath(TestConstants.CRED_FILE_PATH);
  }  
  
  public CredentialsBySettings() {
    super();
  }
  
  @Override
  public void getCredentialByStorage() {
    String credFileName = getCredentialFilePath();
    try {
      InputStreamReader credFileReader = new InputStreamReader(new FileInputStream(credFileName),
        TestConstants.ENCODING);
      Properties credProps = new Properties();
      credProps.load(credFileReader);
      username = credProps.getProperty(TestConstants.UN_PROPERTY_NAME);
      pass = credProps.getProperty(TestConstants.PW_PROPERTY_NAME);
      cig_username = credProps.getProperty(TestConstants.CIG_UN_PROPERTY_NAME);
      cig_pass = credProps.getProperty(TestConstants.CIG_PW_PROPERTY_NAME);
    } catch (Exception e) {
      logger.warn(e.getMessage());
    }
  }

  @Override
  public String getUsername() {

    return username;
  }

  @Override
  public String getPass() {

    return pass;
  }

  @Override
  public String getCig_username() {

    return cig_username;
  }

  @Override
  public String getCig_pass() {

    return cig_pass;
  }

}
