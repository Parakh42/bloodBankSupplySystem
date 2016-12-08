/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.BloodSample.BloodQuantity;
import business.BloodSample.BloodSampleCatalog;
import business.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String time;
    private String bloodGroup;
    private BloodSampleCatalog bloodSampleCatalog;
        private BloodQuantity bq;

    

    public WorkRequest() {
        requestDate = new Date();
        bloodSampleCatalog= new BloodSampleCatalog();
        bq = new BloodQuantity();
        bq.getHash().put("A+", 0);
        bq.getHash().put("A-", 0);
        bq.getHash().put("B+", 0);
        bq.getHash().put("B-", 0);
        bq.getHash().put("AB+", 0);
        bq.getHash().put("AB-", 0);
        bq.getHash().put("O+", 0);
        bq.getHash().put("O-", 0);
    }

    public BloodQuantity getBq() {
        return bq;
    }

    public void setBq(BloodQuantity bq) {
        this.bq = bq;
    }

    public BloodSampleCatalog getBloodSampleCatalog() {
        return bloodSampleCatalog;
    }
    
    
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
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

    
    
    

    
}
