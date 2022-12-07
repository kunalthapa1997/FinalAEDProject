/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;

import backend.organizations.Organization.Type;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class OrgDir {
    private ArrayList<Organization> organizationList;
    
    public OrgDir()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new Volunteers();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HelpSeeker.getValue())){
            organization = new Seeker();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new Supervisor();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new Donor();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new Transportation();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new Mayor();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
}
