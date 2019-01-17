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
public class Doctor extends User{  

    
    private ArrayList<Appointment> appointments = new ArrayList();
    private Appointment currentAppointment;
    
    private ArrayList<String> doctorRating = new ArrayList();
    
    /**
     * The constructor for the doctor with just an ID
     * @param iD The ID to be provided
     */
    public Doctor(String iD) {
        super(iD);
    }

    /**
     * A more detailed constructor for the doctor
     * @param iD ID
     * @param givenName First name
     * @param surName Last Name
     * @param sex Sex
     * @param age age
     * @param password
     */
    public Doctor(String iD, String givenName, String surName, String sex, int age, String password) {
        super(iD, givenName, surName, sex, age, password);
        System.out.println(givenName + "FROM DOCTOR");
    }

    /**
     * Returns the doctors rating
     * @return
     */
    public ArrayList<String> getDoctorRating() {
        return doctorRating;
    }

    /**
     * Sets the doctors rating
     * @param doctorRating
     */
    public void setDoctorRating(ArrayList<String> doctorRating) {
        this.doctorRating = doctorRating;
    }
    
    /**
     * adds a note to the doctor
     * @param note The note itself
     */
    public void addNote(String note)
    {
        currentAppointment.setNotes(note);
    }
    
    /**
     * Views the history of this particular doctors patients
     * @param patient The patient to view the history of
     */
    public void viewPatientHistory(Patient patient)
    {
        patient.getAppointmentHistory();
    }
    
    /**
     * Creates a new appointment
     * @param newAppointment The new appointment
     */
    public void createAppointment(Appointment newAppointment)
    {
        System.out.println("Doctor has appointment with " + newAppointment.getPatient().iD);
        appointments.add(newAppointment);
    }
    
    /**
     * A function for the doctor to prescribe medicine
     * @param patient The patient to prescribe medicine to
     * @param medicine The medicine to be prescribed
     * @param dosage The dosage of the medicine to be prescribed
     */
    public void prescribeMedicine(Patient patient, Medicine medicine, int dosage)
    {
        Prescription newPrescription = new Prescription(patient, this, medicine, dosage);
        patient.setCurrentPrescription(newPrescription);
    }
    
    /**
     *
     */
    public void requestNewMedicine()
    {
        
    }
}
