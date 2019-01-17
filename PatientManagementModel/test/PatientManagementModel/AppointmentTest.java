/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.Doctor;
import Users.Patient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author awebb4
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setNotes method, of class Appointment.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Appointment instance = null;
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrescription method, of class Appointment.
     */
    @Test
    public void testSetPrescription() {
        System.out.println("setPrescription");
        Prescription prescription = null;
        Appointment instance = null;
        instance.setPrescription(prescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctor method, of class Appointment.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Appointment instance = null;
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class Appointment.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Appointment instance = null;
        instance.setDoctor(doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Appointment.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Appointment instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class Appointment.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Appointment instance = null;
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
