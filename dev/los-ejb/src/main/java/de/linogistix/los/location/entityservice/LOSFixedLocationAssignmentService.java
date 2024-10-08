/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.location.entityservice;

import javax.ejb.Local;

import org.mywms.service.BasicService;

import de.wms2.mywms.strategy.FixAssignment;

@Local
public interface LOSFixedLocationAssignmentService 
					extends BasicService<FixAssignment>
{	
}
