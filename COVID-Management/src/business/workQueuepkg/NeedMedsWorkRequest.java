
package business.workQueuepkg;

import business.common.Medicine;


/**
 *
 * @author shravyagunda
 */

//this is the needmedsworkrequest
public class NeedMedsWorkRequest extends WorkRequest{
     private String requestId;
    private static int count = 000;
    private String needMedicine;
    private String reqResult;
    private Medicine med;
    
     public NeedMedsWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }

    public String getNeedMedicine() {
        return needMedicine;
    }

    public void setNeedMedicine(String needMedicine) {
        this.needMedicine = needMedicine;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        NeedMedsWorkRequest.count = count;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public Medicine getMed() {
        return med;
    }

    public void setMed(Medicine med) {
        this.med = med;
    }
    
//     @Override
//    public String toString() {
//       Doctor doc = (Doctor)this.getSender().getPerson();
//        String address = doc.getAddress1().concat(doc.getAddress1().concat(doc.getTown()));
//        return address;
//                
//    }
    
    
    
}
