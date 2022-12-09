/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.people;

/**
 *
 * @author kunal
 */
public class Test {
    private static int count=0;
    private int testimonialID;
    private String testimonialTxt;
    private String writerName;
    private String date;
    
    public Test()
    {
        count++;
       testimonialID = count;
    }

    public int getTestimonialID() {
        return testimonialID;
    }


    public String getTestimonialTxt() {
        return testimonialTxt;
    }

    public void setTestimonialTxt(String testimonialTxt) {
        this.testimonialTxt = testimonialTxt;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.testimonialID);
    }
}
