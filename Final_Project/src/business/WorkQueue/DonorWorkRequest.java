/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.Date;

/**
 *
 * @author piyush sharma
 */
public class DonorWorkRequest extends WorkRequest {
    

    @Override
    public String toString(){
        return this.getStatus();
    }
    
    
    

   
}
