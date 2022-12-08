/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.sensor;

import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Device {
    private String sensorName;
    private String sensorId;
    private Measure hRSensorMeasurements;
    private ArrayList<Measure> measurementList;
    
    public Device()
    {
        this.hRSensorMeasurements = new Measure();
        measurementList= new ArrayList<>();
    }
    
    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public Measure gethRSensorMeasurements() {
        return hRSensorMeasurements;
    }

    
    @Override
    public String toString() {
        return this.sensorName;
    }

}
