
package business.organizationpkg;

import business.organizationpkg.Organization.Type;
import java.util.ArrayList;

//this is the organization directory

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.NurseSchool.getValue())){
            organization = new NurseSchoolOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }

         else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.CovidOrganization.getValue())){  
            organization = new CovidOrganization();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.EmergencyDoctor.getValue())){
                organization = new EmergencyOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacyHead.getValue())){
                organization = new PharmacyOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NurseSchoolHead.getValue())){
                organization = new NurseSchoolHeadOrganization();
                organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
    
}
