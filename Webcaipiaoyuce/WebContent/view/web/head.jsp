<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%
    String path=request.getContextPath();
    String domain=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
    String basePath=domain+path;
    pageContext.setAttribute("ctx",path);
%>
<link rel="stylesheet" type="text/css" href="${ctx}/resources/web/style/style.css" />
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.tabs.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.global.js"></script>
<script type="text/javascript" src="${ctx}/resources/My97DatePicker/WdatePicker.js"></script>
<script language="javascript" type="text/javascript" src="${ctx}/resources/web/js/layPage/laypage.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.min.js"></script>
<div class="header">
    <div class="inner">
        <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0" width="1000" height="160" id="top" align="middle">
            <param name="allowScriptAccess" value="sameDomain" />
            <param name="allowFullScreen" value="false" />
            <param name="movie" value="${ctx}/resources/web/image/head.swf" />
            <param name="quality" value="high" />
            <param name="wmode" value="transparent" /><param name="bgcolor" value="#ffffff" />	
            <embed wmode="transparent" src="${ctx}/resources/web/image/head.swf" quality="high" bgcolor="#ffffff" width="1000" height="160" name="index_header" align="middle" allowScriptAccess="sameDomain" allowFullScreen="false" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer_cn" />
        </object>        
        <p><a href="${ctx}/">网站首页</a></p>
        <table class="nav">
        <tr>
            <td>
            	<div>
                <span><a href="${ctx}/web/areaInfoPage.action" target="_blank"><img src="${ctx}/resources/web/image/nav1.png" /></a></span>
                <ul>
                <c:forEach items="${sessionScope.catalogList }" var="item">
                    <c:if test="${item.isFirstCatalog!=1 }" >
                        <li><a href="${ctx}${item.url}" target="_blank">${item.title }</a></li>
                    </c:if>
                </c:forEach>      
                </ul> 
                </div>              
            </td>
            <td>
            	<div>
                <span><a href="http://zwgk.puning.gd.cn/zwgk/showDeptType.action" target="_blank"><img src="${ctx}/resources/web/image/nav2.png" /></a></span>
                <ul>
	            <li><a href="http://zwgk.puning.gd.cn/zwgk/showDeptType.action" target="_blank">信息公开</a></li>
	            <li><a href="http://zwgk.puning.gd.cn/zwgk/jsp/front/front_ysqgklc.jsp" target="_blank">公开流程</a></li>
	            <li><a href="http://ysq.puning.gd.cn/" target="_blank">依申请公开</a></li>
	            <li><a href="http://yjx.puning.gd.cn/" target="_blank">意见箱</a></li>
	            <li><a href="${ctx }/web/frontOpenCatalogPage.action" target="_blank">重点领域</a></li>
	            <li><a href="${ctx }/web/frontZlCatalogPage.action?theID=51" target="_blank">工作报告</a></li> 
	            
<%-- 	            <li><a href="${ctx }/web/frontZlCatalogPage.action?theID=34">领导之窗</a></li> --%>
<%-- 	            <li><a href="${ctx }/web/frontZlCatalogPage.action?theID=36">政府文件</a></li> --%>
<%-- 	            <li><a href="${ctx }/web/frontZlCatalogPage.action?theID=51">工作报告</a></li> --%>
<%-- 	            <li><a href="${ctx }/web/frontZlCatalogPage.action?theID=46">招标信息</a></li>  --%>
                </ul>  
                </div>              
            </td>
            <td>
            	<div>
                <span><a href="http://www.pnbs.gov.cn/" target="_blank"><img src="${ctx}/resources/web/image/nav3.png" /></a></span>
                <ul>
	            <li><a href="http://www.pnbs.gov.cn/sp/out/wsbs/bmfw.jsp" target="_blank">部门服务</a></li>
	            <li><a href="http://www.pnbs.gov.cn/sp/out/wsbs/qybs.jsp" target="_blank">企业办事</a></li>
	            <li><a href="http://www.pnbs.gov.cn/sp/out/wsbs/grbs.jsp" target="_blank">个人办事</a></li>   
	            <li><a href="http://www.pnbs.gov.cn/sp/out/wsbs/fzx.jsp" target="_blank">分中心</a></li>
	            <li><a href="http://www.pnbs.gov.cn/sp/out/wsbs/zjzl.jsp" target="_blank">镇街专栏</a></li>
	            <li><a href="http://www.pnbs.gov.cn/web!listFwsxjzqk.action" target="_blank">效能监察</a></li>                
                </ul> 
                </div>            
            </td>
            <td style="background:none;">
            	<div>
                <span><a href="${ctx }/web/frontContentsPage.action" target="_blank"><img src="${ctx}/resources/web/image/nav4.png" /></a></span>
                <ul>
	            <li><a href="${ctx }/web/front_queryContentsList.action" target="_blank">民意征集</a></li>
	            <li><a href="${ctx}/web/front_letterRight.action?flag=1" target="_blank">市长信箱</a></li>
	            <li><a href="${ctx}/web/front_letterRight.action?flag=2" target="_blank">我要写信</a></li>
	            <li><a href="${ctx}/web/front_letterRight.action?flag=3" target="_blank">我要建议</a></li>
	            <li><a href="${ctx}/web/front_querySurveyListDetail.action?index=1" target="_blank">网上调查</a></li> 
	            <li><a href="http://xfw.puning.gov.cn/" target="_blank">网上信访</a></li>   
                </ul>  
                </div>           
            </td>
        </tr>
        </table>                 
    </div> 
</div>

