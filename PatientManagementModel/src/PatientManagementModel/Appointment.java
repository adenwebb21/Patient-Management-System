/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.*;

/**
 * This class handles the appointments - it is not complete but olds the basis of the class
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
     * This is the constructor for appointment
     * @param doctorId The ID of the doctor to be used
     * @param patientiD The ID of the patient to be used
     * @param date The date to be used
     */
    public Appointment(String doctorId, String patientiD, String date) {
        this.doctorId = doctorId;
        this.patientiD = patientiD;
        this.date = date;
    }

    /**
     * The function that allows setting the notes during an appointment
     * @param notes The actual notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * The prescription associated with a certain appointment
     * @param prescription
     */
    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
   
    /**
     * Alternate constructor that takes an actual patient and doctor class
     * @param doctor The doctor
     * @param patient The patient
     */
    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    /**
     * Returns the doctor
     * @return The doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Sets the doctor
     * @param doctor The doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Gets the patient
     * @return The patient
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
    
    
    
    
}
