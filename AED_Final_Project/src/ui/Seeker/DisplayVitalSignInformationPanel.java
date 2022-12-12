/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seeker;

import backend.people.Seeker;
import backend.people.Person;
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
public class DisplayVitalSignInformationPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAcc userAccount; 
    private Person person;
 
    
    /**
     * Creates new form UpdateVitalSignInfo
     */
    public DisplayVitalSignInformationPanel(JPanel userProcessContainer, UserAcc userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        
         Seeker customer = (Seeker)person;
        if(customer.isShareVitalInfo() && customer.isHasLungProb())
        {
         for(String vs : customer.getVitalSignTrackList())
         {
            vitalSignTrackList.append(vs + System.getProperty("line.separator"));
         }

          if(customer.isHasSensorDevice())
          {
              hasSensorRadioYes1.setSelected(true);
          }
          else
          {
           hasSensorRadioNo1.setSelected(true);
          }
            if(customer.isGetAlerts())
            {
            getAlertJRadioYes1.setSelected(true);
            }
            else
            {
              getAlertJRadioNo1.setSelected(true);
            }
   
        }
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

        getAlert2 = new javax.swing.JLabel();
        getAlert3 = new javax.swing.JLabel();
        getAlertJRadioNo1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        hasSensorRadioNo1 = new javax.swing.JRadioButton();
        viewYourProfile3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTrackList = new javax.swing.JTextArea();
        hasSensorRadioYes1 = new javax.swing.JRadioButton();
        getAlertJRadioYes1 = new javax.swing.JRadioButton();
        manageEnt1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        getAlert2.setText("Accept alert from Stepone");

        getAlert3.setText("Device to track Vital Signs");

        getAlertJRadioNo1.setText("No");
        getAlertJRadioNo1.setEnabled(false);

        jLabel2.setText("Critical Vital Signs:");

        hasSensorRadioNo1.setText("No");
        hasSensorRadioNo1.setEnabled(false);

        viewYourProfile3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile3.setText("Vital Sign Information:");

        vitalSignTrackList.setEditable(false);
        vitalSignTrackList.setColumns(20);
        vitalSignTrackList.setRows(5);
        vitalSignTrackList.setEnabled(false);
        jScrollPane1.setViewportView(vitalSignTrackList);

        hasSensorRadioYes1.setText("Yes");
        hasSensorRadioYes1.setEnabled(false);

        getAlertJRadioYes1.setText("Yes");
        getAlertJRadioYes1.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Stepone Application");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(getAlertJRadioYes1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(getAlertJRadioNo1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hasSensorRadioYes1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hasSensorRadioNo1))))
                            .addComponent(getAlert2)
                            .addComponent(getAlert3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(manageEnt1)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(manageEnt1)
                .addGap(18, 18, 18)
                .addComponent(viewYourProfile3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(getAlert2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(getAlert3)
                            .addGap(38, 38, 38)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hasSensorRadioYes1)
                            .addComponent(hasSensorRadioNo1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getAlertJRadioYes1)
                            .addComponent(getAlertJRadioNo1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel getAlert2;
    private javax.swing.JLabel getAlert3;
    private javax.swing.JRadioButton getAlertJRadioNo1;
    private javax.swing.JRadioButton getAlertJRadioYes1;
    private javax.swing.JRadioButton hasSensorRadioNo1;
    private javax.swing.JRadioButton hasSensorRadioYes1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel viewYourProfile3;
    private javax.swing.JTextArea vitalSignTrackList;
    // End of variables declaration//GEN-END:variables
}
