/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.account;

import backend.coverage.Coverage;
import backend.people.Person;
import backend.roles.Role;
import backend.tasks.TaskQueue;
/**
 *
 * @author kunal
 */
public class UserAcc {
    
    private String userName;
    private String password;
    private Person person; 
    private Role role;
    private TaskQueue workQueue;
    private boolean enabled = true;
    private Coverage network;
   
    
    public UserAcc() {
        workQueue = new TaskQueue();
    }
  
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public TaskQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(TaskQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return userName; //To change body of generated methods, choose Tools | Templates.
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setNetwork(Coverage network) {
        this.network = network;
    }

    public Coverage getNetwork() {
        return network;
    }
}
