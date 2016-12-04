/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
     public Person createPerson(String name, String lname, String email, int age, String bloodGroup,String gender, String phone, String address){
        Person person = new Person();
        person.setFirstName(name);
        person.setLastName(lname);
        person.setEmailId(email);
        person.setAge(age);
        person.setBloodGroup(bloodGroup);
        person.setPhoneNumber(phone);
        person.setGender(gender);
        person.setAddress(address);
        personList.add(person);
        return person;
    }
    
     public void deletePerson(Person person) {
        personList.remove(person);
     }

    
    
}
