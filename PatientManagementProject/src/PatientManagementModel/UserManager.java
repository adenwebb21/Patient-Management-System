/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.User;
import java.util.ArrayList;

/**
 *
 * @author awebb4
 */
public class UserManager {

    private static UserManager single_instance = null;
    
    private ArrayList<User> users;
    
    private UserManager() {
        users = new ArrayList();
    }
    
    public static UserManager getInstance()
    {
        if (single_instance == null) 
            single_instance = new UserManager(); 
  
        return single_instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public void addUser(User newUser)
    {
        users.add(newUser);
    }
    
}
