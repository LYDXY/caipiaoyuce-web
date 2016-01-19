package com.web.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.web.pojo.ShuangSeQiu;
import com.web.pojo.SixOne;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 * 
 *         49 选 7 服务接口层
 */

public interface ShuangSeQiuServices {

	// 查询所有
	public List<ShuangSeQiu> way0();

	// 查询多条
	public List<ShuangSeQiu> way1(ShuangSeQiu sixOne);

	// 添加一条
	public boolean way2(ShuangSeQiu sixOne);

	// 根据期数查询某一条
	public ShuangSeQiu way3(int qishu);

	// 查询当前的最新期数
	public Integer way4();

	// 查询最近的10期
	public List<ShuangSeQiu> way5();

	// 查询最近的10 期 降序
	public List<ShuangSeQiu> way6();

	// 查询 期数小于 选中期 的其他期数 ,并且降序
	public List<ShuangSeQiu> way7(Integer qishu);

	// 查询 最近 5 到 8期的集合 倒序
	public List<ShuangSeQiu> way8(Integer top);

	// 查询最近的10 期 ,先升序 再降序

	public List<ShuangSeQiu> way9();

	// 查询最新的30期数 升序

	public List<ShuangSeQiu> way10();

	// 查询 过去 n 期的期数 ,升序
	public List<ShuangSeQiu> way11(Integer limit);

	// 查询 过去 n 期的期数 ,降序
	public List<ShuangSeQiu> way12(Integer limit);

	// 查询当前最新的期数id
	public Integer way13();
}
