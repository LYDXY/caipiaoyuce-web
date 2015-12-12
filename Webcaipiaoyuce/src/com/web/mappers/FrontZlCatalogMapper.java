package com.web.mappers;

import java.util.List;

import com.system.pojo.Contents;
import com.system.pojo.ZlCatalog;

public interface FrontZlCatalogMapper {

    public List<ZlCatalog> queryTopZlCatalogList(ZlCatalog zlcatalog);

    public List<ZlCatalog> queryZlCatalogList(ZlCatalog zlcatalog);
    
    public ZlCatalog queryZlCatalogByBean(int theID);

	public List<ZlCatalog> queryContentsByIds(ZlCatalog zlcatalog);

	public ZlCatalog queryCatalogByBean(ZlCatalog temp);

	//linyao
	public List<ZlCatalog> queryCatalogListByBean(ZlCatalog catalog);

    
}
