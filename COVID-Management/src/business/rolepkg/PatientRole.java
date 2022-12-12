
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;
import userInterface.patient.PatientWorkAreaJPanel;

//this the patient role
public class PatientRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
