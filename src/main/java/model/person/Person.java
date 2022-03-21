    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package model.person;

import model.location.City;
import model.location.Community;
   import model.location.House;
import model.location.Residence;

    /**
     *
     * @author bhavinbhatia
     */
    
    public class Person {
        private String Name;
        private String gender;
        private int age;
        private Residence residence;
      

        public Person(String Name, String gender, int age, Residence residence) {
            this.Name = Name;
            this.gender = gender;
            this.age = age;
            this.residence = residence;
     }
   
        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

    
    @Override
    public String toString() {
        return  Name;
    }
    
    public  static boolean validateNotNull(String name, String age, 
                                            String gender){
        if(name == null || name.isEmpty() ||
                age == null || age.isEmpty() ||
                    gender == null || gender.isEmpty()){
            return false;
        }
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }
    
    
    
    
    
        
        



    }
