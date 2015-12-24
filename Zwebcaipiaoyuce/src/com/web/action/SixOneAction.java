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
	 * 遗漏数字偏差系统
	 */
	public String futureYiLou() {
		logger.info("----------------------futureYiLou");
		List<SixOne> sixonesTop5 = SixOneServices.way8(5);
		List<SixOne> sixonesTop6 = SixOneServices.way8(6);
		List<SixOne> sixonesTop7 = SixOneServices.way8(7);
		List<SixOne> sixonesTop8 = SixOneServices.way8(8);
		List<SixOne> sixonesTop9 = SixOneServices.way8(8);
		
		// 5
		List<Integer> yilouZeroInTop5 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop5 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop5 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop5 = new ArrayList<Integer>();
		List<Integer> yilouFourOrMoreInTop5 = new ArrayList<Integer>();
		// 6
		List<Integer> yilouZeroInTop6 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop6 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop6 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop6 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop6 = new ArrayList<Integer>();
		List<Integer> yilouFiveOrMoreInTop6 = new ArrayList<Integer>();

		// 7
		List<Integer> yilouZeroInTop7 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop7 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop7 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop7 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop7 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop7 = new ArrayList<Integer>();
		List<Integer> yilouSixOrMoreInTop7 = new ArrayList<Integer>();
		// 8
		List<Integer> yilouZeroInTop8 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop8 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop8 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop8 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop8 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop8 = new ArrayList<Integer>();
		List<Integer> yilouSixInTop8 = new ArrayList<Integer>();
		List<Integer> yilouSevenOrMoreInTop8 = new ArrayList<Integer>();

		// 9
		List<Integer> yilouZeroInTop9 = new ArrayList<Integer>();
		List<Integer> yilouOneInTop9 = new ArrayList<Integer>();
		List<Integer> yilouTwoInTop9 = new ArrayList<Integer>();
		List<Integer> yilouThreeInTop9 = new ArrayList<Integer>();
		List<Integer> yilouFourInTop9 = new ArrayList<Integer>();
		List<Integer> yilouFiveInTop9 = new ArrayList<Integer>();
		List<Integer> yilouSixInTop9 = new ArrayList<Integer>();
		List<Integer> yilouSevenInTop9 = new ArrayList<Integer>();
		List<Integer> yilouEightOrMoreInTop9 = new ArrayList<Integer>();
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
			for (Integer integer : Templist) {
				int geshu=0;
				for (SixOne tempsixOne : sixonesTop5) { // 145,144,143,142
					
					if (tempsixOne.getQishu() < reallysixOne.getQishu()) {
						Integer tempqishu = tempsixOne.getQishu();
						Integer tempfirst = tempsixOne.getFirst();
						Integer tempsecond = tempsixOne.getSecond();
						Integer tempthird = tempsixOne.getThird();
						Integer tempfourth = tempsixOne.getFourth();
						Integer tempfifth = tempsixOne.getFifth();
						Integer tempsixth = tempsixOne.getSixth();
						Integer tempseventh = tempsixOne.getSeventh();

						if (integer == tempfirst || integer == tempsecond || integer == tempthird
								|| integer == tempfourth || integer == tempfifth || integer == tempsixth
								|| integer == tempseventh) {
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
							
						}
						
						else {
							logger.info("数字" + integer + "在"+tempqishu+"没出现");
							geshu=geshu+1;
							System.out.println(geshu);
							if(geshu==4){
								yilouFourOrMoreInTop5.add(integer);
								break;
							}
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
			for (Integer integer : Templist) {
				int geshu=0;
				for (SixOne tempsixOne : sixonesTop6) { // 145,144,143,142
					if (tempsixOne.getQishu() < reallysixOne.getQishu()) {
						Integer tempqishu = tempsixOne.getQishu();
						Integer tempfirst = tempsixOne.getFirst();
						Integer tempsecond = tempsixOne.getSecond();
						Integer tempthird = tempsixOne.getThird();
						Integer tempfourth = tempsixOne.getFourth();
						Integer tempfifth = tempsixOne.getFifth();
						Integer tempsixth = tempsixOne.getSixth();
						Integer tempseventh = tempsixOne.getSeventh();

						if (integer == tempfirst || integer == tempsecond || integer == tempthird
								|| integer == tempfourth || integer == tempfifth || integer == tempsixth
								|| integer == tempseventh) {
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
							
						} else {
							logger.info("数字" + integer + "在"+tempqishu+"没出现");
							geshu=geshu+1;
							System.out.println(geshu);
							if(geshu==5){
								yilouFiveOrMoreInTop6.add(integer);
								break;
							}
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
			for (Integer integer : Templist) {
                int geshu=0;
				for (SixOne tempsixOne : sixonesTop7) { // 145,144,143,142
					if (tempsixOne.getQishu() < reallysixOne.getQishu()) {
						Integer tempqishu = tempsixOne.getQishu();
						Integer tempfirst = tempsixOne.getFirst();
						Integer tempsecond = tempsixOne.getSecond();
						Integer tempthird = tempsixOne.getThird();
						Integer tempfourth = tempsixOne.getFourth();
						Integer tempfifth = tempsixOne.getFifth();
						Integer tempsixth = tempsixOne.getSixth();
						Integer tempseventh = tempsixOne.getSeventh();

						if (integer == tempfirst || integer == tempsecond || integer == tempthird
								|| integer == tempfourth || integer == tempfifth || integer == tempsixth
								|| integer == tempseventh) {
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

							
						} else {
							logger.info("数字" + integer + "在"+tempqishu+"没出现");
							geshu=geshu+1;
							System.out.println(geshu);
							if(geshu==6){
								yilouSixOrMoreInTop7.add(integer);
								break;
							}
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
			for (Integer integer : Templist) {
                int geshu=0;
				for (SixOne tempsixOne : sixonesTop8) { // 145,144,143,142
					if (tempsixOne.getQishu() < reallysixOne.getQishu()) {
						Integer tempqishu = tempsixOne.getQishu();
						Integer tempfirst = tempsixOne.getFirst();
						Integer tempsecond = tempsixOne.getSecond();
						Integer tempthird = tempsixOne.getThird();
						Integer tempfourth = tempsixOne.getFourth();
						Integer tempfifth = tempsixOne.getFifth();
						Integer tempsixth = tempsixOne.getSixth();
						Integer tempseventh = tempsixOne.getSeventh();

						if (integer == tempfirst || integer == tempsecond || integer == tempthird
								|| integer == tempfourth || integer == tempfifth || integer == tempsixth
								|| integer == tempseventh) {
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
							if ((qishu - tempqishu - 1) == 6) {
								yilouSixInTop8.add(integer);
								break;
							}

							break;
						} else {
							logger.info("数字" + integer + "在"+tempqishu+"没出现");
							geshu=geshu+1;
							System.out.println(geshu);
							if(geshu==7){
								yilouSevenOrMoreInTop8.add(integer);
								break;
							}
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
			for (Integer integer : Templist) {
                int geshu=0;
				for (SixOne tempsixOne : sixonesTop9) { // 145,144,143,142
					if (tempsixOne.getQishu() < reallysixOne.getQishu()) {
						Integer tempqishu = tempsixOne.getQishu();
						Integer tempfirst = tempsixOne.getFirst();
						Integer tempsecond = tempsixOne.getSecond();
						Integer tempthird = tempsixOne.getThird();
						Integer tempfourth = tempsixOne.getFourth();
						Integer tempfifth = tempsixOne.getFifth();
						Integer tempsixth = tempsixOne.getSixth();
						Integer tempseventh = tempsixOne.getSeventh();

						if (integer == tempfirst || integer == tempsecond || integer == tempthird
								|| integer == tempfourth || integer == tempfifth || integer == tempsixth
								|| integer == tempseventh) {
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
							if ((qishu - tempqishu - 1) == 6) {
								yilouSixInTop9.add(integer);
								break;
							}
							if ((qishu - tempqishu - 1) == 7) {
								yilouSevenInTop9.add(integer);
								break;
							}
							break;
						} else {
							logger.info("数字" + integer + "在"+tempqishu+"没出现");
							geshu=geshu+1;
							System.out.println(geshu);
							if(geshu==8){
								yilouEightOrMoreInTop9.add(integer);
								break;
							}
						}

					}
				}

			}
		}
		logger.info("在过去5期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop5.toString());
		logger.info("在过去5期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop5.toString());
		logger.info("在过去5期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop5.toString());
		logger.info("在过去5期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop5.toString());
		logger.info("在过去5期中 遗漏次数 为 4 或者4 以上 :" + yilouFourOrMoreInTop5.toString());
		logger.info("---------------------------------------------------------");
		logger.info("在过去6期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop6.toString());
		logger.info("在过去6期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop6.toString());
		logger.info("在过去6期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop6.toString());
		logger.info("在过去6期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop6.toString());
		logger.info("在过去6期中 遗漏次数 为 4 数字有 :" + yilouFourInTop6.toString());
		logger.info("在过去6期中 遗漏次数 为 5 或者5以上 :" + yilouFiveOrMoreInTop6.toString());
		logger.info("---------------------------------------------------------");
		logger.info("在过去7期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 4 数字有 :" + yilouFourInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 5 数字有 :" + yilouFiveInTop7.toString());
		logger.info("在过去7期中 遗漏次数 为 6 或者 6以上 :" + yilouSixOrMoreInTop7.toString());
		logger.info("---------------------------------------------------------");
		logger.info("在过去8期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 4 数字有 :" + yilouFourInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 5 数字有 :" + yilouFiveInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 6 数字有 :" + yilouSixInTop8.toString());
		logger.info("在过去8期中 遗漏次数 为 7 或者7以上" + yilouSevenOrMoreInTop8.toString());
		logger.info("---------------------------------------------------------");
		logger.info("在过去9期中 遗漏次数 为 0的 数字有 :" + yilouZeroInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 1的 数字有 :" + yilouOneInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 2的 数字有 :" + yilouTwoInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 3的 数字有 :" + yilouThreeInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 4 数字有 :" + yilouFourInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 5 数字有 :" + yilouFiveInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 6 数字有 :" + yilouSixInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 7 的数字有" + yilouSevenInTop9.toString());
		logger.info("在过去9期中 遗漏次数 为 8 的或 8 以上" + yilouSevenInTop9.toString());
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
		List<StringBuilder> builders=new ArrayList<StringBuilder>();
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
			everyone.put("yilouqingkuang", stringBuilder);
			everyone.put("zongyilougeshu", (int) geshu);
			everyone.put("yiloucishuzongshu", yilouzongshu);
			everyone.put("yiloupingjungeshu", yilouzongshu / 7.f);
			logger.info("各个数字遗漏情况:" + stringBuilder);
			logger.info("本次遗漏次数在10以内的数字共有" + (int) geshu + "个");
			logger.info("本期遗漏的次数总数" + yilouzongshu);
			logger.info("本次遗漏平均个数为" + yilouzongshu / 7.f + "个");
			builders.add(stringBuilder);
			fenxijieguolist.add(everyone);
		}
		logger.info("分析结果");
		for (Map<String, Object> map : fenxijieguolist) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				logger.info("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
		logger.info("==============================================");
		logger.info(builders.toString());
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
			map.put("cha", even - even);
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
