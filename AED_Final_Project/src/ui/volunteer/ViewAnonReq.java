/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.volunteer;

/**
 *
 * @author swati
 */
public class ViewAnonReq extends javax.swing.JPanel {

    /**
     * Creates new form ViewAnonReq
     */
    public ViewAnonReq() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        anonymousHelpReqTable = new javax.swing.JTable();
        viewHelpSeekerBtn = new javax.swing.JButton();
        processHelpRquestJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        manageEnt1 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        anonymousHelpReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Help Needed", "Help Seeker Name", "Reciever", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(anonymousHelpReqTable);

        viewHelpSeekerBtn.setText("View Requestor Profile");
        viewHelpSeekerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHelpSeekerBtnActionPerformed(evt);
            }
        });

        processHelpRquestJButton.setText("Process");
        processHelpRquestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processHelpRquestJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Heart Help");

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Help Requests");

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(viewHelpSeekerBtn)
                        .add(47, 47, 47)
                        .add(assignJButton)
                        .add(37, 37, 37)
                        .add(processHelpRquestJButton))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(300, 300, 300)
                            .add(manageEnt1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(48, 48, 48)
                            .add(manageEnt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(209, 209, 209)
                            .add(refreshJButton))
                        .add(layout.createSequentialGroup()
                            .add(48, 48, 48)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(backJButton)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 496, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(manageEnt1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(manageEnt)
                    .add(refreshJButton))
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(processHelpRquestJButton)
                    .add(assignJButton)
                    .add(viewHelpSeekerBtn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(backJButton)
                .add(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewHelpSeekerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHelpSeekerBtnActionPerformed
        int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);
        UserAccount ua = request.getSender();

        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, ua);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewHelpSeekerBtnActionPerformed

    private void processHelpRquestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processHelpRquestJButtonActionPerformed

        int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedHelpWorkRequest request = (NeedHelpWorkRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);

        if(request.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(request.getStatus().equalsIgnoreCase("Completed"))
        {
            JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getStatus().equalsIgnoreCase("Processing") ||  request.getStatus().equalsIgnoreCase("Pending"))
        {
            if(request.getReceiver()!=userAccount)
            {
                JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        request.setStatus("Processing");

        ProcessAnonymousHelpReqPanel processAnonymousHelpReqPanel = new ProcessAnonymousHelpReqPanel(userProcessContainer, request, userAccount, directory);
        userProcessContainer.add("ProcessAnonymousHelpReqPanel", processAnonymousHelpReqPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processHelpRquestJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateAnonymousHelpRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
            JOptionPane.showMessageDialog(null, "Request has been processed by Other Volunteers!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateAnonymousHelpRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable anonymousHelpReqTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JButton processHelpRquestJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewHelpSeekerBtn;
    // End of variables declaration//GEN-END:variables
}