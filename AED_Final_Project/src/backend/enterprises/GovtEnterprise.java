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
public class GovtEnterprise extends Enterprises{
     public GovtEnterprise(String name) {
        super(name, EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
