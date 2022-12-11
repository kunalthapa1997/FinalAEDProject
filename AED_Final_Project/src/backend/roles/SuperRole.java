/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.roles;

import backend.ConfSetup;
import backend.enterprises.Enterprises;
import backend.organizations.Organization;
import backend.account.UserAcc;
import ui.Supervisor.SuperActionAreaPanel;
import javax.swing.JPanel;
/**
 *
 * @author kunal
 */
public class SuperRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, 
            Organization organization, Enterprises enterprise, ConfSetup business) {
        return new SuperActionAreaPanel(userProcessContainer, account, organization, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
