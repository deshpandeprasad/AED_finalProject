
package business.workQueuepkg;

import java.util.ArrayList;

//this is the work queue
public class WorkQueue {
    
     private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
