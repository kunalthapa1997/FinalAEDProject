/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.shared;

import backend.ConfSetup;
import backend.enterprisepkg.Enterprise;
import backend.networkpkg.Network;
import backend.organizationpkg.DoctorOrganization;
import backend.organizationpkg.DonorOrganization;
import backend.organizationpkg.Organization;
import backend.organizationpkg.SupervisorOrganization;
import backend.organizationpkg.TransportOrganization;
import backend.organizationpkg.VolunteerOrganization;
import backend.userAccountpkg.UserAccount;
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
    
    
    public static VolunteerOrganization getVolunteerOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        VolunteerOrganization volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrganization)
             {
              volunteerOrganization = (VolunteerOrganization)organization; 
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
    
    public static VolunteerOrganization getVolunteerOrganizationInNw(EcoSystem ecoSystem, Network nw)
    {
        VolunteerOrganization volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrganization)
             {
              volunteerOrganization = (VolunteerOrganization)organization; 
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
    
      public static DonorOrganization getDonorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DonorOrganization donorOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NonProfit))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DonorOrganization)
             {
              donorOrganization = (DonorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return donorOrganization;
    }
      
       public static TransportOrganization getTransportOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        TransportOrganization transportOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof TransportOrganization)
             {
              transportOrganization = (TransportOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return transportOrganization;
    } 
       
     public static DoctorOrganization getDoctorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DoctorOrganization doctorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DoctorOrganization)
             {
              doctorOrganization = (DoctorOrganization)organization; 
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
     
      public static SupervisorOrganization getSupervisorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        SupervisorOrganization supervisorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.HeartHelp))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof SupervisorOrganization)
             {
              supervisorOrganization = (SupervisorOrganization)organization; 
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
