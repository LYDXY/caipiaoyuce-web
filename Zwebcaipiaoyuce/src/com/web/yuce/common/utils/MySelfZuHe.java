package com.web.yuce.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林尧
 *
 *         2016年1月8日
 */
public class MySelfZuHe {


	/**
	 * 
	 */
	public MySelfZuHe() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 整形数组
	 * 
	 * @param a
	 * @param m
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public  List<String> combine(int[] a, int m) throws Exception {
		int n = a.length;
		if (m > n) {
			throw new Exception("错误！数组a中只有" + n + "个元素。" + m + "大于" + 2 + "!!!");
		}

		List result = new ArrayList();

		int[] bs = new int[n];
		for (int i = 0; i < n; i++) {
			bs[i] = 0;
		}
		// 初始化
		for (int i = 0; i < m; i++) {
			bs[i] = 1;
		}
		boolean flag = true;
		boolean tempFlag = false;
		int pos = 0;
		int sum = 0;
		// 首先找到第一个10组合，然后变成01，同时将左边所有的1移动到数组的最左边
		do {
			sum = 0;
			pos = 0;
			tempFlag = true;
			result.add(printIntZuHe(bs, a, m));

			for (int i = 0; i < n - 1; i++) {
				if (bs[i] == 1 && bs[i + 1] == 0) {
					bs[i] = 0;
					bs[i + 1] = 1;
					pos = i;
					break;
				}
			}
			// 将左边的1全部移动到数组的最左边

			for (int i = 0; i < pos; i++) {
				if (bs[i] == 1) {
					sum++;
				}
			}
			for (int i = 0; i < pos; i++) {
				if (i < sum) {
					bs[i] = 1;
				} else {
					bs[i] = 0;
				}
			}

			// 检查是否所有的1都移动到了最右边
			for (int i = n - m; i < n; i++) {
				if (bs[i] == 0) {
					tempFlag = false;
					break;
				}
			}
			if (tempFlag == false) {
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);
		result.add(printIntZuHe(bs, a, m));

		List<String> strings = new ArrayList<String>();
		for (int i = 0; i < result.size(); i++) {
			int[] tempa = (int[]) result.get(i);
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < tempa.length; j++) {

				builder.append(tempa[j] + "-");
			}
			strings.add(builder.toString());

		}

		return strings;
	}

	private   int[] printIntZuHe(int[] bs, int[] a, int m) {
		int[] result = new int[m];
		int pos = 0;
		for (int i = 0; i < bs.length; i++) {
			if (bs[i] == 1) {
				result[pos] = a[i];
				pos++;
			}
		}
		return result;
	}

	/**
	 * 整形集合
	 * 
	 * @param a
	 * @param m
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public  List<String> combine2(List<Integer> a, int m) throws Exception {

		int n = a.size();
		if (m > n) {
			throw new Exception("错误！数组a中只有" + n + "个元素。" + m + "大于" + 2 + "!!!");
		}
		List result = new ArrayList();
		int[] bs = new int[n];
		for (int i = 0; i < n; i++) {
			bs[i] = 0;
		}
		// 初始化
		for (int i = 0; i < m; i++) {
			bs[i] = 1;
		}
		boolean flag = true;
		boolean tempFlag = false;
		int pos = 0;
		int sum = 0;
		// 首先找到第一个10组合，然后变成01，同时将左边所有的1移动到数组的最左边
		do {
			sum = 0;
			pos = 0;
			tempFlag = true;
			result.add(printListIntZuHe(bs, a, m));

			for (int i = 0; i < n - 1; i++) {
				if (bs[i] == 1 && bs[i + 1] == 0) {
					bs[i] = 0;
					bs[i + 1] = 1;
					pos = i;
					break;
				}
			}
			// 将左边的1全部移动到数组的最左边

			for (int i = 0; i < pos; i++) {
				if (bs[i] == 1) {
					sum++;
				}
			}
			for (int i = 0; i < pos; i++) {
				if (i < sum) {
					bs[i] = 1;
				} else {
					bs[i] = 0;
				}
			}

			// 检查是否所有的1都移动到了最右边
			for (int i = n - m; i < n; i++) {
				if (bs[i] == 0) {
					tempFlag = false;
					break;
				}
			}
			if (tempFlag == false) {
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);
		result.add(printListIntZuHe(bs, a, m));

		List<String> strings = new ArrayList<String>();
		for (int i = 0; i < result.size(); i++) {
			int[] tempa = (int[]) result.get(i);
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < tempa.length; j++) {
				builder.append(tempa[j] + "-");
			}
			builder=builder.deleteCharAt(builder.length() - 1);
			strings.add(builder.toString());

		}
		System.out.println("组合的结果共:"+strings.size()+"组");
		return strings;
	}

	private  int[] printListIntZuHe(int[] bs, List<Integer> a, int m) {
		int[] result = new int[m];
		int pos = 0;
		for (int i = 0; i < bs.length; i++) {
			if (bs[i] == 1) {
				result[pos] = a.get(i);
				pos++;
			}
		}
		return result;
	}

}
