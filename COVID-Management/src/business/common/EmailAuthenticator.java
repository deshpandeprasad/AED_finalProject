
package business.common;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

//checks valid email
public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "spsaedcovidmanager@outlook.com";                                 
    public static final String SMTP_AUTH_PWD  = "Covidaedproject11"; 
    
    @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
                
}
