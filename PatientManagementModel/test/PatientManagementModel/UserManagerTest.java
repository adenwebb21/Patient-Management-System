/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author awebb4
 */
public class UserManagerTest {
    
    public UserManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUsers method, of class UserManager.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserManager instance = UserManager.getInstance();
        
        User doc1 = new Doctor("0");
        User doc2 = new Doctor("1");
        
        instance.addUser(doc1);
        instance.addUser(doc2);
        
        ArrayList<User> expResult = new ArrayList();
        expResult.add(doc1);
        expResult.add(doc2);
        
        ArrayList<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User newUser = new Doctor("D000");
        UserManager instance = UserManager.getInstance();
        instance.addUser(newUser);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        instance.getUsers().contains(newUser);
    }

    /**
     * Test of addUnverified method, of class UserManager.
     */
    @Test
    public void testAddUnverified() {
        System.out.println("addUnverified");
        User newPat = new Patient("P000", "patient0");
        UserManager instance = UserManager.getInstance();
        instance.addUnverified(newPat);
        // TODO review the generated test code and remove the default call to fail.
        //Sfail("The test case is a prototype.");
        instance.getUsers().contains(newPat);
    }

    /**
     * Test of generateUserId method, of class UserManager.
     */
    @Test
    public void testGenerateUserId() {
        System.out.println("generateUserId");
        char type = 'D';
        UserManager instance = UserManager.getInstance();
        String expResult = "D0000";
        String result = instance.generateUserId(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveUserAccount method, of class UserManager.
     */
    @Test
    public void testRemoveUserAccount() {
        System.out.println("RemoveUserAccount");
        String iD = "D000";
        UserManager instance = UserManager.getInstance();
        instance.addUser(new Doctor("D000"));
        
        Boolean expResult = true;
        Boolean result = instance.RemoveUserAccount(iD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfUnverified method, of class UserManager.
     */
    @Test
    public void testCheckIfUnverified() {
        System.out.println("checkIfUnverified");
        String iD = "T000";
        UserManager instance = UserManager.getInstance();
        instance.addUserToUnverified(new Patient(iD, "pass"));
        
        Boolean expResult = true;
        Boolean result = instance.checkIfUnverified(iD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
