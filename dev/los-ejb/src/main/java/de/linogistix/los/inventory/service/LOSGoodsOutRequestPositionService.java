/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.service;

import javax.ejb.Local;

import org.mywms.service.BasicService;

import de.wms2.mywms.shipping.ShippingOrderLine;

@Local
public interface LOSGoodsOutRequestPositionService extends
		BasicService<ShippingOrderLine> {
}
