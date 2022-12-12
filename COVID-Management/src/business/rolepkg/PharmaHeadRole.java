
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;
import userInterface.pharmacyHeadpkg.PharmaHeadWorkAreaJPanel;

/**
 *
 * @author shravyagunda
 */
//this the pharmahead role
public class PharmaHeadRole extends Role {
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmaHeadWorkAreaJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),account, organization, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
