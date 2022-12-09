/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sensor;

/**
 *
 * @author keert
 */
public class sendVSdatatoDoc extends javax.swing.JPanel {

    /**
     * Creates new form sendVSdatatoDoc
     */
    public sendVSdatatoDoc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sendToDoctorPanel = new javax.swing.JLayeredPane();
        medications = new javax.swing.JLabel();
        sendToDoctNoRadio = new javax.swing.JRadioButton();
        sendToDoctorYesRad = new javax.swing.JRadioButton();
        doctorComboBx = new javax.swing.JComboBox();
        dctrNameLabel = new javax.swing.JLabel();
        sendDataTodctrBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentMedicationsTxtArea = new javax.swing.JTextArea();
        sendDataLabel = new javax.swing.JLabel();
        getAlertFromHH = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        sendToDoctorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        medications.setText("Enter Current Medications:");

        sendToDoctNoRadio.setText("No");
        sendToDoctNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToDoctNoRadioActionPerformed(evt);
            }
        });

        sendToDoctorYesRad.setText("Yes");
        sendToDoctorYesRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToDoctorYesRadActionPerformed(evt);
            }
        });

        doctorComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dctrNameLabel.setText("Please Select a doctor you wish to send data");

        sendDataTodctrBtn.setText("Send Vital Sign Data to Doctor");
        sendDataTodctrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDataTodctrBtnActionPerformed(evt);
            }
        });

        currentMedicationsTxtArea.setColumns(20);
        currentMedicationsTxtArea.setRows(5);
        jScrollPane1.setViewportView(currentMedicationsTxtArea);

        sendDataLabel.setText("Do you want to send data to Doctor");

        sendToDoctorPanel.setLayer(medications, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendToDoctNoRadio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendToDoctorYesRad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(doctorComboBx, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(dctrNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendDataTodctrBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendDataLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout sendToDoctorPanelLayout = new org.jdesktop.layout.GroupLayout(sendToDoctorPanel);
        sendToDoctorPanel.setLayout(sendToDoctorPanelLayout);
        sendToDoctorPanelLayout.setHorizontalGroup(
            sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sendToDoctorPanelLayout.createSequentialGroup()
                .add(81, 81, 81)
                .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(sendDataTodctrBtn)
                    .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(sendToDoctorPanelLayout.createSequentialGroup()
                            .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(sendDataLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(dctrNameLabel))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(doctorComboBx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 136, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(sendToDoctorPanelLayout.createSequentialGroup()
                                    .add(sendToDoctorYesRad)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(sendToDoctNoRadio))))
                        .add(sendToDoctorPanelLayout.createSequentialGroup()
                            .add(medications)
                            .add(29, 29, 29)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        sendToDoctorPanelLayout.setVerticalGroup(
            sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sendToDoctorPanelLayout.createSequentialGroup()
                .add(42, 42, 42)
                .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(sendDataLabel)
                    .add(sendToDoctorYesRad)
                    .add(sendToDoctNoRadio))
                .add(18, 18, 18)
                .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dctrNameLabel)
                    .add(doctorComboBx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(sendToDoctorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(medications)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40)
                .add(sendDataTodctrBtn)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Send Vital Sign Data to Doctor");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(262, 262, 262)
                        .add(getAlertFromHH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 384, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(153, 153, 153)
                        .add(sendToDoctorPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(67, 67, 67)
                        .add(backBtn)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(getAlertFromHH)
                .add(35, 35, 35)
                .add(sendToDoctorPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 72, Short.MAX_VALUE)
                .add(backBtn)
                .add(44, 44, 44))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 927, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 571, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendToDoctNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToDoctNoRadioActionPerformed
        doctorComboBx.setVisible(false);
        dctrNameLabel.setVisible(false);
        person.setSendDataToDoctor(false);
        medications.setVisible(false);
        currentMedicationsTxtArea.setVisible(false);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_sendToDoctNoRadioActionPerformed

    private void sendToDoctorYesRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToDoctorYesRadActionPerformed
        populateDoctorComboBx();
        doctorComboBx.setVisible(true);
        dctrNameLabel.setVisible(true);
        medications.setVisible(true);
        currentMedicationsTxtArea.setVisible(true);
        jScrollPane1.setVisible(true);
        person.setSendDataToDoctor(true);
    }//GEN-LAST:event_sendToDoctorYesRadActionPerformed

    private void sendDataTodctrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDataTodctrBtnActionPerformed

        try
        {
            if(sendToDoctorGroup.getSelection() == null)
            {
                JOptionPane.showMessageDialog(null, "Please Select a radio button to send vital Sign data to doctor ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(sendToDoctorYesRad.isSelected())
            {
                if(doctorComboBx.getSelectedIndex()<0 || currentMedicationsTxtArea.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter data in all fields ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(currentMedicationsTxtArea.getText().length()>100)
                {
                    JOptionPane.showMessageDialog(null, "Please enter characters less than 100 in medications Field ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                UserAccount docAccount = (UserAccount) doctorComboBx.getSelectedItem();
                String medicatnTxt = currentMedicationsTxtArea.getText().replaceAll("\n", " ");

                SendDataToDoctorWorkRequest sendDataToDoctorWorkRequest = new SendDataToDoctorWorkRequest();
                sendDataToDoctorWorkRequest.setMessage("Vital Sign Data");
                sendDataToDoctorWorkRequest.setSender(userAccount);
                sendDataToDoctorWorkRequest.setStatus("Sent");
                sendDataToDoctorWorkRequest.setMedication(medicatnTxt);
                sendDataToDoctorWorkRequest.setRequestDate(new Date());
                sendDataToDoctorWorkRequest.setReceiver(docAccount);

                docAccount.getWorkQueue().getWorkRequestList().add(sendDataToDoctorWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(sendDataToDoctorWorkRequest);
                JOptionPane.showMessageDialog(null, "Data has been sent successfully", "success", JOptionPane.PLAIN_MESSAGE);
                currentMedicationsTxtArea.setText("");
            }
            else if(sendToDoctNoRadio.isSelected())
            {
                person.setSendDataToDoctor(false);
                JOptionPane.showMessageDialog(null, "Thank You, Data will not be shared with doctor", "success", JOptionPane.PLAIN_MESSAGE);

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid data in all fields ","warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_sendDataTodctrBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea currentMedicationsTxtArea;
    private javax.swing.JLabel dctrNameLabel;
    private javax.swing.JComboBox doctorComboBx;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medications;
    private javax.swing.JLabel sendDataLabel;
    private javax.swing.JButton sendDataTodctrBtn;
    private javax.swing.JRadioButton sendToDoctNoRadio;
    private javax.swing.JLayeredPane sendToDoctorPanel;
    private javax.swing.JRadioButton sendToDoctorYesRad;
    // End of variables declaration//GEN-END:variables
}