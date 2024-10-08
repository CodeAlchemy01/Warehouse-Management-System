/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.goodsreceipt.gui.component;


import de.linogistix.common.gui.gui_builder.AbstractFooterPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author artur
 */
public class FooterPanel extends AbstractFooterPanel {
    TopComponentPanel topComponentPanel;

    List<JButton> buttonList;
    
    JButton saveButton;
            
    public FooterPanel(TopComponentPanel topComponentPanel) {
        this.topComponentPanel = topComponentPanel;
        postInit();
    }

    @Override
    public List<JButton> getButtonList(){
        
        if (buttonList != null){
            return buttonList;
        }

        buttonList = new ArrayList<JButton>();

        return buttonList;
    }
    
    
    private void postInit() {
    }
    
}
