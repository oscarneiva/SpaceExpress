/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import controllers.UserManager;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar neiva
 */
public class SignInScene extends javax.swing.JPanel {
    
    private SignUpScene signUpScene;
    private UserManager userManager;
    private ProfileScene profile;
    
    /**
     * Creates new form SignInScene
     */
    public SignInScene() {
        initComponents();
        signUpScene = null;
        
        try {
            userManager = new UserManager();
        } catch (IOException ex) {
            Logger.getLogger(SignInScene.class.getName()).log(Level.SEVERE, null, ex);
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

        confirmButton = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        emailTextField.setText("Email");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setText("Password");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Space Express Sign In");

        signUpButton.setText("SignUp");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordTextField))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(signUpButton))
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        if(userManager.readUser(emailTextField.getText(), passwordTextField.getText())){  
            // Create Profile Window
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    
                    try {
                        profile = new ProfileScene();
                    } catch (IOException ex) {
                        Logger.getLogger(SignInScene.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.getContentPane().add(profile);
                    frame.setResizable(false);
                    frame.setSize(1920, 1080);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            });
        }else{
            Component frame = null;
            JOptionPane.showMessageDialog(frame,"Access denied.");
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    signUpScene = new SignUpScene();
                } catch (IOException ex) {
                    Logger.getLogger(SignInScene.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                JFrame frame = new JFrame();
                frame.getContentPane().add(signUpScene);
                frame.setResizable(false);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_signUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}
