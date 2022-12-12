
package business.enterprisepkg;

import business.rolepkg.Role;
import java.util.ArrayList;

//this is the hospital enterprise
public class HospitalEnterprise extends Enterprise{
 
      
     public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
