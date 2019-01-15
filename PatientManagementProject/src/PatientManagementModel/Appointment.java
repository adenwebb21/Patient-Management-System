/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.*;

/**
 *
 * @author adenw
 */
public class Appointment {
    
    private Doctor doctor;
    private Patient patient;
    
    private int date;
    private String notes;
    
    private Prescription prescription;

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
   
    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public void attend()
    {
        
    }
    
    
    
}
