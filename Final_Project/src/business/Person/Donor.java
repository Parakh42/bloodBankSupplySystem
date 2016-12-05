/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class Donor extends Person {
    private static int count;
    private int donorId;
    private VitalSignsHistory vsh;

    public Donor() {
        donorId = count;
        count++;
        this.vsh = new VitalSignsHistory();
    }
     
    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public VitalSignsHistory getVsh() {
        return vsh;
    }

    public void setVsh(VitalSignsHistory vsh) {
        this.vsh = vsh;
    }
    
    
}
