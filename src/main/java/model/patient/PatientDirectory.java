    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package model.patient;

    import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

    /**
     *
     * @author bhavinbhatia
     */
    public class PatientDirectory {

        ArrayList<Patient> patients;

        public PatientDirectory(){
            this.patients= new ArrayList<Patient>();
        }

        public PatientDirectory(ArrayList<Patient> patients) {
            this.patients = patients;
        }


        public ArrayList<Patient> getPatients() {
            return patients;
        }

        public void setPatients(ArrayList<Patient> patients) {
            this.patients = patients;
        }
        
        public Patient addPatient (Patient patient){
            patients.add(patient);
            return patient;
        }
        
        public Patient getPatientById(int id){
            for (Patient patient : patients){
                if (patient.getPatientId() == id){
                    return patient;
                }
            }
           return null;
           
        }
        
        
        public ArrayList<Patient> getAllAbnormalPatients(){
            ArrayList<Patient> allAbnormalPatients = new ArrayList<>();
            
            for (Patient patient: patients){
                if (patient.getIsAbnormal()){
                    allAbnormalPatients.add(patient);
                }
            }
            return allAbnormalPatients;
            
        }
        
        public ArrayList<Patient> searchPatientsByLocation(String cityName,
                String communityName) {
            
            ArrayList<Patient> searchResults = new ArrayList<>();
            
            for (Patient patient : patients) {
                model.location.Residence residence = patient.getPerson().getResidence();
                
                if (!cityName.isEmpty() & !communityName.isEmpty()) {
                     if (residence.getCity().getCityName().equals(cityName) &
                        residence.getCommunity().getCommunityName().equals(communityName)){
                        searchResults.add(patient);
                    }
                } else     if (!cityName.isEmpty()) {
                     if (residence.getCity().getCityName().equals(cityName)){
                        
                        searchResults.add(patient);
                    }
                } else     if (!communityName.isEmpty()) {
                     if (
                        residence.getCommunity().getCommunityName().equals(communityName)){
                        searchResults.add(patient);
                    }
                } 
               
            }
            return searchResults;
        }
        


    }
