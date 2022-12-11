/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;

import backend.account.UserAcc;
import java.util.Date;
/**
 *
 * @author kunal
 */
public abstract class TaskRequest {
    
    private String message;
    private UserAcc sender;
    private UserAcc receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public TaskRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAcc getSender() {
        return sender;
    }

    public void setSender(UserAcc sender) {
        this.sender = sender;
    }

    public UserAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAcc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return this.message;
    }
    
}
