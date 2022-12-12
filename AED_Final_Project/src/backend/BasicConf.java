/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

//importing package

import backend.shared.HelpRequired;
import backend.enterprises.Enterprises;
import backend.coverage.Coverage;
import backend.organizations.Organization;
import backend.people.Person;
import backend.roles.AdminRole;
import backend.roles.DocRole;
import backend.roles.DonationRole;
import backend.roles.DriverRole;
import backend.roles.ManagerRole;
import backend.roles.MayorRole;
import backend.roles.SuperRole;
import backend.roles.SysAdminRole;
import backend.account.UserAcc;
/**
 *
 * @author kunal
 */
public class BasicConf {
 
    
    public static ConfSetup configure()
    {
        ConfSetup system = ConfSetup.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        UserAcc ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SysAdminRole());
        ua.setEnabled(true);
        
        HelpRequired needHelp = system.addNeedHelp();
        needHelp.setHelp("Snow Shovel");
        needHelp.setHelp("Grass Cutting");
        needHelp.setHelp("Gardening");
        needHelp.setHelp("Grocery Shopping");
       
        
        Coverage network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
    // School    
        Enterprises enterprise = network.getEnterpriseDirectory().addEnterprise("BostonSchool", Enterprises.EnterpriseType.School);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("School Admin");
        person.setName();
        UserAcc account = enterprise.getUserAccountDirectory().addUserAccount("bsc", "bsc", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Driver");
        person.setLastName("Transpport");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("dr1", "dr1", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Heart Help
         enterprise = network.getEnterpriseDirectory().addEnterprise("BostonHeartHelp", Enterprises.EnterpriseType.HeartHelp);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Heart Help Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("bhh", "bhh", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HelpSeeker);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bsup", "bsup", person, new SuperRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Manager");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bman", "bman", person, new ManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Non Profit
         enterprise = network.getEnterpriseDirectory().addEnterprise("NonProfit", Enterprises.EnterpriseType.NonProfit);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("non proft Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("bno", "bno", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdon", "bdon", person, new DonationRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprises.EnterpriseType.Hospital);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("hospital Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("bho", "bho", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdoc", "bdoc", person, new DocRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // Govt
         enterprise = network.getEnterpriseDirectory().addEnterprise("Govt", Enterprises.EnterpriseType.Government);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Govt Admin Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("bgt", "bgt", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Mayor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("mayor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bmay", "bmay", person, new MayorRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
    
}
