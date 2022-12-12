
package userInterface.ambulance;

import business.EcoSystem;
import business.common.TableHeadColors;
import business.organizationpkg.*;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.*;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.patient.ViewPatientProfile;

//this sis the DriverWorkAreaJPanel
public class DriverWorkAreaJPanel extends javax.swing.JPanel {
   private JPanel userProcessContainer;
   private UserAccount userAccount;  
    private OrganizationDirectory od;
    private AmbulanceOrganization ambOrg;
    private EcoSystem ecoSystem;
    
    
    public DriverWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, OrganizationDirectory od, EcoSystem ecoSystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.userAccount = userAccount;
         this.od = od;
         this.ambOrg = (AmbulanceOrganization)organization;
         this.ecoSystem = ecoSystem;
         
         populatetransportRequestTable();
         transportRequestJTable.getTableHeader().setDefaultRenderer(new TableHeadColors());
    }
    
     public void populatetransportRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)transportRequestJTable.getModel();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        model.setRowCount(0);
        
        System.out.println(ambOrg);
        System.out.println(ambOrg.getUserAccountDirectory().getUserAccountList());
        System.out.println(userAccount.getWorkQueue().getWorkRequestList());
        
        if(ambOrg.getWorkQueue().getWorkRequestList().isEmpty())
        {
            System.out.println("Requests empty");
            
        }
        if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getName();
            row[2] = dateFormat.format(request.getRequestDate());
            row[3] = request.getStatus();
           
            model.addRow(row);
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transportRequestJTable = new javax.swing.JTable();
        processReqBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        viewPatProfileBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Ambulance Requests");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 81, 253, -1));

        transportRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination Location", "Requestor", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transportRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 496, 173));

        processReqBtn.setText("Process");
        processReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReqBtnActionPerformed(evt);
            }
        });
        add(processReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 90, -1, -1));

        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        viewPatProfileBtn.setText("View Patient Details");
        viewPatProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatProfileBtnActionPerformed(evt);
            }
        });
        add(viewPatProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opaque-ambulance.png"))); // NOI18N
        jLabel1.setText("image");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1300, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void processReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReqBtnActionPerformed

        int selectedRow = transportRequestJTable.getSelectedRow();

        if (selectedRow < 0){
          JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedTransportWorkRequest ntwr = (NeedTransportWorkRequest)transportRequestJTable.getValueAt(selectedRow, 0);
        if(ntwr.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ntwr.getStatus().equalsIgnoreCase("Completed"))
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
         if(ntwr.getStatus().equalsIgnoreCase("Processing") ||  ntwr.getStatus().equalsIgnoreCase("Pending"))
        {
         if(ntwr.getReceiver()!=userAccount)
         {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
         }
        }
        ntwr.setStatus("Processing");
        ntwr.setReceiver(userAccount);
        ProcessTransportWorkRequestJPanel ptwrjp = new ProcessTransportWorkRequestJPanel(userProcessContainer, ntwr, userAccount);
        userProcessContainer.add("ProcessTransportWorkRequestJPanel", ptwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processReqBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populatetransportRequestTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        int selectedRow = transportRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)transportRequestJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populatetransportRequestTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void viewPatProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatProfileBtnActionPerformed
       
        int selectedRow = transportRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)transportRequestJTable.getValueAt(selectedRow, 0);
        UserAccount ua = (UserAccount)request.getSender();
        
         ViewPatientProfile viewVolunteerProfile = new ViewPatientProfile(userProcessContainer, ua,ecoSystem);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton processReqBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable transportRequestJTable;
    private javax.swing.JButton viewPatProfileBtn;
    // End of variables declaration//GEN-END:variables
}
