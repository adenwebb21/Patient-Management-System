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
    
    private String doctorId;
    private String patientiD;
    
    private String date;
    private String notes;
    
    private Prescription prescription;

    /**
     *
     * @param doctorId
     * @param patientiD
     * @param date
     */
    public Appointment(String doctorId, String patientiD, String date) {
        this.doctorId = doctorId;
        this.patientiD = patientiD;
        this.date = date;
    }

    /**
     *
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     *
     * @param prescription
     */
    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
   
    /**
     *
     * @param doctor
     * @param patient
     */
    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    /**
     *
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     *
     * @param doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    /**
     *
     */
    public void attend()
    {
        
    }
    
    
    
}
