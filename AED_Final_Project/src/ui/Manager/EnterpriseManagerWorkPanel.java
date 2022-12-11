/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Manager;

import backend.ConfSetup;
import backend.shared.Validations;
import backend.enterprises.Enterprises;
import backend.organizations.Donor;
import backend.organizations.OrganizationSeeker;
import backend.organizations.Organization;
import backend.organizations.Transportation;
import backend.organizations.Volunteers;
import backend.account.UserAcc;
import backend.tasks.donationTask;
import backend.tasks.HelpTask;
import backend.tasks.DeviceTask;
import backend.tasks.SupervisorTask;
import backend.tasks.TaskRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author kunal
 */
public class EnterpriseManagerWorkPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprises enterprise;
    private ConfSetup ecoSystem;
    private UserAcc userAccount;
    private Volunteers vo;
    private Donor do1 ;
    private OrganizationSeeker hsOrg;
    private Transportation transOrg;
    private List<Entry<String, Integer>> topVolunteeerList;
    private List<Entry<String, Integer>> topDonorList;
    
    /**
     * Creates new form HeartHelpEnterpriseManagerWorkArea
     */
    public EnterpriseManagerWorkPanel(JPanel userProcessContainer, Enterprises enterprise, ConfSetup ecoSystem, UserAcc userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());
      //  setBackground(new Color(182,201,233));
        populatePieChartData();
        populateTextFields();
        
        viewDetailedReportBtn.setVisible(false);
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        manageEnt2 = new javax.swing.JLabel();
        pieChartPanel = new javax.swing.JPanel();
        top3VolunteersBtn = new javax.swing.JButton();
        totalHelpReq = new javax.swing.JLabel();
        totSenDevReq = new javax.swing.JLabel();
        totTransReq = new javax.swing.JLabel();
        totSenDevReqField = new javax.swing.JTextField();
        totTransReqField = new javax.swing.JTextField();
        totHelpReqField = new javax.swing.JTextField();
        findTop3Donors = new javax.swing.JButton();
        viewDetailedReportBtn = new javax.swing.JButton();
        totSenDevReq1 = new javax.swing.JLabel();
        donatedAmntField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(151, 197, 46));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("StepOne Manager Operations");

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Enterprise:");

        javax.swing.GroupLayout pieChartPanelLayout = new javax.swing.GroupLayout(pieChartPanel);
        pieChartPanel.setLayout(pieChartPanelLayout);
        pieChartPanelLayout.setHorizontalGroup(
            pieChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        pieChartPanelLayout.setVerticalGroup(
            pieChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        top3VolunteersBtn.setText("Display Top 3 Volunteers");
        top3VolunteersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top3VolunteersBtnActionPerformed(evt);
            }
        });

        totalHelpReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totalHelpReq.setText("Total No of Service Requests");

        totSenDevReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totSenDevReq.setText("Total No of Sensor Device Requests");

        totTransReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totTransReq.setText("Total No of Transport Requests");

        totSenDevReqField.setEditable(false);
        totSenDevReqField.setBackground(new java.awt.Color(153, 204, 0));

        totTransReqField.setEditable(false);
        totTransReqField.setBackground(new java.awt.Color(153, 204, 0));

        totHelpReqField.setEditable(false);
        totHelpReqField.setBackground(new java.awt.Color(153, 204, 0));

        findTop3Donors.setText("Display Top 3 Donors");
        findTop3Donors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTop3DonorsActionPerformed(evt);
            }
        });

        viewDetailedReportBtn.setText("View Detailed Report");
        viewDetailedReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailedReportBtnActionPerformed(evt);
            }
        });

        totSenDevReq1.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totSenDevReq1.setText("Total Amount Donated By Donors");

        donatedAmntField.setEditable(false);
        donatedAmntField.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(viewDetailedReportBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(top3VolunteersBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(findTop3Donors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totSenDevReq1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalHelpReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(totSenDevReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totTransReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totSenDevReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totTransReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totHelpReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(donatedAmntField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(manageEnt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueLabel)
                            .addComponent(manageEnt2))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalHelpReq)
                            .addComponent(totHelpReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totTransReq)
                            .addComponent(totTransReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totSenDevReq)
                            .addComponent(totSenDevReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totSenDevReq1)
                            .addComponent(donatedAmntField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(top3VolunteersBtn)
                        .addGap(18, 18, 18)
                        .addComponent(findTop3Donors)
                        .addGap(18, 18, 18)
                        .addComponent(viewDetailedReportBtn)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void top3VolunteersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top3VolunteersBtnActionPerformed
       findTop3Volunteers();
       if(topVolunteeerList!=null && topDonorList!=null && !(topVolunteeerList.isEmpty()) && !(topDonorList.isEmpty()) )
       {
       viewDetailedReportBtn.setVisible(true);
       }
    }//GEN-LAST:event_top3VolunteersBtnActionPerformed

    private void findTop3DonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTop3DonorsActionPerformed
        findTop3Donors();
       if(topVolunteeerList!=null && topDonorList!=null && !(topVolunteeerList.isEmpty()) && !(topDonorList.isEmpty()) )
       {
       viewDetailedReportBtn.setVisible(true);
       }
    }//GEN-LAST:event_findTop3DonorsActionPerformed

    private void viewDetailedReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailedReportBtnActionPerformed
       if(topVolunteeerList == null || topDonorList == null || topVolunteeerList.isEmpty() && topDonorList.isEmpty())
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;     
       }
        DisplayReportPanel vdrjp = new DisplayReportPanel(userProcessContainer, topVolunteeerList, topDonorList);
        userProcessContainer.add("ViewDetailedReportJPanel", vdrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailedReportBtnActionPerformed
    
      public void populateTextFields()
      {
          int totalHelpReq = 0;
          int totalTransportReq = 0;
          String totalDonorReq = "";
          int totalAmountDonated =0;
          try
          {
      if(do1!=null){
      totalDonorReq = String.valueOf(do1.getWorkQueue().getWorkRequestList().size());
              
        for(UserAcc donorAccount : do1.getUserAccountDirectory().getUserAccountList())
      {
       if(!donorAccount.getWorkQueue().getWorkRequestList().isEmpty())
       {
         for(TaskRequest wrkrequest : donorAccount.getWorkQueue().getWorkRequestList())
         {  
           if(wrkrequest.getMessage().equalsIgnoreCase("Donated Money"))
             {
                 donationTask donationRequest = (donationTask)wrkrequest;
                totalAmountDonated+= Integer.parseInt(donationRequest.getDonation().getAmount());
             }
        
          }
         }
         
       }
         } 
      if(vo!=null)
      {
          for(TaskRequest request : vo.getWorkQueue().getWorkRequestList())
          {
             if(request.getMessage().equalsIgnoreCase("Need Help"))
             {
               totalHelpReq++;     
             }
             
             
           }
          for(UserAcc userAccount : vo.getUserAccountDirectory().getUserAccountList())
          {
           if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
           {
            for(TaskRequest req : userAccount.getWorkQueue().getWorkRequestList())
            {
              if(req.getMessage().equalsIgnoreCase("Need Help"))
             {
               totalHelpReq++;     
             }   
            }
           }
          }
      } 
      if(transOrg!=null)
      {
           for(TaskRequest request : transOrg.getWorkQueue().getWorkRequestList())
          {
              if(request.getMessage().equals("Need Transport"))
              {
              totalTransportReq++;    
              }
          }
      }   
          totHelpReqField.setText(String.valueOf(totalHelpReq));
          totSenDevReqField.setText(totalDonorReq);
          totTransReqField.setText(String.valueOf(totalTransportReq));
          donatedAmntField.setText(String.valueOf(totalAmountDonated));
          }
          catch(Exception e)
          {
         JOptionPane.showMessageDialog(null, " Data is not availble for few organizations!","warning", JOptionPane.WARNING_MESSAGE);
         return;      
          }
      }
    
    public void populatePieChartData()
    {
       DefaultPieDataset dataSet = new DefaultPieDataset();
       int totalHelpSeekers = 0;
       int totalVolunteers = 0;
       int totalDonors = 0;
       int totalDrivers = 0;
       try
       {
       for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
       {
          if(organization instanceof Organization) 
          {
          this.hsOrg = (OrganizationSeeker)organization;   
           totalHelpSeekers = organization.getPersonDirectory().getCustomerLsit().size();
          }
       }
       try
       {
         this.vo = Validations.getVolunteerOrganization(ecoSystem, userAccount);
       }
        catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " Voluteer Organination does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
       if(vo!=null)
       {
        totalVolunteers = vo.getPersonDirectory().getVolunteerList().size();
       }
        
        this.do1 = Validations.getDonorOrganization(ecoSystem, userAccount);
        if(do1!=null)
        {
        totalDonors = do1.getPersonDirectory().getPersonList().size();
        }
        this.transOrg = Validations.getTransportOrganization(ecoSystem, userAccount);
        if(transOrg!=null)
        {
        totalDrivers = transOrg.getPersonDirectory().getPersonList().size();
        }
         
         dataSet.setValue("Total No of Help Seekers",totalHelpSeekers);
         dataSet.setValue("Total No of Volunteers", totalVolunteers );
         dataSet.setValue("Total No of Donors",totalDonors);
         dataSet.setValue("Total No of Drivers",totalDrivers);
     
         JFreeChart  chart = ChartFactory.createPieChart3D("Pie Chart for "+userAccount.getNetwork().getCity(), dataSet, true, true, Locale.ENGLISH);
            chart.setBackgroundPaint(Color.WHITE);
            chart.getTitle().setPaint(Color.BLUE);
          ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setDomainZoomable(true);

        pieChartPanel.setLayout(new BorderLayout());
        pieChartPanel.add(chartpanel, BorderLayout.EAST); 
        pieChartPanel.setVisible(true);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
        
    }
    
    public void findTop3Volunteers()
    {
     int noOfRequests = 0;  
     HashMap<String, Integer> volMap = new HashMap<>(); 
      try
      {
     for(UserAcc volunteerAccount : vo.getUserAccountDirectory().getUserAccountList())
      {
        if(!volunteerAccount.getWorkQueue().getWorkRequestList().isEmpty())
       {
         for(TaskRequest request : volunteerAccount.getWorkQueue().getWorkRequestList() )
         {
          if(request.getMessage().equalsIgnoreCase("Need Help") && 
                  request.getStatus().equalsIgnoreCase("Completed") )
          {
              HelpTask nhwr = (HelpTask)request;  
          if(nhwr.getRequestResult().equalsIgnoreCase(SupervisorTask.REQUEST_ACCEPT))
          {
          ++noOfRequests;    
          }
          }
         }
          volMap.put(volunteerAccount.getPerson().getName(), noOfRequests);
          noOfRequests = 0;
         }
        
       }
     
          System.out.println("volMap >>>>>>" +volMap.toString());
            
          List<Entry<String, Integer>> list = new LinkedList<>(volMap.entrySet());
        
          Collections.sort(list, new Comparator<Entry<String, Integer>>()
            {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
               if(o1.getValue()>o2.getValue())
               {
                return 1;
               }
                else if(o1.getValue()<o2.getValue())
                {
                    return -1;
                }
                return 0;
            }
             
            });
          Collections.reverse(list);
          System.out.println("After Sort "+list.toString());
          
          topVolunteeerList = list;
          
          DefaultCategoryDataset  dataSet = new DefaultCategoryDataset();
          int count = 0;
        
            if(volMap.entrySet().size()<=3)
            {
           for (Entry<String, Integer> entry : list)
            {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
            dataSet.setValue(entry.getValue(), "No of Help Requests", entry.getKey());
            }
            }
            else  if(volMap.entrySet().size()>3)
            {
            for (Entry<String, Integer> entry : list)
            {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
            dataSet.setValue(entry.getValue(), "No of Help Requests", entry.getKey());
            count ++;
            if(count == 3)
            {
              break;
            }
            }
            }
             JFreeChart barchart = ChartFactory.createBarChart(" Top 3 Volunteers by no of Requests " ," Volunteer Name " ,"No of Help Requests", dataSet,PlotOrientation.VERTICAL, false, true, false);
             barchart.setBackgroundPaint(Color.WHITE);
             barchart.getTitle().setPaint(Color.BLUE);
             CategoryPlot plot = barchart.getCategoryPlot();
             plot.setBackgroundPaint(Color.CYAN);
             
            ChartFrame frame = new ChartFrame("Bar Chart for Top 3 Volunteers ", barchart);
            frame.setVisible(true);
            frame.setSize(450,350);
            
      }
      catch(NullPointerException npe)
       {
        npe.printStackTrace();
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       
       }
      
    }
    
     public void findTop3Donors()
    {
        
     int noOfRequests = 0;  
     int donatedAmount = 0;
     HashMap<String, Integer> donorMap = new HashMap<>(); 
     HashMap<String, Integer> donorAmountMap = new HashMap<>();
      try
      {
     if(do1 ==null)
     {
     JOptionPane.showMessageDialog(null, "Donor Organization does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return;    
     }
     for(UserAcc donorAccount : do1.getUserAccountDirectory().getUserAccountList())
      {
             System.out.println("request"+donorAccount.getUserName());
        if(!donorAccount.getWorkQueue().getWorkRequestList().isEmpty())
       {
           System.out.println("request"+donorAccount.getUserName());
        for(TaskRequest wrkrequest : donorAccount.getWorkQueue().getWorkRequestList() )
         {  
           if(wrkrequest.getMessage().equalsIgnoreCase("Donated Money"))
             {
                 donationTask donationRequest = (donationTask)wrkrequest;
                donatedAmount+= Integer.parseInt(donationRequest.getDonation().getAmount());
               ++noOfRequests; 
             }
           if(wrkrequest.getMessage().equalsIgnoreCase("Need Sensor Device"))
           {
               DeviceTask nsdwr = (DeviceTask)wrkrequest;
               if(nsdwr.getdonationRequestResult().equalsIgnoreCase(SupervisorTask.REQUEST_ACCEPT))
               {
               ++noOfRequests; 
               }
           }
          }
          noOfRequests+=donatedAmount;  
         donorMap.put(donorAccount.getPerson().getName(), noOfRequests);
         noOfRequests=0;
        }
         
       }

         List<Entry<String, Integer>> list = new LinkedList<>(donorMap.entrySet());
        
          Collections.sort(list, new Comparator<Entry<String, Integer>>()
            {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
               return o1.getValue().compareTo(o2.getValue());
             }
            });
          Collections.reverse(list);
          
          topDonorList = list;
          
          DefaultCategoryDataset  dataSet = new DefaultCategoryDataset();
          int count = 0;
        
            if(donorMap.entrySet().size()<=3)
            {
           for (Entry<String, Integer> entry : list)
            {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
            dataSet.setValue(entry.getValue(), "Values", entry.getKey());
            }
            }
            else  if(donorMap.entrySet().size()>3)
            {
            for (Entry<String, Integer> entry : list)
            {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
            dataSet.setValue(entry.getValue(), "Values", entry.getKey());
            count ++;
            if(count == 3)
            {
                break;
            }
            }
            }
             JFreeChart barchart = ChartFactory.createBarChart(" Top 3 Donors " ," Donor Name " ,"No of Requests", dataSet,PlotOrientation.VERTICAL, false, true, false);
             barchart.setBackgroundPaint(Color.WHITE);
             barchart.getTitle().setPaint(Color.BLUE);
             CategoryPlot plot = barchart.getCategoryPlot();
             plot.setBackgroundPaint(Color.CYAN);
            ChartFrame frame = new ChartFrame("Bar Chart for Top 3 Donors ", barchart);
            frame.setVisible(true);
            frame.setSize(450,350);
         
      }
      catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
      
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField donatedAmntField;
    private javax.swing.JButton findTop3Donors;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JPanel pieChartPanel;
    private javax.swing.JButton top3VolunteersBtn;
    private javax.swing.JTextField totHelpReqField;
    private javax.swing.JLabel totSenDevReq;
    private javax.swing.JLabel totSenDevReq1;
    private javax.swing.JTextField totSenDevReqField;
    private javax.swing.JLabel totTransReq;
    private javax.swing.JTextField totTransReqField;
    private javax.swing.JLabel totalHelpReq;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewDetailedReportBtn;
    // End of variables declaration//GEN-END:variables
}
