/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.UserManager;
import java.util.ArrayList;

/**
 *
 * @author adenw
 */
public class Administrator extends User{

    private UserManager userManager = UserManager.getInstance();
    
    public Administrator(String iD) {
        super(iD);
    }

    public Administrator(String iD, String password, String givenName, String surName, int age, String sex) {
        super(iD, password, givenName, surName, age, sex);
    }
    
    public void createOwnAccount()
    {
        
    }
    
    public Doctor addDoctorAccount(String iD, String password, String givenName, String surName, int age, String sex)
    {
        Doctor newDoc = new Doctor(iD, password, givenName, surName, age, sex);
        System.out.println(this.iD + ": Creating new doctor account with ID " + iD);
        return newDoc;
    }
    
    public void removeDoctorAccount()
    {
        
    }
    
    public Secretary addSecretaryAccount(String iD, String password,String givenName, String surName, int age, String sex)
    {
        Secretary newSec = new Secretary(iD, password, givenName, surName, age, sex);
        System.out.println(this.iD + ": Creating new secretary account with ID " + iD);
        return newSec;
    }
    
    public void removeSecretaryAccount()
    {
        
    }
    
    public void viewDoctorRating(Doctor doctor)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
    }
    
    public void giveDoctorFeedback(Doctor doctor, String feedback)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
        temp.add(feedback);
        doctor.setDoctorRating(temp);
    }
    
    
    
}
