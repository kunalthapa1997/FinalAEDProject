/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Sens;

/**
 *
 * @author swati
 */
public class ManHSeek extends javax.swing.JPanel {

    /**
     * Creates new form ManHSeek
     */
    public ManHSeek() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getAlertFromHH = new javax.swing.JLabel();
        manageVitalSignJBtn = new javax.swing.JButton();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        helpSeekerName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        viewVitalSignHistory = new javax.swing.JButton();
        SendVitalDataToDoctorBtn = new javax.swing.JButton();
        viewVitalSignInfo = new javax.swing.JButton();

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Manage Help Seeker Profile ");

        manageVitalSignJBtn.setText("Manage Vital Signs");
        manageVitalSignJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignJBtnActionPerformed(evt);
            }
        });

        viewAndUpdateProfileBtn.setText("View / Update Profile");
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });

        helpSeekerName.setText("Help Seeker Name");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewVitalSignHistory.setText("View Vital Sign History");
        viewVitalSignHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignHistoryActionPerformed(evt);
            }
        });

        SendVitalDataToDoctorBtn.setText("Send Vital Info To Doctor");
        SendVitalDataToDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendVitalDataToDoctorBtnActionPerformed(evt);
            }
        });

        viewVitalSignInfo.setText("View Vital Sign Info");
        viewVitalSignInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignInfoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(180, 180, 180)
                        .add(getAlertFromHH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(helpSeekerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(303, 303, 303)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(viewAndUpdateProfileBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(manageVitalSignJBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(303, 303, 303)
                            .add(viewVitalSignHistory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .addContainerGap()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(SendVitalDataToDoctorBtn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .add(viewVitalSignInfo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(73, 73, 73)
                        .add(backJButton)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(getAlertFromHH)
                    .add(helpSeekerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(66, 66, 66)
                .add(viewAndUpdateProfileBtn)
                .add(18, 18, 18)
                .add(manageVitalSignJBtn)
                .add(18, 18, 18)
                .add(viewVitalSignHistory)
                .add(18, 18, 18)
                .add(SendVitalDataToDoctorBtn)
                .add(18, 18, 18)
                .add(viewVitalSignInfo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(backJButton)
                .add(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVitalSignJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignJBtnActionPerformed
        ManageVitalSignJPanel manageVitalSignJPanel = new ManageVitalSignJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVitalSignJPanel", manageVitalSignJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignJBtnActionPerformed

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
        UpdateHelpSeekerProfile viewVolunteerProfile = new UpdateHelpSeekerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewVitalSignHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignHistoryActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ViewVitalSignHistoryJPanel viewVitalSignHistoryJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVitalSignHistoryJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignHistoryActionPerformed

    private void SendVitalDataToDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendVitalDataToDoctorBtnActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SendVitalSignDataToDoctorPanel sendVitalSignDataToDoctorPanel = new SendVitalSignDataToDoctorPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendVitalSignDataToDoctorPanel", sendVitalSignDataToDoctorPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SendVitalDataToDoctorBtnActionPerformed

    private void viewVitalSignInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignInfoActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ViewVitalSignInfoJPanel viewVitalSignInfoJPanel = new ViewVitalSignInfoJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVitalSignInfoJPanel", viewVitalSignInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendVitalDataToDoctorBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JLabel helpSeekerName;
    private javax.swing.JButton manageVitalSignJBtn;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    private javax.swing.JButton viewVitalSignHistory;
    private javax.swing.JButton viewVitalSignInfo;
    // End of variables declaration//GEN-END:variables
}
