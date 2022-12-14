/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;


import business.EcoSystem;
import business.common.StringValidation;
import business.common.TableHeadColors;
import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


//this is the ManageEnterpriseJPanel part
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        addInputVerifiers();
        enterpriseJTable.getTableHeader().setDefaultRenderer(new TableHeadColors());
        populateEnterpriseTable();
        populateComboBox();
  
    }
    
    private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getCity();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkCmb.removeAllItems();
        enterpriseTypeCmb.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkCmb.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeCmb.addItem(type);
        }

    }
    
       private void addInputVerifiers() {
        InputVerifier stringValidation = new StringValidation();
        entNameCmb.setInputVerifier(stringValidation);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        entNameCmb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterpriseTypeCmb = new javax.swing.JComboBox();
        networkCmb = new javax.swing.JComboBox();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(182, 201, 233));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 420, 169));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 545, -1, -1));

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Manage Enterprise");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 240, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Enterprise Type");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Create");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel5.setText("Add New Enterprise:");

        jLabel1.setText("Network");

        jLabel2.setText("Name");

        enterpriseTypeCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        networkCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCmbActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(entNameCmb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancelBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(submitBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(enterpriseTypeCmb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(networkCmb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkCmb, 0, 187, Short.MAX_VALUE)
                                    .addComponent(enterpriseTypeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(entNameCmb)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entNameCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 111, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finalopaquebg.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(1300, 900));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1300, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(entNameCmb.getText().trim().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter valid name !");
            return;  
        }
        
        Network network = (Network) networkCmb.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeCmb.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        String name = entNameCmb.getText();
         for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
        {
         if(name.equalsIgnoreCase(e.getName()) || type.equals(e.getEnterpriseType()))
         {
          JOptionPane.showMessageDialog(null, "Enterprise already exits!", "warning",JOptionPane.WARNING_MESSAGE);
         return;                 
         }
        }
      Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise(name, type);
        JOptionPane.showMessageDialog(null, "Enterprise has been added successfully", "success",JOptionPane.PLAIN_MESSAGE);
        populateEnterpriseTable();
        resetFields();

    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
       

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Enterprise entToBeDeleted = null;
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Enterprise enterprise = (Enterprise)enterpriseJTable.getValueAt(selectedRow, 0);
                for (Network network : system.getNetworkList()) 
                {
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
                {
                 if(e.getEnterpriseType().getValue().equals(enterprise.getEnterpriseType().getValue()))
                 {
                  if(enterprise.getName().equals(e.getName()))  
                 {
                   entToBeDeleted = e;
                 }
                 }
                }
                if(entToBeDeleted!=null)
                {
                network.getEnterpriseDirectory().deleteEnterprise(entToBeDeleted);
                }
                }
             JOptionPane.showMessageDialog(this, "Enterprise has been deleted successfully", "success",JOptionPane.PLAIN_MESSAGE);
            populateEnterpriseTable();
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning",JOptionPane.PLAIN_MESSAGE);
        }
       
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       resetFields();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void networkCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkCmbActionPerformed
    
    
    public void resetFields()
    {
    entNameCmb.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField entNameCmb;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JComboBox networkCmb;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
