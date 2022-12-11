/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MedicalDepartment;

import PoliceDepartment.Case;
import PoliceDepartment.CasePortal;
import PoliceDepartment.Precinct;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Hospital;
import model.Location;
import utilPackage.Helper;
import utilPackage.SendNotification;

/**
 *
 * @author bashu
 */
public class HospitalPortal extends javax.swing.JFrame {

    /**
     * Creates new form HospitalJFrame
     */
    public HospitalPortal() {
        initComponents();
        hospitalIdTextField.disable();
        try {
          
            List<Hospital> objList = Helper.getResultSet(Hospital.class, "hospital");
            
            for(Hospital i : objList){
                Integer iD = i.getHospitalId();
                String name = i.getName();
                Integer locationId = i.getLocationId();
                String email = i.getEmailId(); 
                Integer contactNum = i.getContactNum(); 
                DefaultTableModel tblModel = (DefaultTableModel)hospitalJTable.getModel();
                Object[] obj = {iD, name, locationId, email, contactNum};
                tblModel.addRow(obj);                   
            }
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CasePortal.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        hospitalNameTextField = new javax.swing.JTextField();
        jLocationId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEmailId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalJTable = new javax.swing.JTable();
        hospCreateBtn = new javax.swing.JButton();
        hospUpdateBtn = new javax.swing.JButton();
        hospDeleteBtn = new javax.swing.JButton();
        hospResetBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jContactNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hospitalIdTextField = new javax.swing.JTextField();
        homePageBtn = new javax.swing.JButton();
        manageDoctorsBtn = new javax.swing.JButton();
        manageEncountersBtn = new javax.swing.JButton();
        homePageBtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hospital Name");

        jLabel4.setText("Location ID");

        jLabel5.setText("Email");

        hospitalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital ID", "Hospital Name", "Location ID", "Email", "Contact Number"
            }
        ));
        hospitalJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitalJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitalJTable);

        hospCreateBtn.setText("CREATE");
        hospCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospCreateBtnActionPerformed(evt);
            }
        });

        hospUpdateBtn.setText("UPDATE");
        hospUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospUpdateBtnActionPerformed(evt);
            }
        });

        hospDeleteBtn.setText("DELETE");
        hospDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospDeleteBtnActionPerformed(evt);
            }
        });

        hospResetBtn.setText("RESET");
        hospResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospResetBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Contact Number");

        jLabel7.setText("Hospital Id");

        homePageBtn.setText("HOME");
        homePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageBtnActionPerformed(evt);
            }
        });

        manageDoctorsBtn.setText("MANAGE DOCTORS");
        manageDoctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDoctorsBtnActionPerformed(evt);
            }
        });

        manageEncountersBtn.setText("MANAGE ENCOUNTERS");
        manageEncountersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEncountersBtnActionPerformed(evt);
            }
        });

        homePageBtn1.setText("BACK");
        homePageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageBtn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hospital Management Portal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(69, 69, 69)
                        .addComponent(homePageBtn)
                        .addGap(18, 18, 18)
                        .addComponent(homePageBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospitalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(hospCreateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(hospUpdateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(hospDeleteBtn)
                                .addGap(18, 18, 18)
                                .addComponent(hospResetBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(manageDoctorsBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(manageEncountersBtn)
                        .addGap(100, 100, 100)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homePageBtn)
                            .addComponent(homePageBtn1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(hospitalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospCreateBtn)
                            .addComponent(hospUpdateBtn)
                            .addComponent(hospDeleteBtn)
                            .addComponent(hospResetBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEncountersBtn)
                            .addComponent(manageDoctorsBtn))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hospCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospCreateBtnActionPerformed
        // TODO add your handling code here:
        String hospitalName = hospitalNameTextField.getText();
        Integer locationId = Integer.parseInt(jLocationId.getText());
        String email = jEmailId.getText();
        Integer contactNum = Integer.parseInt(jContactNum.getText());
        Integer hospitalId = 0;
        try {
            hospitalId = Helper.getMaxId("hospital", "hospital_id", null);
        } catch (SQLException ex) {
            Logger.getLogger(CasePortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel tblModel = (DefaultTableModel)hospitalJTable.getModel();
        Object[] obj = {hospitalId, hospitalName, locationId, email, contactNum};
        tblModel.addRow(obj);
       
        Location loc = null;
        Hospital hospital = new Hospital(hospitalId, hospitalName, locationId, email, contactNum);
        hospital.addToHospitalTable(hospital);
        JOptionPane.showMessageDialog(this, "Hospital Saved Successfully!!!");
    }//GEN-LAST:event_hospCreateBtnActionPerformed

    private void hospitalJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalJTableMouseClicked
        // TODO add your handling code here:
              
        DefaultTableModel hospTableModel = (DefaultTableModel) hospitalJTable.getModel();
        
        if(hospitalJTable.getSelectedRowCount() == 1) {
            
            String tblHospId = hospTableModel.getValueAt( hospitalJTable.getSelectedRow(),0).toString();
            String tblHospName = hospTableModel.getValueAt( hospitalJTable.getSelectedRow(),1).toString();
            String tblHospLocationId = hospTableModel.getValueAt( hospitalJTable.getSelectedRow(),2).toString();
            String tblHospEmail = hospTableModel.getValueAt( hospitalJTable.getSelectedRow(),3).toString();
            String tblHospContact = hospTableModel.getValueAt( hospitalJTable.getSelectedRow(),4).toString();


            hospitalIdTextField.setText(tblHospId);
            hospitalNameTextField.setText(tblHospName);
            jLocationId.setText(tblHospLocationId);
            jEmailId.setText(tblHospEmail);
            jContactNum.setText(tblHospContact);
        }
        
        
    }//GEN-LAST:event_hospitalJTableMouseClicked

    private void hospUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospUpdateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)hospitalJTable.getModel();
        
        
        if (hospitalJTable.getSelectedRowCount() == 1){
            
            Integer hospitalId = Integer.valueOf(tblModel.getValueAt(hospitalJTable.getSelectedRow(), 0).toString()); 
            String hospitalName = hospitalNameTextField.getText(); 
            Integer loccationId = Integer.valueOf(jLocationId.getText()); 
            String email = jEmailId.getText();
            Integer contactNum = Integer.valueOf(jContactNum.getText()); 
            
           
            tblModel.setValueAt(hospitalName, hospitalJTable.getSelectedRow(), 1);
            tblModel.setValueAt(loccationId, hospitalJTable.getSelectedRow(), 2);
            tblModel.setValueAt(email, hospitalJTable.getSelectedRow(), 3);
            tblModel.setValueAt(contactNum, hospitalJTable.getSelectedRow(), 4);
            
            Map<String, String> mp = new HashMap<>();
            mp.put("name", String.valueOf(hospitalName));
            mp.put("locationid", String.valueOf(loccationId));
            mp.put("email", String.valueOf(email));
            mp.put("contactno", String.valueOf(contactNum));
            
            try {
                Helper.updateColumns("hospital", mp, "hospital_id = " + hospitalId);
            } 
            
            catch (SQLException ex) {
                System.out.println("Failed");
                Logger.getLogger(CasePortal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            tblModel.setRowCount(0);
            
            try {
          
            List<Hospital> objList = Helper.getResultSet(Hospital.class, "hospital");
            
            for(Hospital i : objList){
                Integer iD = i.getHospitalId();
                String name = i.getName();
                Integer locationId = i.getLocationId();
                String emailId = i.getEmailId(); 
                Integer contactNo = i.getContactNum(); 
                Object[] obj = {iD, name, locationId, emailId, contactNo};
                tblModel.addRow(obj);                   
            }
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CasePortal.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
    }//GEN-LAST:event_hospUpdateBtnActionPerformed

    private void hospDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospDeleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)hospitalJTable.getModel();
        if(hospitalJTable.getSelectedRowCount() == 1){
            
            Integer hospitalId = Integer.valueOf(tblModel.getValueAt(hospitalJTable.getSelectedRow(), 0).toString()); 
            tblModel.removeRow(hospitalJTable.getSelectedRow());
            
            Helper.insertDeleteData("delete from hospital where hospital_id = " + hospitalId);
            
          }
       
        
    }//GEN-LAST:event_hospDeleteBtnActionPerformed

    public void resetAllFields() {
        hospitalIdTextField.setText(null);
        hospitalNameTextField.setText(null);
        jLocationId.setText(null);
        jEmailId.setText(null);
        jContactNum.setText(null);
    }
    
    private void hospResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospResetBtnActionPerformed
        // TODO add your handling code here:
        resetAllFields();
    }//GEN-LAST:event_hospResetBtnActionPerformed

    private void homePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_homePageBtnActionPerformed

    private void manageDoctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDoctorsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageDoctorsBtnActionPerformed

    private void manageEncountersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEncountersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageEncountersBtnActionPerformed

    private void homePageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homePageBtn1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalPortal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homePageBtn;
    private javax.swing.JButton homePageBtn1;
    private javax.swing.JButton hospCreateBtn;
    private javax.swing.JButton hospDeleteBtn;
    private javax.swing.JButton hospResetBtn;
    private javax.swing.JButton hospUpdateBtn;
    private javax.swing.JTextField hospitalIdTextField;
    private javax.swing.JTable hospitalJTable;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JTextField jContactNum;
    private javax.swing.JTextField jEmailId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLocationId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageDoctorsBtn;
    private javax.swing.JButton manageEncountersBtn;
    // End of variables declaration//GEN-END:variables
}