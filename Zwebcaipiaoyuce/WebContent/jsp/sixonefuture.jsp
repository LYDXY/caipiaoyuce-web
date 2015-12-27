<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	String path = request.getContextPath();
	String domain = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
	String basePath = domain + path;
	String host = request.getScheme() + "://" + request.getServerName();
	pageContext.setAttribute("ctx", path);
	pageContext.setAttribute("host", host);
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript" type="text/javascript"
	src="../jqplot/js/jquery.min.js"></script>
<script language="javascript" type="text/javascript"
	src="../jqplot/js/jquery.jqplot.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../jqplot/css/jquery.jqplot.css" />
<script src="../jqplot/js/plugins/jqplot.canvasAxisTickRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.canvasTextRenderer.js"></script>
<script src="../jqplot/js/plugins/jqplot.canvasAxisLabelRenderer.js"></script>
<script src="../jqplot/js/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.barRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.logAxisRenderer.js"></script>
<!-- 饼图 -->
<script src="../jqplot/js/plugins/jqplot.pieRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.donutRenderer.min.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr class="success">
				<td>短期预测</td>
				<td>预测趋势图分析</td>
				<td>预测结果</td>
			</tr>
		</thead>
		<tbody>
			<!-- 奇数偶数偏差系统分析 -->
			<tr>
				<td class="info">
					<h3>奇数偶数偏差系统分析</h3> <br />
					<button id="getjisoufenxijieguo" onclick="getjisoufenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chartgetjisoufenxijieguo"
						style="height: 400px; width: 900px;"></div></td>
				<td width="500px" >
					<table class="table">
						<thead>
							<tr>
								<td>总奇数</td>
								<td>总偶数</td>
								<td>差</td>
							</tr>
						</thead>
						<tr>
							<td id="zongjishu"></td>
							<td id="zongoushu"></td>
							<td id="zongcha"></td>

						</tr>
					</table>
				</td>
			</tr>
			<!-- 大数小数偏差系统分析 -->
			<tr>
				<td class="info">
					<h3>大数小数偏差系统分析</h3> <br />
					<button id="getdaxiaofenxijieguo" onclick="getdaxiaofenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chatgetdaxiaofenxijieguo"
						style="height: 400px; width: 900px;"></div></td>
				<td >
					<table class="table">
						<thead>
							<tr>
								<td>总大数</td>
								<td>总小数</td>
								<td>差</td>
							</tr>
						</thead>
						<tr>
							<td id="zongdashu"></td>
							<td id="zongxiaoshu"></td>
							<td id="zongdaxiaocha"></td>

						</tr>
					</table>
				</td>
			</tr>
			<!--末位数字偏差系统分析  -->
			<tr>
				<td class="info">
					<h3>末位数字偏差系统分析</h3> <br />
					<button id="getMoWeifenxijieguo" onclick="getjisouFutureMoWei()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td>
					<table class="table table-bordered" id="chartgetjisouFutureMoWei">
						<thead>
							<tr class="active">
								<td><h3>末位数字</h3></td>
								<td><h3>过去5期</h3></td>
								<td><h3>过去6期</h3></td>
								<td><h3>过去7期</h3></td>
								<td><h3>过去8期</h3></td>
								<td><h3>过去9期</h3></td>
							</tr>
						</thead>
						<tbody>
							<tr class="info">
								<td>0</td>
								<td id="future5zero"></td>
								<td id="future6zero"></td>
								<td id="future7zero"></td>
								<td id="future8zero"></td>
								<td id="future9zero"></td>
							</tr>
							<tr class="success">
								<td>1</td>
								<td id="future5one"></td>
								<td id="future6one"></td>
								<td id="future7one"></td>
								<td id="future8one"></td>
								<td id="future9one"></td>
							</tr>
							<tr class="info">
								<td>2</td>
								<td id="future5two"></td>
								<td id="future6two"></td>
								<td id="future7two"></td>
								<td id="future8two"></td>
								<td id="future9two"></td>
							</tr>
							<tr class="success">
								<td>3</td>
								<td id="future5three"></td>
								<td id="future6three"></td>
								<td id="future7three"></td>
								<td id="future8three"></td>
								<td id="future9three"></td>
							</tr>
							<tr class="info">
								<td>4</td>
								<td id="future5four"></td>
								<td id="future6four"></td>
								<td id="future7four"></td>
								<td id="future8four"></td>
								<td id="future9four"></td>
							</tr>
							<tr class="success">
								<td>5</td>
								<td id="future5five"></td>
								<td id="future6five"></td>
								<td id="future7five"></td>
								<td id="future8five"></td>
								<td id="future9five"></td>
							</tr>
							<tr class="info">
								<td>6</td>
								<td id="future5six"></td>
								<td id="future6six"></td>
								<td id="future7six"></td>
								<td id="future8six"></td>
								<td id="future9six"></td>
							</tr>
							<tr class="success">
								<td>7</td>
								<td id="future5seven"></td>
								<td id="future6seven"></td>
								<td id="future7seven"></td>
								<td id="future8seven"></td>
								<td id="future9seven"></td>
							</tr>
							<tr class="info">
								<td>8</td>
								<td id="future5eight"></td>
								<td id="future6eight"></td>
								<td id="future7eight"></td>
								<td id="future8eight"></td>
								<td id="future9eight"></td>
							</tr>
							<tr class="success">
								<td>9</td>
								<td id="future5nine"></td>
								<td id="future6nine"></td>
								<td id="future7nine"></td>
								<td id="future8nine"></td>
								<td id="future9nine"></td>
							</tr>
						</tbody>
					</table>
				<td ></td>
			</tr>
			<!-- 热门冷门数字偏差系统 -->
			<tr>
				<td class="info">
					<h3>热门冷门偏差系统分析</h3> <br />
					<button id="getremenlengmenfenxijieguo"
						onclick="getremenlengmenfenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td colspan="2"><table id="remenlengmenfenxi"
						class="table table-bordered">
						<thead>
							<tr>
								<td>期数</td>
								<td>开奖数字</td>
								<td>遗漏情况</td>
								<td>遗漏次数<10 的个数 (和)</td>
								<td>7个开奖数字的遗漏次数的和</td>
								<td>遗漏次数的和 / 7= 遗漏平均次数</td>
							</tr>
						</thead>
					</table></td>

			</tr>
			<!-- 遗漏数字偏差系统 -->
			<tr>
				<td class="info"><h3>遗漏数字偏差分析系统</h3> <br />
					<button onclick="getyiloufenxijieguo()"
						class="btn btn-primary btn-lg">执行</button></td>
				<td colspan="2"><table class="table table-bordered">
						<thead>
							<tr>
								<td><h4>过去期数</h4></td>
								<td><h4>遗漏次数为0</h4></td>
								<td><h4>遗漏次数为1</h4></td>
								<td><h4>遗漏次数为2</h4></td>
								<td><h4>遗漏次数为3</h4></td>
								<td><h4>遗漏次数为4</h4></td>
								<td><h4>遗漏次数为5</h4></td>
								<td><h4>遗漏次数为6-9</h4></td>
								<td><h4>遗漏次数为 &gt;=10</h4></td>
							</tr>

						</thead>
						<tbody>
							<tr>
								<td>过去5期</td>
								<td id=yilouZeroInTop5></td>
								<td id="yilouOneInTop5"></td>
								<td id="yilouTwoInTop5"></td>
								<td id="yilouThreeInTop5"></td>
								<td id="yilouFourInTop5"></td>
								<td id="yilouFiveInTop5"></td>
								<td id="yilouSixToNineInTop5"></td>
								<td id="yilouTenAndMoreInTop5"></td>
							</tr>
							<tr>
								<td>过去6期</td>
								<td id=yilouZeroInTop6></td>
								<td id="yilouOneInTop6"></td>
								<td id="yilouTwoInTop6"></td>
								<td id="yilouThreeInTop6"></td>
								<td id="yilouFourInTop6"></td>
								<td id="yilouFiveInTop6"></td>
								<td id="yilouSixToNineInTop6"></td>
								<td id="yilouTenAndMoreInTop6"></td>
							</tr>
							<tr>
								<td>过去7期</td>

								<td id=yilouZeroInTop7></td>
								<td id="yilouOneInTop7"></td>
								<td id="yilouTwoInTop7"></td>
								<td id="yilouThreeInTop7"></td>
								<td id="yilouFourInTop7"></td>
								<td id="yilouFiveInTop7"></td>
								<td id="yilouSixToNineInTop7"></td>
								<td id="yilouTenAndMoreInTop7"></td>
							</tr>
							<tr>
								<td>过去8期</td>

								<td id=yilouZeroInTop8></td>
								<td id="yilouOneInTop8"></td>
								<td id="yilouTwoInTop8"></td>
								<td id="yilouThreeInTop8"></td>
								<td id="yilouFourInTop8"></td>
								<td id="yilouFiveInTop8"></td>
								<td id="yilouSixToNineInTop8"></td>
								<td id="yilouTenAndMoreInTop8"></td>
							</tr>
							<tr>
								<td>过去9期</td>

								<td id=yilouZeroInTop9></td>
								<td id="yilouOneInTop9"></td>
								<td id="yilouTwoInTop9"></td>
								<td id="yilouThreeInTop9"></td>
								<td id="yilouFourInTop9"></td>
								<td id="yilouFiveInTop9"></td>
								<td id="yilouSixToNineInTop9"></td>
								<td id="yilouTenAndMoreInTop9"></td>
							</tr>

						</tbody>
					</table></td>
				<td ></td>
			</tr>
			<!-- 和数值偏差系统分析 -->
			<tr>
				<td class="info">
					<h3>和数值偏差系统分析</h3> <br />
					<button id="getheshuzhifenxijieguo"
						onclick="getheshuzhifenxijieguo()" class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chartgetheshuzhifenxijieguo"
						style="width: 900px; height: 400px;"></div></td>
				<td ></td>
			</tr>
			<!-- 数字区间偏差分析系统 -->
			<tr>
				<td class="info">
					<h3>数字区间偏差分析系统</h3> <br />
					<button onclick="getshuziqujianfenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td colspan="2"><table class="table table-bordered"
						id="shuziqujianfenxitable">
						<thead>
							<tr>
								<td><h4>期数</h4></td>
								<td><h4>1&lt;=5</h4></td>
								<td><h4>6&lt;=10</h4></td>
								<td><h4>11&lt;=15</h4></td>
								<td><h4>16&lt;=20</h4></td>
								<td><h4>21&lt;=25</h4></td>
								<td><h4>26&lt;=30</h4></td>
								<td><h4>31&lt;=35</h4></td>
								<td><h4>36&lt;=40</h4></td>
								<td><h4>41&lt;=45</h4></td>
								<td><h4>46&lt;=49</h4></td>

							</tr>
						</thead>
					</table></td>
			
			</tr>
			<tr>
				<td class="info"></td>
				<td><div id="chart6" style="width: 600px; height: 400px;"></div></td>
				<td ></td>
			</tr>


		</tbody>
	</table>








	<!-- 大数小数偏差系统分析-->
	<script type="text/javascript">
		function getdaxiaofenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureBigSmall.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							BIGSHU = json.integersBIG;
							SMALLSHU = json.integersSMALL;

							ticks2 = json.qishulist;

							$("#zongdashu").html(json.zongbig);
							$("#zongxiaoshu").html(json.zongsmall);
							$("#zongdaxiaocha").html(json.cha);

							$
									.jqplot(
											'chatgetdaxiaofenxijieguo',
											[ BIGSHU, SMALLSHU ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '大数:>25'
												}, {
													label : '小数:<=25'
												} ],
												legend : {
													show : true,
													placement : 'outsideGrid'
												},
												title : {
													text : '大数小数偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 0, 1, 2, 3,
																4, 5, 6, 7, 8,
																9, 10 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 和数值偏差系统分析-->
	<script type="text/javascript">
		function getheshuzhifenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureHeShuzhi.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							heshuzhiList = json.heshuzhiList;
							middlesumiList = json.middlesumiList;
							ticks2 = json.qishulist;
							$
									.jqplot(
											'chartgetheshuzhifenxijieguo',
											[ heshuzhiList, middlesumiList ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '和数值 :每一期的数字之和'
												}, {
													label : '和中值 :175'
												} ],
												legend : {
													show : true,
													placement : 'outsideGrid'
												},
												title : {
													text : '和数值偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 105, 110,
																115, 120, 125,
																130, 135, 140,
																145, 150, 155,
																160, 165, 170,
																175, 180, 185,
																190, 195, 200,
																205, 210, 215,
																220, 225, 230,
																235, 240, 245,
																250, 255, 260 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 奇数偶数偏差系统分析-->
	<script type="text/javascript">
		function getjisoufenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureOddEven.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							JISHU = json.integersODD;
							OUSHU = json.integersEVEN;
							ticks2 = json.qishulist;
							$("#zongjishu").html(json.odd);
							$("#zongoushu").html(json.even);
							$("#zongcha").html(json.cha);
							//显示图表
							$
									.jqplot(
											'chartgetjisoufenxijieguo',
											[ JISHU, OUSHU ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '奇数'
												}, {
													label : '偶数'
												} ],
												legend : {
													show : true,
													// 设置标识在图表外，元素内（在canvas内）
													placement : 'outsideGrid'
												},
												title : {
													text : '奇数偶数偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 0, 1, 2, 3,
																4, 5, 6, 7, 8,
																9, 10 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 末位数字偏差系统分析-->
	<script type="text/javascript">
		function getjisouFutureMoWei() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureMoWei.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							$("#future5zero").html(json.zeroTop5);
							$("#future5one").html(json.oneTop5);
							$("#future5two").html(json.twoTop5);
							$("#future5three").html(json.threeTop5);
							$("#future5four").html(json.fourTop5);
							$("#future5five").html(json.fiveTop5);
							$("#future5six").html(json.sixTop5);
							$("#future5seven").html(json.sevenTop5);
							$("#future5eight").html(json.eightTop5);
							$("#future5nine").html(json.nineTop5);
							$("#future6zero").html(json.zeroTop6);
							$("#future6one").html(json.oneTop6);
							$("#future6two").html(json.twoTop6);
							$("#future6three").html(json.threeTop6);
							$("#future6four").html(json.fourTop6);
							$("#future6five").html(json.fiveTop6);
							$("#future6six").html(json.sixTop6);
							$("#future6seven").html(json.sevenTop6);
							$("#future6eight").html(json.eightTop6);
							$("#future6nine").html(json.nineTop6);
							$("#future7zero").html(json.zeroTop7);
							$("#future7one").html(json.oneTop7);
							$("#future7two").html(json.twoTop7);
							$("#future7three").html(json.threeTop7);
							$("#future7four").html(json.fourTop7);
							$("#future7five").html(json.fiveTop7);
							$("#future7six").html(json.sixTop7);
							$("#future7seven").html(json.sevenTop7);
							$("#future7eight").html(json.eightTop7);
							$("#future7nine").html(json.nineTop7);
							$("#future8zero").html(json.zeroTop8);
							$("#future8one").html(json.oneTop8);
							$("#future8two").html(json.twoTop8);
							$("#future8three").html(json.threeTop8);
							$("#future8four").html(json.fourTop8);
							$("#future8five").html(json.fiveTop8);
							$("#future8six").html(json.sixTop8);
							$("#future8seven").html(json.sevenTop8);
							$("#future8eight").html(json.eightTop8);
							$("#future8nine").html(json.nineTop8);
							$("#future9zero").html(json.zeroTop9);
							$("#future9one").html(json.oneTop9);
							$("#future9two").html(json.twoTop9);
							$("#future9three").html(json.threeTop9);
							$("#future9four").html(json.fourTop9);
							$("#future9five").html(json.fiveTop9);
							$("#future9six").html(json.sixTop9);
							$("#future9seven").html(json.sevenTop9);
							$("#future9eight").html(json.eightTop9);
							$("#future9nine").html(json.nineTop9);
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 热门冷门数字偏差系统分析-->
	<script type="text/javascript">
		function getremenlengmenfenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureColdHot.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							alert(data);
							for (i = 0; i < json.length; i++) { //行数跟json.length一样
								var tr = document.createElement("tr");//创建每一行
								var tdqishu = document.createElement("td"); //创建单元格子
								var tdnumber = document.createElement("td"); //创建单元格子
								var tdyilouqingkuang = document
										.createElement("td"); //创建单元格子
								var tdzongyilougeshu = document
										.createElement("td"); //创建单元格子
								var tdyiloucishuzongshu = document
										.createElement("td"); //创建单元格子
								var tdyiloupingjungeshu = document
										.createElement("td"); //创建单元格子
								tdqishu.innerHTML = json[i].qishu;
								tdnumber.innerHTML = json[i].number;
								tdyilouqingkuang.innerHTML = json[i].yilouqingkuang;
								tdzongyilougeshu.innerHTML = json[i].zongyilougeshu;
								tdyiloucishuzongshu.innerHTML = json[i].yiloucishuzongshu;
								tdyiloupingjungeshu.innerHTML = json[i].yiloupingjungeshu;
								tr.appendChild(tdqishu);
								tr.appendChild(tdnumber);
								tr.appendChild(tdyilouqingkuang);
								tr.appendChild(tdzongyilougeshu);
								tr.appendChild(tdyiloucishuzongshu);
								tr.appendChild(tdyiloupingjungeshu);
								document.getElementById("remenlengmenfenxi")
										.appendChild(tr);
							}

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 数字区间偏差系统分析 -->
	<script type="text/javascript">
		function getshuziqujianfenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureShuZiQuJian.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							alert(data);
							for (i = 0; i < json.length; i++) { //行数跟json.length一样
								var tr = document.createElement("tr");//创建每一行
								var tdqishu = document.createElement("td"); //创建单元格子
								tdqishu.innerHTML = json[i].qishu;
								tr.appendChild(tdqishu);
								for (j = 0; j < json[i].qujianqingkuang.length; j++) {
									var td = document.createElement("td"); //创建单元格子
									td.innerHTML = json[i].qujianqingkuang[j];
									if(json[i].qujianqingkuang[j]==0){
										td.style.backgroundColor = "gray";
									}
									tr.appendChild(td);
								}
								document
										.getElementById("shuziqujianfenxitable")
										.appendChild(tr);
							}

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>

	<!-- 遗漏数字偏差系统分析 -->
	<script type="text/javascript">
		function getyiloufenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureYiLou.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							//alert(data);
							$("#yilouZeroInTop5").html(json.yilouZeroInTop5);
							$("#yilouOneInTop5").html(json.yilouOneInTop5);
							$("#yilouTwoInTop5").html(json.yilouTwoInTop5);
							$("#yilouThreeInTop5").html(json.yilouThreeInTop5);
							$("#yilouFourInTop5").html(json.yilouFourInTop5);
							$("#yilouFiveInTop5").html(json.yilouFiveInTop5);
							$("#yilouSixToNineInTop5").html(
									json.yilouSixToNineInTop5);
							$("#yilouTenAndMoreInTop5").html(
									json.yilouTenAndMoreInTop5);

							$("#yilouZeroInTop6").html(json.yilouZeroInTop6);
							$("#yilouOneInTop6").html(json.yilouOneInTop6);
							$("#yilouTwoInTop6").html(json.yilouTwoInTop6);
							$("#yilouThreeInTop6").html(json.yilouThreeInTop6);
							$("#yilouFourInTop6").html(json.yilouFourInTop6);
							$("#yilouFiveInTop6").html(json.yilouFiveInTop6);
							$("#yilouSixToNineInTop6").html(
									json.yilouSixToNineInTop6);
							$("#yilouTenAndMoreInTop6").html(
									json.yilouTenAndMoreInTop6);

							$("#yilouZeroInTop7").html(json.yilouZeroInTop7);
							$("#yilouOneInTop7").html(json.yilouOneInTop7);
							$("#yilouTwoInTop7").html(json.yilouTwoInTop7);
							$("#yilouThreeInTop7").html(json.yilouThreeInTop7);
							$("#yilouFourInTop7").html(json.yilouFourInTop7);
							$("#yilouFiveInTop7").html(json.yilouFiveInTop7);
							$("#yilouSixToNineInTop7").html(
									json.yilouSixToNineInTop7);
							$("#yilouTenAndMoreInTop7").html(
									json.yilouTenAndMoreInTop7);

							$("#yilouZeroInTop8").html(json.yilouZeroInTop8);
							$("#yilouOneInTop8").html(json.yilouOneInTop8);
							$("#yilouTwoInTop8").html(json.yilouTwoInTop8);
							$("#yilouThreeInTop8").html(json.yilouThreeInTop8);
							$("#yilouFourInTop8").html(json.yilouFourInTop8);
							$("#yilouFiveInTop8").html(json.yilouFiveInTop8);
							$("#yilouSixToNineInTop8").html(
									json.yilouSixToNineInTop8);
							$("#yilouTenAndMoreInTop8").html(
									json.yilouTenAndMoreInTop8);

							$("#yilouZeroInTop9").html(json.yilouZeroInTop9);
							$("#yilouOneInTop9").html(json.yilouOneInTop9);
							$("#yilouTwoInTop9").html(json.yilouTwoInTop9);
							$("#yilouThreeInTop9").html(json.yilouThreeInTop9);
							$("#yilouFourInTop9").html(json.yilouFourInTop9);
							$("#yilouFiveInTop9").html(json.yilouFiveInTop9);
							$("#yilouSixToNineInTop9").html(
									json.yilouSixToNineInTop9);
							$("#yilouTenAndMoreInTop9").html(
									json.yilouTenAndMoreInTop9);

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
</body>
</html>