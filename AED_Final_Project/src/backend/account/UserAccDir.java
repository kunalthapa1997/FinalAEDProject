/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.account;

import backend.people.Person;
import backend.roles.Role;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class UserAccDir {
     private ArrayList<UserAcc> userAccountList;
    
    public UserAccDir()
    {
      userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAcc> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAcc authenticateUser(String username, String password){
        for (UserAcc ua : userAccountList)
        {
            System.out.println(ua.getUserName());
            System.out.println(ua.getPassword());
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            } 
        }
        return null;
    }
    
    public UserAcc addUserAccount(String username, String password, Person person, Role role){
        UserAcc userAccount = new UserAcc();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAcc ua : userAccountList){
            if (ua.getUserName().equals(username))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUserAccount(UserAcc userAccount)
    {
        userAccountList.remove(userAccount);
    }
}
