/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.UserAccount.UserAccount;

/**
 *
 * @author piyush sharma
 */
public class ReceptionWorkRequest extends WorkRequest {
    
    private UserAccount donor;

    public UserAccount getDonor() {
        return donor;
    }

    public void setDonor(UserAccount donor) {
        this.donor = donor;
    }
    
    
}
