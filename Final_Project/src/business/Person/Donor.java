/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

/**
 *
 * @author Kaustubh Chaudhari
 */
public class Donor extends Person{
    private static int count;
    private int donorId;
    private String bloodGroup;
    private float bloodPressure;
    private float temperature;
    private float hemoglobinLevel;

    public Donor() {
        donorId=count;
        count++;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHemoglobinLevel() {
        return hemoglobinLevel;
    }

    public void setHemoglobinLevel(float hemoglobinLevel) {
        this.hemoglobinLevel = hemoglobinLevel;
    }
    
}
