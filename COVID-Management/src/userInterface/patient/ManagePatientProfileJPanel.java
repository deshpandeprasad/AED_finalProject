
package userInterface.patient;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

//this is the ManagePatientProfileJPanel
public class ManagePatientProfileJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
    private UserAccount userAccount; 
   private Enterprise enterprise;
   private EcoSystem ecoSystem;
  
    public ManagePatientProfileJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        patientName.setText(userAccount.getPerson().getName());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        getAlertFromHH = new javax.swing.JLabel();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        patientName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Manage Patient Profile ");
        add(getAlertFromHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 41, 360, -1));

        viewAndUpdateProfileBtn.setText("View / Update Profile");
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });
        add(viewAndUpdateProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 144, 234, -1));

        patientName.setText("Patient Name");
        add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 44, 235, 34));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 438, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opaque-mask1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1300, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
        UpdatePatientProfile viewVolunteerProfile = new UpdatePatientProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientName;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    // End of variables declaration//GEN-END:variables
}
