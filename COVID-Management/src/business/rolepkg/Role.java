
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;

//this has the role structure
public abstract class Role {
    
    //enum for role types
    public enum RoleType{
        Admin("Admin"),
        NurseRole("Nurse Role"),
        NurseHeadRole("Nurse Head Role"),
        Driver("Driver"),
        CovidHead("Covid Head"),
        Doctor("Doctor"),
        EmergencyDoctor("Emergency Doctor"),
        Patient("Patient"),
        PharmacyHead("Pharmacy Head");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
    
}
