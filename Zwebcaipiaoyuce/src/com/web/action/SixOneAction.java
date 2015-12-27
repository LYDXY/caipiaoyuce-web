package com.web.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;

import com.sun.star.bridge.oleautomation.Date;
import com.sun.star.io.IOException;
import com.web.pojo.SixOne;
import com.web.services.SixOneServices;
import com.web.yuce.common.utils.DuanQiCommonUtils;

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

	/**
	 * 构造器初始化数据
	 */
	public SixOneAction() {

	}

	/**
	 * 数字区间偏差追踪系统
	 */
	public String futureShuZiQuJian() {
		List<SixOne> sixonesTop10 = SixOneServices.way9();
		List<Map<String, Object>> list = new ArrayList<>();
		for (SixOne tempsixOne : sixonesTop10) {

			Map<String, Object> map2 = new HashMap<String, Object>();
			List<Integer> templist = new ArrayList<Integer>();
			Integer tempqishu = tempsixOne.getQishu();
			Integer tempfirst = tempsixOne.getFirst();
			Integer tempsecond = tempsixOne.getSecond();
			Integer tempthird = tempsixOne.getThird();
			Integer tempfourth = tempsixOne.getFourth();
			Integer tempfifth = tempsixOne.getFifth();
			Integer tempsixth = tempsixOne.getSixth();
			Integer tempseventh = tempsixOne.getSeventh();
			map2.put("qishu", tempqishu);
			templist.add(tempfirst);
			templist.add(tempsecond);
			templist.add(tempthird);
			templist.add(tempfourth);
			templist.add(tempfifth);
			templist.add(tempsixth);
			templist.add(tempseventh);
			List<Integer> qishulisttop10 = new ArrayList<Integer>();
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
			for (Integer integer : templist) {

				if (integer <= 5 && integer >= 1) {
					Integer1to5++;
				} else if (integer <= 10 && integer > 5) {
					Integer6to10++;
				} else if (integer <= 15 && integer > 10) {
					Integer11to15++;
				} else if (integer <= 20 && integer > 15) {
					Integer16to20++;
				} else if (integer <= 25 && integer > 20) {
					Integer21to25++;
				} else if (integer <= 30 && integer > 25) {
					Integer26to30++;
				} else if (integer <= 35 && integer > 30) {
					Integer31to35++;
				} else if (integer <= 40 && integer > 35) {
					Integer36to40++;
				} else if (integer <= 45 && integer > 40) {
					Integer41to45++;
				} else if (integer <= 49 && integer > 45) {
					Integer46to49++;
				}

			}

			qishulisttop10.add(Integer1to5);
			qishulisttop10.add(Integer6to10);
			qishulisttop10.add(Integer11to15);
			qishulisttop10.add(Integer16to20);
			qishulisttop10.add(Integer21to25);
			qishulisttop10.add(Integer26to30);
			qishulisttop10.add(Integer31to35);
			qishulisttop10.add(Integer36to40);
			qishulisttop10.add(Integer41to45);
			qishulisttop10.add(Integer46to49);
			map2.put("qujianqingkuang", qishulisttop10);
			list.add(map2);

		}

		logger.info(list.toString());
		JSONArray jsonObjectFromlist = JSONArray.fromObject(list);
		logger.info(jsonObjectFromlist.toString());
		result = jsonObjectFromlist.toString();
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
		List<SixOne> sixonesTop10 = SixOneServices.way10();
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
	 * 末位数字偏差系统分析
	 */
	public String futureMoWei() {
		logger.info("----------------------futureMoWei");
		List<SixOne> sixonesTop5 = SixOneServices.way8(5);
		List<SixOne> sixonesTop6 = SixOneServices.way8(6);
		List<SixOne> sixonesTop7 = SixOneServices.way8(7);
		List<SixOne> sixonesTop8 = SixOneServices.way8(8);
		List<SixOne> sixonesTop9 = SixOneServices.way8(9);
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 过去的5期末位数字统计
		int zeroTop5 = 0;
		int oneTop5 = 0;
		int twoTop5 = 0;
		int threeTop5 = 0;
		int fourTop5 = 0;
		int fiveTop5 = 0;
		int sixTop5 = 0;
		int sevenTop5 = 0;
		int eightTop5 = 0;
		int nineTop5 = 0;
		for (SixOne sixOne : sixonesTop5) {
			List<Integer> integers = new ArrayList<Integer>();
			Integer tempfirst = sixOne.getFifth() % 10;
			Integer tempsecond = sixOne.getSecond() % 10;
			Integer tempthird = sixOne.getThird() % 10;
			Integer tempfourth = sixOne.getFourth() % 10;
			Integer tempfifth = sixOne.getFifth() % 10;
			Integer tempsixth = sixOne.getSixth() % 10;
			Integer tempseventh = sixOne.getSeventh() % 10;
			integers.add(tempfirst);
			integers.add(tempsecond);
			integers.add(tempthird);
			integers.add(tempfourth);
			integers.add(tempfifth);
			integers.add(tempsixth);
			integers.add(tempseventh);
			for (Integer integer : integers) {
				if (integer == 0) {
					zeroTop5++;
				} else if (integer == 1) {
					oneTop5++;
				} else if (integer == 2) {
					twoTop5++;
				} else if (integer == 3) {
					threeTop5++;
				} else if (integer == 4) {
					fourTop5++;
				} else if (integer == 5) {
					fiveTop5++;
				} else if (integer == 6) {
					sixTop5++;
				} else if (integer == 7) {
					sevenTop5++;
				} else if (integer == 8) {
					eightTop5++;
				} else if (integer == 9) {
					nineTop5++;
				}

			}

		}
		logger.info("===============================================");
		logger.info("在过去5期中末位数为0的数字的个数共有" + zeroTop5 + "个");
		logger.info("在过去5期中末位数为1的数字的个数共有" + oneTop5 + "个");
		logger.info("在过去5期中末位数为2的数字的个数共有" + twoTop5 + "个");
		logger.info("在过去5期中末位数为3的数字的个数共有" + threeTop5 + "个");
		logger.info("在过去5期中末位数为4的数字的个数共有" + fourTop5 + "个");
		logger.info("在过去5期中末位数为5的数字的个数共有" + fiveTop5 + "个");
		logger.info("在过去5期中末位数为6的数字的个数共有" + sixTop5 + "个");
		logger.info("在过去5期中末位数为7的数字的个数共有" + sevenTop5 + "个");
		logger.info("在过去5期中末位数为8的数字的个数共有" + eightTop5 + "个");
		logger.info("在过去5期中末位数为9的数字的个数共有" + nineTop5 + "个");
		map.put("zeroTop5", zeroTop5);
		map.put("oneTop5", oneTop5);
		map.put("twoTop5", twoTop5);
		map.put("threeTop5", threeTop5);
		map.put("fourTop5", fourTop5);
		map.put("fiveTop5", fiveTop5);
		map.put("sixTop5", sixTop5);
		map.put("sevenTop5", sevenTop5);
		map.put("eightTop5", eightTop5);
		map.put("nineTop5", nineTop5);

		// 过去6期
		int zeroTop6 = 0;
		int oneTop6 = 0;
		int twoTop6 = 0;
		int threeTop6 = 0;
		int fourTop6 = 0;
		int fiveTop6 = 0;
		int sixTop6 = 0;
		int sevenTop6 = 0;
		int eightTop6 = 0;
		int nineTop6 = 0;
		for (SixOne sixOne : sixonesTop6) {
			List<Integer> integers = new ArrayList<Integer>();
			Integer tempfirst = sixOne.getFifth() % 10;
			Integer tempsecond = sixOne.getSecond() % 10;
			Integer tempthird = sixOne.getThird() % 10;
			Integer tempfourth = sixOne.getFourth() % 10;
			Integer tempfifth = sixOne.getFifth() % 10;
			Integer tempsixth = sixOne.getSixth() % 10;
			Integer tempseventh = sixOne.getSeventh() % 10;
			integers.add(tempfirst);
			integers.add(tempsecond);
			integers.add(tempthird);
			integers.add(tempfourth);
			integers.add(tempfifth);
			integers.add(tempsixth);
			integers.add(tempseventh);
			for (Integer integer : integers) {
				if (integer == 0) {
					zeroTop6++;
				} else if (integer == 1) {
					oneTop6++;
				} else if (integer == 2) {
					twoTop6++;
				} else if (integer == 3) {
					threeTop6++;
				} else if (integer == 4) {
					fourTop6++;
				} else if (integer == 5) {
					fiveTop6++;
				} else if (integer == 6) {
					sixTop6++;
				} else if (integer == 7) {
					sevenTop6++;
				} else if (integer == 8) {
					eightTop6++;
				} else if (integer == 9) {
					nineTop6++;
				}

			}

		}
		logger.info("===============================================");
		logger.info("在过去6期中末位数为0的数字的个数共有" + zeroTop6 + "个");
		logger.info("在过去6期中末位数为1的数字的个数共有" + oneTop6 + "个");
		logger.info("在过去6期中末位数为2的数字的个数共有" + twoTop6 + "个");
		logger.info("在过去6期中末位数为3的数字的个数共有" + threeTop6 + "个");
		logger.info("在过去6期中末位数为4的数字的个数共有" + fourTop6 + "个");
		logger.info("在过去6期中末位数为5的数字的个数共有" + fiveTop6 + "个");
		logger.info("在过去6期中末位数为6的数字的个数共有" + sixTop6 + "个");
		logger.info("在过去6期中末位数为7的数字的个数共有" + sevenTop6 + "个");
		logger.info("在过去6期中末位数为8的数字的个数共有" + eightTop6 + "个");
		logger.info("在过去6期中末位数为9的数字的个数共有" + nineTop6 + "个");

		map.put("zeroTop6", zeroTop6);
		map.put("oneTop6", oneTop6);
		map.put("twoTop6", twoTop6);
		map.put("threeTop6", threeTop6);
		map.put("fourTop6", fourTop6);
		map.put("fiveTop6", fiveTop6);
		map.put("sixTop6", sixTop6);
		map.put("sevenTop6", sevenTop6);
		map.put("eightTop6", eightTop6);
		map.put("nineTop6", nineTop6);
		// 过去7期
		int zeroTop7 = 0;
		int oneTop7 = 0;
		int twoTop7 = 0;
		int threeTop7 = 0;
		int fourTop7 = 0;
		int fiveTop7 = 0;
		int sixTop7 = 0;
		int sevenTop7 = 0;
		int eightTop7 = 0;
		int nineTop7 = 0;
		for (SixOne sixOne : sixonesTop7) {
			List<Integer> integers = new ArrayList<Integer>();
			Integer tempfirst = sixOne.getFifth() % 10;
			Integer tempsecond = sixOne.getSecond() % 10;
			Integer tempthird = sixOne.getThird() % 10;
			Integer tempfourth = sixOne.getFourth() % 10;
			Integer tempfifth = sixOne.getFifth() % 10;
			Integer tempsixth = sixOne.getSixth() % 10;
			Integer tempseventh = sixOne.getSeventh() % 10;
			integers.add(tempfirst);
			integers.add(tempsecond);
			integers.add(tempthird);
			integers.add(tempfourth);
			integers.add(tempfifth);
			integers.add(tempsixth);
			integers.add(tempseventh);
			for (Integer integer : integers) {
				if (integer == 0) {
					zeroTop7++;
				} else if (integer == 1) {
					oneTop7++;
				} else if (integer == 2) {
					twoTop7++;
				} else if (integer == 3) {
					threeTop7++;
				} else if (integer == 4) {
					fourTop7++;
				} else if (integer == 5) {
					fiveTop7++;
				} else if (integer == 6) {
					sixTop7++;
				} else if (integer == 7) {
					sevenTop7++;
				} else if (integer == 8) {
					eightTop7++;
				} else if (integer == 9) {
					nineTop7++;
				}

			}

		}
		logger.info("===============================================");
		logger.info("在过去7期中末位数为0的数字的个数共有" + zeroTop7 + "个");
		logger.info("在过去7期中末位数为1的数字的个数共有" + oneTop7 + "个");
		logger.info("在过去7期中末位数为2的数字的个数共有" + twoTop7 + "个");
		logger.info("在过去7期中末位数为3的数字的个数共有" + threeTop7 + "个");
		logger.info("在过去7期中末位数为4的数字的个数共有" + fourTop7 + "个");
		logger.info("在过去7期中末位数为5的数字的个数共有" + fiveTop7 + "个");
		logger.info("在过去7期中末位数为6的数字的个数共有" + sixTop7 + "个");
		logger.info("在过去7期中末位数为7的数字的个数共有" + sevenTop7 + "个");
		logger.info("在过去7期中末位数为8的数字的个数共有" + eightTop7 + "个");
		logger.info("在过去7期中末位数为9的数字的个数共有" + nineTop7 + "个");
		map.put("zeroTop7", zeroTop7);
		map.put("oneTop7", oneTop7);
		map.put("twoTop7", twoTop7);
		map.put("threeTop7", threeTop7);
		map.put("fourTop7", fourTop7);
		map.put("fiveTop7", fiveTop7);
		map.put("sixTop7", sixTop7);
		map.put("sevenTop7", sevenTop7);
		map.put("eightTop7", eightTop7);
		map.put("nineTop7", nineTop7);

		// 过去8期
		int zeroTop8 = 0;
		int oneTop8 = 0;
		int twoTop8 = 0;
		int threeTop8 = 0;
		int fourTop8 = 0;
		int fiveTop8 = 0;
		int sixTop8 = 0;
		int sevenTop8 = 0;
		int eightTop8 = 0;
		int nineTop8 = 0;
		for (SixOne sixOne : sixonesTop8) {
			List<Integer> integers = new ArrayList<Integer>();
			Integer tempfirst = sixOne.getFifth() % 10;
			Integer tempsecond = sixOne.getSecond() % 10;
			Integer tempthird = sixOne.getThird() % 10;
			Integer tempfourth = sixOne.getFourth() % 10;
			Integer tempfifth = sixOne.getFifth() % 10;
			Integer tempsixth = sixOne.getSixth() % 10;
			Integer tempseventh = sixOne.getSeventh() % 10;
			integers.add(tempfirst);
			integers.add(tempsecond);
			integers.add(tempthird);
			integers.add(tempfourth);
			integers.add(tempfifth);
			integers.add(tempsixth);
			integers.add(tempseventh);
			for (Integer integer : integers) {
				if (integer == 0) {
					zeroTop8++;
				} else if (integer == 1) {
					oneTop8++;
				} else if (integer == 2) {
					twoTop8++;
				} else if (integer == 3) {
					threeTop8++;
				} else if (integer == 4) {
					fourTop8++;
				} else if (integer == 5) {
					fiveTop8++;
				} else if (integer == 6) {
					sixTop8++;
				} else if (integer == 7) {
					sevenTop8++;
				} else if (integer == 8) {
					eightTop8++;
				} else if (integer == 9) {
					nineTop8++;
				}

			}

		}
		logger.info("===============================================");
		logger.info("在过去8期中末位数为0的数字的个数共有" + zeroTop8 + "个");
		logger.info("在过去8期中末位数为1的数字的个数共有" + oneTop8 + "个");
		logger.info("在过去8期中末位数为2的数字的个数共有" + twoTop8 + "个");
		logger.info("在过去8期中末位数为3的数字的个数共有" + threeTop8 + "个");
		logger.info("在过去8期中末位数为4的数字的个数共有" + fourTop8 + "个");
		logger.info("在过去8期中末位数为5的数字的个数共有" + fiveTop8 + "个");
		logger.info("在过去8期中末位数为6的数字的个数共有" + sixTop8 + "个");
		logger.info("在过去8期中末位数为7的数字的个数共有" + sevenTop8 + "个");
		logger.info("在过去8期中末位数为8的数字的个数共有" + eightTop8 + "个");
		logger.info("在过去8期中末位数为9的数字的个数共有" + nineTop8 + "个");
		map.put("zeroTop8", zeroTop8);
		map.put("oneTop8", oneTop8);
		map.put("twoTop8", twoTop8);
		map.put("threeTop8", threeTop8);
		map.put("fourTop8", fourTop8);
		map.put("fiveTop8", fiveTop8);
		map.put("sixTop8", sixTop8);
		map.put("sevenTop8", sevenTop8);
		map.put("eightTop8", eightTop8);
		map.put("nineTop8", nineTop8);
		// 过去9期
		int zeroTop9 = 0;
		int oneTop9 = 0;
		int twoTop9 = 0;
		int threeTop9 = 0;
		int fourTop9 = 0;
		int fiveTop9 = 0;
		int sixTop9 = 0;
		int sevenTop9 = 0;
		int eightTop9 = 0;
		int nineTop9 = 0;
		for (SixOne sixOne : sixonesTop9) {
			List<Integer> integers = new ArrayList<Integer>();
			Integer tempfirst = sixOne.getFifth() % 10;
			Integer tempsecond = sixOne.getSecond() % 10;
			Integer tempthird = sixOne.getThird() % 10;
			Integer tempfourth = sixOne.getFourth() % 10;
			Integer tempfifth = sixOne.getFifth() % 10;
			Integer tempsixth = sixOne.getSixth() % 10;
			Integer tempseventh = sixOne.getSeventh() % 10;
			integers.add(tempfirst);
			integers.add(tempsecond);
			integers.add(tempthird);
			integers.add(tempfourth);
			integers.add(tempfifth);
			integers.add(tempsixth);
			integers.add(tempseventh);
			for (Integer integer : integers) {
				if (integer == 0) {
					zeroTop9++;
				} else if (integer == 1) {
					oneTop9++;
				} else if (integer == 2) {
					twoTop9++;
				} else if (integer == 3) {
					threeTop9++;
				} else if (integer == 4) {
					fourTop9++;
				} else if (integer == 5) {
					fiveTop9++;
				} else if (integer == 6) {
					sixTop9++;
				} else if (integer == 7) {
					sevenTop9++;
				} else if (integer == 8) {
					eightTop9++;
				} else if (integer == 9) {
					nineTop9++;
				}

			}

		}
		logger.info("===============================================");
		logger.info("在过去9期中末位数为0的数字的个数共有" + zeroTop9 + "个");
		logger.info("在过去9期中末位数为1的数字的个数共有" + oneTop9 + "个");
		logger.info("在过去9期中末位数为2的数字的个数共有" + twoTop9 + "个");
		logger.info("在过去9期中末位数为3的数字的个数共有" + threeTop9 + "个");
		logger.info("在过去9期中末位数为4的数字的个数共有" + fourTop9 + "个");
		logger.info("在过去9期中末位数为5的数字的个数共有" + fiveTop9 + "个");
		logger.info("在过去9期中末位数为6的数字的个数共有" + sixTop9 + "个");
		logger.info("在过去9期中末位数为7的数字的个数共有" + sevenTop9 + "个");
		logger.info("在过去9期中末位数为8的数字的个数共有" + eightTop9 + "个");
		logger.info("在过去9期中末位数为9的数字的个数共有" + nineTop9 + "个");
		map.put("zeroTop9", zeroTop9);
		map.put("oneTop9", oneTop9);
		map.put("twoTop9", twoTop9);
		map.put("threeTop9", threeTop9);
		map.put("fourTop9", fourTop9);
		map.put("fiveTop9", fiveTop9);
		map.put("sixTop9", sixTop9);
		map.put("sevenTop9", sevenTop9);
		map.put("eightTop9", eightTop9);
		map.put("nineTop9", nineTop9);

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
		logger.info("----------------------futureYiLou");
		Map<String, Object> map = new HashMap<String, Object>();
		List<SixOne> sixonesTop5 = SixOneServices.way8(5);
		List<SixOne> sixonesTop6 = SixOneServices.way8(6);
		List<SixOne> sixonesTop7 = SixOneServices.way8(7);
		List<SixOne> sixonesTop8 = SixOneServices.way8(8);
		List<SixOne> sixonesTop9 = SixOneServices.way8(9);

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

		// 针对过去7期
		for (SixOne sixOne7 : sixonesTop7) {
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

		// 针对过去8期
		for (SixOne sixOne8 : sixonesTop8) {
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
		// 针对过去9期
		for (SixOne sixOne9 : sixonesTop9) {
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
		logger.info("----------------------futureColdHot");
		List<SixOne> sixonesTop10 = SixOneServices.way6();
		Iterator<SixOne> iter = sixonesTop10.iterator();
		List<SixOne> temps;
		List<Map<String, Object>> fenxijieguolist = new ArrayList<Map<String, Object>>();
		List<StringBuilder> builders = new ArrayList<StringBuilder>();
		while (iter.hasNext()) {
			Map<String, Object> everyone = new HashMap<String, Object>();
			SixOne sixOne = iter.next();
			Integer qishu = sixOne.getQishu();
			Integer first = sixOne.getFirst();
			Integer second = sixOne.getSecond();
			Integer third = sixOne.getThird();
			Integer fourth = sixOne.getFourth();
			Integer fifth = sixOne.getFifth();
			Integer sixth = sixOne.getSixth();
			Integer seventh = sixOne.getSeventh();
			logger.info("--作为资料的期数--" + qishu + "--球1--" + first + "--球2--" + second + "--球3--" + third + "--球4--"
					+ fourth + "--球5--" + fifth + "--球6--" + sixth + "--球7--" + seventh);
			everyone.put("qishu", qishu + "");
			everyone.put("number",
					first + "-" + second + "-" + third + "-" + fourth + "-" + fifth + "-" + sixth + "-" + seventh);
			List<Integer> IntegerS = new ArrayList<Integer>();
			IntegerS.add(first);
			IntegerS.add(second);
			IntegerS.add(third);
			IntegerS.add(fourth);
			IntegerS.add(fifth);
			IntegerS.add(sixth);
			IntegerS.add(seventh);
			temps = SixOneServices.way7(qishu);
			float geshu = 0;
			float yilouzongshu = 0;
			StringBuilder stringBuilder = new StringBuilder();
			for (Integer integer : IntegerS) {
				logger.info("被找寻的数字--------------第" + qishu + "的" + integer);
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

					logger.info("--寻找的期数--" + tempqishu + "--球1--" + tempfirst + "--球2--" + tempsecond + "--球3--"
							+ tempthird + "--球4--" + tempfourth + "--球5--" + tempfifth + "--球6--" + tempsixth + "--球7--"
							+ tempseventh);

					if (integer == tempfirst) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						logger.info("------------------------------------");
						iscunzai = true;
						break;
					} else if (integer == tempsecond) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					} else if (integer == tempthird) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						yilouzongshu += qishu - tempqishu - 1;
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					} else if (integer == tempfourth) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					} else if (integer == tempfifth) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					} else if (integer == tempsixth) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					} else if (integer == tempseventh) {
						logger.info("数字" + integer + "在第" + qishu + "期出现");
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
							stringBuilder.append("0" + (qishu - tempqishu - 1) + "-");
						} else {
							stringBuilder.append((qishu - tempqishu - 1) + "-");
						}
						iscunzai = true;
						logger.info("------------------------------------");
						break;
					}

				}
				if (!iscunzai) {
					logger.info("数字" + integer + "过去从未出现过");
				}
			}
			logger.info(stringBuilder);
			everyone.put("yilouqingkuang", stringBuilder.deleteCharAt(stringBuilder.length() - 1) + "");
			everyone.put("zongyilougeshu", (int) geshu + "");
			everyone.put("yiloucishuzongshu", yilouzongshu + "");
			everyone.put("yiloupingjungeshu", yilouzongshu / 7.f + "");
			logger.info("各个数字遗漏情况:" + stringBuilder);
			logger.info("本次遗漏次数在10以内的数字共有" + (int) geshu + "个");
			logger.info("本期遗漏的次数总数" + yilouzongshu);
			logger.info("本次遗漏平均个数为" + yilouzongshu / 7.f + "个");
			// builders.add(stringBuilder);
			fenxijieguolist.add(everyone);
		}
		logger.info("分析结果");
		for (Map<String, Object> map : fenxijieguolist) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				logger.info("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
		logger.info("==============================================");
		// logger.info(builders.toString());

		logger.info(fenxijieguolist.toString());
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

		try {
			sixone = new SixOne();
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
			map.put("qishu", all_sixones.get(i).getQishu() + "");
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
			 * else if ("qishu,first".equals(sortName)) { Collections.sort(data,
			 * new Comparator<Map<String, Object>>() { public int
			 * compare(Map<String, Object> map1, Map<String, Object> map2) { int
			 * xhCp = Integer.parseInt(map1.get("qishu").toString()) -
			 * Integer.parseInt(map2.get("qishu").toString()); int idCp =
			 * Integer.parseInt(map1.get("first").toString()) -
			 * Integer.parseInt(map2.get("first").toString());
			 * 
			 * if (sortOrder.equals("asc,asc")) { return xhCp == 0 ? idCp :
			 * xhCp; } else if (sortOrder.equals("asc,desc")) { return xhCp == 0
			 * ? -idCp : xhCp; } else if (sortOrder.equals("desc,asc")) { return
			 * xhCp == 0 ? idCp : -xhCp; } else if
			 * (sortOrder.equals("desc,desc")) { return xhCp == 0 ? -idCp :
			 * -xhCp; } return 0; } }); }
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
		if (endRow > totalRows || pageSize == 0) {
			endRow = totalRows;
		}

		for (int i = startRow - 1; i < endRow; i++) {
			if (i != startRow - 1) {
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
}
