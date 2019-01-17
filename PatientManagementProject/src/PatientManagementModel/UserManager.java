/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.Patient;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author awebb4
 */
public class UserManager {

    private static UserManager single_instance = null;
    
    private ArrayList<User> users;
    
    private ArrayList<User> unverifiedPatients;
    
    private int numDoc = 0;
    private int numSec = 0;
    private int numPat = 0;
    private int numAdmin = 0;
    private int numTempPat = 0;
    
    private UserManager() {
        users = new ArrayList();
        unverifiedPatients = new ArrayList();
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
        
        for(User user : users)
        {
            System.out.println(user.getiD());
            System.out.println(user.getPassword());
        }
    }
    
    public void addUnverified(User newPat)
    {
        unverifiedPatients.add(newPat);
    }
    
    public String generateUserId(char type)
    {
        String newId = "";
        
        switch(type)
        {
            case 'D':
                newId = String.format("D%04d", numDoc);
                numDoc++;
                break;
            case 'A':
                newId = String.format("A%04d", numAdmin);
                numAdmin++;
                break;
            case 'S':
                newId = String.format("S%04d", numSec);
                numSec++;
                break;
            case 'P':
                newId = String.format("P%04d", numPat);
                numPat++;
                break;
            case 'T':
                newId = String.format("T%04d", numTempPat);
                numTempPat++;
                break;
            default:
                break;
        }
        
        return newId;
    }
    
    public ArrayList<User> returnAllDoctors()
    {
        ArrayList<User> tempDoctors = new ArrayList();
        
        for(User user : users)
        {
            if(user.getiD().charAt(0) == 'D')
            {
                tempDoctors.add(user);
            }
        }
        
        return tempDoctors;
    }
    
    public ArrayList<User> returnAllUnverified()
    {
        ArrayList<User> tempUnverified = new ArrayList();
        
        for(User user : users)
        {
            if(user.getiD().charAt(0) == 'T' && !user.getGivenName().equals(""))
            {
                tempUnverified.add(user);
            }
        }
        
        return tempUnverified;
    }
    
    public ArrayList<User> returnAllSecretaries()
    {
        ArrayList<User> tempSecretaries = new ArrayList();
        
        for(User user : users)
        {
            if(user.getiD().charAt(0) == 'S')
            {
                tempSecretaries.add(user);
            }
        }
        
        return tempSecretaries;
    }
    
    public Boolean RemoveUserAccount(String iD)
    {
        char tempFChar = iD.charAt(0);
        
        for(User user : users)
        {
            if(user.getiD().equals(iD) && (tempFChar == 'S' || tempFChar == 'D'))
            {
                users.remove(user);
                return true;
            }
        }
        
        return false;
    }
    
    public Boolean validatePatient(String iD)
    {
        
        for(User user : unverifiedPatients)
        {
            if(user.getiD().equals(iD))
            {
                Patient shell = new Patient(user.getiD(), user.getPassword());
                
                user.setiD(generateUserId('P'));
                unverifiedPatients.remove(user);
                users.add(shell);
                
                System.out.println(unverifiedPatients.size());
                System.out.println(shell.getiD() + "VERIFIED FROM USERMANAGER");
                System.out.println(user.getiD() + "VERIFIED FROM USERMANAGER");
                
                return true;
            }
        }
        
        return false;
    }
    
//    public Boolean registerNewPatient()
//    {
//        
//    }
    
}
