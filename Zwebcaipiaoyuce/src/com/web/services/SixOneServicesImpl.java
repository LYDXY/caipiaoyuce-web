package com.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.pojo.SixOne;
import com.web.mappers.SixOneMapper;

/**
 * 
 * @author 林尧 2015年12月12日 服务层
 */

// 通过注解 说明是服务层
@Service("SixOneServices")
public class SixOneServicesImpl implements SixOneServices {

	/**
	 * 注入SixOneMapper
	 */
	private SixOneMapper sixonemapper;

	public SixOneMapper getSixonemapper() {
		return sixonemapper;
	}

	public void setSixonemapper(SixOneMapper sixonemapper) {
		this.sixonemapper = sixonemapper;
	}

	/**
	 * 查询所有
	 */
	@Override
	public List<SixOne> way0() {

		return sixonemapper.way0();
	}

	/**
	 * 根据多个条件 查询 多个对象
	 */
	@Override
	public List<SixOne> way1(SixOne sixOne) {
		return sixonemapper.way1(sixOne);
	}

	/**
	 * 添加一条记录
	 */
	@Override
	public boolean way2(SixOne sixOne) {
		return sixonemapper.way2(sixOne);
	}

	/**
	 * 根据期数 查询具体某一期的记录
	 */
	@Override
	public SixOne way3(int qishu) {
		return sixonemapper.way3(qishu);
	}

	/**
	 * 
	 */
	@Override
	public Integer way4() {
		
		return sixonemapper.way4();
	}
	
	/**
	 * 查询最近的十期
	 */
	@Override
    public List<SixOne> way5() {
		return sixonemapper.way5();
	}

	/**
	 * 查询最近的10期 降序
	 */
	@Override
	public List<SixOne> way6() {
		
		return sixonemapper.way6();
	}

	/**
	 * 查询 期数小于 选中期 的其他期数 ,并且降序
	 */
	@Override
	public List<SixOne> way7(Integer qishu) {
		
		return sixonemapper.way7(qishu);
	}

	/**
	 *  查询 最近 5 到 8期的集合
	 */
    @Override
	public List<SixOne> way8(Integer top) {
		
		return sixonemapper.way8(top);
	}

	
	@Override
	public List<SixOne> way9() {
		
		return sixonemapper.way9();
	}


	@Override
	public List<SixOne> way10() {
		
		return sixonemapper.way10();
	}

	
	@Override
	public List<SixOne> way11(Integer limit) {
		return sixonemapper.way11(limit);
	}

	
	@Override
	public List<SixOne> way12(Integer limit) {
		
		return sixonemapper.way12(limit);
	}


	@Override
	public Integer way13(Integer limit) {
		
		return sixonemapper.way13(limit);
	}

	
	@Override
	public SixOne way14(Integer qishu) {
		return sixonemapper.way14(qishu);
	}

	
	@Override
	public Integer way15() {
		
		return sixonemapper.way15();
	}

	
}
