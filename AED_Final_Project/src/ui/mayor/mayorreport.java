/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.mayor;

/**
 *
 * @author keert
 */
public class mayorreport extends javax.swing.JPanel {

    /**
     * Creates new form mayorreport
     */
    public mayorreport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volunteerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        volTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        donorPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        volunteerPanel.setBackground(new java.awt.Color(204, 255, 153));

        volTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer Name", "Requests Completed"
            }
        ));
        jScrollPane1.setViewportView(volTable);

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel6.setText("Top Volunteers");

        org.jdesktop.layout.GroupLayout volunteerPanelLayout = new org.jdesktop.layout.GroupLayout(volunteerPanel);
        volunteerPanel.setLayout(volunteerPanelLayout);
        volunteerPanelLayout.setHorizontalGroup(
            volunteerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(volunteerPanelLayout.createSequentialGroup()
                .add(volunteerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(volunteerPanelLayout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 444, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(volunteerPanelLayout.createSequentialGroup()
                        .add(143, 143, 143)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        volunteerPanelLayout.setVerticalGroup(
            volunteerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(volunteerPanelLayout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel6)
                .add(31, 31, 31)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 258, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        donorPanel.setBackground(new java.awt.Color(204, 255, 153));

        donTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(donTable);

        jLabel8.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel8.setText("Top Donors");

        org.jdesktop.layout.GroupLayout donorPanelLayout = new org.jdesktop.layout.GroupLayout(donorPanel);
        donorPanel.setLayout(donorPanelLayout);
        donorPanelLayout.setHorizontalGroup(
            donorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(donorPanelLayout.createSequentialGroup()
                .add(donorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(donorPanelLayout.createSequentialGroup()
                        .add(69, 69, 69)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(donorPanelLayout.createSequentialGroup()
                        .add(82, 82, 82)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        donorPanelLayout.setVerticalGroup(
            donorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(donorPanelLayout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jLabel8)
                .add(35, 35, 35)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Heart Help");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(backJButton))
                            .add(layout.createSequentialGroup()
                                .add(77, 77, 77)
                                .add(volunteerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(39, 39, 39)
                        .add(donorPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(501, 501, 501)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(donorPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, volunteerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(backJButton)
                .add(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable donTable;
    private javax.swing.JPanel donorPanel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable volTable;
    private javax.swing.JPanel volunteerPanel;
    // End of variables declaration//GEN-END:variables
}
