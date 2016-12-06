/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.UserAccount.UserAccount;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class Donor extends Person {
    private static int count;
    private int donorId;
    private VitalSigns vs;

    public Donor() {
        super();
        donorId = count;
        count++;
        this.vs = new VitalSigns();
    }

    public int getDonorId() {
        return donorId;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
     

    
    
}
