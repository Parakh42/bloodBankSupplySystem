/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import business.Organization.DonorOrganization;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Person.Donor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class ManageDonorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;

    /**
     * Creates new form ManageDonorJPanel
     */
    
    ManageDonorJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        populateDonorComboBox();
        //populateTable();
    }
    
    public void populateDonorComboBox() {
        donorComboBox.removeAllItems();
        for (Organization organization : organizationDirectory.getOrganizationList()) {
            if (organization instanceof DonorOrganization) {
                donorComboBox.addItem(organization);
            }
        }
    }
    
    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) manageDonorTable.getModel();
        model.setRowCount(0);
        
        for (Donor donor : organization.getDonorDirectory().getDonorList()) {
            Object[] row = new Object[2];
            row[0] = donor.getDonorId();
            row[1] = donor.getFirstName();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageDonorTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        contactNumberTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        donorComboBox = new javax.swing.JComboBox();
        BtnAddDonor = new javax.swing.JButton();
        BtnRemoveDonor = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Donor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 61, -1, 41));

        manageDonorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(manageDonorTable);
        if (manageDonorTable.getColumnModel().getColumnCount() > 0) {
            manageDonorTable.getColumnModel().getColumn(0).setResizable(false);
            manageDonorTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 120, -1, 91));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Organization :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 244, 100, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("First Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 270, 100, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setText("Last Name :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 296, 100, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setText("Email Id :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 322, 100, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setText("Age :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 348, 100, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("Contact Number :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 405, 100, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setText("Address :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 433, 100, -1));
        add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 267, 257, -1));
        add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 293, 257, -1));
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 319, 257, -1));
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 345, 257, -1));
        add(contactNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 402, 257, -1));

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane2.setViewportView(addressTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 433, 257, 37));

        donorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        donorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorComboBoxActionPerformed(evt);
            }
        });
        add(donorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 241, 100, -1));

        BtnAddDonor.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnAddDonor.setText("Add Donor");
        BtnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddDonorActionPerformed(evt);
            }
        });
        add(BtnAddDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 481, 107, -1));

        BtnRemoveDonor.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnRemoveDonor.setText("Remove Donor");
        BtnRemoveDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveDonorActionPerformed(evt);
            }
        });
        add(BtnRemoveDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 512, -1, -1));

        BtnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 548, 102, -1));

        BtnUpdate.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnUpdate.setText("Update Details");
        add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 548, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setText("Gender :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 374, 100, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 371, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRemoveDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveDonorActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageDonorTable.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete donor detail", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Donor donor = (Donor) manageDonorTable.getValueAt(selectedRow, 0);
                Organization organization = (Organization) donorComboBox.getSelectedItem();
                organization.getDonorDirectory().removeDonor(donor);
                populateTable(organization);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnRemoveDonorActionPerformed

    private void BtnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddDonorActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) donorComboBox.getSelectedItem();
        Donor donor = organization.getDonorDirectory().addDonor();
        donor.setFirstName(firstNameTextField.getText());
        donor.setLastName(lastNameTextField.getText());
        donor.setEmailId(emailTextField.getText());
        donor.setAge(Integer.parseInt(ageTextField.getText()));
        donor.setPhoneNumber(contactNumberTextField.getText());
        donor.setAddress(addressTextArea.getText());
        donor.setGender((String) genderComboBox.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Donor is added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        populateTable(organization);
        
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        ageTextField.setText("");
        contactNumberTextField.setText("");
        addressTextArea.setText("");
    }//GEN-LAST:event_BtnAddDonorActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void donorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorComboBoxActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) donorComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_donorComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddDonor;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnRemoveDonor;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField contactNumberTextField;
    private javax.swing.JComboBox donorComboBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTable manageDonorTable;
    // End of variables declaration//GEN-END:variables
}
