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
<title>中期预算</title>
<script language="javascript" type="text/javascript"
	src="../jqplot/js/jquery.min.js"></script>
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
				<td>中期预测</td>
				<td>预测趋势图分析:<br> (1)遗漏次数为 0 ,1 近期成为热门数字 <br> (2)遗漏次数2
					符合反向层叠 <br> (3) 遗漏次数为3 先有热门数字边冷门再由冷门数字变热门<br></td>
				<td>预测结果</td>
			</tr>
		</thead>
		<tbody class="info">
			<tr>
				<td class="info">
					<h3>50期表格分析1</h3> <br />
					<button onclick="zhongqijisuan_first_step()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><table class="table table-bordered">
						<thead>
							<tr class="info">
								<td>期数</td>
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
							</tr>
						</thead>
						<tbody id="jiesuanTopFifty"></tbody>
					</table></td>
				<td><h5>
						(1)技术矫正<br> <br> <br>
						(2)博彩趋势逆转:当一个冷门数字以一次中奖结束一个长期休眠期，然后又在间隔不超过期彩票的情况下再次中奖，这就说明该数字出现了博彩趋势逆转,趋势逆转使得一个冷门数字变成了一个热门数字！。有以下4种模式:以XX,X1X,X2X,X3X<br>
						<br> <br> (3)层叠 :举个例子来说，某个数字可能遗漏 3期，然后中奖一次；再遗漏5
						期，然后又中奖一次；接着，又遗漏20或 30期彩票，直到出现间隔3
						期或3期以下遗漏的标准期趋势逆转，才标志着一个层叠模式的终结。经过这一过程之后，这个数字会热门起来。<br> <br>
						<br>
						(4)反向层叠:指的是在两次中奖之间在持续时间上递减的遗漏时段情况。这种层叠通常表明，某个数字正在接近终结其下滑趋势，而变成一个热门数字。<br>
						<br> <br> (5)双底:如果某个数字在双底之后遗漏了2期或3期，你就应该放弃对这个数字的选择。<br>
						<br> <br> (6)旗式排列:一个典型的旗式排列，在你的彩票期数表当中看起来是这样的X2X5X5X
						,,,XX5,,,X1X5,,,X2X5
						如果你找到了符合上述某一模式的数字，那么你就可以推断一个旗式排列的上半部分将会出现。在这种情况下，你就可以预测这个数字将在第5次遗漏之后中奖
						旗式排列偶尔也会出现重复，在这种情况下，完整的旗式排列模式在彩票期数表中看起来是这样的：X2X5X5X1X5X5X<br>
						<br> <br>
						
					</h5> <table class="table table-bordered">
					       <thead ><tr class="info"><td>号码</td><td>模式</td></tr></thead>
					       <tbody id="showmoshi"></tbody>
					      </table><br></td>
			</tr>
			<tr>
				<td class="info">
					<h3>50期表格分析2</h3> <br />
					<button onclick="zhongqijisuan_first_step2()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td colspan="2"><table class="table table-bordered">
						<thead id="jiesuanTopFiftyfiftythead">

						</thead>
						<tbody id="jiesuanTopFiftyfiftytbody">
						</tbody>
					</table></td>

			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>

		</tbody>
	</table>



	<!-- 中期预算 1-->
	<script type="text/javascript">
		function zhongqijisuan_first_step() {

			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionZhongQiFirst.action',
						dataType : "json",
						success : function(data) {
							alert(data);
							$("#jiesuanTopFifty").empty();
							var json = eval('(' + data + ')');
							console.log(json["name"][0]);
							for (var i = 0; i < json["name"].length; i++) {
								var trHtml = '<tr>';
								for (var j = 0; j < json["name"][i].length; j++) {
									if (j == 0) {
										var tdHtml = '<td class="success">'
												+ json["name"][i][j] + '</td>';
									} else if (json["name"][i][j] == "--") {
										var tdHtml = '<td>'
												+ json["name"][i][j] + '</td>';
									} else {
										var tdHtml = '<td class="success">'
												+ json["name"][i][j] + '</td>';
									}
									trHtml += tdHtml;
								}
								trHtml += '</tr>';
								$("#jiesuanTopFifty").append(trHtml);
							}
							for (var i = 0; i < json["listsmoshi"].length; i++) {
								var trHtml = '<tr>';
								var tdHtml = '<td class="success">';
								for (var j = 0; j < json["listsmoshi"][i].length; j++) {
									if(j==0){
										tdHtml += json["listsmoshi"][i][j] + '</td><td class="info">';
										continue;
									}else{
										tdHtml += json["listsmoshi"][i][j];
									}
								}
								tdHtml += '</td>';
								trHtml += tdHtml;
								trHtml += '</tr>';
								$("#showmoshi").append(trHtml);
							}
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>


	<!-- 中期预算 2-->
	<script type="text/javascript">
		function zhongqijisuan_first_step2() {

			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionZhongQiSecond.action',

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

</body>



</html>