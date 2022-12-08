/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.shared;

import backend.ConfSetup;
import backend.enterprises.Enterprises;
import backend.coverage.Coverage;
import backend.organizations.Doctor;
import backend.organizations.Donor;
import backend.organizations.Organization;
import backend.organizations.Supervisor;
import backend.organizations.Transportation;
import backend.organizations.Volunteers;
import backend.account.UserAcc;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kunal
 */
public class Validations {
    public static boolean validateString(String name)
    {
        return true;
    }
    
    public static int calculateAge(Date dateOfBirth)
    {
       try
       {     
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
        age--;
        return age;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static Volunteers getVolunteerOrganization(ConfSetup ecoSystem, UserAcc userAccount)
    {
        Volunteers volunteerOrganization = null;
        try
        {
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Volunteers)
             {
              volunteerOrganization = (Volunteers)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
    public static Volunteers getVolunteerOrganizationInNw(ConfSetup ecoSystem, Coverage nw)
    {
        Volunteers volunteerOrganization = null;
        try
        {
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Volunteers)
             {
              volunteerOrganization = (Volunteers)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
      public static Donor getDonorOrganization(ConfSetup ecoSystem, UserAcc userAccount)
    {
        Donor donorOrganization = null;
        
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.NonProfit))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Donor)
             {
              donorOrganization = (Donor)organization; 
             }
            }
            }
          }
         }
        }
        return donorOrganization;
    }
      
       public static Transportation getTransportOrganization(ConfSetup ecoSystem, UserAcc userAccount)
    {
        Transportation transportOrganization = null;
        
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Transportation)
             {
              transportOrganization = (Transportation)organization; 
             }
            }
            }
          }
         }
        }
        return transportOrganization;
    } 
       
     public static Doctor getDoctorOrganization(ConfSetup ecoSystem, UserAcc userAccount)
    {
        Doctor doctorOrganization = null;
        try
        {
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Doctor)
             {
              doctorOrganization = (Doctor)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
     
      public static Supervisor getSupervisorOrganization(ConfSetup ecoSystem, UserAcc userAccount)
    {
        Supervisor supervisorOrganization = null;
        try
        {
        for(Coverage network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprises.EnterpriseType.HeartHelp))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof Supervisor)
             {
              supervisorOrganization = (Supervisor)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return supervisorOrganization;
    }  
}
