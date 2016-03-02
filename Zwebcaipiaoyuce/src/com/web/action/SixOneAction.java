package com.web.action;

import java.io.PrintWriter;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.omg.CORBA.OBJ_ADAPTER;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import com.sun.star.io.IOException;
import com.web.pojo.SixOne;
import com.web.services.SixOneServices;
import com.web.yuce.common.utils.DuanQiCommonUtils;
import com.web.yuce.common.utils.MySelfZuHe;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 */
public class SixOneAction extends BaseAction {

	private String TAG = "SixOneAction";
	private static final long serialVersionUID = 1L;
	private static final int List = 0;

	@Resource(name = "SixOneServices") // 接口的实现
	private SixOneServices SixOneServices; // 服务层的接口

	private String result;// 提示添加是否成功的标志
	private Integer first;
	private Integer second;
	private Integer third;
	private Integer fourth;
	private Integer fifth;
	private Integer sixth;
	private Integer seventh;

	private String choosenNumbers;

	/**
	 * 构造器初始化数据
	 */
	public SixOneAction() {

	}

	/**
	 * 添加一幕了然的遗漏统计模式
	 */

	public String clearYiLouMoShi() {
		logger.info("clearYiLouMoShi");
		logger.info("====查新最近的40条数据 ---降序=================");
		List<SixOne> sixonesTop40 = SixOneServices.way6();
		logger.info(sixonesTop40.size());
		Integer maxqishu = SixOneServices.way4();
		logger.info("====查新最新数据的期数 ---=================" + maxqishu);

		Map<String, List<List<String>>> map = new HashMap<String, List<List<String>>>();
		List<List<String>> all = new ArrayList<List<String>>();
		List<String> clear_zero = new ArrayList<String>();
		List<String> clear_one = new ArrayList<String>();
		List<String> clear_two = new ArrayList<String>();
		List<String> clear_three = new ArrayList<String>();
		List<String> clear_four = new ArrayList<String>();
		List<String> clear_five = new ArrayList<String>();
		List<String> clear_six = new ArrayList<String>();
		List<String> clear_seven = new ArrayList<String>();
		List<String> clear_eight = new ArrayList<String>();
		List<String> clear_nine = new ArrayList<String>();
		List<String> clear_ten = new ArrayList<String>();
		List<String> clear_eleven = new ArrayList<String>();
		List<String> clear_twelve = new ArrayList<String>();
		List<String> clear_thirdteen = new ArrayList<String>();
		List<String> clear_fourteen = new ArrayList<String>();
		List<String> clear_fifteen = new ArrayList<String>();
		List<String> clear_sixteen = new ArrayList<String>();
		List<String> clear_seventeen = new ArrayList<String>();
		List<String> clear_eighteen = new ArrayList<String>();
		List<String> clear_nineteen = new ArrayList<String>();
		List<String> clear_twenty = new ArrayList<String>();
		List<String> clear_twenty_one = new ArrayList<String>();
		List<String> clear_twenty_two = new ArrayList<String>();
		List<String> clear_twenty_three = new ArrayList<String>();
		List<String> clear_twenty_four = new ArrayList<String>();
		List<String> clear_twenty_five = new ArrayList<String>();
		List<String> clear_twenty_six = new ArrayList<String>();
		List<String> clear_twenty_seven = new ArrayList<String>();
		List<String> clear_twenty_eight = new ArrayList<String>();
		List<String> clear_twenty_nine = new ArrayList<String>();
		List<String> clear_thirty = new ArrayList<String>();
		List<String> clear_thirty_one = new ArrayList<String>();
		List<String> clear_thirty_two = new ArrayList<String>();
		List<String> clear_thirty_three = new ArrayList<String>();
		List<String> clear_thirty_four = new ArrayList<String>();
		List<String> clear_thirty_five = new ArrayList<String>();
		List<String> clear_thirty_six = new ArrayList<String>();
		List<String> clear_thirty_seven = new ArrayList<String>();
		List<String> clear_thirty_eight = new ArrayList<String>();
		List<String> clear_thirty_nine = new ArrayList<String>();
		List<String> clear_fourty = new ArrayList<String>();
		clear_zero.add("00");
		clear_one.add("01");
		clear_two.add("02");
		clear_three.add("03");
		clear_four.add("04");
		clear_five.add("05");
		clear_six.add("06");
		clear_seven.add("07");
		clear_eight.add("08");
		clear_nine.add("09");
		clear_ten.add("10");
		clear_eleven.add("11");
		clear_twelve.add("12");
		clear_thirdteen.add("13");
		clear_fourteen.add("14");
		clear_fifteen.add("15");
		clear_sixteen.add("16");
		clear_seventeen.add("17");
		clear_eighteen.add("18");
		clear_nineteen.add("19");
		clear_twenty.add("20");
		clear_twenty_one.add("21");
		clear_twenty_two.add("22");
		clear_twenty_three.add("23");
		clear_twenty_four.add("24");
		clear_twenty_five.add("25");
		clear_twenty_six.add("26");
		clear_twenty_seven.add("27");
		clear_twenty_eight.add("28");
		clear_twenty_nine.add("29");
		clear_thirty.add("30");
		clear_thirty_one.add("31");
		clear_thirty_two.add("32");
		clear_thirty_three.add("33");
		clear_thirty_four.add("34");
		clear_thirty_five.add("35");
		clear_thirty_six.add("36");
		clear_thirty_seven.add("37");
		clear_thirty_eight.add("38");
		clear_thirty_nine.add("39");
		clear_fourty.add("40");
		for (int i = 0; i < sixonesTop40.size(); i++) {
			// 保存自己的7个数字
			List<Integer> sevennumbers = new ArrayList<Integer>();
			sevennumbers.add(sixonesTop40.get(i).getFirst());
			sevennumbers.add(sixonesTop40.get(i).getSecond());
			sevennumbers.add(sixonesTop40.get(i).getThird());
			sevennumbers.add(sixonesTop40.get(i).getFourth());
			sevennumbers.add(sixonesTop40.get(i).getFifth());
			sevennumbers.add(sixonesTop40.get(i).getSixth());
			sevennumbers.add(sixonesTop40.get(i).getSeventh());
			// 获取比自己大的所有期数,并且将其按照期数降序
			List<SixOne> Mintempsixones = SixOneServices.way16(sixonesTop40.get(i).getQishu());

			// 将自己的7个数字与大于自己的其他期数 的每7个数字 比较
			for (Integer integer : sevennumbers) {
				boolean iscunzai = false;
				for (SixOne sixOne : Mintempsixones) {
					if (integer == sixOne.getFirst()) {
						iscunzai = true;
					} else if (integer == sixOne.getSecond()) {
						iscunzai = true;
					} else if (integer == sixOne.getThird()) {
						iscunzai = true;
					} else if (integer == sixOne.getFourth()) {
						iscunzai = true;
					} else if (integer == sixOne.getFifth()) {
						iscunzai = true;
					} else if (integer == sixOne.getSixth()) {
						iscunzai = true;
					} else if (integer == sixOne.getSeventh()) {
						iscunzai = true;
					}
				}
				if (!iscunzai) {
					if (Mintempsixones.size() == 0) {
						if (integer < 10) {
							clear_zero.add("0" + integer);
						} else {
							clear_zero.add(integer + "");
						}
					} else if (Mintempsixones.size() == 1) {
						if (integer < 10) {
							clear_one.add("0" + integer);
						} else {
							clear_one.add(integer + "");
						}

					} else if (Mintempsixones.size() == 2) {
						if (integer < 10) {
							clear_two.add("0" + integer);
						} else {
							clear_two.add(integer + "");
						}
					} else if (Mintempsixones.size() == 3) {
						if (integer < 10) {
							clear_three.add("0" + integer);
						} else {
							clear_three.add(integer + "");
						}
					} else if (Mintempsixones.size() == 4) {
						if (integer < 10) {
							clear_four.add("0" + integer);
						} else {
							clear_four.add(integer + "");
						}
					} else if (Mintempsixones.size() == 5) {
						if (integer < 10) {
							clear_five.add("0" + integer);
						} else {
							clear_five.add(integer + "");
						}
					} else if (Mintempsixones.size() == 6) {
						if (integer < 10) {
							clear_six.add("0" + integer);
						} else {
							clear_six.add(integer + "");
						}
					} else if (Mintempsixones.size() == 7) {
						if (integer < 10) {
							clear_seven.add("0" + integer);
						} else {
							clear_seven.add(integer + "");
						}
					} else if (Mintempsixones.size() == 8) {
						if (integer < 10) {
							clear_eight.add("0" + integer);
						} else {
							clear_eight.add(integer + "");
						}
					} else if (Mintempsixones.size() == 9) {
						if (integer < 10) {
							clear_nine.add("0" + integer);
						} else {
							clear_nine.add(integer + "");
						}
					} else if (Mintempsixones.size() == 10) {
						if (integer < 10) {
							clear_ten.add("0" + integer);
						} else {
							clear_ten.add(integer + "");
						}
					} else if (Mintempsixones.size() == 11) {
						if (integer < 10) {
							clear_eleven.add("0" + integer);
						} else {
							clear_eleven.add(integer + "");
						}
					} else if (Mintempsixones.size() == 12) {
						if (integer < 10) {
							clear_twelve.add("0" + integer);
						} else {
							clear_twelve.add(integer + "");
						}
					} else if (Mintempsixones.size() == 13) {
						if (integer < 10) {
							clear_thirdteen.add("0" + integer);
						} else {
							clear_thirdteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 14) {
						if (integer < 10) {
							clear_fourteen.add("0" + integer);
						} else {
							clear_fourteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 15) {
						if (integer < 10) {
							clear_fifteen.add("0" + integer);
						} else {
							clear_fifteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 16) {
						if (integer < 10) {
							clear_sixteen.add("0" + integer);
						} else {
							clear_sixteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 17) {
						if (integer < 10) {
							clear_seventeen.add("0" + integer);
						} else {
							clear_seventeen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 18) {
						if (integer < 10) {
							clear_eighteen.add("0" + integer);
						} else {
							clear_eighteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 19) {
						if (integer < 10) {
							clear_nineteen.add("0" + integer);
						} else {
							clear_nineteen.add(integer + "");
						}
					} else if (Mintempsixones.size() == 20) {
						if (integer < 10) {
							clear_twenty.add("0" + integer);
						} else {
							clear_twenty.add(integer + "");
						}
					} else if (Mintempsixones.size() == 21) {
						if (integer < 10) {
							clear_twenty_one.add("0" + integer);
						} else {
							clear_twenty_one.add(integer + "");
						}
					} else if (Mintempsixones.size() == 22) {
						if (integer < 10) {
							clear_twenty_two.add("0" + integer);
						} else {
							clear_twenty_two.add(integer + "");
						}
					} else if (Mintempsixones.size() == 23) {
						if (integer < 10) {
							clear_twenty_three.add("0" + integer);
						} else {
							clear_twenty_three.add(integer + "");
						}
					} else if (Mintempsixones.size() == 24) {
						if (integer < 10) {
							clear_twenty_four.add("0" + integer);
						} else {
							clear_twenty_four.add(integer + "");
						}
					} else if (Mintempsixones.size() == 25) {
						if (integer < 10) {
							clear_twenty_five.add("0" + integer);
						} else {
							clear_twenty_five.add(integer + "");
						}
					} else if (Mintempsixones.size() == 26) {
						if (integer < 10) {
							clear_twenty_six.add("0" + integer);
						} else {
							clear_twenty_six.add(integer + "");
						}
					} else if (Mintempsixones.size() == 27) {
						if (integer < 10) {
							clear_twenty_seven.add("0" + integer);
						} else {
							clear_twenty_seven.add(integer + "");
						}
					} else if (Mintempsixones.size() == 28) {
						if (integer < 10) {
							clear_twenty_eight.add("0" + integer);
						} else {
							clear_twenty_eight.add(integer + "");
						}
					} else if (Mintempsixones.size() == 29) {
						if (integer < 10) {
							clear_twenty_nine.add("0" + integer);
						} else {
							clear_twenty_nine.add(integer + "");
						}
					} else if (Mintempsixones.size() == 30) {
						if (integer < 10) {
							clear_thirty.add("0" + integer);
						} else {
							clear_thirty.add(integer + "");
						}
					} else if (Mintempsixones.size() == 31) {
						if (integer < 10) {
							clear_thirty_one.add("0" + integer);
						} else {
							clear_thirty_one.add(integer + "");
						}
					} else if (Mintempsixones.size() == 32) {
						if (integer < 10) {
							clear_thirty_two.add("0" + integer);
						} else {
							clear_thirty_two.add(integer + "");
						}
					} else if (Mintempsixones.size() == 33) {
						if (integer < 10) {
							clear_thirty_three.add("0" + integer);
						} else {
							clear_thirty_three.add(integer + "");
						}
					} else if (Mintempsixones.size() == 34) {
						if (integer < 10) {
							clear_thirty_four.add("0" + integer);
						} else {
							clear_thirty_four.add(integer + "");
						}
					} else if (Mintempsixones.size() == 35) {
						if (integer < 10) {
							clear_thirty_five.add("0" + integer);
						} else {
							clear_thirty_five.add(integer + "");
						}
					} else if (Mintempsixones.size() == 36) {
						if (integer < 10) {
							clear_thirty_six.add("0" + integer);
						} else {
							clear_thirty_six.add(integer + "");
						}
					} else if (Mintempsixones.size() == 37) {
						if (integer < 10) {
							clear_thirty_seven.add("0" + integer);
						} else {
							clear_thirty_seven.add(integer + "");
						}
					} else if (Mintempsixones.size() == 38) {
						if (integer < 10) {
							clear_thirty_eight.add("0" + integer);
						} else {
							clear_thirty_eight.add(integer + "");
						}
					} else if (Mintempsixones.size() == 39) {
						if (integer < 10) {
							clear_thirty_nine.add("0" + integer);
						} else {
							clear_thirty_nine.add(integer + "");
						}
					} else if (Mintempsixones.size() == 40) {
						if (integer < 10) {
							clear_fourty.add("0" + integer);
						} else {
							clear_fourty.add(integer + "");
						}
					}
				}
			}
		}
		logger.info("==============================");
		System.out.println("遗漏次数为0:" + clear_zero.toString());
		System.out.println("遗漏次数为1" + clear_one.toString());
		System.out.println("遗漏次数为2" + clear_two.toString());
		System.out.println("遗漏次数为3" + clear_three.toString());
		System.out.println("遗漏次数为4" + clear_four.toString());
		System.out.println("遗漏次数为5" + clear_five.toString());
		System.out.println("遗漏次数为6" + clear_six.toString());
		System.out.println("遗漏次数为7" + clear_seven.toString());
		System.out.println("遗漏次数为8" + clear_eight.toString());
		System.out.println("遗漏次数为9" + clear_nine.toString());
		System.out.println("遗漏次数为10" + clear_ten.toString());
		System.out.println("遗漏次数为11:" + clear_eleven.toString());
		System.out.println("遗漏次数为12" + clear_twelve.toString());
		System.out.println("遗漏次数为13" + clear_thirdteen.toString());
		System.out.println("遗漏次数为14" + clear_fourteen.toString());
		System.out.println("遗漏次数为15" + clear_fifteen.toString());
		System.out.println("遗漏次数为16" + clear_sixteen.toString());
		System.out.println("遗漏次数为17" + clear_seventeen.toString());
		System.out.println("遗漏次数为18" + clear_eighteen.toString());
		System.out.println("遗漏次数为19" + clear_nineteen.toString());
		System.out.println("遗漏次数为20" + clear_twenty.toString());
		System.out.println("遗漏次数为21" + clear_twenty_one.toString());
		System.out.println("遗漏次数为22" + clear_twenty_two.toString());
		System.out.println("遗漏次数为23" + clear_twenty_three.toString());
		System.out.println("遗漏次数为24" + clear_twenty_four.toString());
		System.out.println("遗漏次数为25" + clear_twenty_five.toString());
		System.out.println("遗漏次数为26" + clear_twenty_six.toString());
		System.out.println("遗漏次数为27" + clear_twenty_seven.toString());
		System.out.println("遗漏次数为28" + clear_twenty_eight.toString());
		System.out.println("遗漏次数为29" + clear_twenty_nine.toString());
		System.out.println("遗漏次数为30" + clear_thirty.toString());
		System.out.println("遗漏次数为31" + clear_thirty_one.toString());
		System.out.println("遗漏次数为32" + clear_thirty_two.toString());
		System.out.println("遗漏次数为33" + clear_thirty_three.toString());
		System.out.println("遗漏次数为34" + clear_thirty_four.toString());
		System.out.println("遗漏次数为35" + clear_thirty_five.toString());
		System.out.println("遗漏次数为36" + clear_thirty_six.toString());
		System.out.println("遗漏次数为37" + clear_thirty_seven.toString());
		System.out.println("遗漏次数为38" + clear_thirty_eight.toString());
		System.out.println("遗漏次数为39" + clear_thirty_nine.toString());
		System.out.println("遗漏次数为40" + clear_fourty.toString());
		all.add(clear_zero);
		all.add(clear_one);
		all.add(clear_two);
		all.add(clear_three);
		all.add(clear_four);
		all.add(clear_five);
		all.add(clear_six);
		all.add(clear_seven);
		all.add(clear_eight);
		all.add(clear_nine);
		all.add(clear_ten);
		all.add(clear_eleven);
		all.add(clear_twelve);
		all.add(clear_thirdteen);
		all.add(clear_fourteen);
		all.add(clear_fifteen);
		all.add(clear_sixteen);
		all.add(clear_seventeen);
		all.add(clear_eighteen);
		all.add(clear_nineteen);
		all.add(clear_twenty);
		all.add(clear_twenty_one);
		all.add(clear_twenty_two);
		all.add(clear_twenty_three);
		all.add(clear_twenty_four);
		all.add(clear_twenty_five);
		all.add(clear_twenty_six);
		all.add(clear_twenty_seven);
		all.add(clear_twenty_eight);
		all.add(clear_twenty_nine);
		all.add(clear_thirty);
		all.add(clear_thirty_one);
		all.add(clear_thirty_two);
		all.add(clear_thirty_three);
		all.add(clear_thirty_four);
		all.add(clear_thirty_five);
		all.add(clear_thirty_six);
		all.add(clear_thirty_seven);
		all.add(clear_thirty_eight);
		all.add(clear_thirty_nine);
		all.add(clear_fourty);
		// 每一期进行冒泡排序
		logger.info("============================冒泡排序");
		List<String> strings = new ArrayList<String>();
		for (SixOne numbers : sixonesTop40) {
			int[] k = new int[] { numbers.getFirst(), numbers.getSecond(), numbers.getThird(), numbers.getFourth(),
					numbers.getFifth(), numbers.getSixth(), numbers.getSeventh() };
			strings.add(DuanQiCommonUtils.bubbleSort(numbers.getId(), k));
		}
		all.add(strings);
		logger.info("============================冒泡排序");
		map.put("clear", all);
		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "CLEARYILOUMOSHI_SUCEESS";
	}

	/**
	 * 跳转到中期预测界面
	 * 
	 * @return
	 */
	public String zhongqifutureSixOne() {

		return "GETZHONGQIFUTURE_SUCCESS";
	}

	/**
	 * 在中期中预测冷门数字
	 */
	public String zhongqitopfiftyfiveSecond() {

		Map<String, List<List<String>>> listmap2 = new HashMap<String, List<List<String>>>();
		List<List<String>> lists = new ArrayList<List<String>>();
		List<SixOne> sixOnes = SixOneServices.way11(55);
		List<String> biaotouList = new ArrayList<String>();
		biaotouList.add("期数");
		// 生成表头数据
		for (SixOne sixOne : sixOnes) {
			biaotouList.add((sixOne.getId() + "").substring(3));
		}
		lists.add(biaotouList);
		// 生成tbody 数据
		for (int i = 1; i <= 49; i++) {
			List<String> strings = new ArrayList<String>();
			if (i < 10) {
				strings.add("0" + i);
			} else {
				strings.add(i + "");
			}

			for (SixOne sixOne : sixOnes) {
				if (i == sixOne.getFirst()) {
					strings.add("X");
				} else if (i == sixOne.getSecond()) {
					strings.add("X");
				} else if (i == sixOne.getThird()) {
					strings.add("X");
				} else if (i == sixOne.getFourth()) {
					strings.add("X");
				} else if (i == sixOne.getFifth()) {
					strings.add("X");
				} else if (i == sixOne.getSixth()) {
					strings.add("X");
				} else if (i == sixOne.getSeventh()) {
					strings.add("X");
				} else {
					strings.add("--");
				}
			}
			lists.add(strings);
		}

		logger.info(lists.toString());

		logger.info("////////////////////////////////////////////");

		listmap2.put("zhengti", lists);
		JSONObject jsonObjectFromMap = JSONObject.fromObject(listmap2);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "ZHONGQITOPFIFTYFIVE_SUCCESS";
	}

	/**
	 * 中期预测 查询过去50 期的数据 ,升序
	 */
	public String zhongqitopfifty() {
		// 2015106
		Integer top1 = SixOneServices.way13(50);
		logger.info("最新50期,期数从小排到大排在最前的一起的期数qishu:" + top1);
		List<SixOne> sixOnes = SixOneServices.way11(50);

		Map<String, List<List<String>>> zonglistMAP = new HashMap<String, List<List<String>>>();

		List<List<String>> zonglist = new ArrayList<List<String>>();
		// 记录数字开的位置
		List<List<String>> qingkuangyuce = new ArrayList<List<String>>();
		// 记录遗漏后的开奖模式
		List<List<String>> futureqingkuang = new ArrayList<List<String>>();
		List<String> zero = new ArrayList<String>();
		List<String> one = new ArrayList<String>();
		List<String> two = new ArrayList<String>();
		List<String> three = new ArrayList<String>();
		List<String> four = new ArrayList<String>();
		List<String> five = new ArrayList<String>();
		List<String> six = new ArrayList<String>();
		List<String> seven = new ArrayList<String>();
		List<String> eight = new ArrayList<String>();
		List<String> nine = new ArrayList<String>();
		List<String> ten = new ArrayList<String>();
		List<String> eleven = new ArrayList<String>();
		List<String> twelve = new ArrayList<String>();
		List<String> thirdteen = new ArrayList<String>();
		List<String> foureen = new ArrayList<String>();
		List<String> fifteen = new ArrayList<String>();
		List<String> sixthteen = new ArrayList<String>();
		List<String> seventeen = new ArrayList<String>();
		List<String> eighteen = new ArrayList<String>();
		List<String> nineteen = new ArrayList<String>();
		List<String> twenty = new ArrayList<String>();
		List<String> twentyone = new ArrayList<String>();
		List<String> twentytwo = new ArrayList<String>();
		List<String> twentythree = new ArrayList<String>();
		List<String> twentyfour = new ArrayList<String>();
		List<String> twentyfive = new ArrayList<String>();
		List<String> twentysix = new ArrayList<String>();
		List<String> twentyseven = new ArrayList<String>();
		List<String> twentyeight = new ArrayList<String>();
		List<String> twentynine = new ArrayList<String>();
		List<String> thirty = new ArrayList<String>();
		zero.add("-0");
		one.add("-1");
		two.add("-2");
		three.add("-3");
		four.add("-4");
		five.add("-5");
		six.add("-6");
		seven.add("-7");
		eight.add("-8");
		nine.add("-9");
		ten.add("-10");
		eleven.add("-11");
		twelve.add("-12");
		thirdteen.add("-13");
		foureen.add("-14");
		fifteen.add("-15");
		sixthteen.add("-16");
		seventeen.add("-17");
		eighteen.add("-18");
		nineteen.add("-19");
		twenty.add("-20");
		twentyone.add("-21");
		twentytwo.add("-22");
		twentythree.add("-23");
		twentyfour.add("-24");
		twentyfive.add("-25");
		twentysix.add("-26");
		twentyseven.add("-27");
		twentyeight.add("-28");
		twentynine.add("-29");
		thirty.add("-30");
		for (SixOne sixOne : sixOnes) {
			Integer Tempid = sixOne.getId();
			Integer Tempqishu = sixOne.getQishu();

			// 记录本期的情况,发送到前台的数据
			List<String> jilu = new ArrayList<String>();
			jilu.add(Tempid.toString());
			// jilu.add(Tempqishu.toString());
			// 数字即是位置

			for (int i = 1; i <= 49; i++) {
				if (sixOne.getFirst() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}

				} else if (sixOne.getFirst() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getSecond() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getThird() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getFourth() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getFifth() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getSixth() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else if (sixOne.getSeventh() == i) {
					if (i < 10) {
						jilu.add("0" + i);
					} else {
						jilu.add(i + "");
					}
				} else {
					jilu.add("--");

				}

			}
			System.out.println(jilu.toString());
			zonglist.add(jilu);
		}

		List<List<String>> listsmoshi = new ArrayList<List<String>>();
		// 统计模式
		for (int i = 1; i <= 49; i++) {
			List<String> stringsmoshi = new ArrayList<String>();
			if (i < 10) {

				stringsmoshi.add("0" + i);

			} else {
				stringsmoshi.add(i + "");
			}
			List<Integer> integersqishu = new ArrayList<Integer>();
			for (int j = 0; j < sixOnes.size(); j++) {
				if (i == sixOnes.get(j).getFirst()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getSecond()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getThird()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getFourth()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getFifth()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getSixth()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				} else if (i == sixOnes.get(j).getSeventh()) {
					integersqishu.add(sixOnes.get(j).getQishu());
				}
			}

			for (int k = 0; k < integersqishu.size(); k++) {

				if (k == (integersqishu.size() - 1)) {

				} else {
					Integer tempint = integersqishu.get(k + 1) - integersqishu.get(k) - 1;
					stringsmoshi.add("" + tempint + "-");

				}

			}
			listsmoshi.add(stringsmoshi);
			logger.info(stringsmoshi.toString());

			/**
			 * 统计遗漏次数
			 */

			// 遗漏次数为0-30的模式
			for (int q = 3; q < stringsmoshi.size(); q++) {

				if (stringsmoshi.get(q).equals("0-")) {
					zero.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));

				}
				if (stringsmoshi.get(q).equals("1-")) {
					one.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("2-")) {
					two.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("3-")) {
					three.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}

				if (stringsmoshi.get(q).equals("4-")) {
					four.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("5-")) {
					five.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("6-")) {
					six.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("7-")) {
					seven.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("8-")) {
					eight.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("9-")) {
					nine.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("10-")) {
					ten.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("11-")) {
					eleven.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("12-")) {
					twelve.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("13-")) {
					thirdteen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("14-")) {
					foureen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("15-")) {
					fifteen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("16-")) {
					sixthteen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("17-")) {
					seventeen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("18-")) {
					eighteen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("19-")) {
					nineteen.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("20-")) {
					twenty.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("21-")) {
					twentyone.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("22-")) {
					twentytwo.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("23-")) {
					twentythree.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("24-")) {
					twentyfour.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("25-")) {
					twentyfive.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("26-")) {
					twentysix.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("27-")) {
					twentyseven.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("28-")) {
					twentyeight.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("29-")) {
					twentynine.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}
				if (stringsmoshi.get(q).equals("30-")) {
					thirty.add(stringsmoshi.get(q - 2) + stringsmoshi.get(q - 1) + stringsmoshi.get(q));
				}

			}

		}
		logger.debug("==================================================");
		logger.debug(zero.toString());
		logger.debug(one.toString());
		logger.debug(two.toString());
		logger.debug(three.toString());
		logger.debug(four.toString());
		logger.debug(five.toString());
		logger.debug(six.toString());
		logger.debug(seven.toString());
		logger.debug(eight.toString());
		logger.debug(nine.toString());
		logger.debug(ten.toString());
		logger.debug(eleven.toString());
		logger.debug(twelve.toString());
		logger.debug(thirdteen.toString());
		logger.debug(foureen.toString());
		logger.debug(fifteen.toString());
		logger.debug(sixthteen.toString());
		logger.debug(seventeen.toString());
		logger.debug(eighteen.toString());
		logger.debug(nineteen.toString());
		logger.debug(twenty.toString());
		logger.debug(twentyone.toString());
		logger.debug(twentytwo.toString());
		logger.debug(twentythree.toString());
		logger.debug(twentyfour.toString());
		logger.debug(twentyfive.toString());
		logger.debug(twentysix.toString());
		logger.debug(twentyseven.toString());
		logger.debug(twentyeight.toString());
		logger.debug(twentynine.toString());
		logger.debug(thirty.toString());

		futureqingkuang.add(zero);
		futureqingkuang.add(one);
		futureqingkuang.add(two);
		futureqingkuang.add(three);
		futureqingkuang.add(four);
		futureqingkuang.add(five);
		futureqingkuang.add(six);
		futureqingkuang.add(seven);
		futureqingkuang.add(nine);
		futureqingkuang.add(ten);
		futureqingkuang.add(eleven);
		futureqingkuang.add(twelve);
		futureqingkuang.add(thirdteen);
		futureqingkuang.add(foureen);
		futureqingkuang.add(fifteen);
		futureqingkuang.add(sixthteen);
		futureqingkuang.add(seventeen);
		futureqingkuang.add(eighteen);
		futureqingkuang.add(nineteen);
		futureqingkuang.add(twenty);
		futureqingkuang.add(twentyone);
		futureqingkuang.add(twentytwo);
		futureqingkuang.add(twentythree);
		futureqingkuang.add(twentyfour);
		futureqingkuang.add(twentyfive);
		futureqingkuang.add(twentysix);
		futureqingkuang.add(twentyseven);
		futureqingkuang.add(twentyeight);
		futureqingkuang.add(twentynine);
		futureqingkuang.add(thirty);

		zonglistMAP.put("name", zonglist);
		zonglistMAP.put("listsmoshi", listsmoshi);
		zonglistMAP.put("futureqingkuang", futureqingkuang);
		JSONObject jsonObjectFromMap = JSONObject.fromObject(zonglistMAP);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		/*
		 * for (List<String> list : zonglist) { String builder = new String();
		 * for (String string : list) { builder += string; }
		 * System.out.println(builder); }
		 */
		return "ZHONGQITOPFIFTY_SUCCESS";
	}

	/**
	 * 根据最后选中的数字进行组合
	 * 
	 * @throws Exception
	 */
	public String myselfZuHe() throws Exception {
		Map<String, List<String>> maps = new HashMap<String, List<String>>();
		logger.info("数组组合:myselfZuHe");

		logger.info(choosenNumbers.toString());
		String[] numebrs = choosenNumbers.split("-");
		List<Integer> integersnumbers = new ArrayList<Integer>();
		for (String string : numebrs) {
			integersnumbers.add(Integer.parseInt(string));
		}
		MySelfZuHe mySelfZuHe = new MySelfZuHe();
		List<String> strings = mySelfZuHe.combine2(integersnumbers, 3);
		logger.info(strings.toString());

		maps.put("zuhe", strings);
		JSONObject jsonObjectFromMap = JSONObject.fromObject(maps);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "MYSELFZUHESUCCESS";
	}

	/**
	 * 统计过去10期出现的数字
	 */
	public String tongjitopTen() {

		Map<String, List<Integer>> maps = new HashMap<String, List<Integer>>();
		List<SixOne> sixOnes10 = SixOneServices.way12(10);
		// 记录过去10期出现的数字
		List<Integer> integers = new ArrayList<Integer>();
		for (SixOne sixOne : sixOnes10) {
			if (!integers.contains(sixOne.getFirst())) {
				integers.add(sixOne.getFirst());
			}
			if (!integers.contains(sixOne.getSecond())) {
				integers.add(sixOne.getSecond());
			}
			if (!integers.contains(sixOne.getThird())) {
				integers.add(sixOne.getThird());
			}
			if (!integers.contains(sixOne.getFourth())) {
				integers.add(sixOne.getFourth());
			}
			if (!integers.contains(sixOne.getFifth())) {
				integers.add(sixOne.getFifth());
			}
			if (!integers.contains(sixOne.getSixth())) {
				integers.add(sixOne.getSixth());
			}
			if (!integers.contains(sixOne.getSeventh())) {
				integers.add(sixOne.getSeventh());
			}
		}
		// 记录过去10期未出现的数字
		List<Integer> integers2 = new ArrayList<Integer>();
		for (int i = 1; i <= 49; i++) {
			if (!integers.contains(i)) {
				integers2.add(i);
			}
		}
		logger.info(integers.toString());
		logger.info(integers2.toString());
		maps.put("integers", integers);
		maps.put("integers2", integers2);

		JSONObject jsonObjectFromMap = JSONObject.fromObject(maps);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "TONGJITOPTENSUCCESS";
	}

	/**
	 * 数字区间偏差追踪系统
	 */
	public String futureShuZiQuJian() {

		Map<String, List<List<String>>> maps = new HashMap<String, List<List<String>>>();// 向前端打包数据

		List<SixOne> sixonesTop10 = SixOneServices.way9(); // 查询最近的10期 ,从过去排到现在
		/*
		 * for(int i =0;i<sixonesTop10.size();i++){
		 * System.out.println(sixonesTop10.get(i).getId()); }
		 */
		Map<String, List<List<SixOne>>> map = DuanQiCommonUtils.getFenDuan(sixonesTop10); // 将这10期
																							// 按照正反顺序分成
																							// 5,6,7,8,9,10
																							// 各个段
		List<List<SixOne>> zheng = map.get("zheng"); // 6个正序的 段 即是从过去到现在
														// 5,6,7,9,10
		List<List<SixOne>> fan = map.get("fan"); // 6个反序的段 即是 从现在到过去
													// 5,6,7,8,9,10
		List<List<String>> zhengListStrings = new ArrayList<List<String>>(); // 正序的区间分析结果
		List<List<String>> fanListStrings = new ArrayList<List<String>>(); // 反序的区间分析结果
		for (int i = 0; i < zheng.size(); i++) {
			// System.out.println(zheng.get(i).size());
			zhengListStrings.add(DuanQiCommonUtils.getQuJian(zheng.get(i))); // 添加每一个分段的结果
																				// 正序
		}
		for (int i = 0; i < fan.size(); i++) {
			fanListStrings.add(DuanQiCommonUtils.getQuJian(fan.get(i))); // 添加每一段的结果
																			// 反序
		}
		System.out.println(zhengListStrings.toString());
		System.out.println(fanListStrings.toString());

		maps.put("zhengxu", zhengListStrings);
		maps.put("fanxu", fanListStrings);

		JSONObject jsonObjectFromMap = JSONObject.fromObject(maps);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTURESHUZIQUJIANSUCCESS";
	}

	/**
	 * 和数值偏差系统分析
	 */
	public String futureHeShuzhi() {
		// 求出和数值中值
		float sum1 = 1 + 2 + 3 + 4 + 5 + 6 + 7;
		float sum2 = 43 + 44 + 45 + 46 + 47 + 48 + 49;
		float middlesum = (sum1 + sum2) / 2f;
		List<SixOne> sixonesTop10 = SixOneServices.way9();
		Map<String, List<List<SixOne>>> map2 = DuanQiCommonUtils.getFenDuan(sixonesTop10); // 将这10期
																							// 按照正反顺序分成
																							// 5,6,7,8,9,10
																							// 各个段
		List<List<SixOne>> zheng = map2.get("zheng"); // 6个正序的 段 即是从过去到现在
														// 5,6,7,9,10
		List<List<SixOne>> fan = map2.get("fan"); // 6个反序的段 即是 从现在到过去
													// 5,6,7,8,9,10
		for (int i = 0; i < zheng.size(); i++) {
			System.out.println(zheng.get(i).size());
		}

		List<Integer> heshuzhiList = new ArrayList<Integer>();
		List<Integer> qishulist = new ArrayList<Integer>();
		List<Float> middlesumiList = new ArrayList<Float>();
		for (SixOne tempsixOne : sixonesTop10) { // 145,144,143,142
			Integer tempqishu = tempsixOne.getQishu();
			Integer tempfirst = tempsixOne.getFirst();
			Integer tempsecond = tempsixOne.getSecond();
			Integer tempthird = tempsixOne.getThird();
			Integer tempfourth = tempsixOne.getFourth();
			Integer tempfifth = tempsixOne.getFifth();
			Integer tempsixth = tempsixOne.getSixth();
			Integer tempseventh = tempsixOne.getSeventh();
			Integer he = tempfirst + tempsecond + tempthird + tempfourth + tempfifth + tempsixth + tempseventh;
			heshuzhiList.add(he);
			middlesumiList.add(middlesum);
			qishulist.add(tempqishu);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("heshuzhiList", heshuzhiList);
		map.put("qishulist", qishulist);
		map.put("middlesumiList", middlesumiList);
		logger.info(map.toString());
		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTUREHESHUZHISUCCESS";
	}

	/**
	 * 末位数字和头部数字偏差系统分析
	 */
	public String futureMoWei() {
		// 降序 获取最新的 10期
		List<SixOne> sixonesTop10 = SixOneServices.way8(10);

		List<SixOne> smallToBig5 = new ArrayList<SixOne>();
		List<SixOne> smallToBig6 = new ArrayList<SixOne>();
		List<SixOne> smallToBig7 = new ArrayList<SixOne>();
		List<SixOne> smallToBig8 = new ArrayList<SixOne>();
		List<SixOne> smallToBig9 = new ArrayList<SixOne>();

		List<SixOne> bigToSmall5 = new ArrayList<SixOne>();

		// 期数从小到大

		for (int i = sixonesTop10.size() - 1; i >= 0; i--) {
			SixOne sixOne = sixonesTop10.get(i);
			if (i >= 5) {
				smallToBig5.add(sixOne);
			}
			if (i >= 4) {
				smallToBig6.add(sixOne);
			}
			if (i >= 3) {
				smallToBig7.add(sixOne);
			}
			if (i >= 2) {
				smallToBig8.add(sixOne);
			}
			if (i >= 1) {
				smallToBig9.add(sixOne);
			}

		}
		// 期数从大到小目前最新的5期
		for (int i = 0; i < sixonesTop10.size(); i++) {
			SixOne sixOne = sixonesTop10.get(i);
			if (i < 5) {
				bigToSmall5.add(sixOne);
			}

		}

		logger.info("-----末位数字开始统计--从过去到现在");
		List<String> weibusmallToBig5Strings = DuanQiCommonUtils.getMoWeiNumbersCount(smallToBig5);
		List<String> weibusmallToBig6Strings = DuanQiCommonUtils.getMoWeiNumbersCount(smallToBig6);
		List<String> weibusmallToBig7Strings = DuanQiCommonUtils.getMoWeiNumbersCount(smallToBig7);
		List<String> weibusmallToBig8Strings = DuanQiCommonUtils.getMoWeiNumbersCount(smallToBig8);
		List<String> weibusmallToBig9Strings = DuanQiCommonUtils.getMoWeiNumbersCount(smallToBig9);
		List<String> common10Strings = DuanQiCommonUtils.getMoWeiNumbersCount(sixonesTop10);

		logger.info("-----末位数字开始统计--从现在到过去");
		List<String> weibuBigToSmall5Strings = DuanQiCommonUtils.getMoWeiNumbersCount(bigToSmall5);

		logger.info("-----头部数字开始统计--从过去到现在");
		List<String> toubusmallToBig5Strings = DuanQiCommonUtils.getTouBu(smallToBig5);
		List<String> toubusmallToBig6Strings = DuanQiCommonUtils.getTouBu(smallToBig6);
		List<String> toubusmallToBig7Strings = DuanQiCommonUtils.getTouBu(smallToBig7);
		List<String> toubusmallToBig8Strings = DuanQiCommonUtils.getTouBu(smallToBig8);
		List<String> toubusmallToBig9Strings = DuanQiCommonUtils.getTouBu(smallToBig9);
		List<String> toubucommon10Strings = DuanQiCommonUtils.getTouBu(sixonesTop10);

		logger.info("-----头部数字开始统计--从现在到过去");
		List<String> toubuBigToSmall5Strings = DuanQiCommonUtils.getTouBu(bigToSmall5);

		Map<String, Object> map = new HashMap<String, Object>();
		List<List<String>> weibulistsmalltobig = new ArrayList<List<String>>();
		weibulistsmalltobig.add(weibusmallToBig5Strings);
		weibulistsmalltobig.add(weibusmallToBig6Strings);
		weibulistsmalltobig.add(weibusmallToBig7Strings);
		weibulistsmalltobig.add(weibusmallToBig8Strings);
		weibulistsmalltobig.add(weibusmallToBig9Strings);
		weibulistsmalltobig.add(common10Strings);
		List<List<String>> weibulistbigtosmall = new ArrayList<List<String>>();
		weibulistbigtosmall.add(weibuBigToSmall5Strings);

		List<List<String>> toubulistsmalltobig = new ArrayList<List<String>>();
		toubulistsmalltobig.add(toubusmallToBig5Strings);
		toubulistsmalltobig.add(toubusmallToBig6Strings);
		toubulistsmalltobig.add(toubusmallToBig7Strings);
		toubulistsmalltobig.add(toubusmallToBig8Strings);
		toubulistsmalltobig.add(toubusmallToBig9Strings);
		toubulistsmalltobig.add(toubucommon10Strings);
		List<List<String>> toubulistbigtosmall = new ArrayList<List<String>>();
		toubulistbigtosmall.add(toubuBigToSmall5Strings);

		map.put("weibulistsmalltobig", weibulistsmalltobig);
		map.put("weibulistbigtosmall", weibulistbigtosmall);
		map.put("toubulistsmalltobig", toubulistsmalltobig);
		map.put("toubulistbigtosmall", toubulistbigtosmall);
		logger.info(map.toString());
		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTUREMOWEISUCCESS";
	}

	/**
	 * 大小数字偏差系统分析
	 */
	public String futureBigSmall() {
		logger.info("奇数偶数偏差系统分析------------futureOddEven----");
		List<SixOne> sixonesTop10 = SixOneServices.way5();
		int zongbig = 0;// 存放大数的总个数
		int zongsmall = 0;// 存放小数的总个数

		SixOne sixOne;
		List<Integer> integersBIG = new ArrayList<Integer>();
		List<Integer> integersSMALL = new ArrayList<Integer>();
		List<Integer> qishulist = new ArrayList<Integer>();
		for (int i = 0; i < sixonesTop10.size(); i++) {
			int everyonebig = 0;// 存放每个对象的大数字的个数
			int everyonesmalll = 0;// 存放每个对象的小数字的个数
			sixOne = sixonesTop10.get(i);

			if (sixOne.getFirst() != null) {
				if (sixOne.getFirst() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;

				}
			}
			if (sixOne.getSecond() != null) {
				if (sixOne.getSecond() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			if (sixOne.getThird() != null) {
				if (sixOne.getThird() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			if (sixOne.getFourth() != null) {
				if (sixOne.getFourth() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			if (sixOne.getFifth() != null) {
				if (sixOne.getFifth() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			if (sixOne.getSixth() != null) {
				if (sixOne.getSixth() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			if (sixOne.getSeventh() != null) {
				if (sixOne.getSeventh() > 26) {
					zongbig++;
					everyonebig++;
				} else {
					zongsmall++;
					everyonesmalll++;
				}
			}
			integersBIG.add(everyonebig);
			integersSMALL.add(everyonesmalll);
			qishulist.add(sixOne.getQishu());
		}
		logger.info(qishulist.toString());
		logger.info(integersBIG.toString());
		logger.info(integersSMALL.toString());
		logger.info("总的大数字的个数为" + zongbig);
		logger.info("总的小数字的个数为" + zongsmall);
		logger.info("======================");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qishulist", qishulist);
		map.put("integersBIG", integersBIG);
		map.put("integersSMALL", integersSMALL);
		map.put("zongbig", zongbig);
		map.put("zongsmall", zongsmall);
		if (zongbig > zongsmall) {
			map.put("cha", zongbig - zongsmall);
		}
		if (zongbig < zongsmall) {
			map.put("cha", zongsmall - zongbig);
		}
		logger.info(map.toString());
		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTUREBIGSMALLSUCCESS";
	}

	/**
	 * 遗漏数字偏差系统
	 */
	public String futureYiLou() {
		logger.info("------遗漏数字偏差系统------futureYiLou");
		Map<String, Object> map = new HashMap<String, Object>();
		List<SixOne> sixonesTop5 = SixOneServices.way8(5);
		List<SixOne> sixonesTop6 = SixOneServices.way8(6);
		List<SixOne> sixonesTop7 = SixOneServices.way8(7);
		List<SixOne> sixonesTop8 = SixOneServices.way8(8);
		List<SixOne> sixonesTop9 = SixOneServices.way8(9);

		// 为了寻找符合条件的数字
		List<SixOne> sixonesTop5fuhetijian = SixOneServices.way11(6);
		List<SixOne> sixonesTop6fuhetijian = SixOneServices.way11(7);
		List<SixOne> sixonesTop7fuhetijian = SixOneServices.way11(8);
		List<SixOne> sixonesTop8fuhetijian = SixOneServices.way11(9);
		List<SixOne> sixonesTop9fuhetijian = SixOneServices.way11(10);

		// 查询当前新的期数

		Integer maxqishu = SixOneServices.way4();
		// 5
		List<Integer> yilouZeroInTop5 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop5 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop5 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop5 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop5 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop5 = new ArrayList<Integer>();
		List<Integer> yilouSixToNineInTop5 = new ArrayList<Integer>();
		List<Integer> yilouTenAndMoreInTop5 = new ArrayList<Integer>();
		// 6
		List<Integer> yilouZeroInTop6 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop6 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop6 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop6 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop6 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop6 = new ArrayList<Integer>();
		List<Integer> yilouSixToNineInTop6 = new ArrayList<Integer>();
		List<Integer> yilouTenAndMoreInTop6 = new ArrayList<Integer>();

		// 7
		List<Integer> yilouZeroInTop7 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop7 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop7 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop7 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop7 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop7 = new ArrayList<Integer>();
		List<Integer> yilouSixToNineInTop7 = new ArrayList<Integer>();
		List<Integer> yilouTenAndMoreInTop7 = new ArrayList<Integer>();
		// 8
		List<Integer> yilouZeroInTop8 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop8 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop8 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop8 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop8 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop8 = new ArrayList<Integer>();
		List<Integer> yilouSixToNineInTop8 = new ArrayList<Integer>();
		List<Integer> yilouTenAndMoreInTop8 = new ArrayList<Integer>();

		// 9
		List<Integer> yilouZeroInTop9 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop9 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop9 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop9 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop9 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop9 = new ArrayList<Integer>();
		List<Integer> yilouSixToNineInTop9 = new ArrayList<Integer>();
		List<Integer> yilouTenAndMoreInTop9 = new ArrayList<Integer>();
		// 针对过去5期
		for (SixOne sixOne5 : sixonesTop5) {
			SixOne reallysixOne = sixOne5; // 146
			Integer qishu = reallysixOne.getQishu();
			List<Integer> Templist = new ArrayList<Integer>();
			Templist.add(reallysixOne.getFirst());
			Templist.add(reallysixOne.getSecond());
			Templist.add(reallysixOne.getThird());
			Templist.add(reallysixOne.getFourth());
			Templist.add(reallysixOne.getFifth());
			Templist.add(reallysixOne.getSixth());
			Templist.add(reallysixOne.getSeventh());
			List<SixOne> temps = SixOneServices.way7(qishu);
			for (Integer integer : Templist) {
				int geshu = 0;

				for (SixOne tempsixOne : temps) { // 145,144,143,142

					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();

					if (integer == tempfirst || integer == tempsecond || integer == tempthird || integer == tempfourth
							|| integer == tempfifth || integer == tempsixth || integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));

						if ((qishu - tempqishu - 1) == 0) {
							yilouZeroInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 1) {
							yilouOneInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 2) {
							yilouTwoInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 3) {
							yilouThreeInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 4) {
							yilouFourInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 5) {
							yilouFiveInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 6 && (qishu - tempqishu - 1) < 10) {
							yilouSixToNineInTop5.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 10) {
							yilouTenAndMoreInTop5.add(integer);
							break;
						}

					}

				}
			}

		}

		// 统计过去 5期 符合条件的数字
		List<Integer> sixonesTop5fuhetijianZero = new ArrayList<Integer>();
		List<Integer> sixonesTop5fuhetijianOne = new ArrayList<Integer>();
		List<Integer> sixonesTop5fuhetijianTwo = new ArrayList<Integer>();
		List<Integer> sixonesTop5fuhetijianThree = new ArrayList<Integer>();
		List<Integer> sixonesTop5fuhetijianfour = new ArrayList<Integer>();
		List<Integer> sixonesTop5fuhetijianfive = new ArrayList<Integer>();

		for (SixOne sixOne : sixonesTop5fuhetijian) {
			System.out.println(sixOne.getQishu() + "========");
			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			List<Integer> list = new ArrayList<Integer>();
			list.add(first);
			list.add(second);
			list.add(third);
			list.add(fourth);
			list.add(fifth);
			list.add(sixth);
			list.add(seventh);
			for (Integer integer2 : list) {
				int yilou = 0;
				boolean ischongfu = false;
				for (SixOne sixOne2 : sixonesTop5fuhetijian) {

					if (sixOne2.getQishu() > qishu) {
						// 147,148,149,150
						System.out.println(sixOne2.getQishu() + "========");
						if (integer2 == sixOne2.getFirst()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getSecond()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getThird()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getFourth()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getFifth()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getSixth()) {
							ischongfu = true;
							break;
						} else if (integer2 == sixOne2.getSeventh()) {
							ischongfu = true;
							break;
						}
						yilou++;
					}

				}
				if (yilou == 0 && ischongfu == false) {
					sixonesTop5fuhetijianZero.add(integer2);
				} else if (yilou == 1 && ischongfu == false) {
					sixonesTop5fuhetijianOne.add(integer2);
				} else if (yilou == 2 && ischongfu == false) {
					sixonesTop5fuhetijianTwo.add(integer2);
				} else if (yilou == 3 && ischongfu == false) {
					sixonesTop5fuhetijianThree.add(integer2);
				} else if (yilou == 4 && ischongfu == false) {
					sixonesTop5fuhetijianfour.add(integer2);
				} else if (yilou == 5 && ischongfu == false) {
					sixonesTop5fuhetijianfive.add(integer2);
				}

			}

		}

		// 针对过去6期
		for (SixOne sixOne6 : sixonesTop6) {
			SixOne reallysixOne = sixOne6; // 146
			Integer qishu = reallysixOne.getQishu();
			List<Integer> Templist = new ArrayList<Integer>();
			Templist.add(reallysixOne.getFirst());
			Templist.add(reallysixOne.getSecond());
			Templist.add(reallysixOne.getThird());
			Templist.add(reallysixOne.getFourth());
			Templist.add(reallysixOne.getFifth());
			Templist.add(reallysixOne.getSixth());
			Templist.add(reallysixOne.getSeventh());
			List<SixOne> temps = SixOneServices.way7(qishu);
			for (Integer integer : Templist) {
				int geshu = 0;
				for (SixOne tempsixOne : temps) { // 145,144,143,142

					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();

					if (integer == tempfirst || integer == tempsecond || integer == tempthird || integer == tempfourth
							|| integer == tempfifth || integer == tempsixth || integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) == 0) {
							yilouZeroInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 1) {
							yilouOneInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 2) {
							yilouTwoInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 3) {
							yilouThreeInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 4) {
							yilouFourInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 5) {
							yilouFiveInTop6.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 6 && (qishu - tempqishu - 1) < 10) {
							yilouSixToNineInTop6.add(integer);
							break;
						}

						if ((qishu - tempqishu - 1) >= 10) {
							yilouTenAndMoreInTop6.add(integer);
							break;
						}

					}

				}

			}

		}

		// 统计过去 6期 符合条件的数字
		List<Integer> sixonesTop6fuhetijianZero = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijianOne = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijianTwo = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijianThree = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijianfour = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijianfive = new ArrayList<Integer>();
		List<Integer> sixonesTop6fuhetijiansix = new ArrayList<Integer>();

		for (SixOne sixOne : sixonesTop6fuhetijian)

		{

			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			List<Integer> list = new ArrayList<Integer>();
			list.add(first);
			list.add(second);
			list.add(third);
			list.add(fourth);
			list.add(fifth);
			list.add(sixth);
			list.add(seventh);
			for (Integer integer2 : list) {
				int yilou = 0;
				boolean ischongfu = false;
				for (SixOne sixOne2 : sixonesTop6fuhetijian) {

					if (sixOne2.getQishu() > qishu) {

						if (integer2 == sixOne2.getFirst() || integer2 == sixOne2.getSecond()
								|| integer2 == sixOne2.getThird() || integer2 == sixOne2.getFourth()
								|| integer2 == sixOne2.getFifth() || integer2 == sixOne2.getSixth()
								|| integer2 == sixOne2.getSeventh()) {
							logger.info(integer2 + "在第--------------" + qishu + "和" + sixOne2.getQishu() + "出现"
									+ "遗漏次数是:" + (sixOne2.getQishu() - qishu - 1));

							if (sixOne2.getQishu() - qishu - 1 == 0) {
								sixonesTop6fuhetijianZero.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 1) {
								sixonesTop6fuhetijianOne.add(integer2);
								ischongfu = true;
								break;

							}
							if (sixOne2.getQishu() - qishu - 1 == 2) {
								sixonesTop6fuhetijianTwo.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 3) {
								sixonesTop6fuhetijianThree.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 4) {
								sixonesTop6fuhetijianfour.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 5) {
								sixonesTop6fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}

						}

						if (integer2 != sixOne2.getFirst() && integer2 != sixOne2.getSecond()
								&& integer2 != sixOne2.getThird() && integer2 != sixOne2.getFourth()
								&& integer2 != sixOne2.getFifth() && integer2 != sixOne2.getSixth()
								&& integer2 != sixOne2.getSeventh()) {

							yilou++;

						}
					}

				}
				if (yilou == 0 && ischongfu == false) {
					sixonesTop6fuhetijianZero.add(integer2);
				} else if (yilou == 1 && ischongfu == false) {
					sixonesTop6fuhetijianOne.add(integer2);
				} else if (yilou == 2 && ischongfu == false) {
					sixonesTop6fuhetijianTwo.add(integer2);
				} else if (yilou == 3 && ischongfu == false) {
					sixonesTop6fuhetijianThree.add(integer2);
				} else if (yilou == 4 && ischongfu == false) {
					sixonesTop6fuhetijianfour.add(integer2);
				} else if (yilou == 5 && ischongfu == false) {
					sixonesTop6fuhetijianfive.add(integer2);
				} else if (yilou == 6 && ischongfu == false) {
					sixonesTop6fuhetijiansix.add(integer2);
				}

			}

		}

		// 针对过去7期
		for (

		SixOne sixOne7 : sixonesTop7)

		{
			SixOne reallysixOne = sixOne7; // 146
			Integer qishu = reallysixOne.getQishu();
			List<Integer> Templist = new ArrayList<Integer>();
			Templist.add(reallysixOne.getFirst());
			Templist.add(reallysixOne.getSecond());
			Templist.add(reallysixOne.getThird());
			Templist.add(reallysixOne.getFourth());
			Templist.add(reallysixOne.getFifth());
			Templist.add(reallysixOne.getSixth());
			Templist.add(reallysixOne.getSeventh());
			List<SixOne> temps = SixOneServices.way7(qishu);
			for (Integer integer : Templist) {
				int geshu = 0;
				for (SixOne tempsixOne : temps) { // 145,144,143,142

					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();

					if (integer == tempfirst || integer == tempsecond || integer == tempthird || integer == tempfourth
							|| integer == tempfifth || integer == tempsixth || integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) == 0) {
							yilouZeroInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 1) {
							yilouOneInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 2) {
							yilouTwoInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 3) {
							yilouThreeInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 4) {
							yilouFourInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 5) {
							yilouFiveInTop7.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 6 && (qishu - tempqishu - 1) < 10) {
							yilouSixToNineInTop7.add(integer);
							break;
						}

						if ((qishu - tempqishu - 1) >= 10) {
							yilouTenAndMoreInTop7.add(integer);
							break;
						}

					}

				}
			}

		}

		// 统计过去 7期 符合条件的数字
		List<Integer> sixonesTop7fuhetijianZero = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijianOne = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijianTwo = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijianThree = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijianfour = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijianfive = new ArrayList<Integer>();
		List<Integer> sixonesTop7fuhetijiansix = new ArrayList<Integer>();

		for (SixOne sixOne : sixonesTop7fuhetijian)

		{

			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			List<Integer> list = new ArrayList<Integer>();
			list.add(first);
			list.add(second);
			list.add(third);
			list.add(fourth);
			list.add(fifth);
			list.add(sixth);
			list.add(seventh);
			for (Integer integer2 : list) {
				int yilou = 0;
				boolean ischongfu = false;
				for (SixOne sixOne2 : sixonesTop7fuhetijian) {

					if (sixOne2.getQishu() > qishu) {

						if (integer2 == sixOne2.getFirst() || integer2 == sixOne2.getSecond()
								|| integer2 == sixOne2.getThird() || integer2 == sixOne2.getFourth()
								|| integer2 == sixOne2.getFifth() || integer2 == sixOne2.getSixth()
								|| integer2 == sixOne2.getSeventh()) {
							logger.info(integer2 + "在第--------------" + qishu + "和" + sixOne2.getQishu() + "出现"
									+ "遗漏次数是:" + (sixOne2.getQishu() - qishu - 1));

							if (sixOne2.getQishu() - qishu - 1 == 0) {
								sixonesTop7fuhetijianZero.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 1) {
								sixonesTop7fuhetijianOne.add(integer2);
								ischongfu = true;
								break;

							}
							if (sixOne2.getQishu() - qishu - 1 == 2) {
								sixonesTop7fuhetijianTwo.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 3) {
								sixonesTop7fuhetijianThree.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 4) {
								sixonesTop7fuhetijianfour.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 5) {
								sixonesTop7fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 >= 6) {
								sixonesTop7fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}

						}

						if (integer2 != sixOne2.getFirst() && integer2 != sixOne2.getSecond()
								&& integer2 != sixOne2.getThird() && integer2 != sixOne2.getFourth()
								&& integer2 != sixOne2.getFifth() && integer2 != sixOne2.getSixth()
								&& integer2 != sixOne2.getSeventh()) {

							yilou++;

						}
					}

				}
				if (yilou == 0 && ischongfu == false) {
					sixonesTop7fuhetijianZero.add(integer2);
				} else if (yilou == 1 && ischongfu == false) {
					sixonesTop7fuhetijianOne.add(integer2);
				} else if (yilou == 2 && ischongfu == false) {
					sixonesTop7fuhetijianTwo.add(integer2);
				} else if (yilou == 3 && ischongfu == false) {
					sixonesTop7fuhetijianThree.add(integer2);
				} else if (yilou == 4 && ischongfu == false) {
					sixonesTop7fuhetijianfour.add(integer2);
				} else if (yilou == 5 && ischongfu == false) {
					sixonesTop7fuhetijianfive.add(integer2);
				} else if (yilou >= 6 && ischongfu == false) {
					sixonesTop7fuhetijiansix.add(integer2);
				}

			}

		}

		// 统计过去 8期 符合条件的数字
		List<Integer> sixonesTop8fuhetijianZero = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijianOne = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijianTwo = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijianThree = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijianfour = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijianfive = new ArrayList<Integer>();
		List<Integer> sixonesTop8fuhetijiansix = new ArrayList<Integer>();

		for (SixOne sixOne : sixonesTop8fuhetijian)

		{

			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			List<Integer> list = new ArrayList<Integer>();
			list.add(first);
			list.add(second);
			list.add(third);
			list.add(fourth);
			list.add(fifth);
			list.add(sixth);
			list.add(seventh);
			for (Integer integer2 : list) {
				int yilou = 0;
				boolean ischongfu = false;
				for (SixOne sixOne2 : sixonesTop8fuhetijian) {

					if (sixOne2.getQishu() > qishu) {

						if (integer2 == sixOne2.getFirst() || integer2 == sixOne2.getSecond()
								|| integer2 == sixOne2.getThird() || integer2 == sixOne2.getFourth()
								|| integer2 == sixOne2.getFifth() || integer2 == sixOne2.getSixth()
								|| integer2 == sixOne2.getSeventh()) {
							logger.info(integer2 + "在第--------------" + qishu + "和" + sixOne2.getQishu() + "出现"
									+ "遗漏次数是:" + (sixOne2.getQishu() - qishu - 1));

							if (sixOne2.getQishu() - qishu - 1 == 0) {
								sixonesTop8fuhetijianZero.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 1) {
								sixonesTop8fuhetijianOne.add(integer2);
								ischongfu = true;
								break;

							}
							if (sixOne2.getQishu() - qishu - 1 == 2) {
								sixonesTop8fuhetijianTwo.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 3) {
								sixonesTop8fuhetijianThree.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 4) {
								sixonesTop8fuhetijianfour.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 5) {
								sixonesTop8fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 >= 6) {
								sixonesTop8fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}

						}

						if (integer2 != sixOne2.getFirst() && integer2 != sixOne2.getSecond()
								&& integer2 != sixOne2.getThird() && integer2 != sixOne2.getFourth()
								&& integer2 != sixOne2.getFifth() && integer2 != sixOne2.getSixth()
								&& integer2 != sixOne2.getSeventh()) {

							yilou++;

						}
					}

				}
				if (yilou == 0 && ischongfu == false) {
					sixonesTop8fuhetijianZero.add(integer2);
				} else if (yilou == 1 && ischongfu == false) {
					sixonesTop8fuhetijianOne.add(integer2);
				} else if (yilou == 2 && ischongfu == false) {
					sixonesTop8fuhetijianTwo.add(integer2);
				} else if (yilou == 3 && ischongfu == false) {
					sixonesTop8fuhetijianThree.add(integer2);
				} else if (yilou == 4 && ischongfu == false) {
					sixonesTop8fuhetijianfour.add(integer2);
				} else if (yilou == 5 && ischongfu == false) {
					sixonesTop8fuhetijianfive.add(integer2);
				} else if (yilou >= 6 && ischongfu == false) {
					sixonesTop8fuhetijiansix.add(integer2);
				}

			}

		}

		// 针对过去8期
		for (

		SixOne sixOne8 : sixonesTop8)

		{
			SixOne reallysixOne = sixOne8; // 146
			Integer qishu = reallysixOne.getQishu();
			List<Integer> Templist = new ArrayList<Integer>();
			Templist.add(reallysixOne.getFirst());
			Templist.add(reallysixOne.getSecond());
			Templist.add(reallysixOne.getThird());
			Templist.add(reallysixOne.getFourth());
			Templist.add(reallysixOne.getFifth());
			Templist.add(reallysixOne.getSixth());
			Templist.add(reallysixOne.getSeventh());
			List<SixOne> temps = SixOneServices.way7(qishu);
			for (Integer integer : Templist) {
				int geshu = 0;
				for (SixOne tempsixOne : temps) { // 145,144,143,142

					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();

					if (integer == tempfirst || integer == tempsecond || integer == tempthird || integer == tempfourth
							|| integer == tempfifth || integer == tempsixth || integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) == 0) {
							yilouZeroInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 1) {
							yilouOneInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 2) {
							yilouTwoInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 3) {
							yilouThreeInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 4) {
							yilouFourInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 5) {
							yilouFiveInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 6 && (qishu - tempqishu - 1) < 10) {
							yilouSixToNineInTop8.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 10) {
							yilouTenAndMoreInTop8.add(integer);
							break;
						}
					}
				}
			}

		}

		// 统计过去 8期 符合条件的数字
		List<Integer> sixonesTop9fuhetijianZero = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijianOne = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijianTwo = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijianThree = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijianfour = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijianfive = new ArrayList<Integer>();
		List<Integer> sixonesTop9fuhetijiansix = new ArrayList<Integer>();

		for (SixOne sixOne : sixonesTop9fuhetijian)

		{

			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			List<Integer> list = new ArrayList<Integer>();
			list.add(first);
			list.add(second);
			list.add(third);
			list.add(fourth);
			list.add(fifth);
			list.add(sixth);
			list.add(seventh);
			for (Integer integer2 : list) {
				int yilou = 0;
				boolean ischongfu = false;
				for (SixOne sixOne2 : sixonesTop9fuhetijian) {

					if (sixOne2.getQishu() > qishu) {

						if (integer2 == sixOne2.getFirst() || integer2 == sixOne2.getSecond()
								|| integer2 == sixOne2.getThird() || integer2 == sixOne2.getFourth()
								|| integer2 == sixOne2.getFifth() || integer2 == sixOne2.getSixth()
								|| integer2 == sixOne2.getSeventh()) {
							logger.info(integer2 + "在第--------------" + qishu + "和" + sixOne2.getQishu() + "出现"
									+ "遗漏次数是:" + (sixOne2.getQishu() - qishu - 1));

							if (sixOne2.getQishu() - qishu - 1 == 0) {
								sixonesTop9fuhetijianZero.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 1) {
								sixonesTop9fuhetijianOne.add(integer2);
								ischongfu = true;
								break;

							}
							if (sixOne2.getQishu() - qishu - 1 == 2) {
								sixonesTop9fuhetijianTwo.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 3) {
								sixonesTop9fuhetijianThree.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 4) {
								sixonesTop9fuhetijianfour.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 == 5) {
								sixonesTop9fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}
							if (sixOne2.getQishu() - qishu - 1 >= 6) {
								sixonesTop9fuhetijiansix.add(integer2);
								ischongfu = true;
								break;
							}

						}

						if (integer2 != sixOne2.getFirst() && integer2 != sixOne2.getSecond()
								&& integer2 != sixOne2.getThird() && integer2 != sixOne2.getFourth()
								&& integer2 != sixOne2.getFifth() && integer2 != sixOne2.getSixth()
								&& integer2 != sixOne2.getSeventh()) {

							yilou++;

						}
					}

				}
				if (yilou == 0 && ischongfu == false) {
					sixonesTop9fuhetijianZero.add(integer2);
				} else if (yilou == 1 && ischongfu == false) {
					sixonesTop9fuhetijianOne.add(integer2);
				} else if (yilou == 2 && ischongfu == false) {
					sixonesTop9fuhetijianTwo.add(integer2);
				} else if (yilou == 3 && ischongfu == false) {
					sixonesTop9fuhetijianThree.add(integer2);
				} else if (yilou == 4 && ischongfu == false) {
					sixonesTop9fuhetijianfour.add(integer2);
				} else if (yilou == 5 && ischongfu == false) {
					sixonesTop9fuhetijianfive.add(integer2);
				} else if (yilou >= 6 && ischongfu == false) {
					sixonesTop9fuhetijiansix.add(integer2);
				}

			}

		}
		// 针对过去9期
		for (

		SixOne sixOne9 : sixonesTop9)

		{
			SixOne reallysixOne = sixOne9; // 146
			Integer qishu = reallysixOne.getQishu();
			List<Integer> Templist = new ArrayList<Integer>();
			Templist.add(reallysixOne.getFirst());
			Templist.add(reallysixOne.getSecond());
			Templist.add(reallysixOne.getThird());
			Templist.add(reallysixOne.getFourth());
			Templist.add(reallysixOne.getFifth());
			Templist.add(reallysixOne.getSixth());
			Templist.add(reallysixOne.getSeventh());
			List<SixOne> temps = SixOneServices.way7(qishu);
			for (Integer integer : Templist) {

				for (SixOne tempsixOne : temps) { // 145,144,143,142

					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();

					if (integer == tempfirst || integer == tempsecond || integer == tempthird || integer == tempfourth
							|| integer == tempfifth || integer == tempsixth || integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) == 0) {
							yilouZeroInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 1) {
							yilouOneInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 2) {
							yilouTwoInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 3) {
							yilouThreeInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 4) {
							yilouFourInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) == 5) {
							yilouFiveInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 6 && (qishu - tempqishu - 1) < 10) {
							yilouSixToNineInTop9.add(integer);
							break;
						}
						if ((qishu - tempqishu - 1) >= 10) {
							yilouTenAndMoreInTop9.add(integer);
							break;
						}
					}

				}
			}

		}

		// 打印过去5期符合条件的数字
		logger.info("=================统计过去 5期 符合条件的数字==================");
		logger.info("符合遗漏次数为0的数字有:" + sixonesTop5fuhetijianZero.toString() + "共有" + sixonesTop5fuhetijianZero.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为1的数字有:" + sixonesTop5fuhetijianOne.toString() + "共有" + sixonesTop5fuhetijianOne.size() + "个数字");
		logger.info(
				"符合遗漏次数为2的数字有:" + sixonesTop5fuhetijianTwo.toString() + "共有" + sixonesTop5fuhetijianTwo.size() + "个数字");
		logger.info("符合遗漏次数为3的数字有:" + sixonesTop5fuhetijianThree.toString() + "共有" + sixonesTop5fuhetijianThree.size()
				+ "个数字");
		logger.info("符合遗漏次数为4的数字有:" + sixonesTop5fuhetijianfour.toString() + "共有" + sixonesTop5fuhetijianfour.size()
				+ "个数字");
		logger.info("符合遗漏次数为5的数字有:" + sixonesTop5fuhetijianfive.toString() + "共有" + sixonesTop5fuhetijianfive.size()
				+ "个数字");
		logger.info("=================统计过去 6期 符合条件的数字==================");
		logger.info("符合遗漏次数为0的数字有:" + sixonesTop6fuhetijianZero.toString() + "共有" + sixonesTop6fuhetijianZero.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为1的数字有:" + sixonesTop6fuhetijianOne.toString() + "共有" + sixonesTop6fuhetijianOne.size() + "个数字");
		logger.info(
				"符合遗漏次数为2的数字有:" + sixonesTop6fuhetijianTwo.toString() + "共有" + sixonesTop6fuhetijianTwo.size() + "个数字");
		logger.info("符合遗漏次数为3的数字有:" + sixonesTop6fuhetijianThree.toString() + "共有" + sixonesTop6fuhetijianThree.size()
				+ "个数字");
		logger.info("符合遗漏次数为4的数字有:" + sixonesTop6fuhetijianfour.toString() + "共有" + sixonesTop6fuhetijianfour.size()
				+ "个数字");
		logger.info("符合遗漏次数为5的数字有:" + sixonesTop6fuhetijianfive.toString() + "共有" + sixonesTop6fuhetijianfive.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为6的数字有:" + sixonesTop6fuhetijiansix.toString() + "共有" + sixonesTop6fuhetijiansix.size() + "个数字");
		logger.info("=================统计过去 7期 符合条件的数字==================");
		logger.info("符合遗漏次数为0的数字有:" + sixonesTop7fuhetijianZero.toString() + "共有" + sixonesTop7fuhetijianZero.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为1的数字有:" + sixonesTop7fuhetijianOne.toString() + "共有" + sixonesTop7fuhetijianOne.size() + "个数字");
		logger.info(
				"符合遗漏次数为2的数字有:" + sixonesTop7fuhetijianTwo.toString() + "共有" + sixonesTop7fuhetijianTwo.size() + "个数字");
		logger.info("符合遗漏次数为3的数字有:" + sixonesTop7fuhetijianThree.toString() + "共有" + sixonesTop7fuhetijianThree.size()
				+ "个数字");
		logger.info("符合遗漏次数为4的数字有:" + sixonesTop7fuhetijianfour.toString() + "共有" + sixonesTop7fuhetijianfour.size()
				+ "个数字");
		logger.info("符合遗漏次数为5的数字有:" + sixonesTop7fuhetijianfive.toString() + "共有" + sixonesTop7fuhetijianfive.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为6的数字有:" + sixonesTop7fuhetijiansix.toString() + "共有" + sixonesTop7fuhetijiansix.size() + "个数字");
		logger.info("=================统计过去 8期 符合条件的数字==================");
		logger.info("符合遗漏次数为0的数字有:" + sixonesTop8fuhetijianZero.toString() + "共有" + sixonesTop8fuhetijianZero.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为1的数字有:" + sixonesTop8fuhetijianOne.toString() + "共有" + sixonesTop8fuhetijianOne.size() + "个数字");
		logger.info(
				"符合遗漏次数为2的数字有:" + sixonesTop8fuhetijianTwo.toString() + "共有" + sixonesTop8fuhetijianTwo.size() + "个数字");
		logger.info("符合遗漏次数为3的数字有:" + sixonesTop8fuhetijianThree.toString() + "共有" + sixonesTop8fuhetijianThree.size()
				+ "个数字");
		logger.info("符合遗漏次数为4的数字有:" + sixonesTop8fuhetijianfour.toString() + "共有" + sixonesTop8fuhetijianfour.size()
				+ "个数字");
		logger.info("符合遗漏次数为5的数字有:" + sixonesTop8fuhetijianfive.toString() + "共有" + sixonesTop8fuhetijianfive.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为6的数字有:" + sixonesTop8fuhetijiansix.toString() + "共有" + sixonesTop8fuhetijiansix.size() + "个数字");

		logger.info("=================统计过去 9期 符合条件的数字==================");
		logger.info("符合遗漏次数为0的数字有:" + sixonesTop9fuhetijianZero.toString() + "共有" + sixonesTop9fuhetijianZero.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为1的数字有:" + sixonesTop9fuhetijianOne.toString() + "共有" + sixonesTop9fuhetijianOne.size() + "个数字");
		logger.info(
				"符合遗漏次数为2的数字有:" + sixonesTop9fuhetijianTwo.toString() + "共有" + sixonesTop9fuhetijianTwo.size() + "个数字");
		logger.info("符合遗漏次数为3的数字有:" + sixonesTop9fuhetijianThree.toString() + "共有" + sixonesTop9fuhetijianThree.size()
				+ "个数字");
		logger.info("符合遗漏次数为4的数字有:" + sixonesTop9fuhetijianfour.toString() + "共有" + sixonesTop9fuhetijianfour.size()
				+ "个数字");
		logger.info("符合遗漏次数为5的数字有:" + sixonesTop9fuhetijianfive.toString() + "共有" + sixonesTop9fuhetijianfive.size()
				+ "个数字");
		logger.info(
				"符合遗漏次数为6的数字有:" + sixonesTop9fuhetijiansix.toString() + "共有" + sixonesTop9fuhetijiansix.size() + "个数字");

		logger.info("在过去5期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop5.toString() + "共" + yilouZeroInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop5.toString() + "共" + yilouOneInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop5.toString() + "共" + yilouTwoInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop5.toString() + "共" + yilouThreeInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 4的 数字有 :" + yilouFourInTop5.toString() + "共" + yilouFourInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 5的 数字有 :" + yilouFiveInTop5.toString() + "共" + yilouFiveInTop5.size() + "个");
		logger.info("在过去5期中 遗漏次数 为 6 到 9之间的 数字有 :" + yilouSixToNineInTop5.toString() + "共" + yilouSixToNineInTop5.size()
				+ "个");
		logger.info("在过去5期中 遗漏次数大于或等于10的 数字有 :" + yilouTenAndMoreInTop5.toString() + "共" + yilouTenAndMoreInTop5.size()
				+ "个");
		logger.info("---------------------------------------------------------");
		logger.info("在过去6期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop6.toString() + "共" + yilouZeroInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop6.toString() + "共" + yilouOneInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop6.toString() + "共" + yilouTwoInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop6.toString() + "共" + yilouThreeInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 4的 数字有 :" + yilouFourInTop6.toString() + "共" + yilouFourInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 5的数字有:" + yilouFiveInTop6.toString() + "共" + yilouFiveInTop6.size() + "个");
		logger.info("在过去6期中 遗漏次数 为 6 到 9之间的 数字有 :" + yilouSixToNineInTop6.toString() + "共" + yilouSixToNineInTop6.size()
				+ "个");
		logger.info("在过去6期中 遗漏次数大于或等于10的 数字有 :" + yilouTenAndMoreInTop6.toString() + "共" + yilouTenAndMoreInTop6.size()
				+ "个");
		logger.info("---------------------------------------------------------");
		logger.info("在过去7期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop7.toString() + "共" + yilouZeroInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop7.toString() + "共" + yilouOneInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop7.toString() + "共" + yilouTwoInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop7.toString() + "共" + yilouThreeInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 4的 数字有 :" + yilouFourInTop7.toString() + "共" + yilouFourInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 5的数字有 :" + yilouFiveInTop7.toString() + "共" + yilouFiveInTop7.size() + "个");
		logger.info("在过去7期中 遗漏次数 为 6 到 9之间的 数字有 :" + yilouSixToNineInTop7.toString() + "共" + yilouSixToNineInTop7.size()
				+ "个");
		logger.info("在过去7期中 遗漏次数大于或等于10的 数字有 :" + yilouTenAndMoreInTop7.toString() + "共" + yilouTenAndMoreInTop7.size()
				+ "个");
		logger.info("---------------------------------------------------------");
		logger.info("在过去8期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop8.toString() + "共" + yilouZeroInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop8.toString() + "共" + yilouOneInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop8.toString() + "共" + yilouTwoInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop8.toString() + "共" + yilouThreeInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 4 数字有 :" + yilouFourInTop8.toString() + "共" + yilouFourInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 5 数字有 :" + yilouFiveInTop8.toString() + "共" + yilouFiveInTop8.size() + "个");
		logger.info("在过去8期中 遗漏次数 为 6 到 9之间的 数字有 :" + yilouSixToNineInTop8.toString() + "共" + yilouSixToNineInTop8.size()
				+ "个");
		logger.info("在过去8期中 遗漏次数大于或等于10的 数字有 :" + yilouTenAndMoreInTop8.toString() + "共" + yilouTenAndMoreInTop8.size()
				+ "个");
		logger.info("---------------------------------------------------------");
		logger.info("在过去9期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop9.toString() + "共" + yilouZeroInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop9.toString() + "共" + yilouOneInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop9.toString() + "共" + yilouTwoInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop9.toString() + "共" + yilouThreeInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 4 数字有 :" + yilouFourInTop9.toString() + "共" + yilouFourInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 5 数字有 :" + yilouFiveInTop9.toString() + "共" + yilouFiveInTop9.size() + "个");
		logger.info("在过去9期中 遗漏次数 为 6 到 9之间的 数字有 :" + yilouSixToNineInTop9.toString() + "共" + yilouSixToNineInTop9.size()
				+ "个");
		logger.info("在过去9期中 遗漏次数大于或等于10的 数字有 :" + yilouTenAndMoreInTop9.toString() + "共" + yilouTenAndMoreInTop9.size()
				+ "个");

		map.put("yilouZeroInTop5", yilouZeroInTop5.toString());
		map.put("yilouOneInTop5", yilouOneInTop5.toString());
		map.put("yilouTwoInTop5", yilouTwoInTop5.toString());
		map.put("yilouThreeInTop5", yilouThreeInTop5.toString());
		map.put("yilouFourInTop5", yilouFourInTop5.toString());
		map.put("yilouFiveInTop5", yilouFiveInTop5.toString());
		map.put("yilouSixToNineInTop5", yilouSixToNineInTop5.toString());
		map.put("yilouTenAndMoreInTop5", yilouTenAndMoreInTop5.toString());

		map.put("yilouZeroInTop6", yilouZeroInTop6.toString());
		map.put("yilouOneInTop6", yilouOneInTop6.toString());
		map.put("yilouTwoInTop6", yilouTwoInTop6.toString());
		map.put("yilouThreeInTop6", yilouThreeInTop6.toString());
		map.put("yilouFourInTop6", yilouFourInTop6.toString());
		map.put("yilouFiveInTop6", yilouFiveInTop6.toString());
		map.put("yilouSixToNineInTop6", yilouSixToNineInTop6.toString());
		map.put("yilouTenAndMoreInTop6", yilouTenAndMoreInTop6.toString());

		map.put("yilouZeroInTop7", yilouZeroInTop7.toString());
		map.put("yilouOneInTop7", yilouOneInTop7.toString());
		map.put("yilouTwoInTop7", yilouTwoInTop7.toString());
		map.put("yilouThreeInTop7", yilouThreeInTop7.toString());
		map.put("yilouFourInTop7", yilouFourInTop7.toString());
		map.put("yilouFiveInTop7", yilouFiveInTop7.toString());
		map.put("yilouSixToNineInTop7", yilouSixToNineInTop7.toString());
		map.put("yilouTenAndMoreInTop7", yilouTenAndMoreInTop7.toString());

		map.put("yilouZeroInTop8", yilouZeroInTop8.toString());
		map.put("yilouOneInTop8", yilouOneInTop8.toString());
		map.put("yilouTwoInTop8", yilouTwoInTop8.toString());
		map.put("yilouThreeInTop8", yilouThreeInTop8.toString());
		map.put("yilouFourInTop8", yilouFourInTop8.toString());
		map.put("yilouFiveInTop8", yilouFiveInTop8.toString());
		map.put("yilouSixToNineInTop8", yilouSixToNineInTop8.toString());
		map.put("yilouTenAndMoreInTop8", yilouTenAndMoreInTop8.toString());

		map.put("yilouZeroInTop9", yilouZeroInTop9.toString());
		map.put("yilouOneInTop9", yilouOneInTop9.toString());
		map.put("yilouTwoInTop9", yilouTwoInTop9.toString());
		map.put("yilouThreeInTop9", yilouThreeInTop9.toString());
		map.put("yilouFourInTop9", yilouFourInTop9.toString());
		map.put("yilouFiveInTop9", yilouFiveInTop9.toString());
		map.put("yilouSixToNineInTop9", yilouSixToNineInTop9.toString());
		map.put("yilouTenAndMoreInTop9", yilouTenAndMoreInTop9.toString());

		// 真正符合的数字 过去5 期
		map.put("sixonesTop5fuhetijianZero", sixonesTop5fuhetijianZero.toString());
		map.put("sixonesTop5fuhetijianOne", sixonesTop5fuhetijianOne.toString());
		map.put("sixonesTop5fuhetijianTwo", sixonesTop5fuhetijianTwo.toString());
		map.put("sixonesTop5fuhetijianThree", sixonesTop5fuhetijianThree.toString());
		map.put("sixonesTop5fuhetijianfour", sixonesTop5fuhetijianfour.toString());
		map.put("sixonesTop5fuhetijianfive", sixonesTop5fuhetijianfive.toString());
		// 真正符合的数字 过去6 期
		map.put("sixonesTop6fuhetijianZero", sixonesTop6fuhetijianZero.toString());
		map.put("sixonesTop6fuhetijianOne", sixonesTop6fuhetijianOne.toString());
		map.put("sixonesTop6fuhetijianTwo", sixonesTop6fuhetijianTwo.toString());
		map.put("sixonesTop6fuhetijianThree", sixonesTop6fuhetijianThree.toString());
		map.put("sixonesTop6fuhetijianfour", sixonesTop6fuhetijianfour.toString());
		map.put("sixonesTop6fuhetijianfive", sixonesTop6fuhetijianfive.toString());
		map.put("sixonesTop6fuhetijiansix", sixonesTop6fuhetijiansix.toString());
		// 真正符合的数字 过去7 期
		map.put("sixonesTop7fuhetijianZero", sixonesTop7fuhetijianZero.toString());
		map.put("sixonesTop7fuhetijianOne", sixonesTop7fuhetijianOne.toString());
		map.put("sixonesTop7fuhetijianTwo", sixonesTop7fuhetijianTwo.toString());
		map.put("sixonesTop7fuhetijianThree", sixonesTop7fuhetijianThree.toString());
		map.put("sixonesTop7fuhetijianfour", sixonesTop7fuhetijianfour.toString());
		map.put("sixonesTop7fuhetijianfive", sixonesTop7fuhetijianfive.toString());
		map.put("sixonesTop7fuhetijiansix", sixonesTop7fuhetijiansix.toString());
		// 真正符合的数字 过去8 期
		map.put("sixonesTop8fuhetijianZero", sixonesTop8fuhetijianZero.toString());
		map.put("sixonesTop8fuhetijianOne", sixonesTop8fuhetijianOne.toString());
		map.put("sixonesTop8fuhetijianTwo", sixonesTop8fuhetijianTwo.toString());
		map.put("sixonesTop8fuhetijianThree", sixonesTop8fuhetijianThree.toString());
		map.put("sixonesTop8fuhetijianfour", sixonesTop8fuhetijianfour.toString());
		map.put("sixonesTop8fuhetijianfive", sixonesTop8fuhetijianfive.toString());
		map.put("sixonesTop8fuhetijiansix", sixonesTop8fuhetijiansix.toString());
		// 真正符合的数字 过去9 期
		map.put("sixonesTop9fuhetijianZero", sixonesTop9fuhetijianZero.toString());
		map.put("sixonesTop9fuhetijianOne", sixonesTop9fuhetijianOne.toString());
		map.put("sixonesTop9fuhetijianTwo", sixonesTop9fuhetijianTwo.toString());
		map.put("sixonesTop9fuhetijianThree", sixonesTop9fuhetijianThree.toString());
		map.put("sixonesTop9fuhetijianfour", sixonesTop9fuhetijianfour.toString());
		map.put("sixonesTop9fuhetijianfive", sixonesTop9fuhetijianfive.toString());
		map.put("sixonesTop9fuhetijiansix", sixonesTop9fuhetijiansix.toString());

		logger.info(map.toString());

		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTUREYILOUSUCCESS";

	}

	/**
	 * 热门冷门数字偏差追踪系统
	 */
	public String futureColdHot() {
		logger.info("------热门冷门数字偏差追踪系统----查询最新的40期数据");
		List<SixOne> sixonesTop40 = SixOneServices.way6();
		Integer maxqishu = SixOneServices.way4();
		logger.info("最新的期数" + maxqishu);
		logger.info("=====================================");
		Iterator<SixOne> iter = sixonesTop40.iterator();// 获取40个对象
		List<SixOne> temps; // 存放临时的对象

		List<Map<String, Object>> fenxijieguolist = new ArrayList<Map<String, Object>>();

		float histoty_zongpingjun = 0.f;// 历史总平均 (遗漏次数在10一个的所有数字的遗漏数字相加)
		float history_geshupingjun = 0.f;// 历史平均遗漏个数(遗漏次数在10 以内)


		// 统计最近10期的遗漏情况
		List<List<Integer>> list10 = new ArrayList<List<Integer>>();
		// 遍历过去40期 降序
		while (iter.hasNext()) {
			Map<String, Object> everyone = new HashMap<String, Object>(); // 保存每一期的数据
			SixOne sixOne = iter.next();
			Integer id = sixOne.getId();
			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			everyone.put("qishu", id + "");// 保存期数
			StringBuilder stringBuilder2 = new StringBuilder();
			if (first < 10) {
				stringBuilder2.append("0" + first + "-");
			} else {
				stringBuilder2.append(first + "-");
			}
			if (second < 10) {
				stringBuilder2.append("0" + second + "-");
			} else {
				stringBuilder2.append(second + "-");
			}
			if (third < 10) {
				stringBuilder2.append("0" + third + "-");
			} else {
				stringBuilder2.append(third + "-");
			}
			if (fourth < 10) {
				stringBuilder2.append("0" + fourth + "-");
			} else {
				stringBuilder2.append(fourth + "-");
			}
			if (fifth < 10) {
				stringBuilder2.append("0" + fifth + "-");
			} else {
				stringBuilder2.append(fifth + "-");
			}
			if (sixth < 10) {
				stringBuilder2.append("0" + sixth + "-");
			} else {
				stringBuilder2.append(sixth + "-");
			}
			if (seventh < 10) {
				stringBuilder2.append("0" + seventh);
			} else {
				stringBuilder2.append(seventh);
			}
			everyone.put("number", stringBuilder2.toString());// 保存开奖数字情况
			List<Integer> IntegerS = new ArrayList<Integer>();// 临时存储每个对象 7个数字
			IntegerS.add(first);
			IntegerS.add(second);
			IntegerS.add(third);
			IntegerS.add(fourth);
			IntegerS.add(fifth);
			IntegerS.add(sixth);
			IntegerS.add(seventh);
			List<Integer> S2 = new ArrayList<Integer>();// 记录每一期7个数字的遗漏值
			temps = SixOneServices.way7(qishu);// 查询比自己期数小的 其他对象
			float geshu = 0;
			float yilouzongshu = 0;
			StringBuilder stringBuilder = new StringBuilder();// 保存每一个对象的七个数字的七个遗漏值,不用排序,直接累加成字符串
			List<Integer> getnewListTen = new ArrayList<Integer>();
			// 遍历自己的七个数字
			for (Integer integer : IntegerS) {
				boolean iscunzai = false;
				for (SixOne tempsixOne : temps) {
					Integer tempqishu = tempsixOne.getQishu();
					Integer tempfirst = tempsixOne.getFirst();
					Integer tempsecond = tempsixOne.getSecond();
					Integer tempthird = tempsixOne.getThird();
					Integer tempfourth = tempsixOne.getFourth();
					Integer tempfifth = tempsixOne.getFifth();
					Integer tempsixth = tempsixOne.getSixth();
					Integer tempseventh = tempsixOne.getSeventh();
					// 记录每一个对象每一个号码的遗漏
					if (integer == tempfirst) {
						Integer tempYiLou = qishu - tempqishu - 1;
						S2.add(tempYiLou);
						yilouzongshu += tempYiLou;
						if (tempYiLou < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + tempYiLou + "-");
						} else {
							stringBuilder.append(tempYiLou + "-");
						}
					
						if ((maxqishu - qishu) < 10) {
							
							getnewListTen.add(tempYiLou);
						}
						iscunzai = true;
						break;
					} else if (integer == tempsecond) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += tempYiLou;
						S2.add(qishu - tempqishu - 1);
						if ((tempYiLou) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + tempYiLou + "-");
						} else {
							stringBuilder.append(tempYiLou + "-");
						}
						
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					} else if (integer == tempthird) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += tempYiLou;
						S2.add(tempYiLou);
						if (tempYiLou < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + tempYiLou + "-");
						} else {
							stringBuilder.append(tempYiLou + "-");
						}
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					} else if (integer == tempfourth) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += qishu - tempqishu - 1;
						S2.add(qishu - tempqishu - 1);
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					} else if (integer == tempfifth) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += qishu - tempqishu - 1;
						S2.add(qishu - tempqishu - 1);
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
					
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					} else if (integer == tempsixth) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += qishu - tempqishu - 1;
						S2.add(qishu - tempqishu - 1);
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					} else if (integer == tempseventh) {
						Integer tempYiLou = qishu - tempqishu - 1;
						yilouzongshu += qishu - tempqishu - 1;
						S2.add(qishu - tempqishu - 1);
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						
						
						if ((maxqishu - qishu) < 10) {
							getnewListTen.add(tempYiLou);
						}

						iscunzai = true;
						break;
					}

				}
				if (!iscunzai) {
					logger.info("数字" + integer + "过去从未出现过");
				}
			}
			logger.info(getnewListTen.toString());
			if (getnewListTen.size() > 0) {
				list10.add(getnewListTen);
			}
			// logger.info(stringBuilder);
			everyone.put("yilouqingkuang", stringBuilder.deleteCharAt(stringBuilder.length() - 1) + "");
			// 遗漏情况进行冒泡排序

			int[] yilouS2 = { S2.get(0), S2.get(1), S2.get(2), S2.get(3), S2.get(4), S2.get(5), S2.get(6) };
			everyone.put("yilouqingkuangpaixu", DuanQiCommonUtils.bubbleSort(id, yilouS2));
			everyone.put("zongyilougeshu", (int) geshu + "");
			everyone.put("yiloucishuzongshu", yilouzongshu + "");
			everyone.put("yiloupingjungeshu", yilouzongshu / 7.f + "");
			/*
			 * logger.info("各个数字遗漏情况:" + stringBuilder);
			 * logger.info("各个数字遗漏情况进行排序:" + stringBuilder);
			 * logger.info("本次遗漏次数在10以内的数字共有" + (int) geshu + "个");
			 * logger.info("本期遗漏的次数总数" + yilouzongshu); logger.info("本次遗漏平均个数为"
			 * + yilouzongshu / 7.f + "个");
			 */
			fenxijieguolist.add(everyone);
			histoty_zongpingjun += yilouzongshu;
			history_geshupingjun += geshu;
		}
		logger.info("分析结果=====================================");
		logger.info("历史平均总计值" + (histoty_zongpingjun / 40.f));
		logger.info("历史个数平均值" + (history_geshupingjun / 40.f));
        for(int i=0;i<list10.size();i++){
        	System.out.println(list10.get(i).toString());
        }
		
        Map<String, List<Integer>> map =DuanQiCommonUtils.getyiloufenduan(list10);
		List<String> now5=DuanQiCommonUtils.getListString(map.get("now5"));
		List<String> last5=DuanQiCommonUtils.getListString(map.get("last5"));
		List<String> last6=DuanQiCommonUtils.getListString(map.get("last6"));
		List<String> last7=DuanQiCommonUtils.getListString(map.get("last7"));
		List<String> last8=DuanQiCommonUtils.getListString(map.get("last8"));
		List<String> last9=DuanQiCommonUtils.getListString(map.get("last9"));
		List<String> last10=DuanQiCommonUtils.getListString(map.get("last10"));
		System.out.println(now5.toString());
		System.out.println(last5.toString());
		System.out.println(last6.toString());
		System.out.println(last7.toString());
		System.out.println(last8.toString());
		System.out.println(last9.toString());
		System.out.println(last10.toString());
		List<List<String>> tongji=new ArrayList<>();
		tongji.add(now5);
		tongji.add(last5);
		tongji.add(last6);
		tongji.add(last7);
		tongji.add(last8);
		tongji.add(last9);
		tongji.add(last10);
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("tongji", tongji);
		fenxijieguolist.add(map2);
		JSONArray jsonObjectFromMap = JSONArray.fromObject(fenxijieguolist);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();

		return "FUTURECOLDHOTSUCCESS";
	}

	/**
	 * 奇数偶数偏差系统分析
	 */
	public String futureOddEven() {
		logger.info("奇数偶数偏差系统分析------------futureOddEven----");
		List<SixOne> sixonesTop10 = SixOneServices.way5();
		int odd = 0;// 存放奇数的总个数
		int even = 0;// 存放偶数的总个数

		SixOne sixOne;
		List<Integer> integersODD = new ArrayList<Integer>();
		List<Integer> integersEVEN = new ArrayList<Integer>();
		List<Integer> qishulist = new ArrayList<Integer>();
		for (int i = 0; i < sixonesTop10.size(); i++) {
			int everyoneOdd = 0;// 存放每个对象的奇数
			int everyoneEven = 0;// 存放每个对象的偶数
			sixOne = sixonesTop10.get(i);

			if (sixOne.getFirst() != null) {
				if (sixOne.getFirst() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;

				}
			}
			if (sixOne.getSecond() != null) {
				if (sixOne.getSecond() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			if (sixOne.getThird() != null) {
				if (sixOne.getThird() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			if (sixOne.getFourth() != null) {
				if (sixOne.getFourth() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			if (sixOne.getFifth() != null) {
				if (sixOne.getFifth() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			if (sixOne.getSixth() != null) {
				if (sixOne.getSixth() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			if (sixOne.getSeventh() != null) {
				if (sixOne.getSeventh() % 2 == 0) {
					even++;
					everyoneEven++;
				} else {
					odd++;
					everyoneOdd++;
				}
			}
			integersODD.add(everyoneOdd);
			integersEVEN.add(everyoneEven);
			qishulist.add(sixOne.getQishu());
		}
		logger.info(qishulist.toString());
		logger.info(integersODD.toString());
		logger.info(integersEVEN.toString());
		logger.info("奇数的个数为" + odd);
		logger.info("偶数的个数为" + even);
		logger.info("======================");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qishulist", qishulist);
		map.put("integersODD", integersODD);
		map.put("integersEVEN", integersEVEN);
		map.put("odd", odd);
		map.put("even", even);
		if (odd > even) {
			map.put("cha", odd - even);
		}
		if (odd < even) {
			map.put("cha", even - odd);
		}
		logger.info(map.toString());
		JSONObject jsonObjectFromMap = JSONObject.fromObject(map);
		logger.info(jsonObjectFromMap.toString());
		result = jsonObjectFromMap.toString();
		return "FUTUREODDEVENSUCCESS";
	}

	/**
	 * 系统分析未来一期的情况
	 */
	public String futureSixOne() {
		return "GETFUTURE_SUCCESS";
	}

	/**
	 * 查询最大的期数
	 * 
	 * @return
	 */
	public String SixOneActionMaxQishu() {
		logger.info(TAG + "---" + "SixOneActionMaxQishu");
		Integer qishu = SixOneServices.way4();
		qishu++;
		result = qishu.toString();
		logger.info(TAG + "当前最新的期数" + result);
		return "SUCCESS";
	}

	/**
	 * 查询所有的期数 数据
	 * 
	 * @return
	 */
	private SixOne sixone;

	public String getSixOnes() {
		logger.info(TAG + "---" + "getSixOnes");
		List<SixOne> all_sixones = SixOneServices.way0();
		logger.info(TAG + "---该表格的数据总数" + all_sixones.size());
		request.setAttribute("sixonelist", all_sixones);

		return "GETSIXONES_SUCCESS";
	}

	/**
	 * 添加最新的记录 到数据库
	 */

	public String addSixOne() {
		logger.info(TAG + "-------" + "addSixOne");
		logger.info(TAG + "期数" + qishu);
		logger.info(TAG + "球1" + first);
		logger.info(TAG + "球2" + second);
		logger.info(TAG + "球3" + third);
		logger.info(TAG + "球4" + fourth);
		logger.info(TAG + "球5" + fifth);
		logger.info(TAG + "球6" + sixth);
		logger.info(TAG + "球7" + seventh);
		Integer id = SixOneServices.way15();
		try {
			sixone = new SixOne();
			sixone.setId(id + 1);
			sixone.setQishu(qishu);
			sixone.setFirst(first);
			sixone.setSecond(second);
			sixone.setThird(third);
			sixone.setFourth(fourth);
			sixone.setFifth(fifth);
			sixone.setSixth(sixth);
			sixone.setSeventh(seventh);
			sixone.setSum(first + second + third + fourth + fifth + sixth + seventh);
			boolean b = SixOneServices.way2(sixone);
			if (b) {
				result = "添加成功";
			} else {
				result = "添加失败";
			}
		} catch (Exception exception) {
			result = "添加失败";
		}
		return "ADDSIXONESUCCESS";
	}

	/**
	 * 分页查询
	 * 
	 * @throws IOException
	 * @throws java.io.IOException
	 */
	public void GetSixOnesByFenYe() throws IOException, java.io.IOException {

		List<SixOne> all_sixones = SixOneServices.way0();
		logger.info(TAG + "---该表格的数据总数" + all_sixones.size());

		response.setContentType("text/html");
		PrintWriter out;
		out = response.getWriter();
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		// 当前页
		int curPage = Integer.parseInt(request.getParameter("curPage"));
		// 要排序的列
		final String sortName = request.getParameter("sortName");
		final String sortOrder = request.getParameter("sortOrder");

		System.out.println("每一页的数据条数" + pageSize);
		System.out.println("当前页" + curPage);
		System.out.println("要排序的列" + sortName);
		System.out.println("要排序的列" + sortOrder);

		// data list
		// 表数据
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		// 总记录数
		int totalRows = all_sixones.size();
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
		for (int i = 0; i < all_sixones.size(); i++) {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("qishu", all_sixones.get(i).getId()+ "");
			map.put("first", all_sixones.get(i).getFirst() + "");
			map.put("second", all_sixones.get(i).getSecond() + "");
			map.put("third", all_sixones.get(i).getThird() + "");
			map.put("fourth", all_sixones.get(i).getFourth() + "");
			map.put("fifth", all_sixones.get(i).getFifth() + "");
			map.put("sixth", all_sixones.get(i).getSixth() + "");
			map.put("seventh", all_sixones.get(i).getSeventh() + "");
			data.add(map);
		}
		// sort 要排序的列
		if ("qishu".equals(sortName)) {
			// 升序
			if ("asc".equals(sortOrder)) {
				Collections.sort(data, new Comparator<Map<String, Object>>() {
					public int compare(Map<String, Object> map1, Map<String, Object> map2) {
						return Integer.parseInt(map1.get(sortName).toString())
								- Integer.parseInt(map2.get(sortName).toString());
					}
				});
			} // 降序
			else if ("desc".equals(sortOrder)) {
				Collections.sort(data, new Comparator<Map<String, Object>>() {

					public int compare(Map<String, Object> map1, Map<String, Object> map2) {
						return Integer.parseInt(map2.get(sortName).toString())
								- Integer.parseInt(map1.get(sortName).toString());
					}
				});
			}
		} /*
			 * else if ("qishu,first" . equals ( sortName ) ) { Collections .
			 * sort ( data, new Comparator < Map < String, Object > > ( ) {
			 * public int compare ( Map < String, Object> map1, Map < String,
			 * Object> map2) { int xhCp = Integer . parseInt ( map1 . get (
			 * "qishu" ) . toString ( ) ) - Integer . parseInt ( map2 . get (
			 * "qishu" ) . toString ( ) ) ; int idCp = Integer . parseInt ( map1
			 * . get ( "first" ) . toString ( ) ) - Integer . parseInt ( map2 .
			 * get ( "first" ) . toString ( ) ) ;
			 * 
			 * if (sortOrder . equals ( "asc,asc" ) ) { return xhCp == 0 ? idCp
			 * : xhCp; } else if (sortOrder . equals ( "asc,desc" ) ) { return
			 * xhCp == 0 ? -idCp : xhCp; } else if (sortOrder . equals (
			 * "desc,asc" ) ) { return xhCp == 0 ? idCp : -xhCp; } else if
			 * (sortOrder . equals ( "desc,desc" ) ) { return xhCp == 0 ? -idCp
			 * : -xhCp; } return 0; } } ) ; }
			 */

		StringBuilder jsonSb = new StringBuilder();
		jsonSb.append("{");
		jsonSb.append("\"success\": true");
		jsonSb.append(", \"totalRows\": ").append(totalRows);
		jsonSb.append(", \"curPage\": ").append(curPage);
		jsonSb.append(", \"data\": ");
		jsonSb.append("[");

		int startRow = pageSize * (curPage - 1) + 1;
		int endRow = startRow + pageSize - 1;
		// if pageSize == 0, then return all
		if (endRow > totalRows || pageSize == 0)

		{
			endRow = totalRows;
		}

		for (

		int i = startRow - 1; i < endRow; i++)

		{
			if (i != startRow - 1)

			{
				jsonSb.append(",");
			}

			Map<String, Object> map = data.get(i);
			jsonSb.append("{");
			jsonSb.append("\"qishu\": ").append(map.get("qishu")).append(",");
			jsonSb.append("\"first\": ").append(map.get("first")).append(",");
			jsonSb.append("\"second\": \"").append(map.get("second")).append("\",");
			jsonSb.append("\"third\": \"").append(map.get("third")).append("\",");
			jsonSb.append("\"fourth\": \"").append(map.get("fourth")).append("\",");
			jsonSb.append("\"fifth\": \"").append(map.get("fifth")).append("\",");
			jsonSb.append("\"sixth\": \"").append(map.get("sixth")).append("\",");
			jsonSb.append("\"seventh\": ").append(map.get("seventh"));
			jsonSb.append("}");
		}

		jsonSb.append("]");
		jsonSb.append("}");
		out.print(jsonSb.toString());
		System.out.println(jsonSb.toString());

	}

	private Integer qishu;

	/**
	 * @return the qishu
	 */
	public Integer getQishu() {
		return qishu;
	}

	/**
	 * @param qishu
	 *            the qishu to set
	 */
	public void setQishu(Integer qishu) {
		this.qishu = qishu;
	}

	/**
	 * @return the first
	 */
	public Integer getFirst() {
		return first;
	}

	/**
	 * @param first
	 *            the first to set
	 */
	public void setFirst(Integer first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	public Integer getSecond() {
		return second;
	}

	/**
	 * @param second
	 *            the second to set
	 */
	public void setSecond(Integer second) {
		this.second = second;
	}

	/**
	 * @return the third
	 */
	public Integer getThird() {
		return third;
	}

	/**
	 * @param third
	 *            the third to set
	 */
	public void setThird(Integer third) {
		this.third = third;
	}

	/**
	 * @return the fourth
	 */
	public Integer getFourth() {
		return fourth;
	}

	/**
	 * @param fourth
	 *            the fourth to set
	 */
	public void setFourth(Integer fourth) {
		this.fourth = fourth;
	}

	/**
	 * @return the fifth
	 */
	public Integer getFifth() {
		return fifth;
	}

	/**
	 * @param fifth
	 *            the fifth to set
	 */
	public void setFifth(Integer fifth) {
		this.fifth = fifth;
	}

	/**
	 * @return the sixth
	 */
	public Integer getSixth() {
		return sixth;
	}

	/**
	 * @param sixth
	 *            the sixth to set
	 */
	public void setSixth(Integer sixth) {
		this.sixth = sixth;
	}

	/**
	 * @return the seventh
	 */
	public Integer getSeventh() {
		return seventh;
	}

	/**
	 * @param seventh
	 *            the seventh to set
	 */
	public void setSeventh(Integer seventh) {
		this.seventh = seventh;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getChoosenNumbers() {
		return choosenNumbers;
	}

	public void setChoosenNumbers(String choosenNumbers) {
		this.choosenNumbers = choosenNumbers;
	}
}
