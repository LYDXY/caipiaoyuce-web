package com.web.yuce.common.utils;

import java.util.ArrayList;
import java.util.List;

import com.web.pojo.SixOne;

/**
 * @author 林尧
 *
 *         2015年12月21日 短期 方法 49 选7
 */
public class DuanQiCommonUtils {

	// 从m 个数字中选 3个进行组合
	private List<String> strings(List<Integer> integers, int jige) throws Exception {
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

	// 冒泡排序
	public static String bubbleSort(Integer qishu, int[] numbers) {
		int temp; // 记录临时中间值
		int size = numbers.length; // 数组大小
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] > numbers[j]) { // 交换两数的位置
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		String string = new String();
		string = qishu + "---";
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 10) {
				string += ("0" + numbers[i] + ",");
			} else {
				string += (numbers[i] + ",");
			}

		}
		System.out.println(string);
		return string;
		// System.out.println();
	}

	/**
	 * 
	 * @param yilouqingkuang
	 *            比如最近5期中 35 个数字的 遗漏情况 均放在 List 中 ,再进行统计
	 * @return
	 */
	public static List<String> getListString(List<Integer> yilouqingkuang) {
		List<String> strings = new ArrayList<>();
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		int thirteen = 0;
		int fourteen = 0;
		int fifteen = 0;
		int sixteen = 0;
		int seventeen = 0;
		int eighteen = 0;
		int nineteen = 0;
		int twenty = 0;
		int twenty_one = 0;
		int twenty_two = 0;
		int twenty_three = 0;
		int twenty_four = 0;
		int twenty_five = 0;
		int twenty_six = 0;
		int twenty_seven = 0;
		int twenty_eight = 0;
		int twenty_nine = 0;
		int thirty = 0;
		int thirty_one = 0;
		int thirty_two = 0;
		int thirty_three = 0;
		int thirty_four = 0;
		int thirty_five = 0;
		int thirty_six = 0;
		int thirty_seven = 0;
		int thirty_eight = 0;
		int thirty_nine = 0;
		int fourty = 0;
		int fourty_one = 0;
		int fourty_two = 0;
		int fourty_three = 0;
		int fourty_four = 0;
		int fourty_five = 0;
		int fourty_six = 0;
		int fourty_seven = 0;
		int fourty_eight = 0;
		int fourty_nine = 0;
		int fifty = 0;
		for (int i = 0; i < yilouqingkuang.size(); i++) {
			for (int j = 0; j < 50; j++) {
				if (yilouqingkuang.get(i) == j) {
					if (j == 0) {
						zero++;
					} else if (j == 1) {
						one++;
					} else if (j == 2) {
						two++;
					} else if (j == 3) {
						three++;
					} else if (j == 4) {
						four++;
					} else if (j == 5) {
						five++;
					} else if (j == 6) {
						six++;
					} else if (j == 7) {
						seven++;
					} else if (j == 8) {
						eight++;
					} else if (j == 9) {
						nine++;
					} else if (j == 10) {
						ten++;
					} else if (j == 11) {
						eleven++;
					} else if (j == 12) {
						twelve++;
					} else if (j == 13) {
						thirteen++;
					} else if (j == 14) {
						fourteen++;
					} else if (j == 15) {
						fifteen++;
					} else if (j == 16) {
						sixteen++;
					} else if (j == 17) {
						seventeen++;
					} else if (j == 18) {
						eighteen++;
					} else if (j == 19) {
						nineteen++;
					} else if (j == 20) {
						twenty++;
					} else if (j == 21) {
						twenty_one++;
					} else if (j == 22) {
						twenty_two++;
					} else if (j == 23) {
						twenty_three++;
					} else if (j == 24) {
						twenty_four++;
					} else if (j == 25) {
						twenty_five++;
					} else if (j == 26) {
						twenty_six++;
					} else if (j == 27) {
						twenty_seven++;
					} else if (j == 28) {
						twenty_eight++;
					} else if (j == 29) {
						twenty_nine++;
					} else if (j == 30) {
						thirty++;
					} else if (j == 31) {
						thirty_one++;
					} else if (j == 32) {
						thirty_two++;
					} else if (j == 33) {
						thirty_three++;
					} else if (j == 34) {
						thirty_four++;
					} else if (j == 35) {
						thirty_five++;
					} else if (j == 36) {
						thirty_six++;
					} else if (j == 37) {
						thirty_seven++;
					} else if (j == 38) {
						thirty_eight++;
					} else if (j == 39) {
						thirty_nine++;
					} else if (j == 40) {
						fourty++;
					} else if (j == 41) {
						fourty_one++;
					} else if (j == 42) {
						fourty_two++;
					} else if (j == 43) {
						fourty_three++;
					} else if (j == 44) {
						fourty_four++;
					} else if (j == 45) {
						fourty_five++;
					} else if (j == 46) {
						fourty_six++;
					} else if (j == 47) {
						fourty_seven++;
					} else if (j == 48) {
						fourty_eight++;
					} else if (j == 49) {
						fourty_nine++;
					} else if (j == 50) {
						fifty++;
					}
				}
			}
		}

		strings.add(zero + "");
		strings.add(one + "");
		strings.add("" + two);
		strings.add("" + three);
		strings.add("" + four);
		strings.add("" + five);
		strings.add("" + six);
		strings.add("" + seven);
		strings.add("" + eight);
		strings.add("" + nine);
		strings.add("" + ten);
		strings.add("" + eleven);
		strings.add("" + twelve);
		strings.add("" + thirteen);
		strings.add("" + fourteen);
		strings.add("" + fifteen);
		strings.add("" + sixteen);
		strings.add("" + seventeen);
		strings.add("" + eighteen);
		strings.add("" + nineteen);
		strings.add("" + twenty);
		strings.add("" + twenty_one);
		strings.add("" + twenty_two);
		strings.add("" + twenty_three);
		strings.add("" + twenty_four);
		strings.add("" + twenty_five);
		strings.add("" + twenty_six);
		strings.add("" + twenty_seven);
		strings.add("" + twenty_eight);
		strings.add("" + twenty_nine);
		strings.add("" + thirty);
		strings.add("" + thirty_one);
		strings.add("" + thirty_two);
		strings.add("" + thirty_three);
		strings.add("" + thirty_four);
		strings.add("" + thirty_five);
		strings.add("" + thirty_six);
		strings.add("" + thirty_seven);
		strings.add("" + thirty_eight);
		strings.add("" + thirty_nine);
		strings.add("" + fourty);
		strings.add("" + fourty_one);
		strings.add("" + fourty_two);
		strings.add("" + fourty_three);
		strings.add("" + fourty_four);
		strings.add("" + fourty_five);
		strings.add("" + fourty_six);
		strings.add("" + fourty_seven);
		strings.add("" + fourty_eight);
		strings.add("" + fourty_nine);
		strings.add("" + fifty);
		return strings;
	}

	/**
	 * 获取连续几期的末位数字统计
	 */
	public static List<String> getMoWeiNumbersCount(List<SixOne> sixOnes) {

		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		List<Integer> integers = new ArrayList<Integer>();
		for (SixOne sixOne : sixOnes) {

			integers.add(sixOne.getFirst() % 10);
			integers.add(sixOne.getSecond() % 10);
			integers.add(sixOne.getThird() % 10);
			integers.add(sixOne.getFourth() % 10);
			integers.add(sixOne.getFifth() % 10);
			integers.add(sixOne.getSixth() % 10);
			integers.add(sixOne.getSeventh() % 10);

		}
		for (Integer integer : integers) {
			if (integer == 0) {
				zero++;
			} else if (integer == 1) {
				one++;
			} else if (integer == 2) {
				two++;
			} else if (integer == 3) {
				three++;
			} else if (integer == 4) {
				four++;
			} else if (integer == 5) {
				five++;
			} else if (integer == 6) {
				six++;
			} else if (integer == 7) {
				seven++;
			} else if (integer == 8) {
				eight++;
			} else if (integer == 9) {
				nine++;
			}

		}
		List<String> list = new ArrayList<>();
		list.add(zero + "");
		list.add(one + "");
		list.add(two + "");
		list.add(three + "");
		list.add(four + "");
		list.add(five + "");
		list.add(six + "");
		list.add(seven + "");
		list.add(eight + "");
		list.add(nine + "");
		return list;
	}
}
