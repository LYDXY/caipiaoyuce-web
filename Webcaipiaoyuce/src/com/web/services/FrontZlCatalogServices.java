package com.web.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.system.pojo.Catalog;
import com.system.pojo.ZlCatalog;

@Transactional
public interface FrontZlCatalogServices {
    
	public List<ZlCatalog> queryTopZlCatalogList(ZlCatalog zlcatalog);
	
	public List<ZlCatalog> queryZlCatalogList(ZlCatalog zlcatalog);
    
    public ZlCatalog queryZlCatalogByBean(int theID);

	public ZlCatalog queryCatalogByBean(ZlCatalog temp);


    //Linyao
	public List<ZlCatalog> queryCatalogListByBean(ZlCatalog catalog);

	
}
