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
    
    /**
     *
     * @param iD
     */
    public Secretary(String iD)
    {
        super(iD);       
    }

    /**
     *
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
     *
     * @return
     */
    public ArrayList<Patient> getWaitingForApproval() {
        return waitingForApproval;
    }

    /**
     *
     * @param patientToApprove
     */
    public void addToWaitingListForApproval(Patient patientToApprove) {
        System.out.println(this.iD + ": Added patient " + patientToApprove.iD + " to waiting list");
        waitingForApproval.add(patientToApprove);
    }
    
    /**
     *
     * @param idealDoc
     * @param patient
     */
    public void addToAppointmentRequests(Doctor idealDoc, Patient patient)
    {
        System.out.println(this.iD + ": Added request for appointment with " + idealDoc.iD + " to secretaries tasks list");
        Appointment newApp = new Appointment(idealDoc, patient);
        appointmentRequests.add(newApp);
        createAppointment(newApp);
    }

    /**
     *
     * @param p
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
     *
     * @param app
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
