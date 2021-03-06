/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NutritionistRole;

import business.EcoSystem;
import business.Organization.NutritionistOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.DonorWorkRequest;
import business.WorkQueue.NutritionistWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author Kaustubh Chaudhari
 */
public class NutritionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionistWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    
    
    public NutritionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
        this.organization = organization;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request1 : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
                    
            
            row[0] = request1.getSender();
            row[1] = ((NutritionistWorkRequest) request1).getUser();
            row[2]= ((NutritionistWorkRequest) request1);
           
            
            
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
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("Nutritionist Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 23, 360, 50));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Patient", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 82, 907, 157));

        assignButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 297, 173, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select a row!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NutritionistWorkRequest request = (NutritionistWorkRequest)workRequestJTable.getValueAt(selectedRow, 2);        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AssignJPanel", new AssignJPanel(userProcessContainer, userAccount, request, organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
