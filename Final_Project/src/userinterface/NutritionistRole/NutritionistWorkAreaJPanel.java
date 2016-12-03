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
import javax.swing.JPanel;

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
    private NutritionistOrganization nutritionistOrganization;
    
    public NutritionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
        this.nutritionistOrganization=nutritionistOrganization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
