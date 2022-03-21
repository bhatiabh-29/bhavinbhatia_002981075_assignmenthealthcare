/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.records;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author bhavinbhatia
 */
public class VitalSigns {
    private int pulseRate;
    private int temperature;
    private int bloodPressure;
    private String symptoms;
    private String alergies;
    private String medication;
    

    public VitalSigns(int pulseRate, int temperature,  int bloodPressure, 
            String symptoms, String alergies, String medication) {
        this.pulseRate = pulseRate;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.symptoms = symptoms;
        this.alergies = alergies;
        this.medication = medication;
//        this.encounter = encounter;
    }

    

    

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
    
    public boolean isAbnormal(){
        if(this.bloodPressure >= 100 && this.temperature >= 100) {
            return true;
        }
        return false;
    }
    
    
    
    
}
