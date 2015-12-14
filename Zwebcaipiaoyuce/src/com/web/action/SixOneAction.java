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
	private SixOne sixone;
	public String getSixOnes(){
		logger.info(TAG+"---"+"getSixOnes");
		List<SixOne> all_sixones1=SixOneServices.way0();
		sixone=new SixOne();
		sixone.setId(1);
		
		List<SixOne> all_sixones2=SixOneServices.way1(sixone);
		logger.info(TAG+"---该表格的数据总数"+all_sixones1.size()+"+"+all_sixones2.size());
		return "GETSIXONES_SUCCESS";
	}
	
	/**
	 * 添加最新的记录 到数据库
	 */
    public String addSixOne(){
    	logger.info(TAG+"-------"+"addSixOne");
    	sixone=new SixOne();
    	sixone.setQishu(3);
    	sixone.setFirst(13);
    	sixone.setSecond(45);
    	sixone.setThird(21);
    	sixone.setFourth(46);
    	sixone.setFifth(7);
    	sixone.setSixth(10);
    	sixone.setSeventh(19);
    	boolean b=SixOneServices.way2(sixone);
    	if(b){
    		return "ADD_SIXONE_SUCCESS";
    	}
    	else {
			return "ADD_SIXONE_FALSE";
		}
    	
    }
}
