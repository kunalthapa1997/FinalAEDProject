/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.shared;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author kunal
 */
public class MailAuth extends Authenticator {
     public static final String SMTP_AUTH_USER = "stepone@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "helpbysteponevolunteer"; 
    
    @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
}
