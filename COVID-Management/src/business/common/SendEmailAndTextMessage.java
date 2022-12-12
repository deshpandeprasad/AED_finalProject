package business.common;


import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

//send email module
public class SendEmailAndTextMessage {
 
    private static final String SMTP_HOST_NAME = "smtp-mail.outlook.com"; 
    private static final String SMTP_PORT_NUMBER = "587"; 
    private static StringBuilder emailMsgTxt ;
        
    private static String emailSubjectTxt = "New Sign Up";
    private static String emailFromAddress = "spsaedcovidmanager@outlook.com";
    
 // Send Email                   
    
    public static boolean sendEmail(String msg, String emailId)
    {
      boolean isSent = true;
 
    try {
     Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST_NAME);                                                        
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.port", "587");
        
        Authenticator mailAuthenticator = new EmailAuthenticator();
        Session mailSession = Session.getDefaultInstance(props,mailAuthenticator);
        Message message = new MimeMessage(mailSession);
        InternetAddress fromAddress ;
        InternetAddress toAddress;
        try
           {
         fromAddress = new InternetAddress(emailFromAddress);
         toAddress = new InternetAddress(emailId);
         }
        
        catch (AddressException ae) {
            ae.printStackTrace();
         isSent= false;
         return isSent;
         }
        
        
        message.setFrom(fromAddress);
        message.setRecipient(RecipientType.TO, toAddress);
        message.setSubject(emailSubjectTxt);
        message.setText(msg);
 
       Transport.send(message);
       System.out.println("Email is Sent !");
        } 
         catch (MessagingException mex) {
            isSent=false;
            return isSent;
       }
       
       catch (Exception e) {
            isSent=false;
       }

         return isSent;
    }  
}