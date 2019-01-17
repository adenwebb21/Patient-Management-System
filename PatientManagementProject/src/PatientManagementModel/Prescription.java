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

    /**
     *
     * @param patient
     * @param prescriber
     * @param medicine
     * @param quantity
     */
    public Prescription(Patient patient, Doctor prescriber, Medicine medicine, int quantity) {
        this.patient = patient;
        this.prescriber = prescriber;
        this.medicine = medicine;
        this.quantity = quantity;
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
     * @return
     */
    public Doctor getPrescriber() {
        return prescriber;
    }

    /**
     *
     * @param prescriber
     */
    public void setPrescriber(Doctor prescriber) {
        this.prescriber = prescriber;
    }

    /**
     *
     * @return
     */
    public Medicine getMedicine() {
        return medicine;
    }

    /**
     *
     * @param medicine
     */
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     *
     * @param Dosage
     */
    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
    
}
