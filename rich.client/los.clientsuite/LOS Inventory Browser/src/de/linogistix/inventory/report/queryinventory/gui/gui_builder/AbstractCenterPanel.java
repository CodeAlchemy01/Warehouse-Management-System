/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.inventory.report.queryinventory.gui.gui_builder;

import de.linogistix.inventory.report.queryinventory.gui.component.TreeTableViewPanel;
import de.linogistix.inventory.res.InventoryBundleResolver;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import javax.swing.ButtonGroup;
import org.openide.util.NbBundle;

/**
 *
 * @author  artur
 */
public abstract class AbstractCenterPanel extends javax.swing.JPanel implements FocusListener {
   
    public TreeTableViewPanel treeTablePanel = new TreeTableViewPanel();
    
    /** Creates new form AbstractCenterPanel */
    public AbstractCenterPanel() {
        initComponents();
        postInit();
        
        articelRadioButton.setText(NbBundle.getMessage(InventoryBundleResolver.class,"QueryInventory.groupedByArticle"));
        lotRadioButton.setText(NbBundle.getMessage(InventoryBundleResolver.class,"QueryInventory.groupedByLot"));
        reloadButton.setText(NbBundle.getMessage(InventoryBundleResolver.class,"QueryInventory.reload"));
        reloadButton.setMnemonic(NbBundle.getMessage(InventoryBundleResolver.class, "QueryInventory.reload.mnemonic").charAt(0));
        jButton1.setText(NbBundle.getMessage(InventoryBundleResolver.class, "AbstractCenterPanel.jButton1.text")); // NOI18N
        jButton1.setMnemonic(NbBundle.getMessage(InventoryBundleResolver.class, "AbstractCenterPanel.jButton1.mnemonic").charAt(0));
        fWithAmountOnly.setText(NbBundle.getMessage(InventoryBundleResolver.class, "AbstractCenterPanel.fWithAmountOnly"));

    }

    public abstract  void createExcelReport();
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox2 = new javax.swing.JComboBox();
        headerPanel = new javax.swing.JPanel();
        autofilteringPanel = new javax.swing.JPanel();
        clientComboBoxPanel = new javax.swing.JPanel();
        lotComboBoxPanel = new javax.swing.JPanel();
        itemDataComboBoxPanel = new javax.swing.JPanel();
        fWithAmountOnly = new javax.swing.JCheckBox();
        groupingPanel = new javax.swing.JPanel();
        articelRadioButton = new javax.swing.JRadioButton();
        lotRadioButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        buttonPanel = new javax.swing.JPanel();
        reloadButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setLayout(new java.awt.BorderLayout());

        headerPanel.setLayout(new java.awt.GridBagLayout());

        autofilteringPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        autofilteringPanel.add(clientComboBoxPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        autofilteringPanel.add(lotComboBoxPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        autofilteringPanel.add(itemDataComboBoxPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        headerPanel.add(autofilteringPanel, gridBagConstraints);

        fWithAmountOnly.setText("With amount only");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        headerPanel.add(fWithAmountOnly, gridBagConstraints);

        groupingPanel.setLayout(new javax.swing.BoxLayout(groupingPanel, javax.swing.BoxLayout.PAGE_AXIS));
        groupingPanel.add(articelRadioButton);
        groupingPanel.add(lotRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        headerPanel.add(groupingPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        headerPanel.add(jSeparator1, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        reloadButton.setText("Reload"); // NOI18N
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(reloadButton);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        headerPanel.add(buttonPanel, gridBagConstraints);

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        viewPanel.setLayout(new java.awt.BorderLayout());
        add(viewPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        reloadButtonActionPerformedListener(evt);
}//GEN-LAST:event_reloadButtonActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    createExcelReport();
            
}//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JRadioButton articelRadioButton;
    protected javax.swing.JPanel autofilteringPanel;
    protected javax.swing.JPanel buttonPanel;
    protected javax.swing.JPanel clientComboBoxPanel;
    protected javax.swing.JCheckBox fWithAmountOnly;
    protected javax.swing.JPanel groupingPanel;
    protected javax.swing.JPanel headerPanel;
    protected javax.swing.JPanel itemDataComboBoxPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JPanel lotComboBoxPanel;
    protected javax.swing.JRadioButton lotRadioButton;
    private javax.swing.JButton reloadButton;
    protected javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
 
    private void postInit() {
        viewPanel.add(treeTablePanel,BorderLayout.CENTER);
        ButtonGroup b = new ButtonGroup();
        b.add(articelRadioButton);
        b.add(lotRadioButton);  
        articelRadioButton.setSelected(true);
    
    }
    

    protected abstract void reloadButtonActionPerformedListener(ActionEvent evt);
}
