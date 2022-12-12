
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;
import userInterface.emergencyDoctor.EmergencyDoctorWorkAreaJPanel;

/**
 *
 * @author shravyagunda
 */
//this the emergencydoctor role
public class EmergencyDoctorRole  extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EmergencyDoctorWorkAreaJPanel(userProcessContainer,business, account);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}