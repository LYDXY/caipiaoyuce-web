<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>普宁市人民政府门户网站</title>
</head>
<body>
<%@include file="../../web/head.jsp" %>
<div class="wrapper">
	<div class="inner">
    	<div class="side">
			<%@include file="../frontLetter/front_letter_page.jsp" %>
		</div> 

        <div class="main" style="border:0;">
            <div class="border">
                <h3><span>民意征集</span></h3>
                <ul>
                    <c:forEach items="${opList }" var="list">
                    <li>
                    <a href="${ctx}/web/front_queryContentsDetail.action?theID=${list.theID}&flag=${list.flag}">${list.title }</a>
<%--                     <em>${list.create_date }</em> --%>
                    </li>
                    </c:forEach>
                </ul>
            </div>                    
            <div class="border">
                <h3><span>市长信箱</span></h3>
                <ul>
                    <c:forEach items="${szxxList }" var="list">
                    <li>
                    <a href="${ctx}/web/front_queryLetterDetail.action?theID=${list.theID}&index=1">${list.theme }</a>
<%--                     <em>${list.create_date }</em> --%>
                    </li>
                    </c:forEach>
                </ul>
            </div>                      


            <div class="border">
                <h3><span>我要写信</span></h3>
                <ul>
                    <c:forEach items="${wyxxList }" var="list">
                    <li>
                    <a href="${ctx}/web/front_queryLetterDetail.action?theID=${list.theID}&index=1">${list.theme }</a>
<%--                     <em>${list.create_date }</em> --%>
                    </li>
                    </c:forEach>
                </ul>
            </div>                    

            <div class="border">
                <h3><span>我要建议</span></h3>
                <ul>
                    <c:forEach items="${wyjyList }" var="list">
                    <pg:item>
                    <li>
                    <a href="${ctx}/web/front_queryLetterDetail.action?theID=${list.theID}&index=1">${list.theme }</a>
<%--                     <em>${list.create_date }</em> --%>
                    </li>
                    </pg:item>
                    </c:forEach>
                </ul>
            </div>                      
         
            <div class="border">
                <h3><span>网络调查</span></h3>
                <ul>
                    <c:forEach items="${surveyList }" var="list">
                    <li>
                    <a href="${ctx}/web/front_querySurveyInfo.action?theID=${list.theID}&index=1">${list.title }</a>
<%--                     <em>${list.create_date }</em> --%>
                    </li>
                    </c:forEach>
                </ul>
            </div>
		</div>
    </div>
</div>
<%@include file="../../web/foot.jsp" %>    
</body>
</html>