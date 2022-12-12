
package business.organizationpkg;


import business.rolepkg.*;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
//this is the pharmacy organization
public class PharmacyOrganization extends Organization{
      public PharmacyOrganization()
    {
        super(Organization.Type.PharmacyHead.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmaHeadRole());
        return roles;
    }
}
