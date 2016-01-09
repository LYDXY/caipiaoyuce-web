package com.web.yuce.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林尧
 *
 *         2015年12月21日 短期 方法 49 选7
 */
public class DuanQiCommonUtils {

	//从m 个数字中选 3个进行组合
	private List<String> strings(List<Integer> integers,int jige) throws Exception{
		int n = integers.size();
		if (jige > n) {
			throw new Exception("错误！数组a中只有" + n + "个元素。" + jige + "大于" + 2 + "!!!");
		}
		
		List result = new ArrayList();
		int[] bs = new int[n];
		for (int i = 0; i < n; i++) {
			bs[i] = 0;
		}
		return null;
	}
	

}
