/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author awebb4
 */
public class Login extends javax.swing.JFrame {

    private Controller thisController;
    
    /**
     * Creates new form Login
     * @param controller
     */
    public Login(Controller controller) {
        initComponents();
        thisController = controller;
    }
    
    /**
     *
     * @param actionListen
     */
    public void AddListener(ActionListener actionListen)
    {
        btn_login.addActionListener(actionListen);
    }
    
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        txt_userId = new javax.swing.JTextField();
        lbl_userId = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        lbl_loginTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_loginTitle1 = new javax.swing.JLabel();
        lbl_userId1 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        txt_lName = new javax.swing.JTextField();
        lbl_userId2 = new javax.swing.JLabel();
        lbl_userId3 = new javax.swing.JLabel();
        spn_age = new javax.swing.JSpinner();
        lbl_userId4 = new javax.swing.JLabel();
        txt_newPassword = new javax.swing.JTextField();
        lbl_userId5 = new javax.swing.JLabel();
        txt_sex = new javax.swing.JTextField();
        btn_registerNew = new javax.swing.JButton();
        lbl_newUserId = new javax.swing.JLabel();
        lbl_userId6 = new javax.swing.JLabel();
        txt_addressLineOne = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        lbl_userId7 = new javax.swing.JLabel();
        lbl_userId8 = new javax.swing.JLabel();
        txt_postCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        lbl_userId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId.setText("User ID");

        lbl_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_password.setText("Password");

        lbl_loginTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_loginTitle.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_loginTitle)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_userId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_userId, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_password)
                            .addGap(18, 18, 18)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_loginTitle)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userId))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_userId.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Login", jPanel1);

        lbl_loginTitle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_loginTitle1.setText("Register New User");

        lbl_userId1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId1.setText("First Name");

        lbl_userId2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId2.setText("Last Name");

        lbl_userId3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId3.setText("Age");

        lbl_userId4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId4.setText("Password");

        lbl_userId5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId5.setText("Sex");

        btn_registerNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registerNew.setText("Register");
        btn_registerNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerNewActionPerformed(evt);
            }
        });

        lbl_newUserId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_newUserId.setText("Your new user ID is - #####    Use this to log on and get verified.");

        lbl_userId6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId6.setText("Address Line 1");

        txt_addressLineOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressLineOneActionPerformed(evt);
            }
        });

        lbl_userId7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId7.setText("City");

        lbl_userId8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_userId8.setText("Postcode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_registerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(lbl_newUserId)
                        .addGap(350, 350, 350))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_loginTitle1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_userId1)
                                            .addComponent(lbl_userId2)
                                            .addComponent(lbl_userId3)
                                            .addComponent(lbl_userId5))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_fName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_lName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spn_age, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_userId4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_userId6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_userId7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_addressLineOne, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_userId8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_postCode, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_loginTitle1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_addressLineOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_userId6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_userId1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userId2)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userId7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_postCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_userId8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_userId3)
                        .addComponent(spn_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userId5))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userId4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_newUserId))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Register New", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerNewActionPerformed
        // TODO add your handling code here:   
        
        System.out.println(txt_addressLineOne.getText() + txt_city.getText() + txt_postCode.getText() + txt_fName.getText() + txt_lName.getText() + txt_sex.getText() + txt_newPassword.getText());
        
        if(txt_addressLineOne.getText().equals("") || txt_city.getText().equals("") || txt_postCode.getText().equals("") || txt_fName.getText().equals("") || txt_lName.getText().equals("") || txt_sex.getText().equals("") || txt_newPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            thisController.registerPatientButton(txt_addressLineOne.getText(), txt_city.getText(), txt_postCode.getText(), txt_fName.getText(), txt_lName.getText(), txt_sex.getText(), (int)spn_age.getValue(), txt_newPassword.getText());
            lbl_newUserId.setText("Your temporary ID is: " + thisController.getLastTempPatientiD() + "   Use this to log on and then get verified.");
        }
    }//GEN-LAST:event_btn_registerNewActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:      
        thisController.LogIn(txt_userId.getText(), txt_password.getText());
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_addressLineOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressLineOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressLineOneActionPerformed


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registerNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JLabel lbl_loginTitle1;
    private javax.swing.JLabel lbl_newUserId;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_userId;
    private javax.swing.JLabel lbl_userId1;
    private javax.swing.JLabel lbl_userId2;
    private javax.swing.JLabel lbl_userId3;
    private javax.swing.JLabel lbl_userId4;
    private javax.swing.JLabel lbl_userId5;
    private javax.swing.JLabel lbl_userId6;
    private javax.swing.JLabel lbl_userId7;
    private javax.swing.JLabel lbl_userId8;
    private javax.swing.JSpinner spn_age;
    private javax.swing.JTextField txt_addressLineOne;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_lName;
    private javax.swing.JTextField txt_newPassword;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_postCode;
    private javax.swing.JTextField txt_sex;
    private javax.swing.JTextField txt_userId;
    // End of variables declaration//GEN-END:variables
}
