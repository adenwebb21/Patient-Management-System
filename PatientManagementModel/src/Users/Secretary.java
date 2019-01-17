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
 * The User type Secretary
 * @author adenw
 */
public class Secretary extends User {
    
    private ArrayList<Patient> waitingForApproval = new ArrayList();
    private ArrayList<Appointment> appointmentRequests = new ArrayList();
    
    private UserManager userManager = UserManager.getInstance();
    
    /**
     * A secretary creator method with just an ID
     * @param iD
     */
    public Secretary(String iD)
    {
        super(iD);       
    }

    /**
     * A complete secretary creator method
     * @param iD
     * @param givenName
     * @param surName
     * @param sex
     * @param age
     * @param password
     */
    public Secretary(String iD, String givenName, String surName, String sex, int age, String password) {
        super(iD, givenName, surName, sex, age, password);
    }

    /**
     * Retrieve a list of all the patients waiting for approval
     * @return returns the list
     */
    public ArrayList<Patient> getWaitingForApproval() {
        return waitingForApproval;
    }

    /**
     * Allows the secretary to add a patient to the waiting list for approval
     * @param patientToApprove The patient
     */
    public void addToWaitingListForApproval(Patient patientToApprove) {
        System.out.println(this.iD + ": Added patient " + patientToApprove.iD + " to waiting list");
        waitingForApproval.add(patientToApprove);
    }
    
    /** 
     * Allows the secretary to create a specific appointment request
     * @param idealDoc The desired doctor
     * @param patient The patient
     */
    public void addToAppointmentRequests(Doctor idealDoc, Patient patient)
    {
        System.out.println(this.iD + ": Added request for appointment with " + idealDoc.iD + " to secretaries tasks list");
        Appointment newApp = new Appointment(idealDoc, patient);
        appointmentRequests.add(newApp);
        createAppointment(newApp);
    }

    /**
     * This allows the secretary to approve a currently pending patient account
     * @param p The patient p is the one to be approcved
     * @return
     */
    public Patient approvePendingPatientAccount(Patient p) {
        
        if(waitingForApproval.contains(p))
        {
            System.out.println(this.iD + ": Assigning patient " + p.givenName + " " + p.surName + " a new ID");
            p.setiD(userManager.generateUserId('P'));
            System.out.println(this.iD + ": New ID is " + p.iD);
            
            return p;
        }    
        else
        {
            System.out.println(this.iD + ": Patient has not yet applied for approval");
            return null;
        }
    }
    
    /**
     * Allows the creation of an appointment that has been passed through
     * @param app The appointment to be confirmed
     */
    public void createAppointment(Appointment app)
    {
        System.out.println("Creating an appointment for " + app.getPatient().iD + " with " + app.getDoctor().iD);
        app.getDoctor().createAppointment(app);
        app.getPatient().setCurrentAppointment(app);
    }
    
    /**
     *
     */
    public void giveMedicine()
    {
        
    }
    
    /**
     *
     */
    public void orderNewMedicine()
    {
        
    }
    
    /**
     *
     */
    public void removePatient()
    {
        
    }
    
    /**
     *
     */
    public void approvePatientAccountTermination()
    {
        
    }
    
    
}
