
package business.enterprisepkg;

import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */


//this is the covid volunteer enterprise
public class CoVolunteerEnterprise extends Enterprise{
     public CoVolunteerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CoVolunteer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

