<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	String path = request.getContextPath();
	String domain = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dhtmlx Sky Blue Style Grid</title>
<!-- grid.simple.min.css, grid.simple.min.js -->
<link rel="stylesheet" href="../css/bsgrid.all.min.css" />
<link rel="stylesheet" href="../css/grid_sky_blue.min.css" />
<script type="text/javascript" src="../js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../js/grid.zh-CN.min.js"></script>
<script type="text/javascript" src="../js/bsgrid.all.min.js"></script>
</head>
<body style="background-color: #fff;">
	<table id="searchTable">
		<tr>
			<th w_index="XH" width="5%;">XH</th>
			<th w_index="ID" width="5%;">ID</th>
			<th w_index="CHAR" w_align="left" width="15%;">CHAR</th>
			<th w_index="TEXT" w_align="left" width="30%;">TEXT</th>
			<th w_index="DATE" width="15%;">DATE</th>
			<th w_index="TIME" width="15%;">TIME</th>
			<th w_index="NUM" width="5%;">NUM</th>
			<th w_render="operate" width="10%;">Operate</th>
		</tr>
	</table>
	<script type="text/javascript">
    var gridObj;
    $(function () {
        gridObj = $.fn.bsgrid.init('searchTable', {
            url: '${ pageContext.request.contextPath }/SixOneAction/SixOneActionGetSixOnesByFenYe.action',
            // autoLoad: false,
            pageSizeSelect: true,
            stripeRows: true,
            pageSize: 10
        });
    });

    function operate(record, rowIndex, colIndex, options) {
        return '<a href="#" onclick="alert(\'ID=' + gridObj.getRecordIndexValue(record, 'ID') + '\');">操作</a>';
    }
</script>
</body>
</html>