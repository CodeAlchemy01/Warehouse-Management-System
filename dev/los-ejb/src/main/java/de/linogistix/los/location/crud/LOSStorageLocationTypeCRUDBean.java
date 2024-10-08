/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.location.crud;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.mywms.service.BasicService;

import de.linogistix.los.crud.BusinessObjectCRUDBean;
import de.linogistix.los.location.entityservice.LOSStorageLocationTypeService;
import de.wms2.mywms.location.LocationType;

/**
 *
 * @author Jordan
 */
@Stateless
public class LOSStorageLocationTypeCRUDBean 
        extends BusinessObjectCRUDBean<LocationType>
        implements LOSStorageLocationTypeCRUDRemote 
{
    @EJB
    LOSStorageLocationTypeService typeService;

    @Override
    protected BasicService<LocationType> getBasicService() {
        return typeService;
    }
 
}
