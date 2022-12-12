
package business.enterprisepkg;

import java.util.ArrayList;


//enterprise directory is here
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
      Enterprise enterprise = null;

       if (type == Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }

      else  if(type ==Enterprise.EnterpriseType.Hospital)
        {
         enterprise = new HospitalEnterprise(name);
         enterpriseList.add(enterprise);     
        }
      else if(type == Enterprise.EnterpriseType.Pharmacy)
      {
          enterprise = new PharmacyEnterprise(name);
          enterpriseList.add(enterprise);
      }
       else if(type == Enterprise.EnterpriseType.CoVolunteer)
      {
          enterprise = new CoVolunteerEnterprise(name);
          enterpriseList.add(enterprise);
      }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
