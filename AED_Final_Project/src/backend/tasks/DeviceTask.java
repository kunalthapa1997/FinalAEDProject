/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;

/**
 *
 * @author kunal
 */
public class DeviceTask extends TaskRequest{
   
    private String requestSensorId;
    private static int count = 001;
    private String comments;
    private String donationRequestResult;
    
    
    public DeviceTask()
    {
        
        StringBuffer sb = new StringBuffer();
        sb.append("SENSOR");
        sb.append(count);
        requestSensorId = sb.toString();
        count++;
    }

    public String getRequestSensorId() {
        return requestSensorId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getdonationRequestResult() {
        return donationRequestResult;
    }

    public void setdonationRequestResult(String requestResult) {
        this.donationRequestResult = requestResult;
    }

    @Override
    public String toString() {
        return this.requestSensorId;
    }
     
}
