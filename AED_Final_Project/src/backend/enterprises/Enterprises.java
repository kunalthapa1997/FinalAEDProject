/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.enterprises;

import backend.organizations.Organization;
import backend.organizations.OrgDir;
/**
 *
 * @author kunal
 */
public abstract class Enterprises extends Organization{
    private String enterpriseId;
    private static int count = 1;
    private OrgDir organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public Enterprises(String enterpriseName, EnterpriseType enterpriseType)
    {
        super(enterpriseName);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrgDir();
        StringBuffer sb = new StringBuffer();
        sb.append("ENT");
        sb.append(count);
        enterpriseId = sb.toString();
        count++;
    }
    
    public enum EnterpriseType{
        
       School("School"),
       StepOneService("StepOneService"),
       NonProfit("NonProfit"),
       Government("Government"),
       Hospital("Hospital");
    
       
       private String value;
       
       private EnterpriseType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }

    public OrgDir getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
