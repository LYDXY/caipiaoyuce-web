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

}
