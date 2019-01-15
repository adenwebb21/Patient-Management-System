/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.ArrayList;

/**
 *
 * @author adenw
 */
public class Administrator extends User{

    public Administrator(String iD) {
        super(iD);
    }
    
    public void createOwnAccount()
    {
        
    }
    
    public Doctor addDoctorAccount(String iD)
    {
        Doctor newDoc = new Doctor(iD);
        System.out.println(this.iD + ": Creating new doctor account with ID " + iD);
        return newDoc;
    }
    
    public void removeDoctorAccount()
    {
        
    }
    
    public Secretary addSecretaryAccount(String iD)
    {
        Secretary newSec = new Secretary("iD");
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
