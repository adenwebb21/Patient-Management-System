/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import PatientManagementModel.UserManager;
import Users.*;
import View.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author awebb4
 */

public class Controller  {
    
    Login login;
    DoctorView doctorView;
    AdminView adminView;
    SecretaryView secretaryView;
    PatientView patientView;
    UnverifiedView unverifiedView;
    
    UserManager userManager = UserManager.getInstance();
    
    private String lastTempPatientiD;

//    @Override
//    public void actionPerformed (ActionEvent e)
//    {        
//        JButton tempBtn = (JButton)e.getSource();
//        String soruceName = tempBtn.getName();
//        
//        //System.out.println(soruceName);
//        /*
//        if (soruceName == "btn_login")
//        {
//            System.out.println("Dab it works my G!");
//            
//        }
//*/
//    }

    public String getLastTempPatientiD() {
        return lastTempPatientiD;
    }   
    
    public void LogIn(String userId, String password)
    {
        Boolean correctLogin = false;
        
        for(User user : userManager.getUsers())
        {
            if(user.getiD().equals(userId) && user.getPassword().equals(password))
            {
                correctLogin = true;
                
                //login.setVisible(false);
                
                switch(user.getiD().charAt(0))
                {
                    case 'A':
                        adminView = new AdminView(this);
                        adminView.setVisible(true);
                        break;
                    case 'S':
                        secretaryView = new SecretaryView(this);
                        secretaryView.setVisible(true);
                        break;
                    case 'P':
                        patientView = new PatientView();
                        patientView.setVisible(true);
                        break;
                    case 'D':
                        doctorView = new DoctorView();
                        doctorView.setVisible(true);
                        break;     
                    case 'T':
                        unverifiedView = new UnverifiedView(this);
                        unverifiedView.setVisible(true);
                    default:
                        break;
                }
            }
        }
        
        if(!correctLogin)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Login", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void logOut()
    {
        login.setVisible(true);
    }
    
    public void registerPatientButton(String addLine1, String city, String postcode, String fName, String lName, String sex, int age, String password)
    {
        lastTempPatientiD = userManager.generateUserId('T');
        Patient newPatient = new Patient(lastTempPatientiD, addLine1, city, postcode, fName, lName, sex, age, password);
        userManager.addUser(newPatient);  
        userManager.addUnverified(newPatient);
    }
    
    public Boolean removeUserAccount(String iD)
    {
        if(userManager.RemoveUserAccount(iD))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Boolean createNewUser(char type, String fName, String lName, int age, String pWord, String sex)
    {
        User temp;
        
        if(type == 'D')
        {
            System.out.println(fName + "FROM CONTROLLER");
            temp = new Doctor(userManager.generateUserId('D'), fName, lName, sex, age, pWord);
            userManager.addUser(temp);
        }
        else if(type == 'S')
        {
            temp = new Secretary(userManager.generateUserId('S'), fName, lName, sex, age, pWord);
            userManager.addUser(temp);
        }
              
        return true;
    }
    
    public ArrayList<User> getAllDoctors()
    {
        ArrayList<User> temp = userManager.returnAllDoctors();
        return temp;
    }
    
    public ArrayList<User> getAllSecs()
    {
        ArrayList<User> temp = userManager.returnAllSecretaries();
        return temp;
    }
    
    public ArrayList<User> getAllUnverified()
    {
        ArrayList<User> temp = userManager.returnAllUnverified();
        return temp;
    }
    
    public Boolean validatePatient(String iDToValidate)
    {
        if(userManager.validatePatient(iDToValidate))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
