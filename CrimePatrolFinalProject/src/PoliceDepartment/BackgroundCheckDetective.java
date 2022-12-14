/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PoliceDepartment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Person;
import utilPackage.CurrentSession;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
public class BackgroundCheckDetective extends javax.swing.JFrame {

    /**
     * Creates new form BackgroundCheckDetective
     * @throws java.lang.InstantiationException
     */
    public BackgroundCheckDetective() throws InstantiationException {
        initComponents();
        try{
            
            List<Person> objList = Helper.getResultSet(Person.class, "person");
            
            for(Person i : objList){
                Integer iD = i.getId();
                String name = i.getName(); 
                String email = i.getEmail(); 
                Long phoneNo = i.getPhoneNo();
                
                DefaultTableModel tblModel = (DefaultTableModel)jPersonTable.getModel();
                Object[] obj = {iD, name, email, phoneNo};
                tblModel.addRow(obj);   
            }
                  
        }
        catch (InstantiationException ex) {
            Logger.getLogger(CasePortalDetective.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPersonTable = new javax.swing.JTable();
        jSearchOption = new javax.swing.JComboBox<>();
        jSearchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Citizen Id", "Name", "Email Id", "Phone No"
            }
        ));
        jPersonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPersonTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jPersonTable);

        jSearchOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Id", "Phone", "Email Id", " " }));
        jSearchOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchOptionActionPerformed(evt);
            }
        });

        jSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Background Check");

        jSearch.setText("SEARCH");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jButton1.setText("CHECK BACKGROUND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton.setText("Back");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSearchOption, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(0, 319, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchOptionActionPerformed

    private void jSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchFieldActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jPersonTable.getModel();
        String searchString = jSearchField.getText();
        String searchField = (String) jSearchOption.getSelectedItem();

        int tblHeaderIndex = 1;

        switch(searchField) {
            case "Citizen Id":
            tblHeaderIndex = 0;
            break;
            case "Name":
            tblHeaderIndex = 1;
            break;
            case "Email":
            tblHeaderIndex = 2;
            break;
            case "Phone No":
            tblHeaderIndex = 3;
            break;
            default:
            tblHeaderIndex = 0;
        }

        TableRowSorter<DefaultTableModel> tSorter = new TableRowSorter(tblModel);
        jPersonTable.setRowSorter(tSorter);
        tSorter.setRowFilter(RowFilter.regexFilter(searchString.trim(), tblHeaderIndex));
    }//GEN-LAST:event_jSearchActionPerformed

    private void jPersonTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPersonTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jPersonTable.getModel();
        
        Integer personId = Integer.parseInt(tblModel.getValueAt(jPersonTable.getSelectedRow(), 0).toString());
        CurrentSession.setQueryUser(personId);       
        
    }//GEN-LAST:event_jPersonTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CitizenStatusPortal obj = new CitizenStatusPortal(); 
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        
    }//GEN-LAST:event_jButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CaptainMenu obj = new CaptainMenu();
        obj.setVisible(true);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BackgroundCheckDetective.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackgroundCheckDetective.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackgroundCheckDetective.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackgroundCheckDetective.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BackgroundCheckDetective().setVisible(true);
                } catch (InstantiationException ex) {
                    Logger.getLogger(BackgroundCheckDetective.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jPersonTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JTextField jSearchField;
    private javax.swing.JComboBox<String> jSearchOption;
    // End of variables declaration//GEN-END:variables
}
