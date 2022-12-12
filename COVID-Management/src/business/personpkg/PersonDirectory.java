
package business.personpkg;

import java.util.ArrayList;

//this is the person directory
public class PersonDirectory {
    
      static ArrayList<Patient> patientList;
      private ArrayList<Person> personList;
      static ArrayList<Nurse> nurseList;
    
      public PersonDirectory()
      {
        patientList = new ArrayList<>();
        personList = new ArrayList<>();
        nurseList = new ArrayList<>();
      }

    public void setNurse(Nurse nurse) {
        nurseList.remove(nurse);
    }

    public Patient addPatient()
    {
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient)
    {
        patientList.remove(patient);
    }

    public static void setNurseList(ArrayList<Nurse> nurseList) {
        PersonDirectory.nurseList = nurseList;
    }

    public static ArrayList<Patient> getPatientList() {
        return patientList;
    }

      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public Person addNurse() {
           Nurse nurse = new Nurse();
        nurseList.add(nurse);
        return nurse;
    }

}
