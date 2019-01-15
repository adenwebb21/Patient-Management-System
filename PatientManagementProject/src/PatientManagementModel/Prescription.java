/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.*;

/**
 *
 * @author awebb4
 */
public class Prescription {
    
    private Patient patient;
    private Doctor prescriber;
    
    private Medicine medicine;
    private int quantity;
    private String Dosage;

    public Prescription(Patient patient, Doctor prescriber, Medicine medicine, int quantity) {
        this.patient = patient;
        this.prescriber = prescriber;
        this.medicine = medicine;
        this.quantity = quantity;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getPrescriber() {
        return prescriber;
    }

    public void setPrescriber(Doctor prescriber) {
        this.prescriber = prescriber;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
    
}
