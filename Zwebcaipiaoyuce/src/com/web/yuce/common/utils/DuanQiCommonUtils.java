package com.web.yuce.common.utils;

import java.util.List;
import java.util.logging.Logger;

import com.web.pojo.SixOne;

import net.sf.json.JSONArray;

/**
 * @author 林尧
 *
 *         2015年12月21日 短期 方法 49 选7
 */
public class DuanQiCommonUtils {

	// 奇偶偏差追踪系统
	/**
	 * 偏差值为偏大的或+10以上的情况，选 择奇数或者全部选择偶数时是有用的
	 * 
	 * @param SixOneTop10
	 * @return
	 */
	public static String do_from_odd_even(List<SixOne> SixOneTop10) {

		int odd = 0;// 存放奇数的个数
		int even = 0;// 存放偶数的个数
		JSONArray jsonarray = JSONArray.fromObject(SixOneTop10);
		SixOne sixOne;
		Integer qishu;
		Integer first;
		Integer second;
		Integer third;
		Integer fourth;
		Integer fifth;
		Integer sixth;
		Integer seventh;
		for (int i = 0; i < SixOneTop10.size(); i++) {
			sixOne = SixOneTop10.get(i);

			if (sixOne.getFirst() != null) {
				if (sixOne.getFirst() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getSecond() != null) {
				if (sixOne.getSecond() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getThird() != null) {
				if (sixOne.getThird() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getFourth() != null) {
				if (sixOne.getFourth() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getFifth()!= null) {
				if (sixOne.getFifth() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getSixth() != null) {
				if (sixOne.getSixth() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (sixOne.getSeventh()!= null) {
				if (sixOne.getSeventh()% 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
		}
        System.out.println("======================");
        System.out.println("奇数的个数为"+odd);
        System.out.println("偶数的个数为"+even);
        
        System.out.println("======================");
		return jsonarray.toString();
	}
}
