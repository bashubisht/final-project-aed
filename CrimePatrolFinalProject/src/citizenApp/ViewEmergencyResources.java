package citizenApp;

import PoliceDepartment.Case;
import PoliceDepartment.Precinct;
import crimepatrolfinalproject.*;
import java.sql.SQLException;
import java.util.Date;
import utilPackage.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Location;
import model.Police;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

public class ViewEmergencyResources extends javax.swing.JFrame {

    private final Set<MyWaypoint> waypoints = new HashSet<>();
    private EventWaypoint event;

    public ViewEmergencyResources() throws InstantiationException, SQLException {
        initComponents();
        init();
        List<Precinct> objList = Helper.getResultSet(Precinct.class, "precinct");
        
        for(Precinct i : objList){
            
            Integer id = i.getPrecinctId();
            int loc_id = i.getLocation();
            
            Location loc = Helper.fetchLocation(loc_id);
            if (loc != null) {

                double longitude = loc.getLongtude();
                double latitude = loc.getLatitude();
                DefaultTableModel tblModel = (DefaultTableModel)jPoliceTable.getModel();
                Object[] obj = {id,"test"};
                tblModel.addRow(obj);



            }
            
        
            
            
        
        }
        
        
    }

    private void init() {
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(42.33540789772934, -71.08937850228882);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(12);

        //  Create event mouse move
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
        event = getEvent();
    }

    private void addWaypoint(MyWaypoint waypoint) {
        for (MyWaypoint d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.add(waypoint);
        initWaypoint();
    }

    private void initWaypoint() {
        WaypointPainter<MyWaypoint> wp = new WaypointRender();
        wp.setWaypoints(waypoints);
        jXMapViewer.setOverlayPainter(wp);
        for (MyWaypoint d : waypoints) {
            jXMapViewer.add(d.getButton());
        }
    }

    private void clearWaypoint() {
        for (MyWaypoint d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.clear();
        initWaypoint();
    }

    private EventWaypoint getEvent() {
        return new EventWaypoint() {
            @Override
            public void selected(MyWaypoint waypoint) {
                JOptionPane.showMessageDialog(ViewEmergencyResources.this, waypoint.getName());
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        comboMapType = new javax.swing.JComboBox<>();
        cmdAdd = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPoliceTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual Earth", "Hybrid", "Satellite" }));
        comboMapType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMapTypeActionPerformed(evt);
            }
        });

        cmdAdd.setText("Add Waypoint");
        cmdAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdAddMouseClicked(evt);
            }
        });
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear Waypoint");
        cmdClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdClearMouseClicked(evt);
            }
        });
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewer.setLayout(jXMapViewerLayout);
        jXMapViewerLayout.setHorizontalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAdd)
                    .addComponent(cmdClear))
                .addContainerGap(574, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("View Emergency  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Resources");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 50, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 107, -1, 136));

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fire Precinct ID", "FireStation Name"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 288, -1, 136));

        jPoliceTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPoliceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Precinct ID", "Station Name"
            }
        ));
        jPoliceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPoliceTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jPoliceTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 464, -1, 136));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/Home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jXMapViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jXMapViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMapTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMapTypeActionPerformed
        TileFactoryInfo info;
        int index = comboMapType.getSelectedIndex();
        if (index == 0) {
            info = new OSMTileFactoryInfo();
        } else if (index == 1) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        } else if (index == 2) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        } else {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
    }//GEN-LAST:event_comboMapTypeActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        //addWaypoint(new MyWaypoint("Test 001", event, new GeoPosition(42.34726263455203, -71.0789384243692)));
        //addWaypoint(new MyWaypoint("Test 002", event, new GeoPosition(42.351417514198566, -71.06537717694252)));
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        clearWaypoint();
    }//GEN-LAST:event_cmdClearActionPerformed

    private void cmdAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdAddMouseClicked
        List<Precinct> objList=null;
        double latitude = 0.00 ;
        double longitude  = 0.00;

        
        try {
            objList = Helper.getResultSet(Precinct.class, "precinct");
        } catch (InstantiationException ex) {
            Logger.getLogger(ViewEmergencyResources.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Precinct i : objList){
            
            Integer id = i.getPrecinctId();
            int loc_id = i.getLocation();
            
            Location loc = null;
            try {
                loc = Helper.fetchLocation(loc_id);
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmergencyResources.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (loc != null) {

                 longitude = loc.getLongtude();
                 latitude = loc.getLatitude();
        
            }
        }
        System.out.println(longitude);
        System.out.println(latitude);
        addWaypoint(new MyWaypoint("Test", event, new GeoPosition(latitude, longitude)));
 //       addWaypoint(new MyWaypoint("New England Baptist Hospital", event, new GeoPosition(42.33108446415697, -71.10739075295284)));
//        addWaypoint(new MyWaypoint("New England Baptist Hospital", event, new GeoPosition(42.33108446415697, -71.10739075295284)));
//       addWaypoint(new MyWaypoint("Boston Children Hospital", event, new GeoPosition(42.335381966301945, -71.10874057514663)));
//       addWaypoint(new MyWaypoint("Tufts Medical Center", event, new GeoPosition(42.335381966301945, -71.07286335094186)));
    }//GEN-LAST:event_cmdAddMouseClicked

    private void cmdClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdClearMouseClicked
        // TODO add your handling code here:
        clearWaypoint();
    }//GEN-LAST:event_cmdClearMouseClicked

    private void jAddLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddLocationMouseClicked
        // TODO add your handling code here:
//   
        
        
    }//GEN-LAST:event_jAddLocationMouseClicked
    

    private void jAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddLocationActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        CitizenMenu cManagement = new CitizenMenu();
        cManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPoliceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPoliceTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jPoliceTable.getModel();
       
        double lat = 0.00 ;
        double longitude  = 0.00;
        int setLocation = Integer.parseInt(tblModel.getValueAt(jPoliceTable.getSelectedRow(), 0).toString());
        if(jPoliceTable.getSelectedRowCount() == 1){
            
            
                
            try {
                Integer dt = Integer.parseInt(tblModel.getValueAt(jPoliceTable.getSelectedRow(), 0).toString());
                Precinct pre = Helper.fetchPrecinct(dt);
                Location loc = Helper.fetchLocation(pre.getLocation());
                
                lat = loc.getLatitude();
                longitude = loc.getLongtude();
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmergencyResources.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        }   
                System.out.println(longitude);
                System.out.println(lat);

        
        addWaypoint(new MyWaypoint("Test 0999", event, new GeoPosition(lat, longitude)));
                
                
                
                
                
                
           
            
            
            
    }//GEN-LAST:event_jPoliceTableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewEmergencyResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmergencyResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmergencyResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmergencyResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewEmergencyResources().setVisible(true);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ViewEmergencyResources.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewEmergencyResources.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdClear;
    private javax.swing.JComboBox<String> comboMapType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jPoliceTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables
}
