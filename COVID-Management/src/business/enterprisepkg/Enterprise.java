package business.enterprisepkg;

import business.organizationpkg.Organization;
import business.organizationpkg.OrganizationDirectory;


//all enterprises
public abstract class Enterprise extends Organization{
    
    
    private String enterpriseId;
    private static int count = 1;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public Enterprise(String enterpriseName, EnterpriseType enterpriseType)
    {
        super(enterpriseName);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
        StringBuffer sb = new StringBuffer();
        sb.append("ENT");
        sb.append(count);
        enterpriseId = sb.toString();
        count++;
    }
    //enum for Enterprise types
    public enum EnterpriseType{

       CoVolunteer("Covid Volunteer"),
       Government("Government"),
       Hospital("Hospital"),
       Pharmacy("Pharmacy");
    
       
       private String value;
       
       private EnterpriseType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
