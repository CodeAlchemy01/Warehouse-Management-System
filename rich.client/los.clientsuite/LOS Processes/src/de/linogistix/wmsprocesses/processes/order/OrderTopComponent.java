/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.order;

import de.linogistix.common.gui.component.other.TopComponentExt;
import de.linogistix.common.services.J2EEServiceLocator;
import de.linogistix.los.model.LOSCommonPropertyKey;
import de.linogistix.wmsprocesses.processes.order.gui.component.TopComponentPanel;
import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;
import java.io.Serializable;
import java.util.logging.Logger;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
//import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
final class OrderTopComponent extends TopComponentExt {

    private static OrderTopComponent instance;
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";

    private static final String PREFERRED_ID = "OrderTopComponent";
    private TopComponentPanel topComponentPanel = new TopComponentPanel(this);
    
    private OrderTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(WMSProcessesBundleResolver.class, "CTL_OrderTopComponent"));
        setToolTipText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "HINT_OrderTopComponent"));
        postInit();
//        setIcon(Utilities.loadImage(ICON_PATH, true));
    }

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
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized OrderTopComponent getDefault() {
        if (instance == null) {
            instance = new OrderTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the OrderTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized OrderTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(OrderTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof OrderTopComponent) {
            return (OrderTopComponent) win;
        }
        Logger.getLogger(OrderTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID +
                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        J2EEServiceLocator loc = (J2EEServiceLocator) Lookup.getDefault().lookup(J2EEServiceLocator.class);
        if( loc.getPropertyBool(LOSCommonPropertyKey.NBCLIENT_RESTORE_TABS, true) ) {
            return TopComponent.PERSISTENCE_ONLY_OPENED;
        }
        else {
            return TopComponent.PERSISTENCE_NEVER;
        }
    }

    /** replaces this in object stream */
    @Override
    public Object writeReplace() {
        return new ResolvableHelper();
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    final static class ResolvableHelper implements Serializable {

        private static final long serialVersionUID = 1L;

        public Object readResolve() {
            return OrderTopComponent.getDefault();
        }
    }
    private void postInit() {
        add(topComponentPanel);
    }

    @Override
    public HelpCtx getHelpCtx() {
        return  new HelpCtx("de.linogistix.wmsprocesses.create_order");
    }
    
    
}
