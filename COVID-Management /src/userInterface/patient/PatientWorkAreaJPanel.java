
package userInterface.patient;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.personpkg.Patient;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToEdocWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//this is the PatientWorkAreaJPanel
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private Enterprise enterprise;
      private UserAccount userAccount;  
      private EcoSystem ecoSystem;
      private Patient person;
    private static int count = 0;
     private static boolean patientCond = false;
    
    public PatientWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise , UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise; 
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        setBackground(new Color(182,201,233));
       
       
        person  = (Patient)userAccount.getPerson();
        alertsPanel.setVisible(false);
      
         populateAlerts();
         alertsPanel.revalidate();
    }

    public void populateAlerts()
    {
       int count = 0;
        displayAlerts(); 
    }

    public void displayAlerts()
    {
      alertsPanel.removeAll();
      alertsPanel.revalidate();
       alertsPanel.setLayout(new GridLayout(10, 1,10,10));
       JTextArea textArea;
       JTextField txtField;
       StringBuilder sb ;
       int count = 0;
       int pos = 0;
         boolean flag = false;

            if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
            {
                txtField = new JTextField("No Requests");   
                txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
                txtField.setVisible(true);
                txtField.setEditable(false);
 
            }
      
      
       if(!(userAccount.getWorkQueue().getWorkRequestList().isEmpty()))
       {
       for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {

            System.out.println(request.getSender());
            System.out.println(request.getStatus());
            System.out.println(request.getMessage());
            if(request.getMessage().equalsIgnoreCase("Sending patient") && request.getStatus().equalsIgnoreCase("Completed"))
            {
            if(count<5)
            {
            SendDataToEdocWorkRequest dataToDoctorWorkRequest = (SendDataToEdocWorkRequest)request;
             txtField = new JTextField(" Message From Doctor: "+dataToDoctorWorkRequest.getReceiver().getPerson().getName());
             txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            
            JTextField txtField1 = new JTextField("Your Current Covid Vitals:");
            txtField1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField1.setVisible(true);
            txtField1.setEditable(false);
            
            Patient pat = (Patient)request.getSender().getPerson();
            
            textArea = new JTextArea("SPo2 Level: " + Float.toString(pat.getSpo2Level()));
            textArea.setVisible(true);
            textArea.setEditable(false);
            //count++;
                JTextArea textArea1 = new JTextArea("Temperature: " + Float.toString(pat.getTemperature()));
            textArea1.setVisible(true);
            textArea1.setEditable(false);
            
            JTextArea textArea2 = new JTextArea("No Severe Breathing Difficulty");
           
            if(pat.getVitalSign().isIsBreathingDifficulty())
            {
               textArea2.removeAll();
               textArea2.setText("Severe Breathing Difficulty");
               textArea2.setVisible(true);
               textArea2.setEditable(false);
            }
            
            JTextArea textArea3 = new JTextArea("Lungs Not affected");
            
            if(pat.getVitalSign().isIsLungsEffected())
            {
               textArea3.removeAll();
               textArea3.setText("Lungs Affected");
               textArea3.setVisible(true);
               textArea3.setEditable(false);
                
            }
            
            
            JTextArea textArea4 = new JTextArea("Covid Negative");
            
            if(pat.getVitalSign().isIsCovid())
            {
               textArea4.removeAll();
               textArea4.setText("Covid Positive");
               textArea4.setVisible(true);
               textArea4.setEditable(false);
                
            } 
 
            alertsPanel.add(txtField,pos);
            alertsPanel.add(txtField1,++pos);
            alertsPanel.add(textArea,++pos);
             alertsPanel.add(textArea1,++pos);
              alertsPanel.add(textArea2,++pos);
              alertsPanel.add(textArea3,++pos);
              alertsPanel.add(textArea4,++pos);
            ++pos;
            flag = true;
            }

            }
           
        }
       }

        if(flag)
        {
        alertsPanel.revalidate();
        alertsPanel.setVisible(true);
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

        managePatientProfile = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        alertsPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(0, 153, 255));

        managePatientProfile.setText("Manage Profile");
        managePatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientProfileActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Patient WorkArea");

        alertsPanel.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout alertsPanelLayout = new javax.swing.GroupLayout(alertsPanel);
        alertsPanel.setLayout(alertsPanelLayout);
        alertsPanelLayout.setHorizontalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        alertsPanelLayout.setVerticalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managePatientProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt)
                        .addGap(272, 272, 272)
                        .addComponent(managePatientProfile))
                    .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(374, 374, 374))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientProfileActionPerformed
        ManagePatientProfileJPanel managePatietnProfileJPanel = new ManagePatientProfileJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ManagePatietnProfileJPanel", managePatietnProfileJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertsPanel;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton managePatientProfile;
    // End of variables declaration//GEN-END:variables


}
