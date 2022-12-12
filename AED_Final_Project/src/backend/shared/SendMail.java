/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.shared;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author kunal
 */
public class SendMail {
    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; 
    private static final String SMTP_PORT_NUMBER = "587"; 
     private static StringBuilder emailMsgTxt ;
        
        private static String emailSubjectTxt = "Thank you!";
        
    

    public static String generatePassword(String name)
    {
        try
        {
      Random random = new Random();
      String value = String.valueOf(random.nextInt(10000));
      String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
        sb.append(value1);
        sb.append(name);
        sb.append(value);
        System.out.println(">>>>password>>>>>"+sb.toString());
         return sb.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateUserName(String name)
    {
        try
        {
      Random random = new Random();
      String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
        sb.append(value1);
        sb.append(name);
        System.out.println(">>>>username>>>>"+sb.toString());
         return sb.toString();
    }
     catch(Exception e)
        {
            
        }
        return null;
    }
      

 // Send Email                   
    
    public static boolean sendEmail(String msg, String emailId, String userName, String password)
    {
      String emailFromAddress = "projectstepone1@gmail.com";
       String emailFromPassword = "mbxjznotdtfqqorp";
       String emailSubjectText = "Thank You!";



       Properties properties = new Properties();
//        properties.put("mail.smtp.starttls.enable","true");
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.auth","true");
//        properties.put("mail.smtp.port", "587");
        
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "true"); 


       Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFromAddress, emailFromPassword);
            }
        });



       try{
            MimeMessage message = new  MimeMessage(session);
            message.setFrom(new InternetAddress(emailFromAddress));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailId));
            message.setSubject(emailSubjectText);
            message.setText(emailId);
            Transport.send(message);
        }
        catch(MessagingException ex){
            System.out.println(""+ex);
        }
       return true;
    }
    
}
