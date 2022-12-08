/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;

import backend.shared.Donation;
/**
 *
 * @author kunal
 */
public class donationTask extends TaskRequest{
    private String donatedBy;
    private String requestId;
    private static int count = 000;
    private Donation donation;
   
    public donationTask()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONATION");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }

    public String getDonatedBy() {
        return donatedBy;
    }

    public void setDonatedBy(String donatedBy) {
        this.donatedBy = donatedBy;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public Donation getDonation() {
        return donation;
    }

    @Override
    public String toString() {
        return this.requestId;
    }
    
}
