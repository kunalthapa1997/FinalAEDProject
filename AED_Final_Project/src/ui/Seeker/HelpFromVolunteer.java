/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seeker;

import backend.ConfSetup;
import backend.enterprises.Enterprises;
import backend.account.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class HelpFromVolunteer extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAcc userAccount; 
    private ConfSetup ecoSystem;
    private Enterprises enterprise;
    
    /**
     * Creates new form ManageHelpFromVolunteer
     */
    public HelpFromVolunteer(JPanel userProcessContainer, UserAcc userAccount, ConfSetup ecoSystem, Enterprises enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(200, 162, 200);
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

        getHelpFromVolunteerBtn = new javax.swing.JButton();
        SearchForVolunteer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        viewHelpHistoryBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        getHelpFromVolunteerBtn.setText("Service from a Volunteer");
        getHelpFromVolunteerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHelpFromVolunteerBtnActionPerformed(evt);
            }
        });

        SearchForVolunteer.setText("Find Volunteer to avail Service");
        SearchForVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchForVolunteerActionPerformed(evt);
            }
        });

        jLabel1.setText("If you would like to get help from a specific volunteer.");

        jLabel2.setText("If you would like to get help from an anonymous volunteer.");

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Manage Volunteer Services");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        viewHelpHistoryBtn.setText("Service Request History");
        viewHelpHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHelpHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(backJButton1)
                        .addGap(422, 422, 422)))
                .addGap(0, 440, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(SearchForVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(getHelpFromVolunteerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(viewHelpHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(manageEnt)
                .addGap(53, 53, 53)
                .addComponent(SearchForVolunteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(getHelpFromVolunteerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(viewHelpHistoryBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(backJButton1)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getHelpFromVolunteerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHelpFromVolunteerBtnActionPerformed
        HelpByVolunteerPanel getHelpFromVolunteerJPanel = new HelpByVolunteerPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("GetHelpFromVolunteerJPanel", getHelpFromVolunteerJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_getHelpFromVolunteerBtnActionPerformed

    private void SearchForVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchForVolunteerActionPerformed
        FindVolunteerPanel searchForVolunteerJPanel = new FindVolunteerPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SearchForVolunteerJPanel", searchForVolunteerJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SearchForVolunteerActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void viewHelpHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHelpHistoryBtnActionPerformed
        HelpRequestHistory viewHelpRequestHistory = new HelpRequestHistory(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewHelpRequestHistory", viewHelpRequestHistory);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewHelpHistoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchForVolunteer;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton getHelpFromVolunteerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton viewHelpHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
