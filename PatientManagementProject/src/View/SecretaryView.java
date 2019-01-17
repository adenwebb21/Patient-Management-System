/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Users.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author awebb4
 */
public class SecretaryView extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private ArrayList<User> unverifiedUsers = new ArrayList();
    private Controller thisController;
    /**
     * Creates new form SecretaryView
     * @param controller
     */
    public SecretaryView(Controller controller) {
        initComponents();
        thisController = controller;
        
        setUpTable();
    }
    
    /**
     *
     */
    public void setUpTable()
    {
        String col[] = {"ID","First Name","Last Name"};
        tableModel = new DefaultTableModel(col, 0);
        
        tbl_unverifiedUsers.setModel(tableModel);
        
        unverifiedUsers = thisController.getAllUnverified();
        
        // swap out get all doctors with get all unverified
        //then populate table with that data
        // remember to update on button click
        // also needs the return all methoid in the user manager
        
        for(User user : unverifiedUsers)
        {
            Object[] objs = {user.getiD(), user.getGivenName(), user.getSurName()};
            System.out.println(user.getiD() + user.getGivenName() + user.getSurName());
            tableModel.addRow(objs);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_unverifiedUsers = new javax.swing.JTable();
        btn_logOut = new javax.swing.JButton();
        lbl_loginTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_userToRemove = new javax.swing.JTextField();
        btn_authenticateUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_requestedAppointments = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_patientForAppointment = new javax.swing.JTextField();
        txt_doctorForAppointment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_dateForAppointment = new javax.swing.JTextField();
        btn_createAppointment = new javax.swing.JButton();
        btn_logOut1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_unverifiedUsers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_unverifiedUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_unverifiedUsers);

        btn_logOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_logOut.setText("Log Out");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });

        lbl_loginTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_loginTitle.setText("Secretary");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter ID to authenticate");

        txt_userToRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_userToRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userToRemoveActionPerformed(evt);
            }
        });

        btn_authenticateUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_authenticateUser.setText("Authenticate");
        btn_authenticateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authenticateUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_loginTitle)
                    .addComponent(jLabel3)
                    .addComponent(txt_userToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_authenticateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_loginTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_userToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_authenticateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Approve Pending Patients", jPanel1);

        tbl_requestedAppointments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_requestedAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Doctor ID", "Proposed Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_requestedAppointments);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enter patient ID");

        txt_patientForAppointment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_patientForAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patientForAppointmentActionPerformed(evt);
            }
        });

        txt_doctorForAppointment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_doctorForAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_doctorForAppointmentActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Enter doctor ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Enter date");

        txt_dateForAppointment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_dateForAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateForAppointmentActionPerformed(evt);
            }
        });

        btn_createAppointment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_createAppointment.setText("Create Appointment");
        btn_createAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createAppointmentActionPerformed(evt);
            }
        });

        btn_logOut1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_logOut1.setText("Log Out");
        btn_logOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOut1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Requested Appointments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_patientForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_doctorForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dateForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_patientForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_doctorForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dateForAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_createAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btn_logOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Appointments", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_authenticateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authenticateUserActionPerformed
        // TODO add your handling code here:
        String iDToValidate = txt_userToRemove.getText();
        
        if(thisController.validatePatient(iDToValidate))
        {
            setUpTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Patient does not exist in this list", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_authenticateUserActionPerformed

    private void txt_userToRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userToRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userToRemoveActionPerformed

    private void txt_patientForAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientForAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientForAppointmentActionPerformed

    private void txt_doctorForAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_doctorForAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_doctorForAppointmentActionPerformed

    private void txt_dateForAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateForAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateForAppointmentActionPerformed

    private void btn_createAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createAppointmentActionPerformed

    private void btn_logOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOut1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logOut1ActionPerformed

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
//            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SecretaryView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_authenticateUser;
    private javax.swing.JButton btn_createAppointment;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JButton btn_logOut1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JTable tbl_requestedAppointments;
    private javax.swing.JTable tbl_unverifiedUsers;
    private javax.swing.JTextField txt_dateForAppointment;
    private javax.swing.JTextField txt_doctorForAppointment;
    private javax.swing.JTextField txt_patientForAppointment;
    private javax.swing.JTextField txt_userToRemove;
    // End of variables declaration//GEN-END:variables
}
