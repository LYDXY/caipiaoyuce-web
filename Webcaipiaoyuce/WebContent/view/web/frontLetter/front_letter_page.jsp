<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>普宁市人民政府门户网站</title>
</head>
<body>



<div class="hdlist">
    <h3>政民互动</h3>
    <ul>
	    <li><a href="${ctx}/web/front_queryContentsList.action"><img src="${ctx}/resources/web/image/ico3.png" align="absmiddle" />民意征集</a></li>
		<li><a href="${ctx}/web/front_letterRight.action?flag=1"><img src="${ctx}/resources/web/image/ico1.png" align="absmiddle" />市长信箱</a></li>
	<%-- 	<li><a href="${ctx}/web/front_letterRight.action?flag=2"><img src="${ctx}/resources/web/image/ico4.png" align="absmiddle" />我要写信</a></li>
		<li><a href="${ctx}/web/front_letterRight.action?flag=3"><img src="${ctx}/resources/web/image/ico4.png" align="absmiddle" />我要建议</a></li> --%>
		<li><a href="${ctx}/web/front_querySurveyListDetail.action?index=1"><img src="${ctx}/resources/web/image/ico2.png" align="absmiddle" />网上调查</a></li>
		<li><a href="http://xfw.puning.gov.cn/"><img src="${ctx}/resources/web/image/ico3.png" align="absmiddle" />网上信访</a></li>
    </ul>
</div>


</body>
</html>