        /*
        * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
        * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
        */
        package model.patient;

import java.util.ArrayList;
        import model.records.EncounterHistory;
        import model.person.Person;
                import model.records.Encounter;
import model.records.VitalSigns;


        /**
        *
        * @author bhavinbhatia
        */
        public class Patient {


        private int patientId;        
  
        Person person;
        EncounterHistory encounterHistory;
        

        public Patient(int patientId,
                    Person person,
                    EncounterHistory encounterHistory) {
            this.patientId = patientId;
            this.person = person;
            this.encounterHistory = encounterHistory;
        }
        
         public Patient(int patientId, Person person) {
            this.patientId = patientId;
            this.person = person;
            this.encounterHistory = new EncounterHistory();
        }
         
         
        public int getPatientId() {
            return patientId;
        }

        public void setPatientId(int patientId) {
            this.patientId = patientId;
        }


        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public EncounterHistory getEncounterHistory() {
            return encounterHistory;
        }

        public void setEncounterHistory(EncounterHistory encounterHistory) {
            this.encounterHistory = encounterHistory;
        }

        public boolean getIsAbnormal() {
            ArrayList<Encounter> encounters = this.getEncounterHistory().getEncounters();
            if (!encounters.isEmpty()) {
                      Encounter latestEncounter = encounters.get(encounters.size() - 1);
            return latestEncounter.getVitalSigns().isAbnormal();
                
            }
            return false;
        }

        public static boolean validatePatienIdNotNull (String patientId){
              if (patientId == null || patientId.isEmpty()){
                  return false;
              }
            return true;
        }
  
        
        public VitalSigns getLatestVitalSigns() {
            ArrayList<Encounter> encounters = this.encounterHistory.getEncounters();
            Encounter latestEncounter = encounters.get(encounters.size() - 1);
            return latestEncounter.getVitalSigns();
        }
        
        

  }