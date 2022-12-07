/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.enterprises;

import backend.enterprises.Enterprises.EnterpriseType;
import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class SchoolEnterprise extends Enterprises{
     public SchoolEnterprise(String name) {
        super(name, EnterpriseType.School);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
