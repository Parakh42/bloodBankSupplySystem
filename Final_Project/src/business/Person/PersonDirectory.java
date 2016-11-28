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
    ArrayList<Employee> employeeList;   
    ArrayList<Donor> donorList;

    public PersonDirectory() {
        employeeList=new ArrayList<>();
        donorList = new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

     public Employee createEmployee(String name){
        Employee employee=new Employee();
        employee.setFirstName(name);
        employeeList.add(employee);
        return employee;
    }
     
     public Donor createDonor(String name){
        Donor donor=new Donor();
        donor.setFirstName(name);
        donorList.add(donor);
        return donor;
    }
}
