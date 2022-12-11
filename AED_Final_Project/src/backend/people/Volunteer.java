/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.people;

import backend.coverage.Coverage;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Volunteer extends Person{
    
    private String volunteerId;
    private static int count = 001;
    private String latitiude;
    private String longitude;
    private ArrayList<Test> testimonialList;
    
    
    public Volunteer()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("VOL");
        sb.append(count);
        volunteerId = sb.toString();
        count++;
        testimonialList= new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getVolunteerId() {
        return volunteerId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Test> getTestimonialList() {
        return testimonialList;
    }

   
    public Test addTestimonial()
    {
        Test testimonial = new Test();
        testimonialList.add(testimonial);
        return testimonial;
    }
    
}
