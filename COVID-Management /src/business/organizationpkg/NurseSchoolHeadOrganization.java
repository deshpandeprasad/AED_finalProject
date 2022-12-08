
package business.organizationpkg;

import business.rolepkg.*;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
//
//this is the nurseschoolhead organization

public class NurseSchoolHeadOrganization extends Organization {
    public NurseSchoolHeadOrganization()
    {
        super(Organization.Type.NurseSchoolHead.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NurseHeadRole());
        return roles;
    }
}
