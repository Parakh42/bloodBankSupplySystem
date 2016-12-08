/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.BloodSample;

import java.util.HashMap;

/**
 *
 * @author Kaustubh Chaudhari
 */
public class BloodQuantity {
 
   HashMap<String, Integer> hash;
  
    public BloodQuantity()
    {
     
        hash= new HashMap<>();
      
    }

    public HashMap<String, Integer> getHash() {
        return hash;
    }

    public void setHash(HashMap<String, Integer> hash) {
        this.hash = hash;
    }

   
    
    
    
    
    
}
