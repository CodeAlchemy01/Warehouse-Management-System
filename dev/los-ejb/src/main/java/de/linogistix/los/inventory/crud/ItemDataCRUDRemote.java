/*
 * UserCRUDRemote.java
 *
 * Created on 14. September 2006, 06:53
 *
 * Copyright (c) 2006 LinogistiX GmbH. All rights reserved.
 *
 *<a href="http://www.linogistix.com/">browse for licence information</a>
 *
 */

package de.linogistix.los.inventory.crud;

import de.linogistix.los.crud.BusinessObjectCRUDRemote;
import de.wms2.mywms.product.ItemData;

import javax.ejb.Remote;

/**
 * CRUD operations for User entities
 * @see  BusinessObjectCRUDRemote
 * 
 * @author trautm
 *
 */
@Remote
public interface ItemDataCRUDRemote extends BusinessObjectCRUDRemote<ItemData>{

}
