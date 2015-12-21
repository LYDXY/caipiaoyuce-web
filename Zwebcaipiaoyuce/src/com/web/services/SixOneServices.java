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

public interface SixOneServices {

	// 查询所有
	public List<SixOne> way0();

	// 查询多条
	public List<SixOne> way1(SixOne sixOne);

	// 添加一条
	public boolean way2(SixOne sixOne);

	// 根据期数查询某一条
	public SixOne way3(int qishu);

	// 查询当前的最新期数
	public Integer way4();

	// 查询最近的10期
	public List<SixOne> way5();
}
