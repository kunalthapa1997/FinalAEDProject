/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Donor;


import backend.ConfSetup;
import backend.enterprises.Enterprises;
import backend.organizations.Organization;
import backend.account.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tejageetla
 */
public class DonorWorkPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ConfSetup ecoSystem;
    private Enterprises enterprise;
    private UserAcc userAccount;
    private Organization organization;
    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public DonorWorkPanel(JPanel userProcessContainer, UserAcc userAccount, Enterprises enterprise, Organization organization, ConfSetup ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageProfile = new javax.swing.JButton();
        donationHistory = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        viewDonationRequestsBtn = new javax.swing.JButton();
        donateMoneyBtn = new javax.swing.JButton();
        viewProfileBtn = new javax.swing.JButton();

        manageProfile.setText("Become a Donor");
        manageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProfileActionPerformed(evt);
            }
        });

        donationHistory.setText("View Donation History");
        donationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationHistoryActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Donor Operations");

        viewDonationRequestsBtn.setText("Display Donation Requests");
        viewDonationRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonationRequestsBtnActionPerformed(evt);
            }
        });

        donateMoneyBtn.setText("Donate Financially");
        donateMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateMoneyBtnActionPerformed(evt);
            }
        });

        viewProfileBtn.setText("View/Update Donor");
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(donationHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewDonationRequestsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donateMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(manageEnt)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDonationRequestsBtn)
                    .addComponent(manageProfile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donationHistory)
                    .addComponent(viewProfileBtn))
                .addGap(18, 18, 18)
                .addComponent(donateMoneyBtn)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProfileActionPerformed
        DonorProfilePanel createDonorProfile = new DonorProfilePanel(userProcessContainer, userAccount);
        userProcessContainer.add("CreateDonorProfile", createDonorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProfileActionPerformed

    private void donationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationHistoryActionPerformed
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Donations Recorded as of now","warning",JOptionPane.WARNING_MESSAGE);
           return;     
        }
        DonationHistory vdh = new DonationHistory(userProcessContainer, userAccount);
        userProcessContainer.add("ViewDonationHistory", vdh);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donationHistoryActionPerformed

    private void viewDonationRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonationRequestsBtnActionPerformed
        ViewDonationRequestPanel viewDonationRequestJPanel = new ViewDonationRequestPanel(userProcessContainer, userAccount, organization, ecoSystem);
        userProcessContainer.add("ViewDonationRequestJPanel", viewDonationRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDonationRequestsBtnActionPerformed

    private void donateMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateMoneyBtnActionPerformed
       DonationWorkPanel donationJPanelWorkArea = new DonationWorkPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("DonationWorkPanel", donationJPanelWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donateMoneyBtnActionPerformed

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
     
        MyProfile viewMyProfile = new MyProfile(userProcessContainer, userAccount);
        userProcessContainer.add("MyProfile", viewMyProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateMoneyBtn;
    private javax.swing.JButton donationHistory;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageProfile;
    private javax.swing.JButton viewDonationRequestsBtn;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables
}
