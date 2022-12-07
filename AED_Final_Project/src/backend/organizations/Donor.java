/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.DonationRole;
import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Donor extends Organization{
    
      public Donor()
    {
        super(Organization.Type.Donor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DonationRole());
        return roles;
    }
}
