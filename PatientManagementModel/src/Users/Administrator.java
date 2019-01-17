/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.UserManager;
import java.util.ArrayList;

/**
 * This is the administrator class
 * @author adenw
 */
public class Administrator extends User{

    private UserManager userManager = UserManager.getInstance();
    
    /**
     * A constructor to create the administrator with only an ID
     * @param iD
     */
    public Administrator(String iD) {
        super(iD);
    }

    /**
     * A constructor to make an admin with more details
     * @param iD The ID of the admin
     * @param password The password of the admin
     * @param givenName The first name of the admin
     * @param surName The last name of the admin
     * @param age The age of the admin
     * @param sex The sex of the admin
     */
    public Administrator(String iD, String password, String givenName, String surName, int age, String sex) {
        super(iD, password, givenName, surName, age, sex);
    }
    
    /**
     *
     */
    public void createOwnAccount()
    {
        
    }
    
    /**
     * This allows the admin to create a doctor account
     * @param iD The ID of the doctor account
     * @param password The password for the new doctor
     * @param givenName The first name for the new doctor
     * @param surName The last name for the new doctor
     * @param age The age for the new doctor
     * @param sex The sex of the new doctor 
     * @return
     */
    public Doctor addDoctorAccount(String iD, String password, String givenName, String surName, int age, String sex)
    {
        Doctor newDoc = new Doctor(iD, password, givenName, surName, age, sex);
        System.out.println(this.iD + ": Creating new doctor account with ID " + iD);
        return newDoc;
    }
    
    /**
     *
     */
    public void removeDoctorAccount()
    {
        
    }
    
    /**
     * Adding the new secretary account
     * @param iD The ID of the new secretary account
     * @param password The password of the new secretary account
     * @param givenName The first name of the new secretary
     * @param surName The last name of the new secretary
     * @param age The age of the new secretary
     * @param sex The sex of the new secretary
     * @return
     */
    public Secretary addSecretaryAccount(String iD, String password,String givenName, String surName, int age, String sex)
    {
        Secretary newSec = new Secretary(iD, password, givenName, surName, age, sex);
        System.out.println(this.iD + ": Creating new secretary account with ID " + iD);
        return newSec;
    }
    
    /**
     *
     */
    public void removeSecretaryAccount()
    {
        
    }
    
    /**
     * View the rating of a particular doctor
     * @param doctor The doctor to look at the review of
     */
    public void viewDoctorRating(Doctor doctor)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
    }
    
    /**
     * The function to provide feedback to the doctor
     * @param doctor
     * @param feedback
     */
    public void giveDoctorFeedback(Doctor doctor, String feedback)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
        temp.add(feedback);
        doctor.setDoctorRating(temp);
    }
    
    
    
}
