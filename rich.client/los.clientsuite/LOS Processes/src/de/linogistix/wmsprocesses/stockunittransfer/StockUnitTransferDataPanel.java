/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.stockunittransfer;

import de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox;
import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;
import de.wms2.mywms.inventory.StockUnit;
import de.wms2.mywms.inventory.UnitLoad;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public class StockUnitTransferDataPanel extends javax.swing.JPanel {

    /** Creates new form AbstractCenterPanel */
    public StockUnitTransferDataPanel() {
        initComponents();
        
        stockUnitAutoFilteringComboBox.setBoClass(StockUnit.class);
        stockUnitAutoFilteringComboBox.initAutofiltering();
        stockUnitAutoFilteringComboBox.setEditorLabelTitle(NbBundle.getMessage(de.linogistix.common.res.CommonBundleResolver.class, "stockUnit"));
        stockUnitAutoFilteringComboBox.setEditorLabelText();
        stockUnitAutoFilteringComboBox.setEnabled(true);

        unitLoadAutofilteringComboBox.setBoClass(UnitLoad.class);
        unitLoadAutofilteringComboBox.initAutofiltering();
        unitLoadAutofilteringComboBox.setEditorLabelTitle(NbBundle.getMessage(WMSProcessesBundleResolver.class, "destinationUnitLoad"));
        unitLoadAutofilteringComboBox.setEditorLabelText();
        unitLoadAutofilteringComboBox.setEnabled(true);


        suLockCheckBox.setEnabled(false);
        suLockCheckBox.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeSuLock"));

        suReserveCheckBox.setEnabled(false);
        suReserveCheckBox.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeReservationFromSu"));

        itemDataLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "itemData")+":");
        amountLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "amount")+":");
        unitLoadLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "unitLoad")+":");
        locationLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "location")+":");
        locationUlLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "location")+":");
        itemDataText.setText("");
        amountText.setText("");
        unitLoadText.setText("");
        locationText.setText("");
        locationUlText.setText("");

    }
    


    public void enableLockField(boolean enable) {
        if(!enable) {
            suLockCheckBox.setSelected(false);
        }
        suLockCheckBox.setEnabled(enable);
    }

    public void enableReservationField(boolean enable) {
        if(!enable) {
            suReserveCheckBox.setSelected(false);
        }
        suReserveCheckBox.setEnabled(enable);
    }

    public void setItemDataInfo(String value) {
        itemDataText.setText(value);
    }
    public void setAmountInfo(String value) {
        amountText.setText(value);
    }
    public void setUnitLoadInfo(String value) {
        unitLoadText.setText(value);
    }
    public void setLocationInfo(String value) {
        locationText.setText(value);
    }
    public void setLocationUlInfo(String value) {
        locationUlText.setText(value);
    }



//    public JCheckBox getStockUnitRemoveReservationField(){
//        return suReserveCheckBox;
//    }
//
//    public JCheckBox getStockUnitRemoveLockField(){
//        return suLockCheckBox;
//    }
//
//    public JLabel getItemDataField() {
//        return itemDataText;
//    }
//    public JLabel getAmountField() {
//        return amountText;
//    }
//    public JLabel getUnitLoadField() {
//        return unitLoadText;
//    }
//    public JLabel getLocationField() {
//        return locationText;
//    }
//    public JLabel getLocationUlField() {
//        return locationUlText;
//    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        stockUnitAutoFilteringComboBox = new de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox();
        stockInfoPanel = new javax.swing.JPanel();
        itemDataLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        unitLoadLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JLabel();
        itemDataText = new javax.swing.JLabel();
        amountText = new javax.swing.JLabel();
        unitLoadText = new javax.swing.JLabel();
        suReserveCheckBox = new javax.swing.JCheckBox();
        suLockCheckBox = new javax.swing.JCheckBox();
        unitLoadAutofilteringComboBox = new de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox();
        unitLoadInfoPanel = new javax.swing.JPanel();
        locationUlLabel = new javax.swing.JLabel();
        locationUlText = new javax.swing.JLabel();

        setAlignmentX(1.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(stockUnitAutoFilteringComboBox, gridBagConstraints);

        stockInfoPanel.setMinimumSize(new java.awt.Dimension(400, 60));
        stockInfoPanel.setLayout(new java.awt.GridBagLayout());

        itemDataLabel.setForeground(new java.awt.Color(70, 70, 70));
        itemDataLabel.setText("DataLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(itemDataLabel, gridBagConstraints);

        amountLabel.setForeground(new java.awt.Color(70, 70, 70));
        amountLabel.setText("amountLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(amountLabel, gridBagConstraints);

        unitLoadLabel.setForeground(new java.awt.Color(70, 70, 70));
        unitLoadLabel.setText("unitLoadLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(unitLoadLabel, gridBagConstraints);

        locationLabel.setForeground(new java.awt.Color(70, 70, 70));
        locationLabel.setText("locationLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(locationLabel, gridBagConstraints);

        locationText.setForeground(new java.awt.Color(70, 70, 70));
        locationText.setText("location");
        locationText.setMinimumSize(new java.awt.Dimension(250, 15));
        locationText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(locationText, gridBagConstraints);

        itemDataText.setForeground(new java.awt.Color(70, 70, 70));
        itemDataText.setText("itemDataText");
        itemDataText.setMinimumSize(new java.awt.Dimension(300, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(itemDataText, gridBagConstraints);

        amountText.setForeground(new java.awt.Color(70, 70, 70));
        amountText.setText("amount");
        amountText.setMinimumSize(new java.awt.Dimension(250, 15));
        amountText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(amountText, gridBagConstraints);

        unitLoadText.setForeground(new java.awt.Color(70, 70, 70));
        unitLoadText.setText("unitLoad");
        unitLoadText.setMinimumSize(new java.awt.Dimension(250, 15));
        unitLoadText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(unitLoadText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 20, 0);
        jPanel1.add(stockInfoPanel, gridBagConstraints);

        suReserveCheckBox.setText("Remove reservation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(suReserveCheckBox, gridBagConstraints);

        suLockCheckBox.setText("Unlock");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(suLockCheckBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(unitLoadAutofilteringComboBox, gridBagConstraints);

        unitLoadInfoPanel.setLayout(new java.awt.GridBagLayout());

        locationUlLabel.setForeground(new java.awt.Color(70, 70, 70));
        locationUlLabel.setText("locationLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        unitLoadInfoPanel.add(locationUlLabel, gridBagConstraints);

        locationUlText.setForeground(new java.awt.Color(70, 70, 70));
        locationUlText.setText("location");
        locationUlText.setMinimumSize(new java.awt.Dimension(250, 15));
        locationUlText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        unitLoadInfoPanel.add(locationUlText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(unitLoadInfoPanel, gridBagConstraints);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel amountText;
    private javax.swing.JLabel itemDataLabel;
    private javax.swing.JLabel itemDataText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel locationText;
    private javax.swing.JLabel locationUlLabel;
    private javax.swing.JLabel locationUlText;
    private javax.swing.JPanel stockInfoPanel;
    private de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox stockUnitAutoFilteringComboBox;
    protected javax.swing.JCheckBox suLockCheckBox;
    protected javax.swing.JCheckBox suReserveCheckBox;
    private de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox unitLoadAutofilteringComboBox;
    private javax.swing.JPanel unitLoadInfoPanel;
    private javax.swing.JLabel unitLoadLabel;
    private javax.swing.JLabel unitLoadText;
    // End of variables declaration//GEN-END:variables

    public BOAutoFilteringComboBox<StockUnit> getStockUnitAutoFilteringComboBox() {
        return stockUnitAutoFilteringComboBox;
    }

    public BOAutoFilteringComboBox<UnitLoad> getUnitLoadAutofilteringComboBox() {
        return unitLoadAutofilteringComboBox;
    }

//    public abstract void setRemoveReservationFromSu(boolean removeReservationFromSu);
//
//    public abstract void setRemoveLockFromSu(boolean removeLockFromSu);


}
