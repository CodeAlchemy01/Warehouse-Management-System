/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.goodsreceipt.gui.gui_builder;

import de.linogistix.common.gui.component.controls.DateFormattedTextField;
import de.linogistix.common.gui.component.other.LOSExplorerProviderPanel;
import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;
import de.linogistix.common.gui.component.controls.LosLabel;
import de.linogistix.common.res.CommonBundleResolver;
import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.view.TreeTableView;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public abstract class AbstractCenterPanel 
        extends javax.swing.JPanel 
{
    protected TreeTableView beanView;
    protected TreeTableView adviceView;
    
    /** Creates new form AbstractCenterPanel */
    public AbstractCenterPanel() {
        initComponents();

        
        gateLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class, "GoodsreceiptCenterPanel.gateLabel")); // NOI18N
        delivererLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class, "GoodsreceiptCenterPanel.deliverer")); // NOI18N
        infoLabel.setText(""); // NOI18N
        
        createButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.createButton.mnemonic").charAt(0));
        editButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.editButton.mnemonic").charAt(0));
        reloadButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.reloadButton.mnemonic").charAt(0));
        finishButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.finishButton.mnemonic").charAt(0));
        printButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.printButton.mnemonic").charAt(0));
        addAdviceButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.addAdviceButton.mnemonic").charAt(0));
        removeAdviceButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.removeAdviceButton.mnemonic").charAt(0));
        addPositionButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.addPositionButton.mnemonic").charAt(0));
        removePositionButton.setMnemonic(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.removePositionButton.mnemonic").charAt(0));

            
    }
    
    abstract protected void addAdviceButtonActionPerformedListener(ActionEvent evt);

    abstract protected void addPositionButtonActionPerformedListener(ActionEvent evt);
    
    abstract protected void removePositionButtonActionPerformedListener(ActionEvent evt) ;

    abstract protected void removeAdviceButtonActionPerformedListener(ActionEvent evt) ;
    
    abstract protected void goodsReceiptChange(PropertyChangeEvent evt);
     
    abstract public ExplorerManager getAdviceManager();

    abstract protected void createButtonActionPerformedListener(ActionEvent evt) ;
      
    abstract protected void editButtonActionPerformedListener(ActionEvent evt);
    
    abstract protected void reloadButtonActionPerformedListener(ActionEvent evt);
    
    abstract protected void finishButtonActionPerformedListener(ActionEvent evt);           
 
    abstract protected void printButtonActionPerformedListener(ActionEvent evt);

    abstract protected void quickAdviceButtonActionPerformedListener(ActionEvent evt);
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        chooseOrCreateButtonGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        goodsReceiptPanel = new javax.swing.JPanel();
        goodsreceiptComboPanel = new javax.swing.JPanel();
        clientComboBoxPanel = new javax.swing.JPanel();
        clientLabel = new javax.swing.JLabel();
        clientTextfield = new javax.swing.JTextField();
        gateComboBoxPanel = new javax.swing.JPanel();
        gateLabel = new LosLabel();
        locationTextfield = new javax.swing.JTextField();
        delivererTextfield = new javax.swing.JTextField();
        delivererLabel = new javax.swing.JLabel();
        externNumberLabel = new javax.swing.JLabel();
        externNumberTextfield = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        reloadButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        dateTextField = new DateFormattedTextField();
        dateLabel = new javax.swing.JLabel();
        comment = new javax.swing.JPanel();
        additionalInfoPanel = new javax.swing.JLabel();
        additionalInfolScrollPane = new javax.swing.JScrollPane();
        additionalInfoTextArea = new javax.swing.JTextArea();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        adviceTablePanel = new LOSExplorerProviderPanel();
        adviceButtonPanel = new javax.swing.JPanel();
        addAdviceButton = new javax.swing.JButton();
        removeAdviceButton = new javax.swing.JButton();
        quickAdviceButton = new javax.swing.JButton();
        positionTablePanel = new LOSExplorerProviderPanel();
        positionButtonPanel = new javax.swing.JPanel();
        addPositionButton = new javax.swing.JButton();
        removePositionButton = new javax.swing.JButton();

        setAlignmentX(1.0F);
        setAlignmentY(1.0F);
        setLayout(new java.awt.GridBagLayout());

        headerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.goodsReceiptPanel.title"))); // NOI18N
        headerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        goodsReceiptPanel.setLayout(new java.awt.GridBagLayout());

        goodsreceiptComboPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        goodsReceiptPanel.add(goodsreceiptComboPanel, gridBagConstraints);

        clientComboBoxPanel.setFocusable(false);
        clientComboBoxPanel.setMinimumSize(new java.awt.Dimension(150, 44));
        clientComboBoxPanel.setLayout(new java.awt.BorderLayout());

        clientLabel.setText(org.openide.util.NbBundle.getMessage(CommonBundleResolver.class, "client")); // NOI18N
        clientLabel.setFocusable(false);
        clientComboBoxPanel.add(clientLabel, java.awt.BorderLayout.NORTH);

        clientTextfield.setColumns(10);
        clientTextfield.setFocusable(false);
        clientComboBoxPanel.add(clientTextfield, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        goodsReceiptPanel.add(clientComboBoxPanel, gridBagConstraints);

        gateComboBoxPanel.setFocusable(false);
        gateComboBoxPanel.setLayout(new java.awt.BorderLayout());

        gateLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.gateLabel")); // NOI18N
        gateComboBoxPanel.add(gateLabel, java.awt.BorderLayout.NORTH);

        locationTextfield.setFocusable(false);
        gateComboBoxPanel.add(locationTextfield, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        goodsReceiptPanel.add(gateComboBoxPanel, gridBagConstraints);

        delivererTextfield.setColumns(10);
        delivererTextfield.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        goodsReceiptPanel.add(delivererTextfield, gridBagConstraints);

        delivererLabel.setText("\n"); // NOI18N
        delivererLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        delivererLabel.setFocusable(false);
        delivererLabel.setMaximumSize(new java.awt.Dimension(150, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        goodsReceiptPanel.add(delivererLabel, gridBagConstraints);

        externNumberLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.externNumberLabel.text")); // NOI18N
        externNumberLabel.setFocusable(false);
        externNumberLabel.setMinimumSize(new java.awt.Dimension(150, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        goodsReceiptPanel.add(externNumberLabel, gridBagConstraints);

        externNumberTextfield.setColumns(10);
        externNumberTextfield.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        goodsReceiptPanel.add(externNumberTextfield, gridBagConstraints);

        createButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.createButton.text")); // NOI18N
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(createButton);

        editButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.editButton.text")); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(editButton);

        reloadButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.reloadButton.text")); // NOI18N
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(reloadButton);

        finishButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.finishButton.text")); // NOI18N
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(finishButton);

        printButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.printButton.text")); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(printButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        goodsReceiptPanel.add(buttonPanel, gridBagConstraints);

        stateLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.stateLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        goodsReceiptPanel.add(stateLabel, gridBagConstraints);

        stateTextField.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        goodsReceiptPanel.add(stateTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        goodsReceiptPanel.add(dateTextField, gridBagConstraints);

        dateLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.dateLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        goodsReceiptPanel.add(dateLabel, gridBagConstraints);

        additionalInfoPanel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.additionalInfoLabel.text")); // NOI18N
        additionalInfoPanel.setFocusable(false);

        additionalInfolScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        additionalInfolScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        additionalInfolScrollPane.setFocusable(false);
        additionalInfolScrollPane.setMinimumSize(new java.awt.Dimension(150, 50));
        additionalInfolScrollPane.setPreferredSize(new java.awt.Dimension(300, 92));

        additionalInfoTextArea.setColumns(20);
        additionalInfoTextArea.setLineWrap(true);
        additionalInfoTextArea.setRows(5);
        additionalInfoTextArea.setWrapStyleWord(true);
        additionalInfolScrollPane.setViewportView(additionalInfoTextArea);

        org.jdesktop.layout.GroupLayout commentLayout = new org.jdesktop.layout.GroupLayout(comment);
        comment.setLayout(commentLayout);
        commentLayout.setHorizontalGroup(
            commentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(commentLayout.createSequentialGroup()
                .add(commentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(additionalInfoPanel)
                    .add(additionalInfolScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        commentLayout.setVerticalGroup(
            commentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(commentLayout.createSequentialGroup()
                .add(additionalInfoPanel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(additionalInfolScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        goodsReceiptPanel.add(comment, gridBagConstraints);

        headerPanel.add(goodsReceiptPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(headerPanel, gridBagConstraints);

        infoPanel.setLayout(new java.awt.BorderLayout(0, 11));
        infoPanel.add(infoLabel, java.awt.BorderLayout.NORTH);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(infoPanel, gridBagConstraints);

        adviceTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "Advices"))); // NOI18N
        adviceTablePanel.setLayout(new java.awt.BorderLayout());

        adviceButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        addAdviceButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.addAdviceButton.text")); // NOI18N
        addAdviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdviceButtonActionPerformed(evt);
            }
        });
        adviceButtonPanel.add(addAdviceButton);

        removeAdviceButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.removeAdviceButton.text")); // NOI18N
        removeAdviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdviceButtonActionPerformed(evt);
            }
        });
        adviceButtonPanel.add(removeAdviceButton);

        quickAdviceButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.quickAdviceButton.text")); // NOI18N
        quickAdviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAdviceButtonActionPerformed(evt);
            }
        });
        adviceButtonPanel.add(quickAdviceButton);

        adviceTablePanel.add(adviceButtonPanel, java.awt.BorderLayout.SOUTH);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(adviceTablePanel, gridBagConstraints);

        positionTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "Positions"))); // NOI18N
        positionTablePanel.setLayout(new java.awt.BorderLayout());

        positionButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        addPositionButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.addPositionButton.text")); // NOI18N
        addPositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPositionButtonActionPerformed(evt);
            }
        });
        positionButtonPanel.add(addPositionButton);

        removePositionButton.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.removePositionButton.text")); // NOI18N
        removePositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePositionButtonActionPerformed(evt);
            }
        });
        positionButtonPanel.add(removePositionButton);

        positionTablePanel.add(positionButtonPanel, java.awt.BorderLayout.SOUTH);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(positionTablePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

private void addAdviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdviceButtonActionPerformed
    addAdviceButtonActionPerformedListener(evt);
}//GEN-LAST:event_addAdviceButtonActionPerformed

private void removeAdviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdviceButtonActionPerformed
    removeAdviceButtonActionPerformedListener(evt);
}//GEN-LAST:event_removeAdviceButtonActionPerformed

private void addPositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPositionButtonActionPerformed
    addPositionButtonActionPerformedListener(evt);
}//GEN-LAST:event_addPositionButtonActionPerformed

private void removePositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePositionButtonActionPerformed
    removePositionButtonActionPerformedListener(evt);
}//GEN-LAST:event_removePositionButtonActionPerformed

private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
    createButtonActionPerformedListener(evt);
}//GEN-LAST:event_createButtonActionPerformed

private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
    editButtonActionPerformedListener(evt);
}//GEN-LAST:event_editButtonActionPerformed

private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
    reloadButtonActionPerformedListener(evt);
}//GEN-LAST:event_reloadButtonActionPerformed

private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
    finishButtonActionPerformedListener(evt);
}//GEN-LAST:event_finishButtonActionPerformed

private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
    printButtonActionPerformedListener(evt);
}//GEN-LAST:event_printButtonActionPerformed

private void quickAdviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickAdviceButtonActionPerformed
    quickAdviceButtonActionPerformedListener(evt);
}//GEN-LAST:event_quickAdviceButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addAdviceButton;
    protected javax.swing.JButton addPositionButton;
    private javax.swing.JLabel additionalInfoPanel;
    protected javax.swing.JTextArea additionalInfoTextArea;
    private javax.swing.JScrollPane additionalInfolScrollPane;
    private javax.swing.JPanel adviceButtonPanel;
    protected javax.swing.JPanel adviceTablePanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.ButtonGroup chooseOrCreateButtonGroup;
    protected javax.swing.JPanel clientComboBoxPanel;
    protected javax.swing.JLabel clientLabel;
    protected javax.swing.JTextField clientTextfield;
    private javax.swing.JPanel comment;
    protected javax.swing.JButton createButton;
    private javax.swing.JLabel dateLabel;
    protected javax.swing.JTextField dateTextField;
    private javax.swing.JLabel delivererLabel;
    private javax.swing.JTextField delivererTextfield;
    protected javax.swing.JButton editButton;
    private javax.swing.JLabel externNumberLabel;
    protected javax.swing.JTextField externNumberTextfield;
    protected javax.swing.JButton finishButton;
    protected javax.swing.JPanel gateComboBoxPanel;
    protected javax.swing.JLabel gateLabel;
    protected javax.swing.JPanel goodsReceiptPanel;
    protected javax.swing.JPanel goodsreceiptComboPanel;
    private javax.swing.JPanel headerPanel;
    protected javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    protected javax.swing.JTextField locationTextfield;
    private javax.swing.JPanel positionButtonPanel;
    protected javax.swing.JPanel positionTablePanel;
    protected javax.swing.JButton printButton;
    protected javax.swing.JButton quickAdviceButton;
    protected javax.swing.JButton reloadButton;
    protected javax.swing.JButton removeAdviceButton;
    protected javax.swing.JButton removePositionButton;
    private javax.swing.JLabel stateLabel;
    protected javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables
    

  
    //------------------------------------------------------------------------
    public JTextField getDelivererTextField(){
        return delivererTextfield;
    }
    
    class CenterPanelFocusTraversalPolicy extends FocusTraversalPolicy {

        FocusTraversalPolicy defaultFocusPolicy;
                
        public CenterPanelFocusTraversalPolicy(CenterPanelFocusTraversalPolicy defaultFocusPolicy){
            this.defaultFocusPolicy = defaultFocusPolicy;
        }
        
        @Override
        public Component getComponentAfter(Container aContainer, Component aComponent) {
            return defaultFocusPolicy.getComponentAfter(aContainer, aComponent);
        }

        @Override
        public Component getComponentBefore(Container aContainer, Component aComponent) {
            return defaultFocusPolicy.getComponentBefore(aContainer, aComponent);
        }

        @Override
        public Component getFirstComponent(Container aContainer) {
            return defaultFocusPolicy.getFirstComponent(aContainer);
        }

        @Override
        public Component getLastComponent(Container aContainer) {
            return defaultFocusPolicy.getLastComponent(aContainer);
        }

        @Override
        public Component getDefaultComponent(Container aContainer) {
            return defaultFocusPolicy.getDefaultComponent(aContainer);
        }
   
    }
    
    public JButton getAddAdviceButton() {
        return addAdviceButton;
    }

    public JTextField getExternNumberTextField() {
        return externNumberTextfield;
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public JTextArea getInfoTextArea() {
        return additionalInfoTextArea;
    }

    public TreeTableView getPositionView() {
        return beanView;
    }

    public JButton getRemoveAdviceButton() {
        return removeAdviceButton;
    }

    public JButton getAddPositionButton() {
        return addPositionButton;
    }

    public JButton getRemovePositionButton() {
        return removePositionButton;
    }

    public JLabel getInfoLabel() {
        return infoLabel;
    }

    public JPanel getAdviceTabelPanel() {
        return adviceTablePanel;
    }

    public JPanel getPositionTabel() {
        return positionTablePanel;
    }

    public JTextField getLocationTextfield() {
        return locationTextfield;
    }

    public TreeTableView getAdviceView() {
        return adviceView;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JTextField getClientTextfield() {
        return clientTextfield;
    }
    
    public JTextField getStateTextField(){
        return stateTextField;
    }
    
    public DateFormattedTextField getDateTextField(){
        return (DateFormattedTextField) dateTextField;
    } 
    
    public JButton getReloadButton(){
        return reloadButton;
    }
}
