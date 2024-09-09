/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.query.gui.component;

import de.linogistix.common.bobrowser.query.*;
import de.linogistix.common.res.CommonBundleResolver;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.propertysheet.PropertySheet;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;

/**
 * JPanel for showing properties in a PropertySheet for forming where clauses in
 *QueryByTemplate Queries.
 *
 * @author  trautm
 */
public class QueryByTemplateJPanel1 extends javax.swing.JPanel implements ExplorerManager.Provider{
  
  BOQueryByTemplateNode node;

  private ExplorerManager explorerManager = new ExplorerManager();
  
  /** Creates new form QueryByTemplateJPanel1 */
  public QueryByTemplateJPanel1(BOQueryByTemplateNode node) { 
    this.node= node;  
    setName(NbBundle.getMessage(CommonBundleResolver.class,"QueryByTemplateWizard.Title"));  
    
    initComponents();
    
    initPropertySheet();
  }
  
  private void initPropertySheet(){
    
//    SwingUtilities.invokeLater(new Runnable() {
//      public void run() {
//        final PropertySheet ps;
//        ps = new PropertySheet();
//        ps.setNodes(new Node[]{node});
//        add(ps);
//      }
//    });
      
       final PropertySheet ps;
       ps = new PropertySheet(){

           
           
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                                
                System.out.println("---- !!!!! Painting PropertySheet  !!!!! -----");
            }

            

            @Override
            public void repaint(long tm, int x, int y, int width, int height) {
//                super.repaint(tm, x, y, width, height);
//                System.out.println("---- !!!!! Repainting PropertySheet  coordinates!!!!! -----");
            }

            @Override
            public void repaint(Rectangle r) {
                super.repaint(r);
                System.out.println("---- !!!!! Repainting PropertySheet rectangle  !!!!! -----");
            }
           
       };
       
       ps.setNodes(new Node[]{node});
       
       add(ps, BorderLayout.CENTER);
  }
  
//  public void addNotify() {
//    super.addNotify();
//    initComponents();
//    initPropertySheet();
//  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
  
  boolean implIsValid() {
    return true;
  }
  
  void implReadSettings(Object settings) {
  }
  
  void implStoreSettings(Object settings) {
    QueryByTemplateWizard w = (QueryByTemplateWizard)settings;
  }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("---- !!!!! Painting QueryByTemplateJPanel1  !!!!! -----");
    }

    
  
    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
//        super.repaint(tm, x, y, width, height);
//        System.out.println("---- !!!!! Repainting QueryByTemplateJPanel1 coordinates  !!!!! -----");
    }

    @Override
    public void repaint(Rectangle r) {
        super.repaint(r);
        System.out.println("---- !!!!! Repainting QueryByTemplateJPanel1 rectangle  !!!!! -----");
    }

    public ExplorerManager getExplorerManager() {
        return this.explorerManager;
    }
  
  
}
