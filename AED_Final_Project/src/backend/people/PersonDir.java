/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.people;

import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class PersonDir {
      private ArrayList<Volunteer> volunteerList;
      private ArrayList<Seeker> customerLsit;
      private ArrayList<Person> personList;
    
      public PersonDir()
      {
            volunteerList = new ArrayList<>();
            customerLsit = new ArrayList<>();
            personList = new ArrayList<>();
      }
      
      public Volunteer addVolunteer()
    {
        Volunteer volunteer = new Volunteer();
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer)
    {
      volunteerList.remove(volunteer);
    }
    
    public Seeker addCustomer()
    {
        Seeker customer = new Seeker();
        customerLsit.add(customer);
        return customer;
    }
    
    public void removeCustomer(Seeker customer)
    {
        customerLsit.remove(customer);
    }
    

    public ArrayList<Seeker> getCustomerLsit() {
        return customerLsit;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
