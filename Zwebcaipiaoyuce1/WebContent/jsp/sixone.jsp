<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	List<SixOne> sixonelist=(List<SixOne>)request.getAttribute("sixonelist");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
</head>
<body>

	<!-- 表格部分 -->
	<p></p>
	<div class="sui-btn-group">

		<button class="sui-btn btn-primary" data-toggle="modal"
			data-target="#myModal" data-keyboard="false">添加一条新的数据</button>
		<button class="sui-btn btn-warning">导出到excel</button>
		<button class="sui-btn btn-success">导出到excel</button>
		<button class="sui-btn btn-danger">导出到excel</button>
	</div>
	<p></p>

	<table class="sui-table table-bordered table-sideheader">
		<thead>
			<tr>
				<th>期数</th>
				<th>球1</th>
				<th>球2</th>
				<th>球3</th>
				<th>球4</th>
				<th>球5</th>
				<th>球6</th>
				<th>球7</th>
				<th>编辑</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sixonelist}" var="item">
				<tr>
					<td>${item.qishu}</td>
					<td>${item.first}</td>
					<td>${item.second}</td>
					<td>${item.third}</td>
					<td>${item.fourth}</td>
					<td>${item.fifth}</td>
					<td>${item.sixth}</td>
					<td>${item.seventh}</td>
					<td><button class="sui-btn btn-bordered btn-primary">编辑</button>&nbsp;&nbsp;
						<button class="sui-btn btn-bordered btn-primary">删除</button></td>
				<tr>
			</c:forEach>



		</tbody>
	</table>



	<!-- 打开对话框模块 -->
	<!-- Modal-->
	<div id="myModal" tabindex="-1" role="dialog" data-hasfoot="false"
		class="sui-modal hide fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" data-dismiss="modal" aria-hidden="true"
						class="sui-close">×</button>
					<h4 id="myModalLabel" class="modal-title">6+1(49选7) 当前期数
						,由后台传过来$</h4>
				</div>
				<!-- 对话框主体 -->
				<div class="modal-body">
					<form class="sui-form form-horizontal sui-validate">
						<div class="control-group">
							<label for="first_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="first_number" name="fifth_number" placeholder="1-49"
									data-rules="required|number|lt=50" type="text">
							</div>
						</div>

						<div class="control-group">
							<label for="second_number" class="control-label">球2:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="second_number" name="second_number"
									placeholder="1-49" data-rules="required|number|lt=50"
									type="text">
							</div>
						</div>

						<div class="control-group">
							<label for="third_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="third_number" name="third_number" placeholder="1-49"
									data-rules="required|number|lt=50" type="text">
							</div>
						</div>

						<div class="control-group">
							<label for="fourth_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="fourth_number" name="fourth_number"
									placeholder="1-49" data-rules="required|number|lt=50"
									type="text">
							</div>
						</div>
						<div class="control-group">
							<label for="fifth_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="fifth_number" name="fifth_number" placeholder="1-49"
									data-rules="required|number|lt=50" type="text">
							</div>
						</div>
						<div class="control-group">
							<label for="sixth_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="sixth_number" name="sixth_number" placeholder="1-49"
									data-rules="required|number|lt=50" type="text">
							</div>
						</div>
						<div class="control-group">
							<label for="seventh_number" class="control-label">球1:&nbsp;&nbsp;</label>
							<div class="controls">
								<input id="seventh_number" name="seventh_number"
									placeholder="1-49" data-rules="required|number|lt=50"
									type="text">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" data-ok="modal"
						class="sui-btn btn-primary btn-large">确定添加</button>
					<button type="button" data-dismiss="modal"
						class="sui-btn btn-default btn-large">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--针对对话框的事件 -->
	<script>
		$('#myModal').on('okHide', function(e) {

		})
		$('#myModal').on('okHidden', function(e) {

		})
		$('#myModal').on('cancelHide', function(e) {

		})
		$('#myModal').on('cancelHidden', function(e) {

		})
	</script>


</body>
</html>