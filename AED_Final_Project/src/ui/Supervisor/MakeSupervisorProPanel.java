/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Supervisor;

import backend.shared.ValidateDob;
import backend.shared.ValidateMail;
import backend.shared.ValidateNo;
import backend.shared.ValidatePhNo;
import backend.shared.ValidateString;
import backend.people.Person;
import backend.account.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tejageetla
 */
public class MakeSupervisorProPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private UserAcc userAccount;
    /**
     * Creates new form CreateSupervisorProfileJPanel
     */
    public MakeSupervisorProPanel(JPanel userProcessContainer, UserAcc account) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        addInputVerifiers();
        supNameField.setText(userAccount.getPerson().getName());
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
    
      private void addInputVerifiers() {
          
        InputVerifier stringValidation = new ValidateString();
        supNameField.setInputVerifier(stringValidation);
        supaddressField.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        
        InputVerifier dobValidtion = new ValidateDob();
        supDobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNo();
        zipCodeField.setInputVerifier(numberValidation);
        
        InputVerifier phnumberValidation = new ValidatePhNo();
        phoneNumberField.setInputVerifier(phnumberValidation);
        
        InputVerifier emailValidtion = new ValidateMail();
        emailIDField.setInputVerifier(emailValidtion);
     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zipCodeField = new javax.swing.JTextField();
        supNameField = new javax.swing.JTextField();
        donorName = new javax.swing.JLabel();
        createYourProfile = new javax.swing.JLabel();
        supDobField = new javax.swing.JFormattedTextField();
        backJButton = new javax.swing.JButton();
        createProfileButton = new javax.swing.JButton();
        zipCode = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        supaddressField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        occupation = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();

        supNameField.setEditable(false);
        supNameField.setEnabled(false);

        donorName.setText("Full Name:");

        createYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createYourProfile.setText("Create Your Profile");

        backJButton.setText("<< back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createProfileButton.setText("Create Profile ");
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });

        zipCode.setText("Zip Code:");

        phoneNumber.setText("Phone Number:");

        town.setText("Town/City: ");

        emailID.setText("Email Address:");

        address.setText("Address: ");

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        occupation.setText("Occupation:");

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Supervisor Creation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backJButton)
                .addGap(38, 274, Short.MAX_VALUE)
                .addComponent(createProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createYourProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(town))
                            .addComponent(occupation)
                            .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donorName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(supDobField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(zipCodeField)
                            .addComponent(townField)
                            .addComponent(occupationField)
                            .addComponent(emailIDField)
                            .addComponent(supaddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(supNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(phoneNumberField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(manageEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createYourProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorName)
                    .addComponent(supNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(supDobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(supaddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(town)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(occupation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailID)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProfileButton)
                    .addComponent(backJButton))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed
        Person person = userAccount.getPerson();
        if( supaddressField.getText()==null || supaddressField.getText().trim().isEmpty() ||
            townField.getText()==null || townField.getText().trim().isEmpty() ||
            occupationField.getText()==null || occupationField.getText().trim().isEmpty() ||
            emailIDField.getText()==null || emailIDField.getText().trim().isEmpty() ||
            phoneNumberField.getText()==null || phoneNumberField.getText().trim().isEmpty() || 
            supDobField.getText()==null || supDobField.getText().trim().isEmpty() ||
            zipCodeField.getText()==null || zipCodeField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all fields");
           return;
        }
        try
        {
        DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date dob =  dateFormat.parse(supDobField.getText());
        if(dob.after(date) || dob.equals(date))
        {
         JOptionPane.showMessageDialog(null, "Please Enter valid Date of Birth");
           return;    
        }
        
            person.setDob(dateFormat.parse(supDobField.getText()));
            person.setAddress1(supaddressField.getText());
            person.setTown(townField.getText());
            person.setOccupation(occupationField.getText());
            person.setZipCode(zipCodeField.getText());
            person.setEmailId(emailIDField.getText());
            person.setPhoneNumber(phoneNumberField.getText());

            JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
        catch(ParseException pe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid date of Birth!");
            return;
        }
        catch(NumberFormatException nfe)
        {
          JOptionPane.showMessageDialog(null, "Please Enter valid number!");
            return;  
        }
        catch(Exception e)
        {  
            JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            return;
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed

    public void resetFields()
{
    supNameField.setText("");
    supDobField.setText("");
    supaddressField.setText("");
    townField.setText("");
    occupationField.setText("");
    zipCodeField.setText("");
    emailIDField.setText("");
    phoneNumberField.setText("");
    
    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel createYourProfile;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel donorName;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JFormattedTextField supDobField;
    private javax.swing.JTextField supNameField;
    private javax.swing.JTextField supaddressField;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
