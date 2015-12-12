package com.web.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.web.pojo.SixOne;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 * 
 *         49 选 7 服务接口层
 */
// 添加 spirng 事务
@Transactional
public interface SixOneServices {

	

	// 查询多条
	public List<SixOne> selectSixOnes(SixOne sixOne);

	// 添加一条
	public boolean saveSixOne(SixOne sixOne);

	// 根据期数查询某一条
	public SixOne selectSixOne(int qishu);

	// 查询最新的前几条 数据
	public List<SixOne> selectSixOnes(int top);
}
