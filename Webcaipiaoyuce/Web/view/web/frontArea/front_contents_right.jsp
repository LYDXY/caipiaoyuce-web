<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path=request.getContextPath();
    String domain=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
    String basePath=domain+path;
    pageContext.setAttribute("ctx",path);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.tabs.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.global.js"></script>
<script type="text/javascript" src="${ctx}/resources/My97DatePicker/WdatePicker.js"></script>
<script language="javascript" type="text/javascript" src="${ctx}/resources/web/js/layPage/laypage.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.min.js"></script>

<title>普宁市人民政府门户网站</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctx}/resources/web/style/style.css" />
</head>

<body style="background:none;">
    <%@include file="../../web/frontArea/front_catalog_left.jsp" %>
 <div class="side">

 </div>
 <input type="hidden" id="type" value="${leftTitle }"/>
 <input type="hidden" id="catalogID" value="${catalog.theID}"/>
<div class="list">
    <h3><span>${catalog.title}</span></h3> 
<table class="csstable">
    <tr class="tbg">
        <td>题目</td>
        <td width="20%">文号</td>
        <td width="10%">公开类型</td>
        <td width="15%">发布日期</td>
    </tr>
    <c:forEach items="${contentsList.list}" var="list">
    <tr>
    	
        <td class="tdl" ><a href="${ctx }/web/frontZlContentsDetail.action?theID=${list.theID}">${list.title }</a></td>
        <td>${list.conCode }</td>
        <td>
            <c:if test="${list.openType eq '1' }">
                主动公开
            </c:if>
        </td>
        <td>${fn:substring(list.releaseDate,0,10) }</td>
      
    </tr>
    </c:forEach>
</table>
</div>
<div id="layPage"></div>
               <script>  
				laypage({
			        cont: 'layPage', //容器id
			        pages: '${contentsList.pages}', //总页数
			        curr: '${contentsList.pageNum}',
			        jump: function (e, first) { //触发分页后的回调
			            if (!first) { //一定要加此判断，否则初始时会无限刷新
			            	window.location.href="${ctx}/web/frontZlContentsRight.action?pageNum=" + e.curr + "&pageSize=${contentsList.pageSize}&type="+'${leftTitle}'+"&theID="+'${catalog.theID}';
			            }
			        },
			
			        skin: 'molv', //皮肤
			        first: '首页', //若不显示，设置false即可
			        last: '尾页', //若不显示，设置false即可
			        prev: '<', //若不显示，设置false即可
			        next: '>', //若不显示，设置false即可
			        skip: true //是否开启跳页
			    }); 
			</script>
  
</body>
</html>