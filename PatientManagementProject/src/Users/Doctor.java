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
    
    public Doctor(String iD) {
        super(iD);
    }

    public Doctor(String iD, String givenName, String surName, String sex, int age, String password) {
        super(iD, givenName, surName, sex, age, password);
        System.out.println(givenName + "FROM DOCTOR");
    }

    public ArrayList<String> getDoctorRating() {
        return doctorRating;
    }

    public void setDoctorRating(ArrayList<String> doctorRating) {
        this.doctorRating = doctorRating;
    }
    
    
    
    public void addNote(String note)
    {
        currentAppointment.setNotes(note);
    }
    
    public void viewPatientHistory(Patient patient)
    {
        patient.getAppointmentHistory();
    }
    
    public void createAppointment(Appointment newAppointment)
    {
        System.out.println("Doctor has appointment with " + newAppointment.getPatient().iD);
        appointments.add(newAppointment);
    }
    
    public void prescribeMedicine(Patient patient, Medicine medicine, int dosage)
    {
        Prescription newPrescription = new Prescription(patient, this, medicine, dosage);
        patient.setCurrentPrescription(newPrescription);
    }
    
    public void requestNewMedicine()
    {
        
    }
}
