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
public class DonorDirectory {
    private ArrayList<Donor> donorList;

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public DonorDirectory() {
        donorList=new ArrayList<>();
    }
    
    public Donor createDonor(String name){
        Donor donor = new Donor();
        donor.setFirstName(name);
        donorList.add(donor);
        return donor;
    }
    
     public void deleteDonor(Donor donor) {
        donorList.remove(donor);
    }
}
