/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import controllers.OrderManager;
import controllers.UserManager;
import static controllers.UserManager.activeUser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author oscar neiva
 */
public class ProfileScene extends javax.swing.JPanel {
    UserManager userManager;
    OrderManager orderManager;
    
    /**
     * Creates new form ProfileScene
     */
    
    public ProfileScene(){
        initComponents();
        loadUserData();
        
        userManager = new UserManager();
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
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        orderList = new java.awt.List();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        readButton = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setPreferredSize(new java.awt.Dimension(960, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Space Express");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 46));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 316));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 18, 368, 56));

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(100, 100, 100));
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 80, 368, 56));

        pictureLabel.setText("jLabel2");
        pictureLabel.setToolTipText("");
        jPanel2.add(pictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 18, 120, 118));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 78, 56));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 78, 56));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 610, 147));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 316));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 316));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(orderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 588, 139));

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel3.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 159, -1, -1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 159, -1, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 159, -1, -1));

        readButton.setText("Read");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });
        jPanel3.add(readButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 159, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 610, 190));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void loadUserData(){
        nameLabel.setText(activeUser.getName());
        emailLabel.setText(activeUser.getEmail());
    }
    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        orderManager = new OrderManager();
        try {
            orderManager.loadAllOrders();
            //orderList.add(orderManager.loadAllOrders());
        } catch (IOException ex) {
            Logger.getLogger(ProfileScene.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_readButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private java.awt.List orderList;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton readButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
