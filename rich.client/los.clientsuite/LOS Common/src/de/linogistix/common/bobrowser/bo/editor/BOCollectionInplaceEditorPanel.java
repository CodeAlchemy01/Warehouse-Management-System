/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.bo.editor;

import de.linogistix.common.bobrowser.api.BOLookup;
import de.linogistix.common.bobrowser.bo.BO;
import java.awt.Graphics;
import java.util.Collection;
import org.mywms.model.BasicEntity;
import org.openide.util.Lookup;

/**
 *
 * @author  trautm
 */
public class BOCollectionInplaceEditorPanel extends javax.swing.JPanel {
  
  private Collection<BasicEntity> entities;
  
  /** Creates new form BOInplaceEditorPanel */
  public BOCollectionInplaceEditorPanel() {
    initComponents();
  }

  
  public Collection<BasicEntity> getEntities() {
    return entities;
  }

  public void setEntities(Collection<BasicEntity> entities) {
    BO bo;
    this.entities = entities;
    if (entities != null){
      inputField.setText(BOCollectionEditor.toString(getEntities()));
    } else{
      inputField.setText("");
    }
  }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

  
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        inputField.setEditable(false);
        inputField.setText("jTextField1");
        inputField.setBorder(null);
        add(inputField, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    // End of variables declaration//GEN-END:variables
  
}
