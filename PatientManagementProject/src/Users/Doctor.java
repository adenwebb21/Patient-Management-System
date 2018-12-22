/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.Appointment;
import UserNotificationObserver.Observer;
import java.util.ArrayList;

/**
 *
 * @author adenw
 */
public class Doctor extends User{  

    
    private ArrayList<Appointment> appointments = new ArrayList();
    
    
    public Doctor(String iD) {
        super(iD);
    }
    
    
    
    public void addNote(Appointment appointment)
    {
        
    }
    
    public void viewPatientHistory(Patient patient)
    {
        
    }
    
    public void createAppointment(Appointment newAppointment)
    {
        System.out.println("Doctor has appointment with " + newAppointment.getPatient().iD);
        appointments.add(newAppointment);
    }
    
    public void prescribeMedicine(Patient patient)
    {
        
    }
    
    public void requestNewMedicine()
    {
        
    }
}
