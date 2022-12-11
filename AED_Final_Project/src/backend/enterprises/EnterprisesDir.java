/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.enterprises;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class EnterprisesDir {
    private ArrayList<Enterprises> enterpriseList;
    
    public EnterprisesDir()
    {
        enterpriseList = new ArrayList<Enterprises>();
    }
    
    
    public Enterprises addEnterprise(String name, Enterprises.EnterpriseType type)
    {
      Enterprises enterprise = null;
      if(type ==Enterprises.EnterpriseType.StepOneService)
      {
       enterprise = new HelpEnterprise(name);
       enterpriseList.add(enterprise);     
      }
      else if (type == Enterprises.EnterpriseType.Government){
            enterprise = new GovtEnterprise(name);
            enterpriseList.add(enterprise);
        }
       else if (type == Enterprises.EnterpriseType.NonProfit){
            enterprise = new NgoEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if(type ==Enterprises.EnterpriseType.School)
        {
         enterprise = new SchoolEnterprise(name);
         enterpriseList.add(enterprise);     
        }
      else  if(type ==Enterprises.EnterpriseType.Hospital)
        {
         enterprise = new HospEnterprise(name);
         enterpriseList.add(enterprise);     
        }

      return enterprise;
    }

    public ArrayList<Enterprises> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprises enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
