/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.*;
import java.util.ArrayList;

/**
 *
 * @author adenw
 */
public class Patient extends User{
    
    private Appointment[] appointmentHistory;
    private Appointment currentAppointment;
    
    private Prescription currentPrescription;

    private String addLine1, city, postcode;
    
    
    public void setCurrentAppointment(Appointment currentAppointment) {
        System.out.println("Recieved appointment with " + currentAppointment.getDoctor().iD);
        this.currentAppointment = currentAppointment;
    }
     
    public Patient(String iD, String givenName, String surName)
    {
        super(iD, givenName, surName);
        
    }

    public Patient(String iD, String addLine1, String city, String postcode, String givenName, String surName, String sex, int age, String password) {
        super(iD, givenName, surName, sex, age, password);
        this.addLine1 = addLine1;
        this.city = city;
        this.postcode = postcode;
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

    public Appointment[] getAppointmentHistory() {
        return appointmentHistory;
    }

    public void setCurrentPrescription(Prescription currentPrescription) {
        this.currentPrescription = currentPrescription;
    }
    
    
    
    public void rateDoctor(Doctor doctor, String rating)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
        temp.add(rating);
        doctor.setDoctorRating(temp);
    }
    
    public void viewDoctorRating(Doctor doctor)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
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
