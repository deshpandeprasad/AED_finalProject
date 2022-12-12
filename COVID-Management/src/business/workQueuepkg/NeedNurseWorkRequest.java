
package business.workQueuepkg;

/**
 *
 * @author shravyagunda
 */
//this is the neednurseworkrequest
public class NeedNurseWorkRequest extends WorkRequest {
     private String nurseRequestId;
    private static int count = 000;
    private String needNurse;
    private String nurseReqResult;

    public NeedNurseWorkRequest() {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        nurseRequestId = sb.toString();
        count++;
    }

    public String getNurseRequestId() {
        return nurseRequestId;
    }

    public void setNurseRequestId(String nurseRequestId) {
        this.nurseRequestId = nurseRequestId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        NeedNurseWorkRequest.count = count;
    }

    public String getNeedNurse() {
        return needNurse;
    }

    public void setNeedNurse(String needNurse) {
        this.needNurse = needNurse;
    }

    public String getNurseReqResult() {
        return nurseReqResult;
    }

    public void setNurseReqResult(String nurseReqResult) {
        this.nurseReqResult = nurseReqResult;
    }
    
    
}
