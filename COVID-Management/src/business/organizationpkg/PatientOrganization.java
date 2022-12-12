
package business.organizationpkg;


import business.rolepkg.*;
import java.util.ArrayList;


//this is the patient organization
public class PatientOrganization extends Organization{
    
    public PatientOrganization()
    {
        super(Organization.Type.Patient.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
    
}
