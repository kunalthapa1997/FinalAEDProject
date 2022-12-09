/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.MayorRole;
import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Mayor extends Organization{
    
     public Mayor()
    {
        super(Organization.Type.Mayor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MayorRole());
        return roles;
    }
}
