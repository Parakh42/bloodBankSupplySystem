/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author Kaustubh Chaudhari
 */
public class PersonDirectory {
    ArrayList<Person> personList;

    public PersonDirectory() {
        personList=new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    
    
    public Person createPerson(String name){
        Person person=new Person();
        person.setFirstName(name);
        personList.add(person);
        return person;
    }
}
