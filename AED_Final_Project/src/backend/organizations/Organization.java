/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.organizations;
import backend.people.PersonDir;
import backend.roles.Role;
import backend.account.UserAccDir;
import backend.tasks.TaskQueue;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public abstract class Organization {
    private String name;
    private UserAccDir userAccountDirectory;
    private PersonDir personDirectory;
    private TaskQueue workQueue;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccDir();
    personDirectory = new PersonDir();
    workQueue = new TaskQueue();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Volunteer("Volunteer Organization"),
     HelpSeeker("HelpSeeker Organization"),
     Supervisor("Supervisor Organization"),
     Donor("Donor Organization"),
     Transport("Transport Organization"),
     Mayor("Mayor Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDir getPersonDirectory() {
        return personDirectory;
    }

    public UserAccDir getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public TaskQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
