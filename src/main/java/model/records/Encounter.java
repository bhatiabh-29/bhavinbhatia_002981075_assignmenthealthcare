/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.records;

import model.patient.Patient;

/**
 *
 * @author bhavinbhatia
 */
public class Encounter {
    
    VitalSigns vitalSigns;
    int date;
    EncounterHistory encounterHistory;

    
    
    
    
//    public Encounter(EncounterHistory encounterHistory){
//        this.encounterHistory=encounterHistory;
//        
//    }

    public Encounter(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
        
    }

    public Encounter(VitalSigns vitalSigns, int date) {
        this.vitalSigns = vitalSigns;
        this.date = date;
    }
    
    

   

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "" + date;
    }
    
    
    
    
    
}
