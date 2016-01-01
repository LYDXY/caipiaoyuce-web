package com.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.pojo.SixOne2;
import com.web.mappers.SixOne2Mapper;

/**
 * 
 * @author 林尧 2015年12月12日 服务层
 */

// 通过注解 说明是服务层
@Service("SixOne2Services")
public class SixOne2ServicesImpl implements SixOne2Services {

	/**
	 * 注入SixOne2Mapper
	 */
	private SixOne2Mapper sixone2mapper;

	public SixOne2Mapper getSixonemapper() {
		return sixone2mapper;
	}

	public void setSixonemapper(SixOne2Mapper sixonemapper) {
		this.sixone2mapper = sixonemapper;
	}

	/**
	 * 查询所有
	 */
	@Override
	public List<SixOne2> way0() {

		return sixone2mapper.way0();
	}

	/**
	 * 根据多个条件 查询 多个对象
	 */
	@Override
	public List<SixOne2> way1(SixOne2 sixOne) {
		return sixone2mapper.way1(sixOne);
	}

	/**
	 * 添加一条记录
	 */
	@Override
	public boolean way2(SixOne2 sixOne) {
		return sixone2mapper.way2(sixOne);
	}

	/**
	 * 根据期数 查询具体某一期的记录
	 */
	@Override
	public SixOne2 way3(int qishu) {
		return sixone2mapper.way3(qishu);
	}

	/**
	 * 
	 */
	@Override
	public Integer way4() {
		
		return sixone2mapper.way4();
	}
	
	/**
	 * 查询最近的十期
	 */
	@Override
    public List<SixOne2> way5() {
		return sixone2mapper.way5();
	}

	/**
	 * 查询最近的10期 降序
	 */
	@Override
	public List<SixOne2> way6() {
		
		return sixone2mapper.way6();
	}

	/**
	 * 查询 期数小于 选中期 的其他期数 ,并且降序
	 */
	@Override
	public List<SixOne2> way7(Integer qishu) {
		
		return sixone2mapper.way7(qishu);
	}

	/**
	 *  查询 最近 5 到 8期的集合
	 */
    @Override
	public List<SixOne2> way8(Integer top) {
		
		return sixone2mapper.way8(top);
	}

	
	@Override
	public List<SixOne2> way9() {
		
		return sixone2mapper.way9();
	}


	@Override
	public List<SixOne2> way10() {
		
		return sixone2mapper.way10();
	}

	
	@Override
	public List<SixOne2> way11(Integer limit) {
		return sixone2mapper.way11(limit);
	}

	
}
