package business;

import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import business.organizationpkg.Organization;
import business.personpkg.Person;
import business.rolepkg.*;
import business.userAccountpkg.*;

/**
 *
 * @author shravyagunda
 */
///final main project
public class ConfigureASystem {
    
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        UserAccount uacc = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        uacc.setEnabled(true);
        
//        Network network = system.addNetwork();
      
//        network.setCountry("Australia");
//        network.setState("Victoria");
//        network.setCity("Melbourne");

        // Hospital
//        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
//        person = enterprise.getPersonDirectory().addPerson();
//        person.setLastName("Hospital Admin");
//        person.setName();
//        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("mho", "mho", person, new AdminRole());
//        account.setEnabled(true);
//        account.setNetwork(network);
//        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
//        person = organization.getPersonDirectory().addPerson();    
//          
//        person.setFirstName("Doctor");
//        person.setLastName("Melbourne");
//        person.setName();
//        
//        account = organization.getUserAccountDirectory().addUserAccount("mdoc", "mdoc", person, new DoctorRole());
//        account.setNetwork(network);
//        account.setEnabled(true);
//        
//         organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Ambulance);
//         person = organization.getPersonDirectory().addPerson();    
//          
//        person.setFirstName("Ambulance");
//        person.setLastName("Driver");
//        person.setName();
//        
//        account = organization.getUserAccountDirectory().addUserAccount("mdr", "mdr", person, new DriverRole());
//        account.setNetwork(network);
//        account.setEnabled(true);
   
        // Government Enterprise
//        enterprise = network.getEnterpriseDirectory().addEnterprise("Govt", Enterprise.EnterpriseType.Government);
//        person = enterprise.getPersonDirectory().addPerson();
//        person.setLastName("Govt  Admin");
//        person.setName();
//        account = enterprise.getUserAccountDirectory().addUserAccount("mgovt", "mgovt", person, new AdminRole());
//        account.setEnabled(true);
//        account.setNetwork(network);
//        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.CovidOrganization);
//        person = organization.getPersonDirectory().addPerson();    
//          
//        person.setFirstName("Covid");
//        person.setLastName("Head");
//        person.setName();
//        
//        account = organization.getUserAccountDirectory().addUserAccount("mcov", "mcov", person, new CovidHeadRole());
//        account.setNetwork(network);
//        account.setEnabled(true);
     
    return system;
    }   
}