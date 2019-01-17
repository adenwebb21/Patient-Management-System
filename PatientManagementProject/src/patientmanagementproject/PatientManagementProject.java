/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementproject;

import Controller.Controller;
import PatientManagementModel.UserManager;
import Users.*;
import View.Login;

/**
 *
 * @author adenw
 */
public class PatientManagementProject {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        
        UserManager userManager = UserManager.getInstance();
        
        Controller cont = new Controller();
               
        Login login = new Login(cont);
        
        //login.AddListener(cont);
        login.setVisible(true);
        
        Administrator a1 = new Administrator(userManager.generateUserId('A'), "Wilma", "Russel", "female", 34, "admin0");
        
        userManager.addUser(a1);
             
        Doctor d1 = a1.addDoctorAccount(userManager.generateUserId('D'), "Paul", "Thorne", "male", 23, "doc0");
        userManager.addUser(d1);
        
        Doctor d2 = a1.addDoctorAccount(userManager.generateUserId('D'), "John", "Smith", "male", 56, "doc1");
        userManager.addUser(d2);
        
        Doctor d3 = a1.addDoctorAccount(userManager.generateUserId('D'), "Sarah", "Jones", "female", 43, "doc2");
        userManager.addUser(d3);
        
        Secretary s1 = a1.addSecretaryAccount(userManager.generateUserId('S'), "Georga", "Huynh", "female", 32, "sec0");
        userManager.addUser(s1);
        
        //Secretary s1 = a1.addSecretaryAccount(userManager.generateUserId('S'));
//        
//        Patient p1 = new Patient("Sue", "Green");
//        System.out.println("New patient created - currently has no ID");
//        p1.requestAccountCreation(s1);
//        
//        s1.approvePendingPatientAccount(p1);
//        
//        p1.requestAppointment(d1, s1);
    }
    
}
