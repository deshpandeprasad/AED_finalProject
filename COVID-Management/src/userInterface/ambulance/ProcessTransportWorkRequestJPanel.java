
package userInterface.ambulance;

import business.userAccountpkg.UserAccount;
import business.workQueuepkg.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//this is the ProcessTransportWorkRequestJPanel
public class ProcessTransportWorkRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private NeedTransportWorkRequest request;
    private UserAccount userAccount;
   
    public ProcessTransportWorkRequestJPanel(JPanel userProcessContainer, NeedTransportWorkRequest request, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        
        populateResultComboBox();
    }
    
    public void populateResultComboBox()
    {
        resultCmb.removeAllItems();
        resultCmb.addItem(DoctorWorkRequest.REQUEST_ACCEPT);
        resultCmb.addItem(DoctorWorkRequest.REQUEST_REJECT);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultCmb = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 221, -1, -1));

        jLabel1.setText("Request Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 125, -1, -1));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Process Work Request:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 42, 300, -1));

        resultCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(resultCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 122, 163, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opaque-ambulance.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1300, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(resultCmb.getSelectedIndex()<0 )
        {
         JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
         return;
        }
        request.setTransReqResult((String)resultCmb.getSelectedItem());
        request.setStatus(DoctorWorkRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DriverWorkAreaJPanel driverWorkAreaPanel = (DriverWorkAreaJPanel) component;
        driverWorkAreaPanel.populatetransportRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox resultCmb;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
