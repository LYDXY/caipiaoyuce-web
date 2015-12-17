<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String domain = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
	String basePath = domain + path;
	String host = request.getScheme() + "://" + request.getServerName();
	pageContext.setAttribute("ctx", path);
	pageContext.setAttribute("host", host);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>href="${ pageContext.request.contextPath }/SixOneAction/SixOneActionGetSixOnes.action"</title>
<link type="text/css" rel="stylesheet" href="css/style1.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>

</head>
<body>

	<div class="top"></div>
	<div id="header">
		<div class="logo">***后台管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">张山</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">设置</a></li>
				<li><a href="">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>系统公告
					</h4>
					<div class="list-item none">
						<a href=''>系统公告1</a> <a href=''>系统公告2</a> <a href=''>系统公告3</a> <a
							href=''>系统公告4</a>
					</div>
				</li>
				<li>
					<h4 class="M2">
						<span></span>49选7(6+1)
					</h4>
					<div class="list-item none">

						<a href="javascript:SixOneActionGetSixOnes();">查询</a>

					</div>
				</li>
				<li>
					<h4 class="M3">
						<span></span>基础教学
					</h4>
					<div class="list-item none">
						<a href=''>基础教学1</a> <a href=''>基础教学2</a> <a href=''>基础教学3</a>
					</div>
				</li>
				<li>
					<h4 class="M4">
						<span></span>评论管理
					</h4>
					<div class="list-item none">
						<a href=''>评论管理1</a> <a href=''>评论管理2</a> <a href=''>评论管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M5">
						<span></span>调研问卷
					</h4>
					<div class="list-item none">
						<a href=''>调研问卷1</a> <a href=''>调研问卷2</a> <a href=''>调研问卷3</a>
					</div>
				</li>
				<li>
					<h4 class="M6">
						<span></span>数据统计
					</h4>
					<div class="list-item none">
						<a href=''>数据统计1</a> <a href=''>数据统计2</a> <a href=''>数据统计3</a>
					</div>
				</li>
				<li>
					<h4 class="M7">
						<span></span>奖励管理
					</h4>
					<div class="list-item none">
						<a href=''>奖励管理1</a> <a href=''>奖励管理2</a> <a href=''>奖励管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M8">
						<span></span>字典维护
					</h4>
					<div class="list-item none">
						<a href=''>字典维护1</a> <a href=''>字典维护2</a> <a href=''>字典维护3</a> <a
							href=''>字典维护4</a> <a href=''>字典维护5</a> <a href=''>字典维护6</a> <a
							href=''>字典维护7</a> <a href=''>字典维护8</a> <a href=''>字典维护9</a> <a
							href=''>字典维护4</a> <a href=''>字典维护5</a> <a href=''>字典维护6</a> <a
							href=''>字典维护7</a> <a href=''>字典维护8</a> <a href=''>字典维护9</a>
					</div>
				</li>
				<li>
					<h4 class="M9">
						<span></span>内容管理
					</h4>
					<div class="list-item none">
						<a href=''>内容管理1</a> <a href=''>内容管理2</a> <a href=''>内容管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M10">
						<span></span>系统管理
					</h4>
					<div class="list-item none">
						<a href=''>系统管理1</a> <a href=''>系统管理2</a> <a href=''>系统管理3</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
				<ul>
					<li><img src="images/home.png"></li>
					<li style="margin-left: 25px;">您当前的位置：</li>
					<li><a href="#">系统公告</a></li>
					<li>></li>
					<li><a href="#">最新公告</a></li>
				</ul>
			</div>
			<div class="main" id="main"></div>
		</div>
	</div>
	<div class="bottom"></div>
	<div id="footer"></div>
	<script>
		navList(12);
	</script>

</body>

<!-- 根据点击的不同,进行ajax 调用,切换右边的 内容 -->
<script type="text/javascript">
	function SixOneActionGetSixOnes() {
		alert("234324");
	}
	$(document).ready(function() {

	});
</script>
</html>