
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

////this is the ambulance organization
public class AmbulanceOrganization extends Organization{
    
        public AmbulanceOrganization()
    {
        super(Organization.Type.Ambulance.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
