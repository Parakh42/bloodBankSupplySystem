/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author PARAKH MAHAJAN
 */
public abstract class Organization {
    private String name;
    private int organizationID;
    private static int counter;

    public Organization(String name) {
        this.name = name;
        organizationID = counter;
        ++counter;
        
        
        
    }
    
    public enum Type
    {
        Donor("Donor Organization"), Receptionist("Reception Organization"), Lab("Lab Organization"), Nurse("Nurse Organization"), Inventory("Inventory Organization"), Admin("Admin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }
    
    //public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
