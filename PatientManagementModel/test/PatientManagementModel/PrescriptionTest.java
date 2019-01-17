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
public class PrescriptionTest {
    
    public PrescriptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPatient method, of class Prescription.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Prescription instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class Prescription.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Prescription instance = null;
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrescriber method, of class Prescription.
     */
    @Test
    public void testGetPrescriber() {
        System.out.println("getPrescriber");
        Prescription instance = null;
        Doctor expResult = null;
        Doctor result = instance.getPrescriber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrescriber method, of class Prescription.
     */
    @Test
    public void testSetPrescriber() {
        System.out.println("setPrescriber");
        Doctor prescriber = null;
        Prescription instance = null;
        instance.setPrescriber(prescriber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicine method, of class Prescription.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Prescription instance = null;
        Medicine expResult = null;
        Medicine result = instance.getMedicine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicine method, of class Prescription.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        Medicine medicine = null;
        Prescription instance = null;
        instance.setMedicine(medicine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Prescription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Prescription instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Prescription.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Prescription instance = null;
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDosage method, of class Prescription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Prescription instance = null;
        String expResult = "";
        String result = instance.getDosage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDosage method, of class Prescription.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        String Dosage = "";
        Prescription instance = null;
        instance.setDosage(Dosage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
