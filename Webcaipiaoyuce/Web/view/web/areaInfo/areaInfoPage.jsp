<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>普宁市人民政府门户网站</title>

</head>
<body class="about">
<%@include file="../../web/head.jsp" %>

<link rel="stylesheet" type="text/css" href="${ctx}/resources/web/style/baguetteBox.css" />
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/baguettebox.min.js"></script>
<div class="wrapper">
	<div class="inner">
		<div class="intro">
        	<table>
            <tr>
            <th>
                <ul>
                <li><img src="${ctx}/resources/web/image/intro1.jpg" /><p>普宁市位于广东省东南部、潮汕平原西缘，东毗汕头市潮南区，南邻惠来县，西南连陆丰市、陆河县，西北接揭西县，东北界榕城区。境内地势北高南低，属滨海丘陵地形，大南山横贯县境北部。北回归线从市境北部通过。厦深高速铁路、普惠高速公路、揭普高速公路、国道324线、省道236线、省道238在市区交汇。</p></li>
                <li><img src="${ctx}/resources/web/image/intro2.jpg" /><p>普宁于明嘉靖四十二年（1563年）置县，初始县衙暂寄于潮阳贵屿民宅；万历十四年（1586年）县治迁于洪阳；1949年7月1日，普宁县人民政府成立，定县城于流沙；1993年4月6日，撤县设市，由省直辖、揭阳市代管。</p></li>
                <li><img src="${ctx}/resources/web/image/intro3.jpg"  /><p>全市设19个镇、5个街道办事处、1个乡、3个国营农场；有518个村委会、46个社区居民委员会。区域面积1620平方公里，折243万亩，其中耕地49.83万亩，占20.5%；山地100.6万亩（指林业用地，不含侨场），占41.4%。</p></li>
                </ul>               
            </th>
            <td>
                <ul>
                <c:forEach items="${areaCatalogList }" var="item">
                    <li><a href="${ctx}${item.url}">${item.title }</a></li>
                </c:forEach>
                </ul>	               
            </td>
            </tr>
            </table>      
        </div>
        <div class="map">
            <ul>
            <li><a href="">大坝镇</a></li>
            <li><a href="">军埠镇</a></li>
            <li><a href="">赤岗镇</a></li>
            <li><a href="">云落镇</a></li>
            <li><a href="">梅塘镇</a></li>
            <li><a href="">南径镇</a></li>
            <li><a href="">流沙东街道</a></li>
            <li><a href="">流沙北街道</a></li>
            <li><a href="">池尾街道</a></li>
            <li><a href="">占陇镇</a></li>
            <li><a href="">洪阳镇</a></li>
            <li><a href="">后溪乡</a></li>
            <li><a href="">大南山镇</a></li>
            <li><a href="">广太镇</a></li>
            <li><a href="">大坪镇</a></li>
            <li><a href="">流沙西街道</a></li>
            <li><a href="">流沙南街道</a></li>
            <li><a href="">船埔镇</a></li>
            <li><a href="">麒麟镇</a></li>
            <li><a href="">里湖镇</a></li>
            <li><a href="">南溪镇</a></li>
            <li><a href="">梅林镇</a></li>
            <li><a href="">大池农场</a></li>
            <li><a href="">大坪农场</a></li>
            <li><a href="">马鞍山农场</a></li>
            <li><a href="">高埔镇</a></li>
            <li><a href="">下架山镇</a></li>
            <li><a href="">燎原镇</a></li>
            </ul>        
        </div>
       <script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.innerfade.js"></script>
       <script>
		$(document).ready( function(){
			$('.intro th ul').innerfade({
				speed: 500,
				timeout: 5000,
				type: 'sequence',
				containerheight: '370px'
			});
		}); 
	   </script>



        <table class="boxlist">
        <tr>
        <td>
            <%@include file="../areaInfo/contentsUpLeft.jsp" %>
        </td>
        <td style="padding:0 10px;">
            <%@include file="../areaInfo/contentsUpMid.jsp" %>
        </td>
        <td>
            <%@include file="../areaInfo/contentsUpRight.jsp" %>
        </td>            
        </tr>
        <tr>
        <td>
            <%@include file="../areaInfo/contentsDownLeft.jsp" %>
        </td>
        <td style="padding:0 10px;">
            <%@include file="../areaInfo/contentsDownMid.jsp" %>
        </td>
        <td>
            <%@include file="../areaInfo/contentsDownRight.jsp" %>
        </td>            
        </tr>        
        </table>        

        
        <div class="piclist">
            <div id="demo">
            <div style="float:left;width:800%;">
            <div id="demo1" style="float:left; margin-right:5px;">
            	<ul class="baguetteBoxOne gallery">
                <c:forEach items="${fileInfoList}" var="item">
                    <li><a href="${ctx}/${item.fileUrl}"><img src="${ctx}/${item.fileUrl}" width="150" height="150"/></a></li>
                </c:forEach>
                </ul>
            </div>
            <div id="demo2" style="float:left;"></div>
            </div>
            </div> 
        </div>
        <script>
		//友情链接图片滚动
		var links_switch_speed=50;
		var demo=document.getElementById("demo");
		var demo1=document.getElementById("demo1");
		var demo2=document.getElementById("demo2");
		demo2.innerHTML=demo1.innerHTML;
		function linksMarquee() {
			if(demo2.offsetWidth-demo.scrollLeft<=0) {
				demo.scrollLeft-=demo1.offsetWidth;
			} else {
				demo.scrollLeft++;
			}
		}
		var linksMar=setInterval(linksMarquee,links_switch_speed);
		demo.onmouseover=function(){ clearInterval(linksMar)};
		demo.onmouseout=function(){ linksMar=setInterval(linksMarquee,links_switch_speed);}		   


		baguetteBox.run('.baguetteBoxOne', {
			animation: 'fadeIn',
		});
		</script>
	</div>
</div>
<%@include file="../../web/foot.jsp" %>
</body>
</html>