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
public class NgoEnterprise extends Enterprises{
     
     public NgoEnterprise(String name) {
        super(name, EnterpriseType.NonProfit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
