
package business.organizationpkg;

import business.personpkg.PersonDirectory;
import business.rolepkg.Role;
import business.userAccountpkg.UserAccountDirectory;
import business.workQueuepkg.WorkQueue;
import java.util.ArrayList;


//this has organiation structure
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccountDirectory();
    personDirectory = new PersonDirectory();
    workQueue = new WorkQueue();
    counter++;
    orgId = counter;
    }
    //enum for organization type
    public enum Type
    {
     Admin("Admin"),
     NurseSchool("Nurse School Organization"),
     Patient("Patient Organization"),
     NurseSchoolHead("Nurse School Head Organization"),
     Ambulance("Ambulance Organization"),
     CovidOrganization("Covid Organization"),
     Doctor("Doctor Organization"),
     EmergencyDoctor("Emergency Organization"),
     PharmacyHead("Pharmacy Head Organization");
     
     
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
