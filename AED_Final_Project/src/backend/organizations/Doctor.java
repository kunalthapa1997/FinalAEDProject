/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.DocRole;
import backend.roles.DonationRole;
import backend.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class Doctor extends Organization{
     public Doctor()
    {
        super(Organization.Type.Doctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DocRole());
        return roles;
    }
}
