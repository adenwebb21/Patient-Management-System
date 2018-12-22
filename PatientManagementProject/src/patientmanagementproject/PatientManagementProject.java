/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementproject;

import Users.*;

/**
 *
 * @author adenw
 */
public class PatientManagementProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administrator a1 = new Administrator("a0000");
        
        Doctor d1 = a1.addDoctorAccount("d0000");
        Secretary s1 = a1.addSecretaryAccount("s0000");
        
        Patient p1 = new Patient("Sue", "Green");
        System.out.println("New patient created - currently has no ID");
        p1.requestAccountCreation(s1);
        
        s1.approvePendingPatientAccount(p1);
        
        p1.requestAppointment(d1, s1);
    }
    
}
