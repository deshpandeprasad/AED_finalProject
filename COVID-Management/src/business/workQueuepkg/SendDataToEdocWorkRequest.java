
package business.workQueuepkg;

import business.vitalsign.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
//this is the senddatatoedoctorworkrequest
public class SendDataToEdocWorkRequest extends WorkRequest
{
 
    private String sendDataRequestId;
    private static int count = 000;
    private ArrayList<VitalSign> vitalSignList;

     public SendDataToEdocWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
        vitalSignList = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        
        return this.sendDataRequestId;       
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }


}
