        /*
        * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
        * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
        */
        package model.person;

        import java.util.ArrayList;

        /**
        *
        * @author bhavinbhatia
        */
        public class PersonDirectory {

        ArrayList<Person> persons;
        Person person;

        public PersonDirectory(){
        this.persons = new ArrayList<>();
        }

        public PersonDirectory(ArrayList<Person> persons) {
        this.persons = persons;
        }

        public ArrayList<Person> getPersons() {
        return persons;
        }

        public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        }

        public Person addPerson (Person newPerson){
        persons.add(newPerson);
        return newPerson;
        }

        

        public Person getPersonsByName(String name) {

        ArrayList<Person> foundPersons = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
        if (person.getName().equals(name)){
        foundPersons.add(i, person);

        }

        }
        return person;
        }
        
        public void deletePerson (int index){
        persons.remove(index);
    }

        }
