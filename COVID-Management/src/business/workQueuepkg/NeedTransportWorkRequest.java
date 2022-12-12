
package business.workQueuepkg;

import business.personpkg.Patient;

//this is the needtransportworkrequest
public class NeedTransportWorkRequest extends WorkRequest{
    
    private String transRequestId;
    private static int count = 000;
    private String needTransport;
    private String transReqResult;
    
    
     public NeedTransportWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        transRequestId = sb.toString();
        count++;
    }
     
    public void setNeedTransport(String needTransport) {
        this.needTransport = needTransport;
    }

    public String getNeedTransport() {
        return needTransport;
    }

    @Override
    public String toString() {
       Patient pat = (Patient)this.getSender().getPerson();
        String address = pat.getAddress1().concat(pat.getAddress1().concat(pat.getTown()));
        return address;
                
    }

    public String getTransReqResult() {
        return transReqResult;
    }

    public void setTransReqResult(String transReqResult) {
        this.transReqResult = transReqResult;
    }
     
     
}
