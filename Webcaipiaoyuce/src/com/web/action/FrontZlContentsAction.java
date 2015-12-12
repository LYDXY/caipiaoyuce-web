package com.web.action;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.system.action.BaseAction;
import com.system.pojo.Catalog;
import com.system.pojo.Contents;
import com.system.pojo.User;
import com.system.pojo.ZlCatalog;
import com.system.pojo.ZlContents;
import com.system.services.UserServices;
import com.web.services.FrontZlCatalogServices;
import com.web.services.FrontZlContentsServices;
import com.web.utils.Arithmetic;

public class FrontZlContentsAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	@Resource(name="frontZlContentsServices")
	private FrontZlContentsServices frontZlContentsServices;	
	
	@Resource(name="frontZlCatalogServices")
	private FrontZlCatalogServices frontZlCatalogServices;
	
	@Autowired
	private UserServices userServices;

	public String frontZlContentsRight(){
		
		
		String catalogID = request.getParameter("theID");
//		String pageNum = request.getParameter("pageNum");
//		String pageSize = request.getParameter("pageSize");
		if (catalogID == null) {
            catalogID = "5";//给一个默认值
        }
		 ZlCatalog catalog = this.getCatalogByID(catalogID);
		 logger.info("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"+catalog); 
		 request.setAttribute("catalog", catalog);
		 List<ZlCatalog> leftCatalogList = this.findChildCatalogs(catalogID);
		 logger.info("1111111111111111111"+leftCatalogList); 
		 ZlCatalog leftCatalog = new ZlCatalog();
	/*	if(catalogID!=null&&!"".equals(catalogID)){
			ZlCatalog catalog = frontZlCatalogServices.queryZlCatalogByBean(Integer.valueOf(catalogID));
			request.setAttribute("catalog", catalog);
		}*/
		 if (leftCatalogList == null || leftCatalogList.size() <= 0) {//如果不存在子栏目
			 if (catalog.getParentID().equals("0")) {
				 leftCatalog.setTheID(catalog.getTheID());
			 } else {
				 leftCatalog.setParentID(catalog.getParentID());
			 }
			 leftCatalog.setStatus("1");
	         leftCatalogList = this.initLeftCatalog(leftCatalog);
	     }
		 request.setAttribute("leftCatalogList", leftCatalogList);
		 Arithmetic des = new Arithmetic();
		 if (catalog != null) {
			 logger.debug(">>>>>>>>>>>>>>>>>>>>>>> catalogType : " + catalog.getCatalogType());
			 if (catalog.getCatalogType().equals("t_contents")) {
        		
				 List<Integer> catalogIDList = new ArrayList<Integer>();
            	
				 catalogIDList = this.queryLeafCatalogIDList(catalog.getTheID().toString(), catalogIDList);
				 Integer[] ids = new Integer[catalogIDList.size()];
				 for(int i = 0;i < catalogIDList.size();i++){
					 ids[i] = catalogIDList.get(i);
				 }
				 ZlContents zlContents = new ZlContents();
				 zlContents.setIds(ids);
				 PageInfo<ZlContents> contentsList = frontZlContentsServices.queryContentsByIds(zlContents, getPageNum(), getPageSize());
            	
              	 if(contentsList != null && contentsList.getList().size() > 0){
              		 for(ZlContents c : contentsList.getList()){
              			 c.setDesId(des.getEncString(c.getTheID().toString()));
              		 }
              	 }
              	 logger.debug(">>>>>>>>>>>>>>>>>>>>>>>  contentsList : " +  contentsList);
              	 request.setAttribute("contentsList", contentsList);
			 }
		/*if(catalogID!=null&&!("").equals(catalogID)){
			
			ZlCatalog zlcatalog = new ZlCatalog();
			zlcatalog.setParentID(catalogID);
			List<ZlCatalog> zlCatalogList = frontZlCatalogServices.queryZlCatalogList(zlcatalog);
			if(zlCatalogList.size() > 0){
				zlContents.setCatalogPid(catalogID);
			}else{
				zlContents.setCatalogID(catalogID);
			}
			zlContents.setStatus("1");
			List<ZlContents> list = new ArrayList<ZlContents>();
			list = this.frontZlContentsServices.queryZlContentsList(zlContents);
			
			
			request.setAttribute("list", list);
		}*/
		 }
		 request.setAttribute("theID", catalogID);
		 return SUCCESS;
		
	}
	
	

	public String frontZlContentsDetail(){
		int theID = Integer.valueOf(request.getParameter("theID"));
		ZlContents zlContents = frontZlContentsServices.queryZlContentsByBean(theID);
		
		User user = new User();
		user.setId(Integer.valueOf(zlContents.getCreater_pid()));
		user = userServices.queryUserByBean(user);
		
		if(user != null && user.getRealName() != null){
			zlContents.setUserName(user.getRealName());
		}
		
		request.setAttribute("zlContents", zlContents);
		String title = request.getParameter("title");
		request.setAttribute("title", title);
		return SUCCESS;
	}
	

    /**
     * @param catalogID
     * @return
     */
    private ZlCatalog getCatalogByID(String catalogID) {
    	ZlCatalog temp = new ZlCatalog();
        temp.setTheID(Integer.valueOf(catalogID));
        ZlCatalog catalog = frontZlCatalogServices.queryCatalogByBean(temp);
        return catalog;
    }
    private List<ZlCatalog> findChildCatalogs(String theID) {
    	ZlCatalog catalog = new ZlCatalog();
        catalog.setParentID(theID);
        catalog.setStatus("1");
        List<ZlCatalog> list =frontZlCatalogServices.queryCatalogListByBean(catalog);
        return list;
    }
    /**
     * 初始左导航
     *
     * @return
     */
    private List<ZlCatalog> initLeftCatalog(ZlCatalog catalog) {
        if (catalog == null) {
            catalog = new ZlCatalog();
            catalog.setParentID("1");
            catalog.setStatus("1");
        }
        List<ZlCatalog> list = frontZlCatalogServices.queryCatalogListByBean(catalog);
        return list;
    }
    /**
     * 根据某个catalogID查找其子栏目id
     * @param catalogID
     * @param ids
     * @return
     */
    public List<Integer> queryLeafCatalogIDList(String catalogID, List<Integer> ids){
    	if(catalogID != null){
    		ZlCatalog temp = new ZlCatalog();
            temp.setParentID(catalogID);
            temp.setStatus("1");
            List<ZlCatalog> list = frontZlCatalogServices.queryCatalogListByBean(temp);
            if (list != null && list.size() > 0) {//存在子栏目
                for (int i = 0; i < list.size(); i++) {
                	ZlCatalog c = list.get(i);
                    ids = this.queryLeafCatalogIDList(c.getTheID().toString(), ids);//递归
                }
            } else {
                //不存在子栏目（即叶节点），直接加入到集合中
            	ids.add(Integer.valueOf(catalogID));
            	
            }
    	}
    	return ids;
    }
}
