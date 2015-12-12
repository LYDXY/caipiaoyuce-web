package com.web.mappers;

import java.util.List;

import com.web.pojo.*;

/**
 * @author 林尧
 * 
 *         2015年12月12日 这种配置方案的固定写法
 */
public interface SixOneMapper {

	//查询一条
	public SixOne  fineSixOne(SixOne sixOne);
    //查询多条
	public List<SixOne> findSixOnes(SixOne sixOne);
    //添加一条
	public boolean  saveSixOne(SixOne sixOne);
	//根据期数查询某一期
	public SixOne  fineSixOne(int qishu);
	//查询最新的 的期数
	public List<SixOne> findSixOnes(int top);
}
