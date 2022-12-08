/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;
import backend.sensor.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class DataToDoctorTask extends TaskRequest{
    
    private String sendDataRequestId;
    private static int count = 000;
    private ArrayList<VitalSign> vitalSignList;
    private String medication;
    private String newMedication;
    private String reqResult;
   
    
     public DataToDoctorTask()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
        vitalSignList = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        
        return this.sendDataRequestId;       
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setNewMedication(String newMedication) {
        this.newMedication = newMedication;
    }

    public String getNewMedication() {
        return newMedication;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public String getReqResult() {
        return reqResult;
    }

   
}
