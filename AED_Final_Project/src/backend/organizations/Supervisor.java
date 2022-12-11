/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.roles.ManagerRole;
import backend.roles.Role;
import backend.roles.SuperRole;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class Supervisor extends Organization{
     public Supervisor()
    {
        super(Organization.Type.Supervisor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SuperRole());
        roles.add(new ManagerRole());
        return roles;
    }
}
