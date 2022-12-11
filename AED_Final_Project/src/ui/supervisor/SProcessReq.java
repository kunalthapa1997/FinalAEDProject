/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supervisor;

/**
 *
 * @author swati
 */
public class SProcessReq extends javax.swing.JPanel {

    /**
     * Creates new form SProcessReq
     */
    public SProcessReq() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        commentsJTextField = new javax.swing.JTextField();
        assignNetworkCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        backJButton.setForeground(new java.awt.Color(0, 51, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setForeground(new java.awt.Color(255, 0, 0));
        submitJButton.setText("Submit ");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Request Result");

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 0));
        jLabel7.setText("Process Work Request:");

        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Add comments: ");

        assignNetworkCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        assignNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignNetworkComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Assign Location");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(99, 99, 99)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel1)
                                        .add(120, 120, 120))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(56, 56, 56)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(assignNetworkCombo, 0, 163, Short.MAX_VALUE)
                                    .add(commentsJTextField)
                                    .add(resultComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .add(layout.createSequentialGroup()
                        .add(64, 64, 64)
                        .add(backJButton))
                    .add(layout.createSequentialGroup()
                        .add(232, 232, 232)
                        .add(submitJButton)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabel7)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, resultComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(commentsJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(assignNetworkCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(44, 44, 44)
                .add(submitJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(backJButton)
                .add(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupervisorWorkAreaJPanel supervisorWorkAreaJPanel = (SupervisorWorkAreaJPanel) component;
        supervisorWorkAreaJPanel.populateWorkRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultComboBox.getSelectedIndex()<0 || commentsJTextField.getText().trim().isEmpty() ||
            assignNetworkCombo.getSelectedIndex()<1)
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
           
        }
        Network net = (Network)assignNetworkCombo.getSelectedItem();

        if((request.getSender().getRole().toString()).equalsIgnoreCase("VolunteerRole"))
        {
            

            
            volunteer.setLongitude(longlat[0]);
            volunteer.setLatitiude(longlat[1]);
        }

        request.setStatus(SupervisorWorkRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        request.setTestResult((String)resultComboBox.getSelectedItem());
        request.setComments(commentsJTextField.getText());
        request.getSender().setNetwork(net);

        if(request.getTestResult().equals(SupervisorWorkRequest.REQUEST_APPROVED))
        {
            request.getSender().setEnabled(true);

            String emailId = request.getSender().getPerson().getEmailId();
            String userName = request.getSender().getUserName();
            String password = request.getSender().getPassword();

            StringBuilder emailMsgTxt = new StringBuilder();
            emailMsgTxt.append("Your account is enabled. Please find username and password");
            emailMsgTxt.append(System.lineSeparator());
            emailMsgTxt.append("username : ".concat(userName));
            emailMsgTxt.append(System.lineSeparator());
            emailMsgTxt.append("password : ".concat(password));
            emailMsgTxt.append(System.lineSeparator());
            emailMsgTxt.append(System.lineSeparator());
            emailMsgTxt.append("Thank You");
            

            boolean emailSent = SendEmailAndTextMessage.sendEmail(emailMsgTxt.toString(),emailId,userName, password);
            if(!emailSent)
            {
                JOptionPane.showMessageDialog(null, "Unable to send email,Please Try again! ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        //messaage display
        JOptionPane.showMessageDialog(null, "Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);
        commentsJTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void assignNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignNetworkComboActionPerformed

    }//GEN-LAST:event_assignNetworkComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox assignNetworkCombo;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField commentsJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox resultComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
