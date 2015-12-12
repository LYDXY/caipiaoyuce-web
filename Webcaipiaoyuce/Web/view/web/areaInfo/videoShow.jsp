<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>普宁市人民政府门户网站</title>
</head>

<body>
<%@include file="../../web/head.jsp" %>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/jwplayer/jwplayer.js"></script>


<div class="wrapper">
	<div class="inner">
    	<div class="side"> 
			<%@include file="../../web/leftCatalog.jsp" %>
        </div>
        <div class="main">
        	<div class="position"><span>当前位置：</span><a href="${ctx}/web/index.action">网站首页</a> > 
			<c:if test="${leftTitle=='news'}">
        		<a href="${ctx}/web/areaInfoList.action?type=${leftTitle }&catalogID=${leftCatalogList[0].theID}">
    				新闻资讯
    			</a>
    			> <b>${catalog.title}</b>
    		</c:if>
    		<c:if test="${leftTitle=='contents'}">
    			<a href="${ctx}/web/areaInfoPage.action">
    				走进普宁
    			</a>
    			> <b>${catalog.title}</b>
    		</c:if>
    		<c:if test="${leftTitle=='announcement'}">
    			<a href="${ctx}/web/areaInfoList.action?type=${leftTitle }&catalogID=${leftCatalogList[0].theID}">
    				通知公告
				</a>
    		</c:if> </div>
        	<div class="article">
            	<div class="tit">${video.title }</div>
            	<div class="data">来源：${video.source }&nbsp;&nbsp;&nbsp;发布时间：${video.releaseDate}</div>
            	<!-- >div id="video" style="position:relative;z-index:100;width:700px;height:500px;float:left;">
                	<div id="container"></div> 
		            <script type="text/javascript">  
		                jwplayer('container').setup({  
		                    flashplayer: '${ctx}/resources/web/jwplayer/jwplayer.flash.swf',  
		                    file: 'http://www.gdpntv.com/static/tv/news/20150107.flv',  
		                    image:'',
		                    width: 700,  
		                    height: 480, 
		                    autostart:true
		                });  
		            </script> 
            	</div -->
            	<div id="video" style="position:relative;z-index:100;width:700px;height:500px;float:center;">
            	<embed allowfullscreen="true" allownetworking="internal" allowscriptaccess="never" height="500px" id="flash0" src="${video.url }" style="width: 700px; height: 480px" type="application/x-shockwave-flash" width="700"></embed>
            	</div>
            </div>
        	                               
        </div>
    </div>
</div>
<%@include file="../../web/foot.jsp" %>
</body>
</html>



