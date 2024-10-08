/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.location.entityservice;

import javax.ejb.Stateless;

import org.mywms.service.BasicServiceBean;

import de.wms2.mywms.location.StorageLocation;

/**
 *
 * @author Jordan
 */
@Stateless
public class LOSStorageLocationServiceBean 
        extends BasicServiceBean<StorageLocation>
        implements LOSStorageLocationService{
}
