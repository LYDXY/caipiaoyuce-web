package com.web.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.sun.star.bridge.oleautomation.Date;
import com.sun.star.io.IOException;
import com.web.pojo.SixOne;
import com.web.services.SixOneServices;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 */
public class SixOneAction extends BaseAction {

	private String TAG = "SixOneAction";
	private static final long serialVersionUID = 1L;

	@Resource(name = "SixOneServices") // 接口的实现
	private SixOneServices SixOneServices; // 服务层的接口

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
		sixone = new SixOne();
		sixone.setQishu(3);
		sixone.setFirst(13);
		sixone.setSecond(45);
		sixone.setThird(21);
		sixone.setFourth(46);
		sixone.setFifth(7);
		sixone.setSixth(10);
		sixone.setSeventh(19);
		boolean b = SixOneServices.way2(sixone);
		if (b) {
			return "ADD_SIXONE_SUCCESS";
		} else {
			return "ADD_SIXONE_FALSE";
		}

	}

	// 分页查询
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
	//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//	SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
		for (int i = 0; i < all_sixones.size(); i++) {
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("XH", all_sixones.get(i).getQishu()+"");
			map.put("ID", all_sixones.get(i).getFirst()+"");
			map.put("CHAR", all_sixones.get(i).getSecond()+"");
			map.put("TEXT",all_sixones.get(i).getThird()+"");
			map.put("DATE", all_sixones.get(i).getFirst()+"");
			map.put("TIME", all_sixones.get(i).getSixth()+"");
			map.put("NUM", all_sixones.get(i).getSeventh()+"");
			data.add(map);
		}
		// sort 要排序的列
		if ("XH".equals(sortName) || "ID".equals(sortName)) {
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
		} else if ("XH,ID".equals(sortName)) {
			Collections.sort(data, new Comparator<Map<String, Object>>() {
				public int compare(Map<String, Object> map1, Map<String, Object> map2) {
					int xhCp = Integer.parseInt(map1.get("XH").toString())
							- Integer.parseInt(map2.get("XH").toString());
					int idCp = Integer.parseInt(map1.get("ID").toString())
							- Integer.parseInt(map2.get("ID").toString());

					if (sortOrder.equals("asc,asc")) {
						return xhCp == 0 ? idCp : xhCp;
					} else if (sortOrder.equals("asc,desc")) {
						return xhCp == 0 ? -idCp : xhCp;
					} else if (sortOrder.equals("desc,asc")) {
						return xhCp == 0 ? idCp : -xhCp;
					} else if (sortOrder.equals("desc,desc")) {
						return xhCp == 0 ? -idCp : -xhCp;
					}
					return 0;
				}
			});
		}

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
			jsonSb.append("\"XH\": ").append(map.get("XH")).append(",");
			jsonSb.append("\"ID\": ").append(map.get("ID")).append(",");
			jsonSb.append("\"CHAR\": \"").append(map.get("CHAR")).append("\",");
			jsonSb.append("\"TEXT\": \"").append(map.get("TEXT")).append("\",");
			jsonSb.append("\"DATE\": \"").append(map.get("DATE")).append("\",");
			jsonSb.append("\"TIME\": \"").append(map.get("TIME")).append("\",");
			jsonSb.append("\"NUM\": ").append(map.get("NUM"));
			jsonSb.append("}");
		}

		jsonSb.append("]");
		jsonSb.append("}");
		out.print(jsonSb.toString());
		System.out.println(jsonSb.toString());

	}
}
