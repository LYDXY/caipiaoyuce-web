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

	// 查询最近的10 期 降序
	public List<SixOne> way6();

	// 查询 期数小于 选中期 的其他期数 ,并且降序
	public List<SixOne> way7(Integer qishu);

	// 查询 最近 5 到 8期的集合 倒序
	public List<SixOne> way8(Integer top);

	// 查询最近的10 期 ,先升序 再降序

	public List<SixOne> way9();

	// 查询最新的30期数 升序

	public List<SixOne> way10();
	
	//查询 过去 n 期的期数 ,升序
	public List<SixOne> way11(Integer limit);
	
	 //查询 过去 n 期的期数 ,降序
  	public List<SixOne> way12(Integer limit);
}
