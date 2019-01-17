/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author awebb4
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PatientManagementModel.AppointmentTest.class, PatientManagementModel.PrescriptionTest.class, PatientManagementModel.UserManagerTest.class, PatientManagementModel.MedicineTest.class})
public class PatientManagementModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
