/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.AdminRole;
import backend.roles.SeekerRole;
import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Seeker extends Organization {
    
     public Seeker()
    {
        super(Organization.Type.HelpSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SeekerRole());
        return roles;
    }
    
}
