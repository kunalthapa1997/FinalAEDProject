/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.DriverRole;
import backend.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class Transportation extends Organization{
          public Transportation()
    {
        super(Organization.Type.Transport.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
