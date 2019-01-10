/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.*;

/**
 *
 * @author adenw
 */
public class Patient extends User{
    
    private Appointment[] appointmentHistory;
    private Appointment currentAppointment;

    
    public void setCurrentAppointment(Appointment currentAppointment) {
        System.out.println("Recieved appointment with " + currentAppointment.getDoctor().iD);
        this.currentAppointment = currentAppointment;
    }
     
    public Patient(String iD, String givenName, String surName)
    {
        super(iD, givenName, surName);
        
    }

    public Patient(String givenName, String surName) {
        super(givenName, surName);
    }

    public void requestAccountCreation(Secretary sec) {
        
        System.out.println(this.iD + ": Requesting account creation from secretary " + sec.iD);
        sec.addToWaitingListForApproval(this);
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
    
    
    
    public void rateDoctor()
    {
        
    }
    
    public void viewDoctorRating(Doctor doctor)
    {
        
    }
    
    public void requestAppointment(Doctor doctor, Secretary sec)
    {
        sec.addToAppointmentRequests(doctor, this);
    }
    
    public void viewCurrentAppointment()
    {
        
    }
    
    public void viewPrescription()
    {
        
    }
    
    public void viewHistory()
    {
        
    }
    
    public void requestAccountTermination()
    {
        
    }
    
}