/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import PatientManagementModel.UserManager;
import Users.User;
import View.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JButton;

/**
 *
 * @author awebb4
 */

public class Controller implements ActionListener {
    
    //Login login;
    DoctorView doctorView;
    AdminView adminView;
    SecretaryView secretaryView;
    PatientView patientView;

    @Override
    public void actionPerformed (ActionEvent e)
    {        
        JButton tempBtn = (JButton)e.getSource();
        String soruceName = tempBtn.getName();
        
        //System.out.println(soruceName);
        /*
        if (soruceName == "btn_login")
        {
            System.out.println("Dab it works my G!");
            
        }
*/
    }
    
    public void LogIn(String userId, String password)
    {
        Boolean correctLogin = false;
        
        UserManager userManager = UserManager.getInstance();
        
        for(User user : userManager.getUsers())
        {
            if(user.getiD().equals(userId) && user.getPassword().equals(password))
            {
                correctLogin = true;
                
                //login.setVisible(false);
                
                switch(user.getiD().charAt(0))
                {
                    case 'A':
                        adminView = new AdminView();
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
}
