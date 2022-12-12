
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

////this is the covid organization
public class CovidOrganization extends Organization {
    
     public CovidOrganization()
    {
        super(Organization.Type.CovidOrganization.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CovidHeadRole());
        return roles;
    }
    
}
