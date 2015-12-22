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

import javax.annotation.Resource;

import com.sun.star.bridge.oleautomation.Date;
import com.sun.star.io.IOException;
import com.web.pojo.SixOne;
import com.web.services.SixOneServices;
import com.web.yuce.common.utils.DuanQiCommonUtils;

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
	 * 热门冷门数字偏差追踪系统
	 */
	public String futureColdHot() {
		logger.info("----------------------futureColdHot");
		List<SixOne> sixonesTop10 = SixOneServices.way6();
		Iterator<SixOne> iter = sixonesTop10.iterator();
		List<SixOne> temps;

		while (iter.hasNext()) {

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
			for (Integer integer : IntegerS) {
				logger.info("被找寻的数字--------------第" + qishu + "的" + integer);
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
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempsecond) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempthird) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						yilouzongshu += qishu - tempqishu - 1;
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempfourth) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempfifth) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempsixth) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} else if (integer == tempseventh) {
						logger.info("数字" + integer + "在第" + tempqishu + "期出现");
						logger.info("数字" + integer + "的遗忘间隔次数为" + (qishu - tempqishu - 1));
						yilouzongshu += qishu - tempqishu - 1;
						if ((qishu - tempqishu - 1) < 10) {
							geshu += 1.f;
						}
						logger.info("------------------------------------");
						break;
					} 

				}
			}
			logger.info("本次遗漏次数在10以内的数字共有" + (int) geshu + "个");
			logger.info("本期遗漏的次数总数" + yilouzongshu);
			logger.info("本次遗漏平均个数为" + yilouzongshu / geshu + "个");
		}

		return "FUTURECOLDHOTSUCCESS";
	}

	/**
	 * 奇数偶数偏差系统分析
	 */
	public String futureOddEven() {
		List<SixOne> sixonesTop10 = SixOneServices.way5();
		String top10json = DuanQiCommonUtils.do_from_odd_even(sixonesTop10);
		logger.info(TAG + "------------" + top10json);
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
