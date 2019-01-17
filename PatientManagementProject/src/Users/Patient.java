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
    
    /**
     *
     * @param currentAppointment
     */
    public void setCurrentAppointment(Appointment currentAppointment) {
        System.out.println("Recieved appointment with " + currentAppointment.getDoctor().iD);
        this.currentAppointment = currentAppointment;
    }
     
    /**
     *
     * @param iD
     * @param givenName
     * @param surName
     */
    public Patient(String iD, String givenName, String surName)
    {
        super(iD, givenName, surName);       
    }

    /**
     *
     * @param iD
     * @param password
     */
    public Patient(String iD, String password) {
        super(iD, password);
    }

    /**
     *
     * @param iD
     * @param addLine1
     * @param city
     * @param postcode
     * @param givenName
     * @param surName
     * @param sex
     * @param age
     * @param password
     */
    public Patient(String iD, String addLine1, String city, String postcode, String givenName, String surName, String sex, int age, String password) {
        super(iD, givenName, surName, sex, age, password);
        this.addLine1 = addLine1;
        this.city = city;
        this.postcode = postcode;
    }
    
    /**
     *
     * @param sec
     */
    public void requestAccountCreation(Secretary sec) {
        
        System.out.println(this.iD + ": Requesting account creation from secretary " + sec.iD);
        sec.addToWaitingListForApproval(this);
    }

    /**
     *
     * @return
     */
    public String getiD() {
        return iD;
    }

    /**
     *
     * @return
     */
    public Appointment getCurrentAppointment() {
        return currentAppointment;
    }

    /**
     *
     * @return
     */
    public Prescription getCurrentPrescription() {
        return currentPrescription;
    }

    /**
     *
     * @return
     */
    public String getAddLine1() {
        return addLine1;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     *
     * @return
     */
    public String getSurName() {
        return surName;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param iD
     */
    public void setiD(String iD) {
        this.iD = iD;
    }

    /**
     *
     * @return
     */
    public Appointment[] getAppointmentHistory() {
        return appointmentHistory;
    }

    /**
     *
     * @param currentPrescription
     */
    public void setCurrentPrescription(Prescription currentPrescription) {
        this.currentPrescription = currentPrescription;
    }
    
    /**
     *
     * @param doctor
     * @param rating
     */
    public void rateDoctor(Doctor doctor, String rating)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
        temp.add(rating);
        doctor.setDoctorRating(temp);
    }
    
    /**
     *
     * @param doctor
     */
    public void viewDoctorRating(Doctor doctor)
    {
        ArrayList<String> temp = doctor.getDoctorRating();
    }
    
    /**
     *
     * @param doctor
     * @param sec
     */
    public void requestAppointment(Doctor doctor, Secretary sec)
    {
        sec.addToAppointmentRequests(doctor, this);
    }
    
    /**
     *
     */
    public void viewCurrentAppointment()
    {
        
    }
    
    /**
     *
     */
    public void viewPrescription()
    {
        
    }
    
    /**
     *
     */
    public void viewHistory()
    {
        
    }
    
    /**
     *
     */
    public void requestAccountTermination()
    {
        
    }
    
}
