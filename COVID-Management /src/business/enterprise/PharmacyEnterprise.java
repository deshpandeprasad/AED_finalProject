
package business.enterprisepkg;

import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */

//this is the pharmacy enterprise
public class PharmacyEnterprise extends Enterprise{
     public PharmacyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
