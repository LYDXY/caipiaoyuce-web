package com.web.mappers;

import java.util.List;

import com.web.pojo.*;

/**
 * @author 林尧
 * 
 *         2015年12月12日 这种配置方案的固定写法
 */
public interface SixOneMapper {



	// 查询多条
	public List<SixOne> selectSixOnes(SixOne sixOne);

	// 添加一条
	public boolean saveSixOne(SixOne sixOne);

	// 根据期数查询某一条
	public SixOne selectSixOne(int qishu);

	// 查询最新的前几条 数据
	public List<SixOne> selectSixOnes(int top);
}
