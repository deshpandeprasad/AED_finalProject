
package userInterface.common;

import business.EcoSystem;
import business.common.*;
import business.enterprisepkg.*;
import business.networkpkg.Network;
import business.organizationpkg.*;
import business.personpkg.*;
import business.rolepkg.*;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.DoctorWorkRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//this is the RegistrationWorkAreaPanel
public class RegistrationWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private EcoSystem ecoSystem; 
    private Enterprise enterprise;
    private Organization organization;
    
    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    public RegistrationWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.ecoSystem = ecoSystem;
       
       patientPane.setVisible(true);
         
        addInputVerifiers();
        
        populateCountryComboBox();
        populateNetworkComboBox();
        
        
    }
    
      private void addInputVerifiers() {
          
        InputVerifier stringValidation = new StringValidation();
        firstNameTxt.setInputVerifier(stringValidation);
        lastNameTxt.setInputVerifier(stringValidation);
        addressTxt.setInputVerifier(stringValidation);
        townTxt.setInputVerifier(stringValidation);
        addressTxt.setInputVerifier(stringValidation);
        userNameTxt.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new PasswordValidation();
        passwordTxt.setInputVerifier(passwordValidation);
        confirmPasswordTxt.setInputVerifier(passwordValidation);
        
        InputVerifier dobValidtion = new DOBValidation();
        DobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new NumberValidation();
        zipcodeTxt.setInputVerifier(numberValidation);
        
        InputVerifier emailValidtion = new EmailValidation();
        emailTxt.setInputVerifier(emailValidtion);
        
        InputVerifier tempValidation = new NumberValidation();
        tempTxt.setInputVerifier(tempValidation);
        
        InputVerifier spo2Validation = new NumberValidation();
        spo2Txt.setInputVerifier(spo2Validation);
        
        
      
    }
    
    private void populateCountryComboBox(){
        countryCmb.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");  
         return;        
        }
        countryCmb.addItem("Please select a country");
        String networkVal = "";   
        HashSet<String> hs = new HashSet();
           
        for(Network network : ecoSystem.getNetworkList()){
           if(!network.getCountry().equals(networkVal))
           {
               hs.add(network.getCountry());
           }
        }
        for(String s : hs)
        {
         countryCmb.addItem(s);
        }
        }
    
         private void populateNetworkComboBox()
         {
        
        patientNetworkCmb.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        patientNetworkCmb.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             patientNetworkCmb.addItem(network);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        DobField = new javax.swing.JFormattedTextField();
        addressTxt = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        townTxt = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        patientPane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordTxt = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        patientNetworkCmb = new javax.swing.JComboBox();
        createProfileButton = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderCmb = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        countryCmb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stateCmb = new javax.swing.JComboBox();
        Spo2Label = new javax.swing.JLabel();
        zipcodeTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        covidYesRbtn = new javax.swing.JRadioButton();
        coughNoRbtn = new javax.swing.JRadioButton();
        Spo2Label1 = new javax.swing.JLabel();
        tempTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        coughYesRbtn = new javax.swing.JRadioButton();
        covidNoRbtn = new javax.swing.JRadioButton();
        spo2Txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(DobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 176, -1));
        DobField.getAccessibleContext().setAccessibleDescription("");

        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 175, -1));

        town.setText("Town/City: ");
        add(town, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        add(townTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 176, -1));

        zipCode.setText("Zip Code:");
        add(zipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 78, -1));

        emailID.setText("Email Address:");
        add(emailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 101, -1));
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 178, -1));

        firstName.setText("First Name:");
        add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 176, -1));

        LastName.setText("Last Name:");
        add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 78, -1));
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 176, -1));

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");
        add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 194, -1));

        address1.setText("Address Line1 : ");
        add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        patientPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Create User Account:");

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Confirm Password");

        helpSeekerNw.setText("Please Select the Closest City");

        patientNetworkCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNetworkCmbActionPerformed(evt);
            }
        });

        createProfileButton.setText("Register");
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });

        patientPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(passwordTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(userNameTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(confirmPasswordTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(helpSeekerNw, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(patientNetworkCmb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientPane.setLayer(createProfileButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout patientPaneLayout = new javax.swing.GroupLayout(patientPane);
        patientPane.setLayout(patientPaneLayout);
        patientPaneLayout.setHorizontalGroup(
            patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(helpSeekerNw, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientPaneLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(passwordTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientNetworkCmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(patientPaneLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        patientPaneLayout.setVerticalGroup(
            patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(52, 52, 52)
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpSeekerNw)
                    .addComponent(patientNetworkCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(createProfileButton)
                .addGap(27, 27, 27))
        );

        add(patientPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 450, 350));

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Register as Patient");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 296, -1));

        jLabel1.setText("Gender:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        genderCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCmbActionPerformed(evt);
            }
        });
        add(genderCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 180, -1));

        jLabel3.setText("Country:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        countryCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCmbActionPerformed(evt);
            }
        });
        add(countryCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 175, -1));

        jLabel6.setText("State:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        stateCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCmbActionPerformed(evt);
            }
        });
        add(stateCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 175, -1));

        Spo2Label.setText("SPo2");
        add(Spo2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 110, 50));
        add(zipcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 700, 176, -1));

        jLabel8.setText("Cough");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, 30));

        buttonGroup2.add(covidYesRbtn);
        covidYesRbtn.setText("Yes");
        add(covidYesRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, -1));

        buttonGroup1.add(coughNoRbtn);
        coughNoRbtn.setText("No");
        add(coughNoRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, -1, -1));

        Spo2Label1.setText("Temperature");
        add(Spo2Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 110, 30));

        tempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTxtActionPerformed(evt);
            }
        });
        add(tempTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 180, 30));

        jLabel9.setText("Covid Positive");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 103, 20));

        buttonGroup1.add(coughYesRbtn);
        coughYesRbtn.setText("Yes");
        add(coughYesRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        buttonGroup2.add(covidNoRbtn);
        covidNoRbtn.setText("No");
        add(covidNoRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, -1, -1));

        spo2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spo2TxtActionPerformed(evt);
            }
        });
        add(spo2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 180, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opaque-mask1.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 1300, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed

        try
        {
         if(countryCmb.getSelectedIndex()<1 || stateCmb.getSelectedIndex()<1)
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         if(genderCmb.getSelectedIndex()<1 )
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         
         Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(DobField.getText()) ;
           
            int age = GetOrganizations.calculateAge(dateOfBirthVal);
            
            
            String firstName =   firstNameTxt.getText();
            String lastName = lastNameTxt.getText();
            String address1 = addressTxt.getText();
            String town = townTxt.getText();
            String zipCode = zipcodeTxt.getText();
            String emailId = emailTxt.getText();
            String gender = (String)genderCmb.getSelectedItem();
            String country = (String)countryCmb.getSelectedItem();
            String state = (String)stateCmb.getSelectedItem();
            boolean isCough = false;
            if(coughYesRbtn.isSelected()){
                isCough= true;
            }
            else
                isCough = false;
            
            boolean isCovid = false;
            if(covidYesRbtn.isSelected()){
                isCovid= true;
            }
            else
                isCovid = false;
            
            float temp = Float.parseFloat(tempTxt.getText());
            float spo2 = Float.parseFloat(spo2Txt.getText());
            
            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                town!=null && !town.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && age > 0 
                    &&  country!=null && !country.isEmpty() 
                    &&  state!=null && !state.isEmpty() && !tempTxt.getText().isEmpty() && 
                    !spo2Txt.getText().isEmpty()
           )
            {

          
                  Person person = null;

                 if(passwordTxt.getPassword().length ==0 || confirmPasswordTxt.getPassword().length == 0 ||
                        userNameTxt.getText().trim().isEmpty() || patientNetworkCmb.getSelectedIndex()<1
                            )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
               
                 
                  if(patientNetworkCmb.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                 
                    String userName = userNameTxt.getText();
                    String password = String.valueOf(passwordTxt.getPassword());
                    String confirmPassword =String.valueOf(confirmPasswordTxt.getPassword());
               
                    Network patientNw = (Network)patientNetworkCmb.getSelectedItem();
                      if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPatientList().remove(person);
                        return;
                    }
                    
                    getEnterprise(patientNw);
                     if(enterprise == null)
                    {
                  JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+patientNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                    getOrganization("Patient",enterprise);
                    
                    if(organization == null)
                    {
                  JOptionPane.showMessageDialog(null, "Patient Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                    Patient patient;
                    person = organization.getPersonDirectory().addPatient();
                    person.setPatient(true);
                    patient =(Patient)person;
 
                    for(Enterprise e : patientNw.getEnterpriseDirectory().getEnterpriseList())
                    {
                     for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUserName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                            {  
                            if(ua1.getUserName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPatientList().remove((Patient)person);
                        return;
                    }
                    // To get patient org
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new PatientRole());
                    userAccount.setPerson(person);
                   userAccount.setNetwork((Network)patientNw);
                  
                    
                    DoctorWorkRequest request = new DoctorWorkRequest();
                    request.setMessage(DoctorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(DoctorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                    
                  for(Enterprise e : patientNw.getEnterpriseDirectory().getEnterpriseList())
                  {
                      if(e instanceof HospitalEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
                       {
                      if (organization instanceof DoctorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
 
                
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                person.setEmailId(emailId);
                person.setDob(dateOfBirthVal);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);
                patient.setTemperature(temp);
                patient.setIsCough(isCough);
                patient.setSpo2Level(spo2);
                patient.setIsCovid(isCovid);
                
               
                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        }
        
        catch(NumberFormatException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");
        
        }
        catch(ParseException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
          
        }
        catch(NullPointerException e )
        {
        JOptionPane.showMessageDialog(null, "Organization does not exist! ");  
          
        }
        catch(Exception e )
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");  
         
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed
    public void resetFields()
    {
     userNameTxt.setText("");
     passwordTxt.setText("");
     confirmPasswordTxt.setText("");
    firstNameTxt.setText("");
    lastNameTxt.setText("");
    DobField.setText("");
    addressTxt.setText("");
    townTxt.setText("");
    spo2Txt.setText("");
    emailTxt.setText("");
    tempTxt.setText("");
    buttonGroup1.clearSelection();;
    buttonGroup2.clearSelection();
    zipcodeTxt.setText("");
     
    }
    
    public void getEnterprise(Network network)
    {
          try
                {
                 for (Network n : ecoSystem.getNetworkList())
                    {
                    if(n.getCity().equals(network.getCity()))   
                    {  
                   for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
                      {
                            if(e instanceof HospitalEnterprise)
                           {
                             this.enterprise = e;
                              network = n;
                            }
                      }
                    }
                    }
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                     
                }
    }

    public void getOrganization(String orgVal, Enterprise e){
     
        try
        {
     for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
          
     if(orgVal.equals("Patient") && organization instanceof PatientOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
             }  
       
             }
        }
        catch(Exception ex)
        {
             
        }
    }
    
    private void genderCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCmbActionPerformed

    private void countryCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCmbActionPerformed
        
        stateCmb.removeAllItems();
       
        
      if(countryCmb.getSelectedIndex()>0)
      {
          stateCmb.addItem("Please select a State");
         HashSet<String> hsstateVal = new HashSet<>();
        for (Network network : ecoSystem.getNetworkList())
        {
          if(network.getCountry().equals(countryCmb.getSelectedItem()))
          {
           hsstateVal.add(network.getState());
          }
        }
        for(String s1 : hsstateVal)
        {
        stateCmb.addItem(s1);
        }
       }
         
    }//GEN-LAST:event_countryCmbActionPerformed

    private void stateCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateCmbActionPerformed

    }//GEN-LAST:event_stateCmbActionPerformed

    private void patientNetworkCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNetworkCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNetworkCmbActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void spo2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spo2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spo2TxtActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void tempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTxtActionPerformed
    
  
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DobField;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Spo2Label;
    private javax.swing.JLabel Spo2Label1;
    private javax.swing.JLabel address1;
    private javax.swing.JTextField addressTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField confirmPasswordTxt;
    private javax.swing.JRadioButton coughNoRbtn;
    private javax.swing.JRadioButton coughYesRbtn;
    private javax.swing.JComboBox countryCmb;
    private javax.swing.JRadioButton covidNoRbtn;
    private javax.swing.JRadioButton covidYesRbtn;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JComboBox genderCmb;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox patientNetworkCmb;
    private javax.swing.JLayeredPane patientPane;
    private javax.swing.JTextField spo2Txt;
    private javax.swing.JComboBox stateCmb;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipcodeTxt;
    // End of variables declaration//GEN-END:variables
}
