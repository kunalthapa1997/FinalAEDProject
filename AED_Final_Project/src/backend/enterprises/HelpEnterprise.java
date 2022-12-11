/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.enterprises;

import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class HelpEnterprise extends Enterprises{
    
      @Override
    public ArrayList<Role> getSupportedRole() {
    return null;
    }
    
    public HelpEnterprise(String name)
    {
     super(name, Enterprises.EnterpriseType.StepOneService);  
    }
}
