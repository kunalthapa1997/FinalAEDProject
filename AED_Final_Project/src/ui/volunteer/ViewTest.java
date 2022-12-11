/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.volunteer;

/**
 *
 * @author swati
 */
public class ViewTest extends javax.swing.JPanel {

    /**
     * Creates new form ViewTest
     */
    public ViewTest() {
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
        testimonialListJTable = new javax.swing.JTable();
        manageEnt = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        testimonialJPanel = new javax.swing.JPanel();
        viewTestiBtn = new javax.swing.JButton();
        testimonialHeadingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTestimonialField = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();

        testimonialListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Testimonial Id", "Written By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testimonialListJTable);

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("View Testimonials");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Heart Help ");

        testimonialJPanel.setBackground(new java.awt.Color(153, 204, 0));

        org.jdesktop.layout.GroupLayout testimonialJPanelLayout = new org.jdesktop.layout.GroupLayout(testimonialJPanel);
        testimonialJPanel.setLayout(testimonialJPanelLayout);
        testimonialJPanelLayout.setHorizontalGroup(
            testimonialJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 504, Short.MAX_VALUE)
        );
        testimonialJPanelLayout.setVerticalGroup(
            testimonialJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 404, Short.MAX_VALUE)
        );

        viewTestiBtn.setText("View Testimonial");
        viewTestiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTestiBtnActionPerformed(evt);
            }
        });

        testimonialHeadingLabel.setText("jLabel1");

        viewTestimonialField.setEditable(false);
        viewTestimonialField.setColumns(20);
        viewTestimonialField.setRows(5);
        jScrollPane1.setViewportView(viewTestimonialField);

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
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(manageEnt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 336, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(testimonialHeadingLabel)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 311, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(backJButton)))
                    .add(layout.createSequentialGroup()
                        .add(99, 99, 99)
                        .add(viewTestiBtn)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(testimonialJPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(61, 61, 61))
            .add(layout.createSequentialGroup()
                .add(458, 458, 458)
                .add(manageEnt1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(manageEnt1)
                        .add(18, 18, 18)
                        .add(manageEnt)
                        .add(18, 18, 18)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(viewTestiBtn)
                        .add(28, 28, 28)
                        .add(testimonialHeadingLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(testimonialJPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19)))
                .add(backJButton)
                .add(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTestiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTestiBtnActionPerformed
        int selectedRow = testimonialListJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        Testimonial testimonial = (Testimonial)testimonialListJTable.getValueAt(selectedRow, 0);

        testimonialHeadingLabel.setText(testimonial.getDate() + " written by "+testimonial.getWriterName() );
        viewTestimonialField.setText(testimonial.getTestimonialTxt());
        testimonialHeadingLabel.setVisible(true);
        viewTestimonialField.setVisible(true);

    }//GEN-LAST:event_viewTestiBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel testimonialHeadingLabel;
    private javax.swing.JPanel testimonialJPanel;
    private javax.swing.JTable testimonialListJTable;
    private javax.swing.JButton viewTestiBtn;
    private javax.swing.JTextArea viewTestimonialField;
    // End of variables declaration//GEN-END:variables
}