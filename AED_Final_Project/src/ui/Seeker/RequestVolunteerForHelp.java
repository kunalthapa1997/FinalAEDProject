/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seeker;

import backend.ConfSetup;
import backend.shared.HelpRequired;
import backend.organizations.Volunteers;
import backend.people.Volunteer;
import backend.account.UserAcc;
import backend.tasks.HelpTask;
import backend.tasks.TaskRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunal
 */
public class RequestVolunteerForHelp extends javax.swing.JPanel {
    
    private Volunteer volunteer;
    private JPanel userProcessContainer;
    private UserAcc userAccount;
    private Volunteers organization;
    private ConfSetup ecoSystem;
    /**
     * Creates new form RequestVolunteerForHelp
     */
    public RequestVolunteerForHelp(JPanel userProcessContainer, UserAcc userAccount, Volunteer volunteer, Volunteers organization,ConfSetup ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.volunteer = volunteer;
        this.organization = (Volunteers)organization;
        this.ecoSystem = ecoSystem;
        
        populateNeedHelpListTable();
        otherHelpPanel.setVisible(false);
        
        populateVolunteerDetails();
       
        populateHelpHistoryTable();
        
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
    
    public void populateHelpHistoryTable()
    {
     DefaultTableModel dtm = (DefaultTableModel)workRequestHistoryTable.getModel();
        dtm.setRowCount(0);
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
     for(TaskRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
         if(workRequest.getMessage().equalsIgnoreCase("Need Help"))
         {
           Object[] rowData = new Object[5];
           rowData[0] = ((HelpTask)workRequest).getRequestId();
           rowData[1] = ((HelpTask)workRequest).getNeedHelp().getHelp();
           rowData[2] = dateFormat.format(workRequest.getRequestDate());
           rowData[3] = workRequest.getReceiver() == null ? null : workRequest.getReceiver().getUserName() ;
           rowData[4] = workRequest.getStatus();
           
           dtm.addRow(rowData);
         }
        }       
    }
    
    public void populateVolunteerDetails()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
                
        firstNameField.setText(volunteer.getFirstName());
        lastNameField.setText(volunteer.getLastName());
        dobField.setText(dateFormat.format(volunteer.getDob()));
        genderField.setText(volunteer.getGender());
    }
    
    public void populateNeedHelpListTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)helpjTable.getModel();
        dtm.setRowCount(0);
        
        for(HelpRequired nh : ecoSystem.getHelpList() )
        {

           Object[] rowData = new Object[4];
           rowData[0] = nh;
           rowData[1] = nh.getHelp();
           rowData[2] = nh.getServiceType();
           rowData[3] = nh.getNewHelp()== null ? null : nh.getNewHelp() ;
           dtm.addRow(rowData);
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

        manageEnt2 = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        createRequestButton = new javax.swing.JButton();
        manageEnt3 = new javax.swing.JLabel();
        manageEnt4 = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        firstName = new javax.swing.JLabel();
        viewYourProfile = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        otherHelpPanel = new javax.swing.JPanel();
        helpDetails = new javax.swing.JLabel();
        serviceTypeCombo = new javax.swing.JComboBox();
        helpDetailsTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        serviceType = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestHistoryTable = new javax.swing.JTable();
        manageEnt5 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        helpjTable = new javax.swing.JTable();
        newHelpRadioBtn = new javax.swing.JRadioButton();

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("StepOne App");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        manageEnt1.setText("Service not available in the Table:");

        createRequestButton.setText("Create Request");
        createRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequestButtonActionPerformed(evt);
            }
        });

        manageEnt3.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt3.setText("Services Availed History:");

        manageEnt4.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        manageEnt4.setText("Request New Service");

        LastName.setText("Last Name:");

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        gender.setText("Gender:");

        dobField.setEnabled(false);

        firstName.setText("First Name:");

        viewYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile.setText("Volunteer Details:");

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        dateOfBirth.setText("Date Of Birth ");

        genderField.setEnabled(false);

        helpDetails.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        helpDetails.setText(" Enter details about the help needed.");

        serviceTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select Amount", "5$", "10$", "15$", "20$" }));

        jLabel1.setText("Enter details of Service needed: ");

        serviceType.setText("Service Type");

        javax.swing.GroupLayout otherHelpPanelLayout = new javax.swing.GroupLayout(otherHelpPanel);
        otherHelpPanel.setLayout(otherHelpPanelLayout);
        otherHelpPanelLayout.setHorizontalGroup(
            otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherHelpPanelLayout.createSequentialGroup()
                .addGroup(otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherHelpPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serviceTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpDetailsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(helpDetails))
                .addContainerGap())
        );
        otherHelpPanelLayout.setVerticalGroup(
            otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherHelpPanelLayout.createSequentialGroup()
                .addComponent(helpDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(helpDetailsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(otherHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceType))
                .addContainerGap())
        );

        workRequestHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service ID", "Service Recieved", "Requested Date", "Volunteer ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestHistoryTable);

        manageEnt5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt5.setText("Request Volunteer Service:");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        helpjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service ID", "Service Needed", "Service Type", "Service Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(helpjTable);

        newHelpRadioBtn.setText("New Help");
        newHelpRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHelpRadioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageEnt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newHelpRadioBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherHelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(createRequestButton))
                    .addComponent(backJButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateOfBirth)
                                            .addComponent(LastName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gender)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(genderField)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewYourProfile)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(manageEnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(666, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt2)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageEnt1)
                            .addComponent(manageEnt4)
                            .addComponent(manageEnt3)
                            .addComponent(newHelpRadioBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewYourProfile)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastName)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfBirth)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otherHelpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(createRequestButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(backJButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(manageEnt5)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequestButtonActionPerformed
    
        HelpRequired needHelp;
      
        if(newHelpRadioBtn.isSelected())
        {
            
        if(helpDetailsTxtField.getText().trim().isEmpty() || serviceTypeCombo.getSelectedIndex() <0)
        {
       JOptionPane.showMessageDialog(this, "Please Enter data in all the fields ", "warning", JOptionPane.PLAIN_MESSAGE);
         return;      
        }
        needHelp = ecoSystem.addNeedHelp();
        needHelp.setHelp("Others");
        needHelp.setNewHelp(helpDetailsTxtField.getText());
        needHelp.setServiceType((String)serviceTypeCombo.getSelectedItem());
       }
         else
         {
        int selectedRow = helpjTable.getSelectedRow();
        if(selectedRow<0)
        {
        JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
         return;    
        }
        
        needHelp = (HelpRequired)helpjTable.getValueAt(selectedRow, 0);
         }
       
        SaveHelpRequestPanel submitHelpRequestJPanel = new SaveHelpRequestPanel(userProcessContainer, userAccount,volunteer, needHelp, organization);
        userProcessContainer.add("SubmitHelpRequestJPanel", submitHelpRequestJPanel);
        newHelpRadioBtn.setSelected(false);
        helpDetailsTxtField.setText("");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_createRequestButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void newHelpRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHelpRadioBtnActionPerformed
        populateComboBxHelpType();
        otherHelpPanel.setVisible(true);
    }//GEN-LAST:event_newHelpRadioBtnActionPerformed
    
    public void populateComboBxHelpType()
    {
      serviceTypeCombo.removeAllItems();
      serviceTypeCombo.addItem("Immediate");
      serviceTypeCombo.addItem("Need in a day");
      serviceTypeCombo.addItem("Not Immediate service");
      serviceTypeCombo.addItem("In a Week");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton createRequestButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel helpDetails;
    private javax.swing.JTextField helpDetailsTxtField;
    private javax.swing.JTable helpjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel manageEnt3;
    private javax.swing.JLabel manageEnt4;
    private javax.swing.JLabel manageEnt5;
    private javax.swing.JRadioButton newHelpRadioBtn;
    private javax.swing.JPanel otherHelpPanel;
    private javax.swing.JLabel serviceType;
    private javax.swing.JComboBox serviceTypeCombo;
    private javax.swing.JLabel viewYourProfile;
    private javax.swing.JTable workRequestHistoryTable;
    // End of variables declaration//GEN-END:variables
}
