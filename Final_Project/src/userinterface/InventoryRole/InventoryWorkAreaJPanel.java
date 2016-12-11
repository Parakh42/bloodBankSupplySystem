/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryRole;

import business.BloodSample.BloodSample;
import business.EcoSystem;
import business.Enterprise.BloodBankEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.DoctorWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author piyush sharma
 */
public class InventoryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    private BloodBankEnterprise enterprise;
    private static int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;

    public InventoryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = (BloodBankEnterprise) enterprise;
        populateMap();
        populateTable();
    }

    public void populateMap() {
        enterprise.getHash().put("A+", 0);
        enterprise.getHash().put("A-", 0);
        enterprise.getHash().put("B+", 0);
        enterprise.getHash().put("B-", 0);
        enterprise.getHash().put("AB+", 0);
        enterprise.getHash().put("AB-", 0);
        enterprise.getHash().put("O+", 0);
        enterprise.getHash().put("O-", 0);

        for (WorkRequest req : organization.getWorkQueue().getWorkRequestList()) {
            for (BloodSample bs : req.getBloodSampleCatalog().getBloodCatalog()) {
                if (bs.getBloodGroup().equalsIgnoreCase("A+")) {
                    a = enterprise.getHash().get("A+");
                    a++;
                    enterprise.getHash().put("A+", a);
                    aPosTextField.setText((String.valueOf(a)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("A-")) {
                    b = enterprise.getHash().get("A-");
                    b++;
                    enterprise.getHash().put("A-", b);
                    aNeTextField.setText((String.valueOf(b)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("B+")) {
                    c = enterprise.getHash().get("B+");
                    c++;
                    enterprise.getHash().put("B+", c);
                    bPosTextField.setText((String.valueOf(c)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("B-")) {
                    d = enterprise.getHash().get("B-");
                    d++;
                    enterprise.getHash().put("B-", d);
                    bNeTextField.setText((String.valueOf(d)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("AB+")) {
                    e = enterprise.getHash().get("AB+");
                    e++;
                    enterprise.getHash().put("AB+", e);
                    abPosTextField.setText((String.valueOf(e)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("AB-")) {
                    f = enterprise.getHash().get("AB-");
                    f++;
                    enterprise.getHash().put("AB-", f);
                    abNeTextField.setText((String.valueOf(f)));

                } else if (bs.getBloodGroup().equalsIgnoreCase("O+")) {
                    g = enterprise.getHash().get("O+");
                    g++;
                    enterprise.getHash().put("O+", g);
                    oPosTextField.setText((String.valueOf(g)));

                } else {
                    h = enterprise.getHash().get("O-");
                    h++;
                    enterprise.getHash().put("O-", h);
                    oNeTextField.setText((String.valueOf(h)));

                }
            }
        }
    }

    public void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();

            model.setRowCount(0);
            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                if (request instanceof DoctorWorkRequest) {
//DoctorWorkRequest req= (DoctorWorkRequest) request;
                    Object[] row = new Object[4];

                    row[0] = request.getSender();
                    row[1] = request.getBloodGroup();
                    row[2] = ((DoctorWorkRequest) request);
                    row[3] = request.getStatus();

                    model.addRow(row);
                }

            }
        } catch (Exception ex) {
            System.out.println(ex);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aPosTextField = new javax.swing.JTextField();
        aNeTextField = new javax.swing.JTextField();
        bPosTextField = new javax.swing.JTextField();
        bNeTextField = new javax.swing.JTextField();
        oPosTextField = new javax.swing.JTextField();
        oNeTextField = new javax.swing.JTextField();
        abPosTextField = new javax.swing.JTextField();
        abNeTextField = new javax.swing.JTextField();
        chartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        processReqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("Inventory Work Area ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("A+");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("A-");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("B+");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("B-");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("O+");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("O-");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("AB+");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("AB-");

        aPosTextField.setEnabled(false);

        aNeTextField.setEnabled(false);

        bPosTextField.setEnabled(false);

        bNeTextField.setEnabled(false);

        oPosTextField.setEnabled(false);

        oNeTextField.setEnabled(false);

        abPosTextField.setEnabled(false);

        abNeTextField.setEnabled(false);

        chartButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        chartButton.setText("See graphical representation");
        chartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartButtonActionPerformed(evt);
            }
        });

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Blood group", "Quantity", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        processReqBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        processReqBtn.setText("Process request");
        processReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(abNeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(abPosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(oNeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(oPosTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bNeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bPosTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(aNeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(aPosTextField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(aPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aNeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bNeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(oPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(oNeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(abPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(abNeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chartButton)
                    .addComponent(processReqBtn))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartButtonActionPerformed
        // TODO add your handling code here:
        int a = enterprise.getHash().get("A+");
        int b = enterprise.getHash().get("A-");
        int c = enterprise.getHash().get("B+");
        int d = enterprise.getHash().get("B-");
        int e = enterprise.getHash().get("AB+");
        int f = enterprise.getHash().get("AB-");
        int g = enterprise.getHash().get("O+");
        int h = enterprise.getHash().get("O-");

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(a, "Quantity", "A+");
        dataset.setValue(b, "Quantity", "A-");
        dataset.setValue(c, "Quantity", "B+");
        dataset.setValue(d, "Quantity", "B-");
        dataset.setValue(e, "Quantity", "AB+");
        dataset.setValue(f, "Quantity", "AB-");
        dataset.setValue(g, "Quantity", "O+");
        dataset.setValue(h, "Quantity", "O-");

        JFreeChart chart = ChartFactory.createBarChart("BloodAvailability", "Blood Group", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Availability Bar Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 500);

    }//GEN-LAST:event_chartButtonActionPerformed

    private void processReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReqBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = inventoryTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select a row!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            DoctorWorkRequest request = (DoctorWorkRequest) inventoryTable.getValueAt(selectedRow, 2);
            int quantity = request.getQuantity();
            String bGroup = request.getBloodGroup();
            int a = enterprise.getHash().get("A+");
            int b = enterprise.getHash().get("A-");
            int c = enterprise.getHash().get("B+");
            int d = enterprise.getHash().get("B-");
            int e = enterprise.getHash().get("AB+");
            int f = enterprise.getHash().get("AB-");
            int g = enterprise.getHash().get("O+");
            int h = enterprise.getHash().get("O-");

            if (bGroup.equalsIgnoreCase("A+")) {
                if (a <= 0 && a < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int a1 = a - quantity;
                    enterprise.getHash().put("A+", a1);
                    aPosTextField.setText((String.valueOf(a1)));
                }

            } else if (bGroup.equalsIgnoreCase("A-")) {
                if (b <= 0 && b < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int b1 = b - quantity;
                    enterprise.getHash().put("A-", b1);
                    aNeTextField.setText((String.valueOf(b1)));
                }

            } else if (bGroup.equalsIgnoreCase("B+")) {
                if (c <= 0 && c < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int c1 = c - quantity;
                    enterprise.getHash().put("B+", c1);
                    bPosTextField.setText((String.valueOf(c1)));
                }

            } else if (bGroup.equalsIgnoreCase("B-")) {
                if (d <= 0 && d < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int d1 = d - quantity;
                    enterprise.getHash().put("B-", d1);
                    bNeTextField.setText((String.valueOf(d1)));
                }

            } else if (bGroup.equalsIgnoreCase("AB+")) {
                if (e <= 0 && e < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int e1 = e - quantity;
                    enterprise.getHash().put("AB+", e1);
                    abPosTextField.setText((String.valueOf(e1)));
                }

            } else if (bGroup.equalsIgnoreCase("AB-")) {
                if (f <= 0 && f < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int f1 = f - quantity;
                    enterprise.getHash().put("AB-", f1);
                    abNeTextField.setText((String.valueOf(f1)));
                }

            } else if (bGroup.equalsIgnoreCase("O+")) {
                if (g <= 0 && g < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int g1 = g - quantity;
                    enterprise.getHash().put("O+", g1);
                    oPosTextField.setText((String.valueOf(g1)));
                }

            } else if (bGroup.equalsIgnoreCase("O-")) {
                if (h <= 0 && h < quantity) {
                    JOptionPane.showMessageDialog(this, "Required blood group is not available ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    int h1 = h - quantity;
                    enterprise.getHash().put("O-", h1);
                    oNeTextField.setText((String.valueOf(h1)));
                }

            }
        }
    }//GEN-LAST:event_processReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aNeTextField;
    private javax.swing.JTextField aPosTextField;
    private javax.swing.JTextField abNeTextField;
    private javax.swing.JTextField abPosTextField;
    private javax.swing.JTextField bNeTextField;
    private javax.swing.JTextField bPosTextField;
    private javax.swing.JButton chartButton;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oNeTextField;
    private javax.swing.JTextField oPosTextField;
    private javax.swing.JButton processReqBtn;
    // End of variables declaration//GEN-END:variables
}
