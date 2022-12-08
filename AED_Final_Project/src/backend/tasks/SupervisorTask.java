/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;

/**
 *
 * @author kunal
 */
public class SupervisorTask extends TaskRequest{
    
    public static String REQUEST_APPROVED = "Approved";
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_REJECT = "Declined";
    public static String REQUEST_COMPLETED = "Completed";
    public static String REQUEST_APPROVAL = "Request for Approval";
    public static String REQUEST_SENT = "Sent";
    public static String REQUEST_ACCEPT = "Accepted";
    private String testResult;
    private String comments;
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
