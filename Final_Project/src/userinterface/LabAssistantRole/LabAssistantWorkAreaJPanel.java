/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import business.BloodSample.BloodSample;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.InventoryOrganization;
import business.Organization.NurseOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.DonorWorkRequest;
import business.WorkQueue.LabWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.NurseRole.VitalSignsAddJPanel;

/**
 *
 * @author piyush sharma
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    private Enterprise enterprise;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */

    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        populateRequestTable();
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
                    
            
            row[0] = request.getSender();
            row[1] = request.getMessage() == null ? "Waiting for result" : request.getMessage();
            row[2]= ((DonorWorkRequest) request);
            row[3]= request.getBloodGroup();
            
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnSend = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Result", "Status", "Blood group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnSend.setText("send result");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lab assistant work area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(535, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnSend))
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select a row!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DonorWorkRequest request = (DonorWorkRequest)workRequestJTable.getValueAt(selectedRow, 2);        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessWorkRequestJPanel", new ProcessWorkRequestJPanel(userProcessContainer, account, request, organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = workRequestJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "please select a row!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                DonorWorkRequest request = (DonorWorkRequest) workRequestJTable.getValueAt(selectedRow, 2);

                if (request.getStatus().equalsIgnoreCase("Completed")) {
                    request.setReceiver(account);
                    request.getBloodGroup();
                    request.setStatus("Approved & Stored");
                    populateRequestTable();
                    
                    BloodSample bs = request.getBloodSampleCatalog().addBloodSample();
                    bs.setBloodGroup(request.getBloodGroup());
                    for(BloodSample bs1:request.getBloodSampleCatalog().getBloodCatalog())
                    {
                        bs.setQuantityAvailable(bs1.getQuantityAvailable()+1);
                    }
                    
                    Organization org = null;
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof InventoryOrganization) {
                            org = organization;
                            break;

                        }
                    }
                    if (org != null) {
                        org.getWorkQueue().getWorkRequestList().add(request);
                        account.getWorkQueue().getWorkRequestList().add(request);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "The selected donor request is already assigned ", "Warning", JOptionPane.WARNING_MESSAGE);
                }

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
