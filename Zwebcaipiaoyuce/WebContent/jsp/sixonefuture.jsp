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
<script src="../jqplot/js/plugins/jqplot.cursor.js"></script>
<!-- 饼图 -->
<script src="../jqplot/js/plugins/jqplot.pieRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.donutRenderer.min.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!-- <style type="text/css">
td{text-align: center;}
</style> -->
</head>
<body>
	<table class="table table-bordered">
		<tbody>
			<!-- 奇数偶数偏差系统分析 -->
			<tr>
				<td class="info">
					<button id="getjisoufenxijieguo" onclick="getjisoufenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td></td>
				<td width="500px">
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
					<button id="getdaxiaofenxijieguo" onclick="getdaxiaofenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td></td>
				<td>
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
					<h3></h3> <br />
					<button id="getMoWeifenxijieguo" onclick="getjisouFutureMoWei()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td>从过去到现在:
					<table class="table table-bordered" id="smallToBigFutureMoWei">
						<thead>
							<tr class="active">
								<td>0</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
								<td>8</td>
								<td>9</td>
							</tr>
						</thead>
						<tbody id="oooooooo1">
						</tbody>
					</table> 从现在到过去:
					<table class="table table-bordered" id="bigToSmallFutureMoWei">
						<thead>
							<tr class="active">
								<td>0</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
								<td>8</td>
								<td>9</td>
							</tr>
						</thead>
						<tbody id="oooooooo2">
						</tbody>
					</table>

				</td>
				<td>从过去到现在:
					<table class="table table-bordered" id="smallToBigFutureTouBu">
						<thead>
							<tr class="active">
								<td>0</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
							</tr>
						</thead>
						<tbody id="oooooooo3">
						</tbody>
					</table> 从现在到过去:
					<table class="table table-bordered" id="bigToSmallFutureTouBu">
						<thead>
							<tr class="active">
								<td>0</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
							</tr>
						</thead>
						<tbody id="oooooooo4">
						</tbody>
					</table>
				</td>
			</tr>
			<!-- 热门冷门数字偏差系统 -->
			<tr>
				<td class="info">
					<button id="getremenlengmenfenxijieguo"
						onclick="getremenlengmenfenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><table id="remenlengmenfenxi" class="table table-bordered">
						<thead>
							<tr>
								<td>期数</td>
								<td>开奖数字</td>
								<td>遗漏情况</td>
								<td>遗漏情况排序</td>
								<td>遗漏次数&lt;10 的个数 (和)</td>
								<td>7个开奖数字的遗漏次数的和</td>
								<td>遗漏次数的和 除以 7= 遗漏平均次数</td>
							</tr>
						</thead>
					</table> 从过去到现在
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>00</td>
								<td>01</td>
								<td>02</td>
								<td>03</td>
								<td>04</td>
								<td>05</td>
								<td>06</td>
								<td>07</td>
								<td>08</td>
								<td>09</td>
								<td>10</td>
								<td>11</td>
								<td>12</td>
								<td>13</td>
								<td>14</td>
								<td>15</td>
								<td>16</td>
								<td>17</td>
								<td>18</td>
								<td>19</td>
								<td>20</td>
								<td>21</td>
								<td>22</td>
								<td>23</td>
								<td>24</td>
								<td>25</td>
								<td>26</td>
								<td>27</td>
								<td>28</td>
								<td>29</td>
								<td>30</td>
								<td>31</td>
								<td>32</td>
								<td>33</td>
								<td>34</td>
								<td>35</td>
								<td>36</td>
								<td>37</td>
								<td>38</td>
								<td>39</td>
								<td>40</td>
								<td>41</td>
								<td>42</td>
								<td>43</td>
								<td>44</td>
								<td>45</td>
								<td>46</td>
								<td>47</td>
								<td>48</td>
								<td>49</td>
								<td>50</td>
							</tr>
						</thead>
						<tbody id="uuuuuuu">
						</tbody>
					</table> 从现在到过去
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>00</td>
								<td>01</td>
								<td>02</td>
								<td>03</td>
								<td>04</td>
								<td>05</td>
								<td>06</td>
								<td>07</td>
								<td>08</td>
								<td>09</td>
								<td>10</td>
								<td>11</td>
								<td>12</td>
								<td>13</td>
								<td>14</td>
								<td>15</td>
								<td>16</td>
								<td>17</td>
								<td>18</td>
								<td>19</td>
								<td>20</td>
								<td>21</td>
								<td>22</td>
								<td>23</td>
								<td>24</td>
								<td>25</td>
								<td>26</td>
								<td>27</td>
								<td>28</td>
								<td>29</td>
								<td>30</td>
								<td>31</td>
								<td>32</td>
								<td>33</td>
								<td>34</td>
								<td>35</td>
								<td>36</td>
								<td>37</td>
								<td>38</td>
								<td>39</td>
								<td>40</td>
								<td>41</td>
								<td>42</td>
								<td>43</td>
								<td>44</td>
								<td>45</td>
								<td>46</td>
								<td>47</td>
								<td>48</td>
								<td>49</td>
								<td>50</td>
							</tr>
						</thead>
						<tbody id="sssssssssss">
						</tbody>
					</table></td>

				<td><table class="table table-bordered">

						<thead>
							<tr>
								<td><button onclick="getclearYiLouMoShi()" type="button"
										class="btn btn-primary btn-lg">执行</button></td>
								<td colspan="7">未来模式</td>
							</tr>
						</thead>
						<tbody id="cleartbody">


						</tbody>
					</table>
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>最新40期遗漏情况进行排序后结果</td>
							</tr>
						</thead>
						<tbody id="qqqqqqq">
						</tbody>
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
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为1</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为2</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为3</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为4</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为5</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为6-9</h4></td>
								<td><h4>符合条件的数字</h4></td>
								<td><h4>遗漏次数为 &gt;=10</h4></td>
								<td><h4>符合条件的数字</h4></td>
							</tr>

						</thead>
						<tbody>
							<tr>
								<td>过去5期</td>
								<td id=yilouZeroInTop5></td>
								<td id=sixonesTop5fuhetijianZero class="success"></td>
								<td id="yilouOneInTop5"></td>
								<td id=sixonesTop5fuhetijianOne class="success"></td>
								<td id="yilouTwoInTop5"></td>
								<td id=sixonesTop5fuhetijianTwo class="success"></td>
								<td id="yilouThreeInTop5"></td>
								<td id=sixonesTop5fuhetijianThree class="success"></td>
								<td id="yilouFourInTop5"></td>
								<td id=sixonesTop5fuhetijianfour class="success"></td>
								<td id="yilouFiveInTop5"></td>
								<td id=sixonesTop5fuhetijianfive class="success"></td>
								<td id="yilouSixToNineInTop5"></td>
								<td class="success"></td>
								<td id="yilouTenAndMoreInTop5"></td>
								<td class="success"></td>
							</tr>
							<tr>
								<td>过去6期</td>
								<td id=yilouZeroInTop6></td>
								<td id=sixonesTop6fuhetijianZero class="success"></td>
								<td id="yilouOneInTop6"></td>
								<td id=sixonesTop6fuhetijianOne class="success"></td>
								<td id="yilouTwoInTop6"></td>
								<td id=sixonesTop6fuhetijianTwo class="success"></td>
								<td id="yilouThreeInTop6"></td>
								<td id=sixonesTop6fuhetijianThree class="success"></td>
								<td id="yilouFourInTop6"></td>
								<td id=sixonesTop6fuhetijianfour class="success"></td>
								<td id="yilouFiveInTop6"></td>
								<td id=sixonesTop6fuhetijianfive class="success"></td>
								<td id="yilouSixToNineInTop6"></td>
								<td id="sixonesTop6fuhetijiansix" class="success"></td>
								<td id="yilouTenAndMoreInTop6"></td>
								<td class="success"></td>
							</tr>
							<tr>
								<td>过去7期</td>

								<td id=yilouZeroInTop7></td>
								<td id=sixonesTop7fuhetijianZero class="success"></td>
								<td id="yilouOneInTop7"></td>
								<td id=sixonesTop7fuhetijianOne class="success"></td>
								<td id="yilouTwoInTop7"></td>
								<td id=sixonesTop7fuhetijianTwo class="success"></td>
								<td id="yilouThreeInTop7"></td>
								<td id=sixonesTop7fuhetijianThree class="success"></td>
								<td id="yilouFourInTop7"></td>
								<td id=sixonesTop7fuhetijianfour class="success"></td>
								<td id="yilouFiveInTop7"></td>
								<td id=sixonesTop7fuhetijianfive class="success"></td>
								<td id="yilouSixToNineInTop7"></td>
								<td id="sixonesTop7fuhetijiansix" class="success"></td>
								<td id="yilouTenAndMoreInTop7"></td>
								<td class="success"></td>
							</tr>
							<tr>
								<td>过去8期</td>

								<td id=yilouZeroInTop8></td>
								<td id=sixonesTop8fuhetijianZero class="success"></td>
								<td id="yilouOneInTop8"></td>
								<td id=sixonesTop8fuhetijianOne class="success"></td>
								<td id="yilouTwoInTop8"></td>
								<td id=sixonesTop8fuhetijianTwo class="success"></td>
								<td id="yilouThreeInTop8"></td>
								<td id=sixonesTop8fuhetijianThree class="success"></td>
								<td id="yilouFourInTop8"></td>
								<td id=sixonesTop8fuhetijianfour class="success"></td>
								<td id="yilouFiveInTop8"></td>
								<td id=sixonesTop8fuhetijianfive class="success"></td>
								<td id="yilouSixToNineInTop8"></td>
								<td id="sixonesTop8fuhetijiansix" class="success"></td>
								<td id="yilouTenAndMoreInTop8"></td>
								<td class="success"></td>
							</tr>
							<tr>
								<td>过去9期</td>

								<td id=yilouZeroInTop9></td>
								<td id=sixonesTop9fuhetijianZero class="success"></td>
								<td id="yilouOneInTop9"></td>
								<td id=sixonesTop9fuhetijianOne class="success"></td>
								<td id="yilouTwoInTop9"></td>
								<td id=sixonesTop9fuhetijianTwo class="success"></td>
								<td id="yilouThreeInTop9"></td>
								<td id=sixonesTop9fuhetijianThree class="success"></td>
								<td id="yilouFourInTop9"></td>
								<td id=sixonesTop9fuhetijianfour class="success"></td>
								<td id="yilouFiveInTop9"></td>
								<td id=sixonesTop9fuhetijianfive class="success"></td>
								<td id="yilouSixToNineInTop9"></td>
								<td id="sixonesTop9fuhetijiansix" class="success"></td>
								<td id="yilouTenAndMoreInTop9"></td>
								<td class="success"></td>
							</tr>

						</tbody>
					</table></td>
				<td></td>
			</tr>
			<!-- 和数值偏差系统分析 -->
			<tr>
				<td class="info">
					<button id="getheshuzhifenxijieguo"
						onclick="getheshuzhifenxijieguo()" class="btn btn-primary btn-lg">执行</button>
				</td>
				<td colspan="2"></td>

			</tr>
			<!-- 数字区间偏差分析系统 -->
			<tr>
				<td class="info">
					<button onclick="getshuziqujianfenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td>从过去到现在
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>1&lt;=5</td>
								<td>6&lt;=10</td>
								<td>11&lt;=15</td>
								<td>16&lt;=20</td>
								<td>21&lt;=25</td>
								<td>26&lt;=30</td>
								<td>31&lt;=35</td>
								<td>36&lt;=40</td>
								<td>41&lt;=45</td>
								<td>46&lt;=49</td>

							</tr>
						</thead>
						<tbody id="shuziqujianfenxitable1"></tbody>
					</table>
				</td>
				<td>从现在到过去
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>1&lt;=5</td>
								<td>6&lt;=10</td>
								<td>11&lt;=15</td>
								<td>16&lt;=20</td>
								<td>21&lt;=25</td>
								<td>26&lt;=30</td>
								<td>31&lt;=35</td>
								<td>36&lt;=40</td>
								<td>41&lt;=45</td>
								<td>46&lt;=49</td>

							</tr>
						</thead>
						<tbody id="shuziqujianfenxitable2"></tbody>
					</table>
				</td>
			</tr>
			<!-- 统计过去十期出现的数字,越靠前表明最近才出现 -->
			<tr>
				<td class="info">
					<button onclick="getshuzitongjiguoqutenjieguo()"
						class="btn btn-primary btn-lg">执行</button></td>
				<td>统计过去十期以内的数字,越靠前表明最近才出现<table id="lasttenTable" class="table table-bordered"></table></td>
				<td>统计过去十期以外的数字,越靠前表明最近才出现<table id="notInlasttenTable" class="table table-bordered"></table></td>
			</tr>
			<!-- 请输入需要组合的数字-->
			<tr>
				<td colspan="2"><form id="choosenNumbersform">
						<div class="form-group">
							<label for="choosenNumbers">需要组合的数字,连续输入,用"-"隔开,如
								12-45-32-12-45-6-7</label> <input class="form-control"
								id="choosenNumbers">
						</div>
						<button type="button" onclick="getChoosenshuzitenjieguo()"
							class="btn btn-default">确定</button>

					</form></td>
				<td><table id="zuhejieguo" class="table table-bordered"></table></td>
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
							alert(data);
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
							alert(data);
							var json = eval('(' + data + ')');

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
							alert(data);
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

							alert(data);
							var json = eval('(' + data + ')');
							//	alert(json.weibulistsmalltobig);
							//	alert(json.weibulistbigtosmall);
							//	alert(json.toubulistsmalltobig);
							//	alert(json.toubulistbigtosmall);
							$("#oooooooo1").empty();
							$("#oooooooo2").empty();
							$("#oooooooo3").empty();
							$("#oooooooo4").empty();
							for (var i = 0; i < json.weibulistsmalltobig.length; i++) {
								var trHtml = '<tr>';
								for (var j = 0; j < json.weibulistsmalltobig[i].length; j++) {
									var tdHtml = '<td class="info">'
											+ json.weibulistsmalltobig[i][j];
									+'</td>';
									trHtml += tdHtml;

								}
								trHtml += '</tr>';
								$("#oooooooo1").append(trHtml);
							}
							for (var i = 0; i < json.weibulistbigtosmall.length; i++) {
								var trHtml = '<tr>';
								for (var j = 0; j < json.weibulistbigtosmall[i].length; j++) {
									var tdHtml = '<td class="info">'
											+ json.weibulistbigtosmall[i][j];
									+'</td>';
									trHtml += tdHtml;

								}
								trHtml += '</tr>';
								$("#oooooooo2").append(trHtml);
							}
							for (var i = 0; i < json.toubulistsmalltobig.length; i++) {
								var trHtml = '<tr>';
								for (var j = 0; j < json.toubulistsmalltobig[i].length; j++) {
									var tdHtml = '<td class="info">'
											+ json.toubulistsmalltobig[i][j];
									+'</td>';
									trHtml += tdHtml;

								}
								trHtml += '</tr>';
								$("#oooooooo3").append(trHtml);
							}
							for (var i = 0; i < json.toubulistbigtosmall.length; i++) {
								var trHtml = '<tr>';
								for (var j = 0; j < json.toubulistbigtosmall[i].length; j++) {
									var tdHtml = '<td class="info">'
											+ json.toubulistbigtosmall[i][j];
									+'</td>';
									trHtml += tdHtml;

								}
								trHtml += '</tr>';
								$("#oooooooo4").append(trHtml);
							}

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
							for (i = 0; i < json.length; i++) {
								var classType = '';
								i % 2 == 0 ? classType = 'info'
										: classType = 'success';
								if (i == json.length - 1) {
									//alert(json[i].aLists.length);

									for (var j = 0; j < json[i].aLists.length; j++) {
										if (j <= 5) {
											var trHtml = '<tr>';
											for (var k = 0; k < json[i].aLists[j].length; k++) {
												var tdHtml = '<td class="success">'
														+ json[i].aLists[j][k];
												+'</td>';
												trHtml += tdHtml;

											}
											trHtml += '</tr>';
											$("#sssssssssss").append(trHtml);

										} else {
											for (var k = 0; k < json[i].aLists[j].length; k++) {
												var trHtml = '<tr>';
												for (var k = 0; k < json[i].aLists[j].length; k++) {
													var tdHtml = '<td class="success">'
															+ json[i].aLists[j][k];
													+'</td>';
													trHtml += tdHtml;

												}
												trHtml += '</tr>';
												$("#uuuuuuu").append(trHtml);
											}
										}

									}

								} else {
									$("#remenlengmenfenxi")
											.append(
													'<tr class="'+classType+'">'
															+ '<td>'
															+ json[i].qishu
															+ '</td>'
															+ '<td>'
															+ json[i].number
															+ '</td>'
															+ '<td>'
															+ json[i].yilouqingkuang
															+ '</td>'
															+ '<td>'
															+ json[i].yilouqingkuangpaixu
															+ '</td>'
															+ '<td>'
															+ json[i].zongyilougeshu
															+ '</td>'
															+ '<td>'
															+ json[i].yiloucishuzongshu
															+ '</td>'
															+ '<td>'
															+ json[i].yiloupingjungeshu
															+ '</td>')
											+ '</tr>';
								}

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
							$("#shuziqujianfenxitable1").empty();
							$("#shuziqujianfenxitable1").empty();
							for(var i=0;i<json.zhengxu.length;i++){
								var trHtml = '<tr>';
								for(var j=0;j<json.zhengxu[i].length;j++){
									var tdHtml = '<td>'
										+ json.zhengxu[i][j] + '</td>';
								    trHtml += tdHtml;
								}
								trHtml += '</tr>';
								$("#shuziqujianfenxitable1").append(trHtml);
							}
							for(var i=0;i<json.fanxu.length;i++){
								var trHtml = '<tr>';
								for(var j=0;j<json.fanxu[i].length;j++){
									var tdHtml = '<td>'
										+ json.fanxu[i][j] + '</td>';
								    trHtml += tdHtml;
								}
								trHtml += '</tr>';
								$("#shuziqujianfenxitable2").append(trHtml);
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
							alert(data);
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

							//实际符合条件数字过去5 期
							$("#sixonesTop5fuhetijianZero").html(
									json.sixonesTop5fuhetijianZero);
							$("#sixonesTop5fuhetijianOne").html(
									json.sixonesTop5fuhetijianOne);
							$("#sixonesTop5fuhetijianTwo").html(
									json.sixonesTop5fuhetijianTwo);
							$("#sixonesTop5fuhetijianThree").html(
									json.sixonesTop5fuhetijianThree);
							$("#sixonesTop5fuhetijianfour").html(
									json.sixonesTop5fuhetijianfour);
							$("#sixonesTop5fuhetijianfive").html(
									json.sixonesTop5fuhetijianfive);
							//实际符合条件数字过去6期
							$("#sixonesTop6fuhetijianZero").html(
									json.sixonesTop6fuhetijianZero);
							$("#sixonesTop6fuhetijianOne").html(
									json.sixonesTop6fuhetijianOne);
							$("#sixonesTop6fuhetijianTwo").html(
									json.sixonesTop6fuhetijianTwo);
							$("#sixonesTop6fuhetijianThree").html(
									json.sixonesTop6fuhetijianThree);
							$("#sixonesTop6fuhetijianfour").html(
									json.sixonesTop6fuhetijianfour);
							$("#sixonesTop6fuhetijianfive").html(
									json.sixonesTop6fuhetijianfive);
							$("#sixonesTop6fuhetijiansix").html(
									json.sixonesTop6fuhetijiansix);
							//实际符合条件数字过去7期
							$("#sixonesTop7fuhetijianZero").html(
									json.sixonesTop7fuhetijianZero);
							$("#sixonesTop7fuhetijianOne").html(
									json.sixonesTop7fuhetijianOne);
							$("#sixonesTop7fuhetijianTwo").html(
									json.sixonesTop7fuhetijianTwo);
							$("#sixonesTop7fuhetijianThree").html(
									json.sixonesTop7fuhetijianThree);
							$("#sixonesTop7fuhetijianfour").html(
									json.sixonesTop7fuhetijianfour);
							$("#sixonesTop7fuhetijianfive").html(
									json.sixonesTop7fuhetijianfive);
							$("#sixonesTop7fuhetijiansix").html(
									json.sixonesTop7fuhetijiansix);
							//实际符合条件数字过去8期
							$("#sixonesTop8fuhetijianZero").html(
									json.sixonesTop8fuhetijianZero);
							$("#sixonesTop8fuhetijianOne").html(
									json.sixonesTop8fuhetijianOne);
							$("#sixonesTop8fuhetijianTwo").html(
									json.sixonesTop8fuhetijianTwo);
							$("#sixonesTop8fuhetijianThree").html(
									json.sixonesTop8fuhetijianThree);
							$("#sixonesTop8fuhetijianfour").html(
									json.sixonesTop8fuhetijianfour);
							$("#sixonesTop8fuhetijianfive").html(
									json.sixonesTop8fuhetijianfive);
							$("#sixonesTop8fuhetijiansix").html(
									json.sixonesTop8fuhetijiansix);
							//实际符合条件数字过去9期
							$("#sixonesTop9fuhetijianZero").html(
									json.sixonesTop9fuhetijianZero);
							$("#sixonesTop9fuhetijianOne").html(
									json.sixonesTop9fuhetijianOne);
							$("#sixonesTop9fuhetijianTwo").html(
									json.sixonesTop9fuhetijianTwo);
							$("#sixonesTop9fuhetijianThree").html(
									json.sixonesTop9fuhetijianThree);
							$("#sixonesTop9fuhetijianfour").html(
									json.sixonesTop9fuhetijianfour);
							$("#sixonesTop9fuhetijianfive").html(
									json.sixonesTop9fuhetijianfive);
							$("#sixonesTop9fuhetijiansix").html(
									json.sixonesTop9fuhetijiansix);

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>


	<!-- 统计过去10期的数字 -->
	<script type="text/javascript">
		function getshuzitongjiguoqutenjieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionTongJiTopTen.action',
						dataType : "json",
						success : function(data) {
							$("#lasttenTable").empty();
							$("#notInlasttenTable").empty();
							var json = eval('(' + data + ')');
							alert(data)
							var trHtml = '<tr>';
							for (var i = 0; i < json.integers.length; i++) {
								var tdHtml = '<td class="danger">'
										+ json.integers[i] + '</td>';
								trHtml += tdHtml;
							}
							trHtml += '</tr>';
							$("#lasttenTable").append(trHtml);

							var trHtml2 = '<tr>';
							for (var j = 0; j < json.integers2.length; j++) {
								var tdHtml2 = '<td class="info">'
										+ json.integers2[j] + '</td>';
								trHtml2 += tdHtml2;
							}
							trHtml2 += '</tr>';
							$("#notInlasttenTable").append(trHtml2);
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 需要组合的数字 -->
	<script type="text/javascript">
		function getChoosenshuzitenjieguo() {

			var choosenNumbers = new Array();
			var arr = $("#choosenNumbers").val().split('-');
			for ( var i in arr) {
				if (parseInt(arr[i]) > 49) {
					alert("数字:" + arr[i] + "不符合,请重新输入");
					return;
				}
			}

			var param = {
				choosenNumbers : $("#choosenNumbers").val()
			};
			alert(param.choosenNumbers);
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionMySelfZuHe.action',
						data : param,
						dataType : "json",
						success : function(data) {
							$("#zuhejieguo").empty();
							var json = eval('(' + data + ')');
							var trHtml = '<tr>', addNum = 1;
							for (var i = 0; i < json.zuhe.length; i++) {
								var tdHtml = '<td class="info">' + json.zuhe[i]
										+ '</td>';
								if (addNum == 5) {
									addNum = 1;
									trHtml += tdHtml + '</tr><tr>';
								} else {
									addNum++;
									trHtml += tdHtml;
								}

							}
							trHtml += '</tr>';
							$("#zuhejieguo").append(trHtml);

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>




	<!-- 获取清晰模式 -->
	<script type="text/javascript">
		function getclearYiLouMoShi() {

			//alert();

			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionClearYiLouMoShi.action',
						//	data : param,
						dataType : "json",
						success : function(data) {
							alert(data);
							//console.log(json.clear[0])
							var json = eval('(' + data + ')');
							$("#qqqqqqq").empty();
							$("#cleartbody").empty();
							for (var i = 0; i < json.clear.length; i++) {
								if (i < (json.clear.length - 1)) {
									var trHtml = '<tr>';
									var tdHtml = '';
									for (var j = 0; j < json.clear[i].length; j++) {
										tdHtml += '<td class="info">'
												+ json.clear[i][j] + '</td>';
									}
									trHtml += tdHtml;
									trHtml += '</tr>';
									$("#cleartbody").append(trHtml);
								}
								if (i == (json.clear.length - 1)) {
									for (var k = 0; k < json.clear[i].length; k++) {
										var trHtml = '<tr>';
										var tdHtml = '';
										tdHtml += '<td class="info">'
												+ json.clear[i][k] + '</td>';
										trHtml += tdHtml;
										trHtml += '</tr>';
										$("#qqqqqqq").append(trHtml);
									}

								}

							}

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});

		}
	</script>

</body>
</html>