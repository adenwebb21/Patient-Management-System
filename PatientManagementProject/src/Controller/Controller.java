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
    
    UserManager userManager;

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
    
    public void LogIn(String userId, String password)
    {
        Boolean correctLogin = false;
        
        userManager = UserManager.getInstance();
        
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
                        secretaryView = new SecretaryView();
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
    
    public Boolean registerPatientButton(String addLine1, String city, String postcode, String fName, String lName, String sex, int age, String password)
    {
        Patient newPatient = new Patient(addLine1, city, postcode, fName, lName, sex, age, password);
        return true;
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
            temp = new Doctor(userManager.generateUserId('D'), pWord, fName, lName, age, sex);
            userManager.addUser(temp);
        }
        else if(type == 'S')
        {
            temp = new Secretary(userManager.generateUserId('S'), pWord, fName, lName, age, sex);
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
}
