package com.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.pojo.ShuangSeQiu;
import com.web.mappers.ShuangSeQiuMapper;

/**
 * 
 * @author 林尧 2015年12月12日 服务层
 */

// 通过注解 说明是服务层
@Service("ShuangSeQiuServices")
public class ShuangSeQiuServicesImpl implements ShuangSeQiuServices {

	/**
	 * 注入ShuangSeQiuMapper
	 */
	private ShuangSeQiuMapper shuangseqiumapper;

	public ShuangSeQiuMapper getSixonemapper() {
		return shuangseqiumapper;
	}

	public void setSixonemapper(ShuangSeQiuMapper shuangseqiumapper) {
		this.shuangseqiumapper = shuangseqiumapper;
	}

	/**
	 * 查询所有
	 */
	@Override
	public List<ShuangSeQiu> way0() {

		return shuangseqiumapper.way0();
	}

	/**
	 * 根据多个条件 查询 多个对象
	 */
	@Override
	public List<ShuangSeQiu> way1(ShuangSeQiu sixOne) {
		return shuangseqiumapper.way1(sixOne);
	}

	/**
	 * 添加一条记录
	 */
	@Override
	public boolean way2(ShuangSeQiu sixOne) {
		return shuangseqiumapper.way2(sixOne);
	}

	/**
	 * 根据期数 查询具体某一期的记录
	 */
	@Override
	public ShuangSeQiu way3(int qishu) {
		return shuangseqiumapper.way3(qishu);
	}

	/**
	 * 
	 */
	@Override
	public Integer way4() {
		
		return shuangseqiumapper.way4();
	}
	
	/**
	 * 查询最近的十期
	 */
	@Override
    public List<ShuangSeQiu> way5() {
		return shuangseqiumapper.way5();
	}

	/**
	 * 查询最近的10期 降序
	 */
	@Override
	public List<ShuangSeQiu> way6() {
		
		return shuangseqiumapper.way6();
	}

	/**
	 * 查询 期数小于 选中期 的其他期数 ,并且降序
	 */
	@Override
	public List<ShuangSeQiu> way7(Integer qishu) {
		
		return shuangseqiumapper.way7(qishu);
	}

	/**
	 *  查询 最近 5 到 8期的集合
	 */
    @Override
	public List<ShuangSeQiu> way8(Integer top) {
		
		return shuangseqiumapper.way8(top);
	}

	
	@Override
	public List<ShuangSeQiu> way9() {
		
		return shuangseqiumapper.way9();
	}


	@Override
	public List<ShuangSeQiu> way10() {
		
		return shuangseqiumapper.way10();
	}

	
	@Override
	public List<ShuangSeQiu> way11(Integer limit) {
		return shuangseqiumapper.way11(limit);
	}

	
}
