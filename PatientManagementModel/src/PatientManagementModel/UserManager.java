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
 * This class is a singleton class which deals with the user details of the project
 * @author awebb4
 */
public class UserManager {

    private static UserManager single_instance = null;
    
    private ArrayList<User> users;   
    private ArrayList<User> unverifiedPatients;
    
    private ArrayList<Appointment> proposedAppointments;
    
    private int numDoc = 0;
    private int numSec = 0;
    private int numPat = 0;
    private int numAdmin = 0;
    private int numTempPat = 0;
    
    private UserManager() {
        users = new ArrayList();
        unverifiedPatients = new ArrayList();
    }
    
    /**
     * This allows the singular instance to be accessed from anywhere
     * @return 
     */
    public static UserManager getInstance()
    {
        if (single_instance == null) 
            single_instance = new UserManager(); 
  
        return single_instance;
    }

    /**
     * Gets a list of all the users currently registered
     * @return Returns the list
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * 
     * @param users
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    /**
     * Adds a user to the list of currently active users
     * @param newUser This is the new user to be added
     */
    public void addUser(User newUser)
    {
        users.add(newUser);
        
        for(User user : users)
        {
            System.out.println(user.getiD());
            System.out.println(user.getPassword());
        }
    }
    
    /**
     * This adds a new patient to the list of patients who are yet to be verified by a secretary
     * @param newPat This is the new user to be added
     */
    public void addUnverified(User newPat)
    {
        unverifiedPatients.add(newPat);
    }
    
    /** 
     * This method is used to generate a user ID for the user
     * @param type Takes in a  character which indicates the type of user to create
     * @return returns a string which is the new ID
     */
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
    
    /**
     * Returns a list of all the doctors currently registered
     * @return
     */
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
    
    /**
     * Returns a list of all the unverified patients that are registered
     * @return
     */
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
    
    /**
     * Returns a list of all the secretaries that are registered in the project
     * @return
     */
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
    
    /**
     * Removes a user account from the system, only used by the admin for doctors or secretaries
     * @param iD The ID of the user to be removed
     * @return
     */
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
    
    /**
     * This is a method used to validate a patient and make them a properly registered member
     * @param iD The ID of the patient to validate
     * @return A boolean indicating whether or not the validation was successful
     */
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
                              
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * This function will add the proposed appointment to a list of proposed appointments to be viewwed by the secretaries
     * @param doctorId
     * @param patientId
     * @param date
     */
    public void addProposedAppointmentToList(String doctorId, String patientId, String date)
    {
        
    }
    
    /**
     * This will check if a patient user is unverified or not by comparing its ID against IDs in the unverfied list
     * @param iD The ID of the patient that is being checked
     * @return
     */
    public Boolean checkIfUnverified(String iD)
    {
        for(User user : unverifiedPatients)
        {
            if(user.getiD().equals(iD))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void addUserToUnverified(User user)
    {
        unverifiedPatients.add(user);
    }
    
//    public Boolean registerNewPatient()
//    {
//        
//    }
    
}
