    /*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    */
    package model.patient;

    import model.patient.Patient;
    import java.util.ArrayList;
import java.util.Date;
    import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import model.location.City;
import model.location.Community;
import model.location.House;
import model.location.Residence;
import model.person.Person;
import model.person.PersonDirectory;
import model.records.Encounter;
import model.records.EncounterHistory;
import model.records.VitalSigns;

    /**
    *
    * @author bhavinbhatia
    */
public class PatientGenerator {
    public static final String[] FIRST_NAME = {"James", "Michael", 
                "George", "Henry", "Charles", "Thomas", "Joseph", 
                "Mary", "Sarah", "Elizabeth", "Martha"};
    public static final String[] LAST_NAME = {"Smith", "Brown", "Miller", "Johnson", 
                "Jones", "Davis", "Williams"};
    public static final String[] GENDER = {"Male", "Female", "Chose Not To Say"};
    public static final int PATIENT_ID_START = 0000;
    public static final int PATIENT_ID_END = 9999;
    public static final int AGE_START = 20;
    public static final int AGE_END = 90;
    public static final String[] COMMUNITIES = {"Beacon Hill", "Back Bay", 
                "North End", "South End", "Allston", 
                "Somerville"};
    public static final String[] CITIES = {"Boston", "Cambridge", "New York"};
    public static final int PULSERATE_START = 60;
    public static final int PULSERATE_END = 120;
    public static final int TEMPERATURE_START = 95;
    public static final int TEMPERATURE_END = 104;
    public static final int RESPIRATION_START = 12;
    public static final int RESPIRATION_END = 20;
    public static final int BLOODPRESSURE_START = 80;
    public static final int BLOODPRESSURE_END = 150;
    public static final String[] SYMPTOMS ={"cold & flu", "Headache", "Mononucleosis",
                                "Stomach Ache","Diarrhea", "Conjunctivitis" };
    public static final String[] ALERGIES = {"foods", "pollen", "mold", "latex", 
                                   "pet dander"};
    public static final String[] MEDICATION = {"Atorvastatin", "Lisinopril",
                        "Metformin", "Pantoprazole", "Bupropion",
                              "Ibuprofen", "Aspirin"};

    public  VitalSigns getRandomVitalSigns() {
            Random random = new Random();

        int pulseRate = random.nextInt(PULSERATE_START, PULSERATE_END);
        int temperature = random.nextInt(TEMPERATURE_START, TEMPERATURE_END);
        int respiration = random.nextInt(RESPIRATION_START, RESPIRATION_END);
        int bloodPressure = random.nextInt(BLOODPRESSURE_START, BLOODPRESSURE_END);
        String symptoms = SYMPTOMS[random.nextInt(0, SYMPTOMS.length)];
        String alergies = ALERGIES[random.nextInt(0, ALERGIES.length)];
        String medication = MEDICATION[random.nextInt(0, MEDICATION.length)];
        
        return new VitalSigns(pulseRate, temperature, bloodPressure, 
                symptoms, alergies, medication);
        
    }
    
    public ArrayList<Residence> getRandomResidences() {
      Community community_A = new Community(COMMUNITIES[0]);
      for(int i = 100; i <= 105 ; i++) {
        community_A.addHouse(new House(i));
      }
      Community community_B = new Community(COMMUNITIES[1]);
      for(int i = 105; i <= 110 ; i++) {
        community_B.addHouse(new House(i));
      }
      Community community_C = new Community(COMMUNITIES[2]);
      for(int i = 110; i <= 115 ; i++) {
        community_C.addHouse(new House(i));
      }
      
      Community community_D = new Community(COMMUNITIES[3]);
      for(int i = 110; i <= 115 ; i++) {
        community_D.addHouse(new House(i));
      }
      
      Community community_E = new Community(COMMUNITIES[4]);
      for(int i = 10; i <= 15 ; i++) {
        community_E.addHouse(new House(i));
      
        }
      Community community_F = new Community(COMMUNITIES[5]);
      for(int i = 20; i <= 30 ; i++) {
        community_F.addHouse(new House(i));
      }
      
      
      City boston = new City(CITIES[0]);
      boston.addCommunity(community_A);
        boston.addCommunity(community_B);

      
      City newYork = new City(CITIES[1]);
      newYork.addCommunity(community_C);
      newYork.addCommunity(community_D);

      City cambridge = new City(CITIES[2]);
        cambridge.addCommunity(community_E);

        cambridge.addCommunity(community_F);

        ArrayList<Residence> residences = new ArrayList<>();
        
        residences.add(new Residence(boston, 
                boston.getCommunities().get(0), 
                community_A.getHouses().get(0)
                
                ));
        
        residences.add(new Residence(boston, 
                community_A, 
                community_A.getHouses().get(1)
                
                ));
        
        residences.add(new Residence(boston, 
                community_B,
                community_B.getHouses().get(2)
                
                ));
        
        residences.add(new Residence(newYork, 
                community_C, 
                community_C.getHouses().get(0)
                
                ));
        
        residences.add(new Residence(newYork, 
                community_D,
                community_D.getHouses().get(0)
                
                ));
        
        residences.add(new Residence(cambridge, 
                community_E, 
                community_E.getHouses().get(0)
                
                ));
        
         residences.add(new Residence(cambridge, 
                community_F, 
                community_F.getHouses().get(0)
                
                ));
        
        return residences;

                  
    }
    
    public PersonDirectory getRandomPersonDirectory(int count) {
        PersonDirectory personDirectory = new PersonDirectory();
        for(int i = 0 ; i <= count ; i++) {
            Person person = getRandomPerson();
            personDirectory.addPerson(person);
        }
        return personDirectory;
    }
    
    public Person getRandomPerson() {
            Random random = new Random();

          String firstName = FIRST_NAME[random.nextInt(0, FIRST_NAME.length)];
            String lastName = LAST_NAME[random.nextInt(0, LAST_NAME.length)];
            String gender = GENDER[random.nextInt(0, GENDER.length)];
            int age = random.nextInt(AGE_START, AGE_END);

        String fullName = firstName + " " + lastName;
        ArrayList<Residence> residences = getRandomResidences();
        int randomIndex = random.nextInt(0, residences.size());
        Residence residence = residences.get(randomIndex);
        Person person = new Person(fullName, gender, age, residence);
        return person;
    }
    
    public PatientDirectory getRandomPatientDirectory(PersonDirectory personDirectory, 
                int count) {
        PatientDirectory patientDirectory = new PatientDirectory();
        Random random = new Random();
        for(int i = 0; i < count ; i++) {
            Person person = personDirectory.getPersons().get(i);
            int patientId = random.nextInt(PATIENT_ID_START, PATIENT_ID_END);         
            Patient patient = new Patient(patientId, person);
            EncounterHistory encounterHistory = getRandomEncounterHistory();
            patient.setEncounterHistory(encounterHistory);
            patientDirectory.addPatient(patient);
        }
        
        return patientDirectory;
    }
    
    public EncounterHistory getRandomEncounterHistory(){
        EncounterHistory encounterHistory = new EncounterHistory();
        for (int i = 0 ; i <= 3 ; i++) {
            Encounter encounter = this.getRandomEncounter();
            encounterHistory.addNewEncounter(encounter);

        }
        return encounterHistory;
    }
    
    public Encounter getRandomEncounter() {
        VitalSigns vitalSigns = this.getRandomVitalSigns();
         long today = new Date().getTime();
        long aDay = TimeUnit.DAYS.toMillis(1);
        Date startDate = new Date(today - aDay * 365 * 2);
        Date endDate = new Date(today + aDay * 365 * 2);
        Date randomDate = this.between(startDate, 
               endDate);
        Encounter encounter = new Encounter(randomDate, vitalSigns);
        return encounter;
    }
    
    
    public static Residence getResidence(String cityName, String communityName) {
        PatientGenerator generator = new PatientGenerator();
        for (Residence residence: generator.getRandomResidences()){
            if (residence.getCity().getCityName().equalsIgnoreCase(cityName) &&
                    residence.getCommunity().getCommunityName().equalsIgnoreCase(communityName)){
                return residence;
            }
        }
        return null;
    }
    
     public static Date between(Date startInclusive, Date endExclusive) {
        
            // Taken from : https://www.baeldung.com/java-random-dates
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
          .current()
          .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }
}
    




