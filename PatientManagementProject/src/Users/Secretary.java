/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.Appointment;
import PatientManagementModel.UserManager;
import java.util.ArrayList;

/**
 *
 * @author adenw
 */
public class Secretary extends User {
    
    private ArrayList<Patient> waitingForApproval = new ArrayList();
    private ArrayList<Appointment> appointmentRequests = new ArrayList();
    
    private UserManager userManager = UserManager.getInstance();
    
    
    public Secretary(String iD)
    {
        super(iD);       
    }

    public Secretary(String iD, String password, String givenName, String surName, int age, String sex) {
        super(iD, password, givenName, surName, age, sex);
    }

    public ArrayList<Patient> getWaitingForApproval() {
        return waitingForApproval;
    }

    public void addToWaitingListForApproval(Patient patientToApprove) {
        System.out.println(this.iD + ": Added patient " + patientToApprove.iD + " to waiting list");
        waitingForApproval.add(patientToApprove);
    }
    
    public void addToAppointmentRequests(Doctor idealDoc, Patient patient)
    {
        System.out.println(this.iD + ": Added request for appointment with " + idealDoc.iD + " to secretaries tasks list");
        Appointment newApp = new Appointment(idealDoc, patient);
        appointmentRequests.add(newApp);
        createAppointment(newApp);
    }

    public Patient approvePendingPatientAccount(Patient p) {
        
        if(waitingForApproval.contains(p))
        {
            System.out.println(this.iD + ": Assigning patient " + p.givenName + " " + p.surName + " a new ID");
            p.setiD(userManager.generateUserId('C'));
            System.out.println(this.iD + ": New ID is " + p.iD);
            
            return p;
        }    
        else
        {
            System.out.println(this.iD + ": Patient has not yet applied for approval");
            return null;
        }
    }
    
    public void createAppointment(Appointment app)
    {
        System.out.println("Creating an appointment for " + app.getPatient().iD + " with " + app.getDoctor().iD);
        app.getDoctor().createAppointment(app);
        app.getPatient().setCurrentAppointment(app);
    }
    
    public void giveMedicine()
    {
        
    }
    
    public void orderNewMedicine()
    {
        
    }
    
    public void removePatient()
    {
        
    }
    
    public void approvePatientAccountTermination()
    {
        
    }
    
    
}
