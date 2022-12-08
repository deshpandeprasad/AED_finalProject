
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

//this is the nurseschool organization
public class NurseSchoolOrganization extends Organization {
    
    public NurseSchoolOrganization()
    {
        super(Organization.Type.NurseSchool.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NurseRole());
        return roles;
    }
    
}
