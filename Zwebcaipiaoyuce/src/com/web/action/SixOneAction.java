package com.web.action;

import java.util.List;

import javax.annotation.Resource;

import com.web.pojo.SixOne;
import com.web.services.SixOneServices;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 */
public class SixOneAction extends BaseAction {
    
	private String TAG="SixOneAction";
	private static final long serialVersionUID = 1L;

	@Resource(name = "SixOneServices")//接口的实现
	private SixOneServices SixOneServices; // 服务层的接口 
    
	/**
	 * 查询所有的期数 数据
	 * @return
	 */
	public String getSixOnes(){
		logger.info(TAG+"---"+"getSixOnes");
		List<SixOne> all_sixones1=SixOneServices.way0();
		SixOne one=new SixOne();
		one.setId(1);;
		
		List<SixOne> all_sixones2=SixOneServices.way1(one);
		logger.info(TAG+"---该表格的数据总数"+all_sixones1.size()+"+"+all_sixones2.size());
		return "GETSIXONES_SUCCESS";
	}

}
