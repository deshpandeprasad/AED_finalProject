
package business.enterprisepkg;

import business.rolepkg.Role;
import java.util.ArrayList;

//this is the governmnet enterprise
public class GovernmentEnterprise extends Enterprise{
    
     public GovernmentEnterprise(String name) {
        super(name, EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
