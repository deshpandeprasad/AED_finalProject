
package business.common;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import business.organizationpkg.*;
import business.userAccountpkg.UserAccount;
import java.util.Calendar;
import java.util.Date;

//gets all organizations
public class GetOrganizations {
   
    public static boolean validateString(String name)
    {
        return true;
    }
    
    public static int calculateAge(Date dateOfBirth)
    {
       try
       {     
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
        age--;
        return age;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static NurseSchoolOrganization getNurseSchoolOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        NurseSchoolOrganization volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.CoVolunteer))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof NurseSchoolOrganization)
             {
              volunteerOrganization = (NurseSchoolOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException e)
        {
          e.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
 
    
       public static AmbulanceOrganization getAmbulanceOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        AmbulanceOrganization transportOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof AmbulanceOrganization)
             {
              transportOrganization = (AmbulanceOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return transportOrganization;
    } 
       
     public static DoctorOrganization getDoctorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DoctorOrganization doctorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DoctorOrganization)
             {
              doctorOrganization = (DoctorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException e)
        {
          e.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
     
      
      
      
      
      
        public static EmergencyOrganization getEmergencyOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        EmergencyOrganization emergencyOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof EmergencyOrganization)
             {
              emergencyOrganization = (EmergencyOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException e)
        {
          e.printStackTrace();
         return null;
        }
        return emergencyOrganization;
    }
        public static PharmacyOrganization getPharmacyOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        PharmacyOrganization pharmacyOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Pharmacy))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof PharmacyOrganization)
             {
              pharmacyOrganization = (PharmacyOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException e)
        {
          e.printStackTrace();
         return null;
        }
        return pharmacyOrganization;
    }
      
 
}
