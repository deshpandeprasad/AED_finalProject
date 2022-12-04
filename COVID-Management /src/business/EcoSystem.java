package business;

import business.networkpkg.Network;
import business.organizationpkg.Organization;
import business.rolepkg.Role;
import business.rolepkg.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
public class EcoSystem extends Organization{
 
   private ArrayList<Network> networkList;
   private static EcoSystem ecoSystem;

    
   public EcoSystem()
   {
       super(null);
       networkList = new ArrayList<>();
      
   }
   
   public static EcoSystem getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new EcoSystem();
    }
    return ecoSystem;
   }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
}