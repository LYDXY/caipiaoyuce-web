package com.web.mappers;

import java.util.List;

import com.web.pojo.*;

/**
 * @author 林尧
 * 
 *         2015年12月12日 这种配置方案的固定写法
 */
public interface SixOneMapper {

	

	// 查询所有
	public List<SixOne> way0();

	// 查询多条
	public List<SixOne> way1(SixOne sixOne);

	// 添加一条
	public boolean way2(SixOne sixOne);

	// 根据期数查询某一条
	public SixOne way3(int qishu);
	
	// 查询当前的最近期数
	public Integer way4();

}
