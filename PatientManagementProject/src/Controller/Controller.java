/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import PatientManagementModel.UserManager;
import Users.*;
import View.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * This is the controller class. It acts as the go-between for the model and the view.
 * @author awebb4
 */

public class Controller  {
    
    Login login;
    DoctorView doctorView;
    AdminView adminView;
    SecretaryView secretaryView;
    PatientView patientView;
    UnverifiedView unverifiedView;
    
    UserManager userManager = UserManager.getInstance();
    
    private String lastTempPatientiD;

    /**
     * This is used to get the most recently logged in with patient ID. It is accessed from the view.
     * @return Returns the ID as a string for use with referencing recent logged in users.
     */

    public String getLastTempPatientiD() {
        return lastTempPatientiD;
    }   
    
    /**
     * This method is used when someone wants to log into the system. It opens up the correct JFrame for the type of user that is trying to log in.
     * @param userId This is the text entered into the ID (username) box on the view
     * @param password This is the text entered into the password box on the view
     */
    public void LogIn(String userId, String password)
    {
        Boolean correctLogin = false;
        
        for(User user : userManager.getUsers())
        {
            if(user.getiD().equals(userId) && user.getPassword().equals(password))
            {
                correctLogin = true;
                
                //login.setVisible(false);
                
                switch(user.getiD().charAt(0))
                {
                    case 'A':
                        adminView = new AdminView(this);
                        adminView.setVisible(true);
                        break;
                    case 'S':
                        secretaryView = new SecretaryView(this);
                        secretaryView.setVisible(true);
                        break;
                    case 'P':
                        patientView = new PatientView(this);
                        patientView.SetCurrentPatient(user.getiD());
                        patientView.setVisible(true);
                        break;
                    case 'D':
                        doctorView = new DoctorView();
                        doctorView.setVisible(true);
                        break;     
                    case 'T':
                           
                        unverifiedView = new UnverifiedView(this);  
                        
                        if(userManager.checkIfUnverified(user.getiD()))
                        {
                            unverifiedView.isUserVerified(false, "000");
                        }
                        else
                        {
                            String iDNums;
                            unverifiedView.isUserVerified(true, iDNums = user.getiD().substring(user.getiD().length() - 3));
                        }
                        
                        unverifiedView.displayVerificationStatus();
                        
                        unverifiedView.setVisible(true);
                        
                    default:
                        break;
                }
            }
        }
        
        if(!correctLogin)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Login", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * The log out method simply sets the login screen to visible, ready for the next person to log in
     */
    public void logOut()
    {
        login.setVisible(true);
    }
    
    /**
     * This method is called when a new patient is trying to register to the system
     * @param addLine1 The patients address line 1
     * @param city The patients city
     * @param postcode The patients postcode
     * @param fName The patients first name
     * @param lName The patients last name
     * @param sex The patients sex
     * @param age The patients age
     * @param password The patients password
     */
    public void registerPatientButton(String addLine1, String city, String postcode, String fName, String lName, String sex, int age, String password)
    {
        lastTempPatientiD = userManager.generateUserId('T');
        Patient newPatient = new Patient(lastTempPatientiD, addLine1, city, postcode, fName, lName, sex, age, password);
        userManager.addUser(newPatient);  
        userManager.addUnverified(newPatient);
    }
    
    /**
     * Tells the user manager to remove this account
     * @param iD The iD of the account to remove
     * @return This returns a boolean that indicates whether or not it was successful 
     */
    public Boolean removeUserAccount(String iD)
    {
        if(userManager.RemoveUserAccount(iD))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * This is a method used by the administrator that can create new doctors or secretaries
     * @param type A character indicating what type of user has been created
     * @param fName The first name of the new user
     * @param lName The last name of the new user
     * @param age The age of the new user
     * @param pWord The password of the new user
     * @param sex The sex of the new user
     * @return Returns a boolean to indicate whether or not the user has been created successfully
     */
    public Boolean createNewUser(char type, String fName, String lName, int age, String pWord, String sex)
    {
        User temp;
        
        if(type == 'D')
        {
            System.out.println(fName + "FROM CONTROLLER");
            temp = new Doctor(userManager.generateUserId('D'), fName, lName, sex, age, pWord);
            userManager.addUser(temp);
        }
        else if(type == 'S')
        {
            temp = new Secretary(userManager.generateUserId('S'), fName, lName, sex, age, pWord);
            userManager.addUser(temp);
        }
              
        return true;
    }
    
    /**
     * Returns a list of all the doctor
     * @return returns the list of doctors (users)
     */
    public ArrayList<User> getAllDoctors()
    {
        ArrayList<User> temp = userManager.returnAllDoctors();
        return temp;
    }
    
    /**
     * Returns a list of all current secretaries
     * @return returns the list
     */
    public ArrayList<User> getAllSecs()
    {
        ArrayList<User> temp = userManager.returnAllSecretaries();
        return temp;
    }
    
    /**
     * Returns a list of all unverified patient accounts
     * @return returns a list
     */
    public ArrayList<User> getAllUnverified()
    {
        ArrayList<User> temp = userManager.returnAllUnverified();
        return temp;
    }
    
    /**
     * Allows a patient to propose an appointment
     * @param doctorId The ID of the doctor to be involved in the appointment
     * @param date The date that the appointment is to take place on
     * @param patientId The patient that the appointment is concerning
     */
    public void proposeAppointment(String doctorId, String date, String patientId)
    {
        userManager.addProposedAppointmentToList(doctorId, patientId, date);
    }
    
    /**
     * Tells the user manager to validate a patient and move it from the unvalidated list to the validated one
     * @param iDToValidate The ID of the user to validate
     * @return returns whether or not the validation was successful
     */
    public Boolean validatePatient(String iDToValidate)
    {
        if(userManager.validatePatient(iDToValidate))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
