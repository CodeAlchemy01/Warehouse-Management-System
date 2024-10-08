/*
 * Copyright (c) 2009-2013 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.service;

import javax.ejb.Stateless;

import org.mywms.service.BasicServiceBean;

import de.wms2.mywms.picking.PickingOrder;
/**
 * @author krane
 *
 */
@Stateless
public class LOSPickingOrderServiceBean extends BasicServiceBean<PickingOrder> implements LOSPickingOrderService{
}
