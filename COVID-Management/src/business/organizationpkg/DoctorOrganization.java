
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

////this is the doctor organization
public class DoctorOrganization extends Organization {
    
     public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
