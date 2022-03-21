/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.records;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.patient.Patient;

/**
 *
 * @author bhavinbhatia
 */
public class Encounter {
    
    VitalSigns vitalSigns;
    Date date;
    EncounterHistory encounterHistory;

    
    
    
    
//    public Encounter(EncounterHistory encounterHistory){
//        this.encounterHistory=encounterHistory;
//        
//    }

    public Encounter(Date date, VitalSigns vitalSigns) {
        this.date = date;
        this.vitalSigns = vitalSigns;
        
    }

 

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "" + date;
    }
    
    
    
    
    
}
