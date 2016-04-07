package com.web.yuce.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		/*strings.add("" + twenty_six);
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
		strings.add("" + fifty);*/
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

	/**
	 * 获取连续几期的头部情况统计
	 */
	public static List<String> getTouBu(List<SixOne> sixOnes) {
		List<String> list = new ArrayList<>();
		List<Integer> integers = new ArrayList<Integer>();
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		for (SixOne sixOne : sixOnes) {

			integers.add(sixOne.getFirst() / 10);
			integers.add(sixOne.getSecond() / 10);
			integers.add(sixOne.getThird() / 10);
			integers.add(sixOne.getFourth() / 10);
			integers.add(sixOne.getFifth() / 10);
			integers.add(sixOne.getSixth() / 10);
			integers.add(sixOne.getSeventh() / 10);

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
			}

		}
		list.add(zero + "");
		list.add(one + "");
		list.add(two + "");
		list.add(three + "");
		list.add(four + "");
		return list;
	}

	/**
	 * 获取连续几期中的数字区间情况统计
	 */
	public static List<String> getQuJian(List<SixOne> sixOnes) {
		List<String> strings = new ArrayList<String>();
		Integer Integer1to5 = 0;
		Integer Integer6to10 = 0;
		Integer Integer11to15 = 0;
		Integer Integer16to20 = 0;
		Integer Integer21to25 = 0;
		Integer Integer26to30 = 0;
		Integer Integer31to35 = 0;
		Integer Integer36to40 = 0;
		Integer Integer41to45 = 0;
		Integer Integer46to49 = 0;
		List<Integer> templist = new ArrayList<Integer>();
		for (int i = 0; i < sixOnes.size(); i++) {
			templist.add(sixOnes.get(i).getFirst());
			templist.add(sixOnes.get(i).getSecond());
			templist.add(sixOnes.get(i).getThird());
			templist.add(sixOnes.get(i).getFourth());
			templist.add(sixOnes.get(i).getFifth());
			templist.add(sixOnes.get(i).getSixth());
			templist.add(sixOnes.get(i).getSeventh());

		}
		for (int i = 0; i < templist.size(); i++) {
			Integer integer = templist.get(i);
			if (integer <= 5) {
				Integer1to5++;
			}
			if (integer <= 10 && integer > 5) {
				Integer6to10++;
			}
			if (integer <= 15 && integer > 10) {
				Integer11to15++;
			}
			if (integer <= 20 && integer > 15) {
				Integer16to20++;
			}
			if (integer <= 25 && integer > 20) {
				Integer21to25++;
			}
			if (integer <= 30 && integer > 25) {
				Integer26to30++;
			}
			if (integer <= 35 && integer > 30) {
				Integer31to35++;
			}
			if (integer <= 40 && integer > 35) {
				Integer36to40++;
			}
			if (integer <= 45 && integer > 40) {
				Integer41to45++;
			}
			if (integer <= 49 && integer > 45) {
				Integer46to49++;
			}
		}

		strings.add(Integer1to5.toString());
		strings.add(Integer6to10.toString());
		strings.add(Integer11to15.toString());
		strings.add(Integer16to20.toString());
		strings.add(Integer21to25.toString());
		strings.add(Integer26to30.toString());
		strings.add(Integer31to35.toString());
		strings.add(Integer36to40.toString());
		strings.add(Integer41to45.toString());
		strings.add(Integer46to49.toString());

		return strings;

	}

	/**
	 * 根据获取到的最近的10期数据 按照正反方向拆分成 5 ,6,7,8,9 ,10
	 */
	public static Map<String, List<List<SixOne>>> getFenDuan(List<SixOne> sixOnes) {

		Map<String, List<List<SixOne>>> map = new HashMap<String, List<List<SixOne>>>();

		List<List<SixOne>> lists = new ArrayList<List<SixOne>>();
		// 按照顺序来
		List<SixOne> sixOnes1 = new ArrayList<SixOne>();
		List<SixOne> sixOnes2 = new ArrayList<SixOne>();
		List<SixOne> sixOnes3 = new ArrayList<SixOne>();
		List<SixOne> sixOnes4 = new ArrayList<SixOne>();
		List<SixOne> sixOnes5 = new ArrayList<SixOne>();
		List<SixOne> sixOnes6 = new ArrayList<SixOne>();
		List<SixOne> sixOnes7 = new ArrayList<SixOne>();
		List<SixOne> sixOnes8 = new ArrayList<SixOne>();
		List<SixOne> sixOnes9 = new ArrayList<SixOne>();

		for (int i = 0; i < sixOnes.size(); i++) {
			if (i < 1) {
				sixOnes1.add(sixOnes.get(i));
			}
			if (i < 2) {
				sixOnes2.add(sixOnes.get(i));
			}
			if (i < 3) {
				sixOnes3.add(sixOnes.get(i));
			}
			if (i < 4) {
				sixOnes4.add(sixOnes.get(i));
			}
			if (i < 5) {
				sixOnes5.add(sixOnes.get(i));
			}
			if (i < 6) {
				sixOnes6.add(sixOnes.get(i));
			}
			if (i < 7) {
				sixOnes7.add(sixOnes.get(i));
			}
			if (i < 8) {
				sixOnes8.add(sixOnes.get(i));
			}
			if (i < 9) {
				sixOnes9.add(sixOnes.get(i));
			}
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes5.size(); i++) {
			System.out.println(sixOnes5.get(i).getId());
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes6.size(); i++) {
			System.out.println(sixOnes6.get(i).getId());
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes7.size(); i++) {
			System.out.println(sixOnes7.get(i).getId());
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes8.size(); i++) {
			System.out.println(sixOnes8.get(i).getId());
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes9.size(); i++) {
			System.out.println(sixOnes9.get(i).getId());
		}
		System.out.println("=============");
		for (int i = 0; i < sixOnes.size(); i++) {
			System.out.println(sixOnes.get(i).getId());
		}
		lists.add(sixOnes1);
		lists.add(sixOnes2);
		lists.add(sixOnes3);
		lists.add(sixOnes4);
		lists.add(sixOnes5);
		lists.add(sixOnes6);
		lists.add(sixOnes7);
		lists.add(sixOnes8);
		lists.add(sixOnes9);
		lists.add(sixOnes);
		map.put("zheng", lists);
		// 按照反方向来
		List<List<SixOne>> Flists = new ArrayList<List<SixOne>>();
		List<SixOne> FsixOnes5 = new ArrayList<SixOne>();
		List<SixOne> FsixOnes4 = new ArrayList<SixOne>();
		List<SixOne> FsixOnes3 = new ArrayList<SixOne>();
		List<SixOne> FsixOnes2 = new ArrayList<SixOne>();
		List<SixOne> FsixOnes1 = new ArrayList<SixOne>();
		for (int i = sixOnes.size() - 1; i >= 0; i--) {
			if (i >= 5) {
				FsixOnes5.add(sixOnes.get(i));
			}
			if (i >= 5 && i <= 8) {
				FsixOnes4.add(sixOnes.get(i));
			}
			if (i >= 5 && i <= 7) {
				FsixOnes3.add(sixOnes.get(i));
			}
			if (i >= 5 && i <= 6) {
				FsixOnes2.add(sixOnes.get(i));
			}
			if (i == 5) {
				FsixOnes1.add(sixOnes.get(i));
			}
		}
		Flists.add(FsixOnes1);
		Flists.add(FsixOnes2);
		Flists.add(FsixOnes3);
		Flists.add(FsixOnes4);
		Flists.add(FsixOnes5);
		map.put("fan", Flists);

		return map;

	}

	/**
	 * 根据获取到的最近的10期遗漏 按照正反方向拆分成 5 ,6,7,8,9 ,10
	 */

	public static Map<String, List<Integer>> getyiloufenduan(List<List<Integer>> list10) {
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		List<Integer> now5 = new ArrayList<>();
		List<Integer> now4 = new ArrayList<>();
		List<Integer> now3 = new ArrayList<>();
		List<Integer> now2 = new ArrayList<>();
		List<Integer> now1 = new ArrayList<>();
		// 从现在到过去的5期
		for (int i = 0; i < list10.size(); i++) {
			if (i < 5) {
				for (int j = 0; j < list10.get(i).size(); j++) {
					now5.add(list10.get(i).get(j));
				}
			}
			if (i > 0 && i < 5) {
				for (int j = 0; j < list10.get(i).size(); j++) {
					now4.add(list10.get(i).get(j));
				}
			}
			if (i > 1 && i < 5) {
				for (int j = 0; j < list10.get(i).size(); j++) {
					now3.add(list10.get(i).get(j));
				}
			}
			if (i > 2 && i < 5) {
				for (int j = 0; j < list10.get(i).size(); j++) {
					now2.add(list10.get(i).get(j));
				}
			}
			if (i > 3 && i < 5) {
				for (int j = 0; j < list10.get(i).size(); j++) {
					now1.add(list10.get(i).get(j));
				}
			}
		}
		map.put("now1", now1);
		map.put("now2", now2);
		map.put("now3", now3);
		map.put("now4", now4);
		map.put("now5", now5);
		List<Integer> last1 = new ArrayList<>();
		List<Integer> last2 = new ArrayList<>();
		List<Integer> last3 = new ArrayList<>();
		List<Integer> last4 = new ArrayList<>();
		List<Integer> last5 = new ArrayList<>();
		List<Integer> last6 = new ArrayList<>();
		List<Integer> last7 = new ArrayList<>();
		List<Integer> last8 = new ArrayList<>();
		List<Integer> last9 = new ArrayList<>();
		List<Integer> last10 = new ArrayList<>();
		for (int i = list10.size() - 1; i >= 0; i--) {

			for (int j = 0; j < list10.get(i).size(); j++) {

				if (i >= 9) {
					last1.add(list10.get(i).get(j));
				}
				if (i >= 8) {
					last2.add(list10.get(i).get(j));
				}
				if (i >= 7) {
					last3.add(list10.get(i).get(j));
				}
				if (i >= 6) {
					last4.add(list10.get(i).get(j));
				}

				if (i >= 5) {
					last5.add(list10.get(i).get(j));
				}
				if (i >= 4) {
					last6.add(list10.get(i).get(j));
				}
				if (i >= 3) {
					last7.add(list10.get(i).get(j));
				}
				if (i >= 2) {
					last8.add(list10.get(i).get(j));
				}
				if (i >= 1) {
					last9.add(list10.get(i).get(j));
				}
				last10.add(list10.get(i).get(j));
			}

		}
		map.put("last1", last1);
		map.put("last2", last2);
		map.put("last3", last3);
		map.put("last4", last4);
		map.put("last5", last5);
		map.put("last6", last6);
		map.put("last7", last7);
		map.put("last8", last8);
		map.put("last9", last9);
		map.put("last10", last10);
		return map;
	}

	public static List<Integer> getjioushu(List<SixOne> sixOnes) {
		List<Integer> aList = new ArrayList<>();
		int odd = 0;// 存放奇数的总个数
		int even = 0;// 存放偶数的总个数
		for (int i = 0; i < sixOnes.size(); i++) {

			if (sixOnes.get(i).getFirst() != null) {
				if (sixOnes.get(i).getFirst() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getSecond() != null) {
				if (sixOnes.get(i).getSecond() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getThird() != null) {
				if (sixOnes.get(i).getThird() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getFourth() != null) {
				if (sixOnes.get(i).getFourth() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getFifth() != null) {
				if (sixOnes.get(i).getFifth() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getSixth() != null) {
				if (sixOnes.get(i).getSixth() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}
			if (sixOnes.get(i).getSeventh() != null) {
				if (sixOnes.get(i).getSeventh() % 2 == 0) {
					even++;

				} else {
					odd++;

				}
			}

		}
		System.out.println(odd + "----------" +even);
		aList.add(odd);
		aList.add(even);
		return aList;
	}

}
