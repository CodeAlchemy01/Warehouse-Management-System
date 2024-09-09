/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.goodsreceipt.gui.gui_builder;

import javax.swing.JPanel;

/**
 *
 * @author  trautm
 */
public abstract class AbstractPositionWizardLotPanelUI extends javax.swing.JPanel {
    
    /** Creates new form AbstractPositionWizardULPanel */
    public AbstractPositionWizardLotPanelUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lotPanel = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        lotPanel.setLayout(new java.awt.GridLayout(3, 1, 0, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(lotPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lotPanel;
    // End of variables declaration//GEN-END:variables

    public JPanel getLotPanel(){
        return lotPanel;
    }

}