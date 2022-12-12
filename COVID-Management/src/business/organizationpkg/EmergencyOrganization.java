
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
////this is the emergency organization
public class EmergencyOrganization extends Organization{
         public EmergencyOrganization()
    {
        super(Organization.Type.EmergencyDoctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyDoctorRole());
        return roles;
    }
}
