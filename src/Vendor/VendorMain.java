package Vendor;

import LoginRegistration.LoginPage;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VendorMain extends javax.swing.JFrame {

   
    public VendorMain() {
        initComponents();
        MakeUI();
    }

    
   private void MakeUI() {
    customizeButton(jButtonDashboard);
    customizeButton(jButtonAccounts);
    customizeButton(jButtonNotifications);
    customizeButton(jButtonWallet);
    customizeButton(jButtonReceipts);
    customizeButton(jButtonEditProfile);
    customizeButton(jButtonLogout);

    // Set Dashboard button to dark blue color on startup
    jButtonDashboard.setBackground(new Color(0, 51, 102));

    
}

private void customizeButton(JButton button) {
    button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    button.setIconTextGap(10); //gap 
    makeButtonTransparent(button);
    
    
    // Add mouse listener for hover effect
    button.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (!button.getBackground().equals(new Color(0, 51, 102))) {
                button.setBackground(new Color(41, 122, 204)); // Apply hover effect
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (!button.getBackground().equals(new Color(0, 51, 102))) {
                button.setBackground(new Color(51, 153, 255)); // Revert to original color
            }
        }
    });
    
}


private void makeButtonTransparent(JButton button) {
    button.setContentAreaFilled(false);
    button.setBorderPainted(false);
    button.setOpaque(true);
}


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jButtonDashboard = new javax.swing.JButton();
        jButtonAccounts = new javax.swing.JButton();
        jButtonNotifications = new javax.swing.JButton();
        jButtonWallet = new javax.swing.JButton();
        jButtonReceipts = new javax.swing.JButton();
        jButtonEditProfile = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jPanelSCREEN = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendor Page");

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user 45px.png"))); // NOI18N

        jLabelEmail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmail.setText("username@email.com");

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Vendor Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmail))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jButtonDashboard.setBackground(new java.awt.Color(51, 153, 255));
        jButtonDashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDashboard.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard.png"))); // NOI18N
        jButtonDashboard.setText("Dashboard");
        jButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashboardActionPerformed(evt);
            }
        });

        jButtonAccounts.setBackground(new java.awt.Color(51, 153, 255));
        jButtonAccounts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAccounts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/profile-user.png"))); // NOI18N
        jButtonAccounts.setText("Accounts");
        jButtonAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountsActionPerformed(evt);
            }
        });

        jButtonNotifications.setBackground(new java.awt.Color(51, 153, 255));
        jButtonNotifications.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNotifications.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotifications.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/notification white.png"))); // NOI18N
        jButtonNotifications.setText("Send Notifications");
        jButtonNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotificationsActionPerformed(evt);
            }
        });

        jButtonWallet.setBackground(new java.awt.Color(51, 153, 255));
        jButtonWallet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonWallet.setForeground(new java.awt.Color(255, 255, 255));
        jButtonWallet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallet-filled-money-tool white.png"))); // NOI18N
        jButtonWallet.setText("Top-Up Wallet");
        jButtonWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWalletActionPerformed(evt);
            }
        });

        jButtonReceipts.setBackground(new java.awt.Color(51, 153, 255));
        jButtonReceipts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonReceipts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReceipts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/invoice white.png"))); // NOI18N
        jButtonReceipts.setText("Generate Receipts");
        jButtonReceipts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiptsActionPerformed(evt);
            }
        });

        jButtonEditProfile.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEditProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editing.png"))); // NOI18N
        jButtonEditProfile.setText("Edit Profile");
        jButtonEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditProfileActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(51, 153, 255));
        jButtonLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout white.png"))); // NOI18N
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNotifications, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonWallet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReceipts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButtonDashboard)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccounts)
                .addGap(18, 18, 18)
                .addComponent(jButtonNotifications)
                .addGap(18, 18, 18)
                .addComponent(jButtonWallet)
                .addGap(18, 18, 18)
                .addComponent(jButtonReceipts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jButtonEditProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLogout)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanelSCREENLayout = new javax.swing.GroupLayout(jPanelSCREEN);
        jPanelSCREEN.setLayout(jPanelSCREENLayout);
        jPanelSCREENLayout.setHorizontalGroup(
            jPanelSCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanelSCREENLayout.setVerticalGroup(
            jPanelSCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSCREEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSCREEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashboardActionPerformed
        // UI Design
        setDarkBackground(jButtonDashboard);
        resetButtonColorsExcept(jButtonDashboard);
        
        // BackEnd
        
    }//GEN-LAST:event_jButtonDashboardActionPerformed

    private void jButtonAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountsActionPerformed
        // UI Design
        setDarkBackground(jButtonAccounts);
        resetButtonColorsExcept(jButtonAccounts);
        
        // BackEnd
    }//GEN-LAST:event_jButtonAccountsActionPerformed

    private void jButtonNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotificationsActionPerformed
        // UI Design
        setDarkBackground(jButtonNotifications);
        resetButtonColorsExcept(jButtonNotifications);
        
        // BackEnd
    }//GEN-LAST:event_jButtonNotificationsActionPerformed

    private void jButtonWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWalletActionPerformed
        // UI Design
        setDarkBackground(jButtonWallet);
        resetButtonColorsExcept(jButtonWallet);
        
        // BackEnd
    }//GEN-LAST:event_jButtonWalletActionPerformed

    private void jButtonReceiptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiptsActionPerformed
        // UI Design
        setDarkBackground(jButtonReceipts);
        resetButtonColorsExcept(jButtonReceipts);
        
        // BackEnd
    }//GEN-LAST:event_jButtonReceiptsActionPerformed

    private void jButtonEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditProfileActionPerformed
        // UI Design
        setDarkBackground(jButtonEditProfile);
        resetButtonColorsExcept(jButtonEditProfile);
        
        // BackEnd
    }//GEN-LAST:event_jButtonEditProfileActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        dispose();
    }
    
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    
    private void setDarkBackground(JButton button) {
    button.setBackground(new Color(0, 51, 102)); // Set to dark blue
}

private void resetButtonColorsExcept(JButton selectedButton) {
    JButton[] buttons = {jButtonDashboard, jButtonAccounts, jButtonNotifications, jButtonWallet, jButtonReceipts, jButtonEditProfile};
    for (JButton button : buttons) {
        if (button != selectedButton) {
            button.setBackground(new Color(51, 153, 255)); // Set to original blue
        }
    }
}
    
    
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
            java.util.logging.Logger.getLogger(VendorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccounts;
    private javax.swing.JButton jButtonDashboard;
    private javax.swing.JButton jButtonEditProfile;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonNotifications;
    private javax.swing.JButton jButtonReceipts;
    private javax.swing.JButton jButtonWallet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelSCREEN;
    // End of variables declaration//GEN-END:variables
}
