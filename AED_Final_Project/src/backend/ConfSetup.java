/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import backend.shared.HelpRequired;
import backend.coverage.Coverage;
import backend.organizations.Organization;
import backend.roles.Role;
import backend.roles.AdminRole;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class ConfSetup extends Organization{
     private ArrayList<Coverage> networkList;
   private static ConfSetup ecoSystem;
   private ArrayList<HelpRequired> helpList;
    
   public ConfSetup()
   {
       super(null);
       networkList = new ArrayList<>();
       helpList = new ArrayList<>();
      
   }
   
   public static ConfSetup getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new ConfSetup();
    }
    return ecoSystem;
   }
//array list 
    public ArrayList<Coverage> getNetworkList() {
        return networkList;
    }
   
    public Coverage addNetwork()
    {
        Coverage network = new Coverage();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   //deletenetwork
    public void deleteNetwork(Coverage network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole());
        return roleList;
    }
   
    public HelpRequired addNeedHelp()
    {
        HelpRequired needHelp = new HelpRequired();
        helpList.add(needHelp);
        return needHelp;
    }
    
    public void deleteHelp(HelpRequired needHelp)
    {
        helpList.remove(needHelp);
    }

    public ArrayList<HelpRequired> getHelpList() {
        return helpList;
    }
}
