<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content=""/>
    <meta content="" name="description"/>
    <title>普宁市人民政府门户网站</title>

</head>
<body class="index">
<%@include file="../web/head.jsp" %>
<script type="text/javascript" language="javascript" src="${ctx}/resources/web/jwplayer/jwplayer.js"></script>


<div class="wrapper">
    <div class="inner">

		<table class="other">
        <tr>
        <th><iframe width="450" scrolling="no" height="18" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&icon=1&py=puning&wind=1&num=2"></iframe></th>
        <td>
            <div class="so">
                <form action="${ctx}/web/searchList.action" method="post">
                <input type="text" name="title" class="text" value="${title }"/><input type="submit" class="submit" />
                </form>         
            </div>          
        </td>
        </tr>
        </table>

        <div class="banner"><a href="javascript:void(0)" onclick="openwindow(7);"><img src="${ctx}/uploads/system/titlepic/7.jpg"/></a></div>
        
        <div class="left">
        	<div class="barNews">
            <div id="barNews">
                <ul>
                    <c:forEach items="${focusList}" var="e">
                        <li><a href="${ctx}/web/contentsShow.action?type=news&contentsID=${e.theID}" title="${e.title}">${e.title}</a></li>
                    </c:forEach>
                </ul>
            </div>          
            </div>
            <script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.scroll.js"></script>
            <script type="text/javascript">
                $(function () {
                    $("#barNews").Scroll({line: 1, speed: 500, timer: 4000, up: "btn_up", down: "btn_down"});
                });
            </script>
        	<table>
            <tr>
            	<th>
				<script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.slide.js"></script>
                <div id="sliderDiv">
                    <ul id="slider">
                        <c:forEach items="${picIndexList}" var="item" varStatus="status">
                            <li>
                                <p></p>
                                <span>${item.title}</span>
                                <a target="_blank" href="${ctx}/web/contentsShow.action?type=news&contentsID=${item.contentID}"><img src="${ctx}/${item.fileUrl}" title="${item.title}"/></a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
                <ul id="sliderNum">
                    <c:forEach items="${picIndexList}" var="item" varStatus="status">
                        <li><img src="${ctx}/${item.fileUrl}" title="${item.title }"/></li>
                    </c:forEach>
                </ul>
                <script>
                    mytv("sliderNum", "sliderDiv", "slider", 260, 4, true, 2000, 4, true, "onmouseover");

                    function switchTab(e) {
                        $('.tab_content ul').eq(2).html($('.tab_content ul').eq(e).html())
                    }
                </script>                
                </th>
                <td>
                <div class="tab tab1">
                    <ul class="tab_menu">
                        <li onmousemove="switchTab(0)" class="current">普宁新闻</li>
                        <li onmousemove="switchTab(1)">国内外新闻</li>
                        <li><a href="http://gdpntv.com/tv.php" target="_blank">普宁电视网</a></li>
                    </ul>
                    <div class="tab_content">
                        <ul>
                            <c:if test="${contents10 != null }">
                                <li class="topic">
                                    <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents10.theID}" title="${contents10.title}">
	                                    <c:if test="${fn:length(contents10.title)>16}">${fn:substring(contents10.title,0,16)}...</c:if>
	                                    <c:if test="${fn:length(contents10.title)<=16}">${contents10.title}</c:if>
                                    </a>                                   
                                    <p>
	                                    <c:if test="${fn:length(contents10.contents)>60}">${fn:substring(contents10.contents,0,55)}...</c:if>
	                                    <c:if test="${fn:length(contents10.contents)<=60}">${contents10.contents}</c:if>
                                    </p>
                                </li>
                                <c:forEach items="${contents10List }" var="contents" varStatus="status">
                                    <li>
                                        <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents.theID}" title="${contents.title}">
                                            <c:if test="${fn:length(contents.title)>22}">${fn:substring(contents.title,0,22)}...</c:if>
                                            <c:if test="${fn:length(contents.title)<=22}">${contents.title}</c:if>
                                        </a>
                                        <em>${fn:substring(contents.releaseDate,0,10)}</em>
                                    </li>
                                </c:forEach>
                            </c:if>
                            <c:if test="${contents10==null }">
                                <c:forEach items="${contents10List }" var="contents" varStatus="status">
	                                <li>
	                                    <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents.theID}" title="${contents.title}">
	                                        <c:if test="${fn:length(contents.title)>22}">${fn:substring(contents.title,0,22)}...</c:if>
	                                        <c:if test="${fn:length(contents.title)<=22}">${contents.title}</c:if>
	                                    </a>
	                                    <em>${fn:substring(contents.releaseDate,0,10)}</em>
	                                </li>
                                </c:forEach>
                            </c:if>
                        </ul>
                        <ul class="hide">
                            <c:if test="${contents43 != null }">
                                 <li class="topic">
                                    <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents43.theID}" title="${contents43.title}">
	                                    <c:if test="${fn:length(contents43.title)>16}">${fn:substring(contents43.title,0,16)}...</c:if>
	                                    <c:if test="${fn:length(contents43.title)<=16}">${contents43.title}</c:if>
                                    </a>                                   
                                    <p>
	                                    <c:if test="${fn:length(contents43.contents)>60}">${fn:substring(contents43.contents,0,55)}...</c:if>
	                                    <c:if test="${fn:length(contents43.contents)<=60}">${contents43.contents}</c:if>
                                    </p>
                                </li>
                                <c:forEach items="${contents43List }" var="contents" varStatus="status">
                                    <li>
                                        <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents.theID}" title="${contents.title}">
                                            <c:if test="${fn:length(contents.title)>22}">${fn:substring(contents.title,0,22)}...</c:if>
                                            <c:if test="${fn:length(contents.title)<=22}">${contents.title}</c:if>
                                        </a>
                                        <em>${fn:substring(contents.releaseDate,0,10)}</em>
                                    </li>
                                </c:forEach>                           

                            </c:if>
                            <c:if test="${contents43 == null }">
                                <c:forEach items="${contents43List }" var="contents" varStatus="status">	 
	                                <li>
	                                    <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents.theID}" title="${contents.title}">
	                                        <c:if test="${fn:length(contents.title)>21}">${fn:substring(contents.title,0,21)}...</c:if>
	                                        <c:if test="${fn:length(contents.title)<=21}">${contents.title}</c:if>
	                                    </a>
	                                    <em>${fn:substring(contents.releaseDate,0,10)}</em>
	                                </li>
                                </c:forEach>
                            </c:if>
                        </ul>
                        <ul class="hide"></ul>
                    </div>
                </div>
                
                </td>
            </tr>
            </table>
        </div>
        
        
        <div class="right">   
            <div class="banner" style="margin-bottom:0;"><a href="http://www.pnbs.gov.cn/" target="_blank"><img src="${ctx}/resources/web/image/pic.jpg" width="240" height="80"/></a></div>
            <div class="notice">
                <h3><span>通知公告</span></h3>
                <ul>
                    <c:forEach items="${contents68List }" var="item">
                        <li>
                            <a href="${ctx}/web/contentsShow.action?type=announcement&contentsID=${item.theID}" title="${item.title }">
                                <c:if test="${fn:length(item.title)>15}">
                                    ${fn:substring(item.title,0,15)}...
                                </c:if>
                                <c:if test="${fn:length(item.title)<=15}">
                                    ${item.title}
                                </c:if>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>

        <div class="banner"><a href="javascript:void(0)" onclick="openwindow(8);"><img src="${ctx}/uploads/system/titlepic/8.jpg"/></a></div>
        <div><a href="${ctx }/web/frontOpenCatalogPage.action"><img src="${ctx}/resources/web/image/xxgk.jpg" width="1000" height="38"/></a></div>


        <div class="left">
            <table>
            <tr>
                <th style="background:#e1e1e1;">
                    <div class="xxgk">
                    	<h3><span>政府信息公开专栏</span></h3>
                        <ul>
<%--                             <c:forEach items="${openTop8 }" var="list"> --%>
<!--                                 <li> -->
<%--                                     <a href="${ctx }/web/frontOpenCatalogPage.action?theID=${list.theID}"> --%>
<%--                                             ${list.title} --%>
<!--                                     </a> -->
<!--                                 </li> -->
<%--                             </c:forEach> --%>
<!-- 							<li> -->
<!-- 								<a href="#"> -->
<!-- 									政府信息公开指南 -->
<!-- 								</a> -->
<!-- 							</li> -->
							<li>
								<a href="http://zwgk.puning.gd.cn/zwgk/showDeptType.action" title="政府信息公开目录" target="_blank">
									政府信息公开目录
								</a>
							</li>
<!-- 							<li> -->
<!-- 								<a href="#"> -->
<!-- 									政府公开工作年度报告 -->
<!-- 								</a> -->
<!-- 							</li> -->
							<li>
								<a href="http://ysq.puning.gd.cn/" title="政府信息依申请公开" target="_blank">
									政府信息依申请公开
								</a>
							</li>
							<li>
								<a href="http://yjx.puning.gd.cn/" title="政府信息公开意见箱" target="_blank">
									政府信息公开意见箱
								</a>
							</li>
							<li>
								<a href="http://zwgk.puning.gd.cn/zwgk/jsp/front/front_ysqgklc.jsp" title="依申请公开流程" target="_blank">
									依申请公开流程
								</a>
							</li>
<!-- 							<li> -->
<!-- 								<a href="#"> -->
<!-- 									部门政府信息公开 -->
<!-- 								</a> -->
<!-- 							</li> -->
<!-- 							<li> -->
<!-- 								<a href="#"> -->
<!-- 									乡镇政府信息公开 -->
<!-- 								</a> -->
<!-- 							</li> -->
                        </ul>
                    </div>
                    <script>
                        $(function () {
                            $(".xxgk ul li").each(function (i) {
                                $(this).addClass("gk" + i);
                            })
                        })
                    </script>
    				<div class="zdlyxk">
                    	<h3><span>
	                    	<a href="${ctx}/web/frontOpenCatalogPage.action">
	                    		重点领域信息公开专栏
	                    	</a></span></h3>
                        <ul>
                        <c:forEach items="${openTop8 }" var="item" varStatus="status"> 
                        	<c:if test="${status.index%2==0 && status.index!=2 && status.index!=6 && status.index!=10}">
								<li>
                        		<c:if test="${item.catalogType=='t_links' }">
                        			<a href="${item.url }" target='_blank'>${item.title }</a>
                        		</c:if>
                        		<c:if test="${item.catalogType=='t_contents' }">
                        			<a href="${ctx}/web/frontOpenCatalogPage.action?theID=${item.theID}" >${item.title }</a>
                        		</c:if>
                        	</c:if>
                        	<c:if test="${status.index%2==1}">
                        		<c:if test="${item.catalogType=='t_links' }">
                        			<a href="${item.url }" target='_blank'>${item.title }</a>
                        		</c:if>
                        		<c:if test="${item.catalogType=='t_contents' }">
                        			<a href="${ctx}/web/frontOpenCatalogPage.action?theID=${item.theID}" >${item.title }</a>
                        		</c:if>
                  				</li>
                        	</c:if>
                        	<c:if test="${status.index==2||status.index==6||status.index==10 }">
                        		<li style="background:#eee;">
                        		<c:if test="${item.catalogType=='t_links' }">
                        			<a href="${item.url }" target='_blank'>${item.title }</a>
                        		</c:if>
                        		<c:if test="${item.catalogType=='t_contents' }">
                        			<a href="${ctx}/web/frontOpenCatalogPage.action?theID=${item.theID}" >${item.title }</a>
                        		</c:if>
                        	</c:if>
                        </c:forEach>

                        </ul>
                    </div>
               
                </th>
                <td>
                    <div class="zdly">
                        <h3><span><a href="${ctx }/web/frontZlCatalogPage.action">政务导航</a></span></h3>
                        <ul>
                            <c:forEach items="${zlTop8 }" var="list" varStatus="stat">
                                <li>
                                    <a href="${ctx }/web/frontZlCatalogPage.action?theID=${list.theID}">
                                            ${list.title}
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>                 
                    <div class="tab tab1">
                        <ul class="tab_menu">
                            <li class="current">工作报告</li>
	                        <li>人事任免</li>
	                        <li>重大项目</li>
                        </ul>
                        <div class="tab_content">
                        <ul>
                            <c:forEach items="${zfgbContents }" var="list">
                                <li>
                                    <a href="${ctx }/web/frontZlCatalogPage.action?theID=${list.theID}&flag=1" title="${list.title}">
                                        <c:if test="${fn:length(list.title)>21 }">${fn:substring(list.title,0,21)}...</c:if>
                                        <c:if test="${fn:length(list.title)<=21 }">${list.title}</c:if>
                                    </a>

                                </li>
                            </c:forEach>
                        </ul>
                        <ul class="hide">
                            <c:forEach items="${zlTop8Contents }" var="list">
                                <li>
                                    <a href="${ctx }/web/frontZlCatalogPage.action?theID=${list.theID}&flag=1" title="${list.title}">
                                        <c:if test="${fn:length(list.title)>21 }">${fn:substring(list.title,0,21)}...</c:if>
                                        <c:if test="${fn:length(list.title)<=21 }">${list.title}</c:if>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                        <ul class="hide">
                            <c:forEach items="${zdxmContents }" var="list">
                                <li>
                                    <a href="${ctx }/web/frontZlCatalogPage.action?theID=${list.theID}&flag=1" title="${list.title}">
                                        <c:if test="${fn:length(list.title)>21 }">${fn:substring(list.title,0,21)}...</c:if>
                                        <c:if test="${fn:length(list.title)<=21 }">${list.title}</c:if>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                    </div>                    
                </td>
            </tr>
            </table>
		</div>
        <div class="right">
            <div class="zfxx">
                <h3><span>政府信息</span></h3>
                <ul>
                    <c:forEach items="${contents130List}" var="contents">
                        <li>
                            <a href="${ctx}/web/contentsShow.action?type=news&contentsID=${contents.theID}" title="${contents.title}">
                                <c:if test="${fn:length(contents.title)>10}">${fn:substring(contents.title,0,10)}...</c:if>
                                <c:if test="${fn:length(contents.title)<=10}">${contents.title}</c:if>
                            </a>
                            <em>${fn:substring(contents.releaseDate,0,10)}</em>
                        </li>
                    </c:forEach>
                </ul>
            </div>  

		</div>

        <script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.js"></script>
        <script type="text/javascript" language="javascript" src="${ctx}/resources/web/js/jquery.focus.min.js"></script>
        <div id="banner">
            <ul id="pic">
                <li><a href="javascript:void(0)" onclick="openwindow(13);"><img src="${ctx}/uploads/system/titlepic/13.jpg"/></a></li>
                <li><a href="javascript:void(0)" onclick="openwindow(14);"><img src="${ctx}/uploads/system/titlepic/14.jpg"/></a></li>
                <li><a href="javascript:void(0)" onclick="openwindow(15);"><img src="${ctx}/uploads/system/titlepic/15.jpg"/></a></li>
                <li><a href="javascript:void(0)" onclick="openwindow(16);"><img src="${ctx}/uploads/system/titlepic/16.jpg"/></a></li>
            </ul>
            <div id="num">
                <a href="javascript:void(0)" hidefocus="true">1</a>
                <a href="javascript:void(0)" hidefocus="true">2</a>
                <a href="javascript:void(0)" hidefocus="true">3</a>
                <a href="javascript:void(0)" hidefocus="true">4</a>
            </div>
        </div>
        <script type="text/javascript">
            Qfast(false, 'widgets', function () {
                K.tabs({
                    id: 'banner',   //焦点图包裹id
                    conId: "pic",  //** 大图域包裹id
                    tabId: "num",
                    tabTn: "a",
                    conTn: "li",
                    auto: 1,   //自动播放 1或0
                    effect: 'fade',   //效果配置
                    eType: 'mouseover', //** 鼠标事件
                    pageBt: 'false'//是否有按钮切换页码
                })
            })
        </script>



        <div class="clear">
            <div class="fl">
                <%@include file="../web/frontArea/front_area.jsp" %>
                <div class="banner"><a href="javascript:void(0)" onclick="openwindow(9);"><img src="${ctx}/uploads/system/titlepic/9.jpg"/></a></div>               
            </div>
            <div class="fr">
				<iframe src="http://www.pnbs.gov.cn/sp/out/forzfw/bjgg.jsp" frameborder="0" scrolling="no" height="350px" width="492px"></iframe>
                
                <div class="banner"><a href="javascript:void(0)" onclick="openwindow(10);"><img src="${ctx}/uploads/system/titlepic/10.jpg"/></a></div>

                  
            </div>
        </div>


        <!--div class="hd">
            <a href="${ctx}/web/front_letterRight.action?flag=1"><img src="${ctx}/resources/web/image/ico1.jpg" align="absmiddle"/>市长信箱</a>
            <a><img src="${ctx}/resources/web/image/ico2.jpg" align="absmiddle"/>投诉电话</a>
            <a href="${ctx}/web/front_letterRight.action?flag=2"><img src="${ctx}/resources/web/image/ico3.jpg" align="absmiddle"/>公民信访</a>
            <a href="${ctx}/web/front_letterRight.action?flag=3" align="absmiddle"><img src="${ctx}/resources/web/image/ico4.jpg"/>城管热线</a>
        </div>        
        <div class="tab tab2">
            <ul class="tab_menu">
                <li class="current"><a href="${ctx}/web/front_querySurveyListDetail.action?index=1">网上调查</a></li>
                <li><a href="${ctx }/web/front_queryContentsList.action">民意征集</a></li>
            </ul>
            <div class="tab_content">

                <ul>
                    <c:forEach items="${list }" var="list" begin="0" end="4">
                        <li>
                            <a href="${ctx}/web/front_querySurveyInfo.action?theID=${list.theID}&index=1" title="${list.title }">
                                <c:if test="${fn:length(list.title)>15}">
                                    ${fn:substring(list.title,0,15) }...
                                </c:if>
                                <c:if test="${fn:length(list.title)<=15}">
                                    ${list.title}
                                </c:if>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
                <ul class="hide">
                    <c:forEach items="${contents45List }" var="list" begin="0" end="4">
                        <li>
                            <a href="${ctx}/web/front_queryContentsDetail.action?theID=${list.theID}&flag=now" title="${list.title }">
                                <c:if test="${fn:length(list.title)>15}">
                                    ${fn:substring(list.title,0,15) }...
                                </c:if>
                                <c:if test="${fn:length(list.title)<=15}">
                                    ${list.title}
                                </c:if>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div-->           
        <div class="zt">
        	<div class="zttit">专题</div>
            <div id="demo3" style="overflow:hidden; zoom:1; clear:both; margin-bottom:10px; margin-left:40px;">
                 <div style="float:left;width:800%;">
                    <div id="demo4" style="float:left;">
                        <c:forEach items="${ztCatalogList}" var="item">
                            <a href="${ctx}/web/specialTopicList.action?catalogID=${item.theID}">
                                <img src="${ctx}/uploads/zt/pic/${item.theID}.jpg" width="250" height="70" />
                            </a>
                        </c:forEach>
                    </div>
                    <div id="demo5" style="float:left;"></div>
                </div>
            </div>
		</div>
        <table class="boxlist">
            <tr>
                <td>
                    <div>
                        <h3><span>投资服务</span><a href="${ctx}/web/areaInfoList.action?type=contents&catalogID=87">更多 >></a></h3>
                        <ul>
                            <c:forEach items="${contents65List}" var="contents">
                                <li>
                                    <a href="${ctx}/web/contentsShow.action?type=contents&contentsID=${contents.theID}">
                                        <c:if test="${fn:length(contents.title)>20}">${fn:substring(contents.title,0,18)}...</c:if>
                                        <c:if test="${fn:length(contents.title)<=20}">${contents.title}</c:if>
                                    </a>
                                    <em>${fn:substring(contents.releaseDate,0,10)}</em>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </td>
                <td style="padding:0 10px;">
                    <div>
                        <h3><span>旅游服务</span><a href="${ctx}/web/areaInfoList.action?type=contents&catalogID=88">更多 >></a></h3>
                        <ul>
                            <c:forEach items="${contents51List}" var="contents">
                                <li>
                                    <a href="${ctx}/web/contentsShow.action?type=contents&contentsID=${contents.theID}">
                                        <c:if test="${fn:length(contents.title)>16}">${fn:substring(contents.title,0,15)}...</c:if>
                                        <c:if test="${fn:length(contents.title)<=16}">${contents.title}</c:if>
                                    </a>
                                    <em>${fn:substring(contents.releaseDate,0,10)}</em>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </td>
                <td>
                    <div>
                        <h3><span>经济文化</span><a href="${ctx}/web/areaInfoList.action?type=contents&catalogID=7">更多 >></a></h3>
                        <ul>
                            <c:forEach items="${contents7List}" var="contents">
                                <li>
                                    <a href="${ctx}/web/contentsShow.action?type=contents&contentsID=${contents.theID}">
                                        <c:if test="${fn:length(contents.title)>20}">${fn:substring(contents.title,0,18)}...</c:if>
                                        <c:if test="${fn:length(contents.title)<=20}">${contents.title}</c:if>
                                    </a>
                                    <em>${fn:substring(contents.releaseDate,0,10)}</em>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </td>
            </tr>
        </table>

        <div id="demo" style="overflow:hidden; zoom:1; clear:both; margin-bottom:10px;">
            <div style="float:left;width:800%;">
                <div id="demo1" style="float:left;">
                    <c:forEach items="${picLinksList}" var="item" varStatus="status">
                        <a href="${item.link_url}" target="_blank">
                            <img src="${ctx}/${item.pic_url}" width="195" height="44"/>
                        </a>
                    </c:forEach>
                </div>
                <div id="demo2" style="float:left;"></div>
            </div>
        </div>

        <div class="tab tab3 linktab">
            <ul class="tab_menu">
<!--                 <li class="current">市委</li> -->
<!--                 <li>市政府</li> -->
<!--                 <li>乡镇街道</li> -->
<!--                 <li>国家部委</li> -->
<!--                 <li>省内各市政府网</li> -->
<!--                 <li>揭阳各县区</li> -->
<!--                 <li>其他网站</li> -->
				<c:forEach items="${linksMap}" var="item" varStatus="status">
					<c:if test="${status.count==1 }"><li class="current">${item.value}</li></c:if>
					<c:if test="${status.count!=1 }"><li>${item.value}</li></c:if>
				</c:forEach>

            </ul>
            <div class="tab_content">
                <div>
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==1 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==2 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==3 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==4 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==5 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==6 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="hide">
                    <c:forEach items="${selectLinksList }" var="links">
                        <c:if test="${links.select_type==7 }">
                            <a href="${links.link_url }" target="_blank">${links.title}</a>
                        </c:if>
                    </c:forEach>
                </div>
            </div>
        </div>

    </div>
</div>
<%@include file="../web/foot.jsp" %>
</body>
</html>

<script>


    window.onload = function () {

        //专题图片滚动
        var links_switch_speed = 50;
        var demo3 = document.getElementById("demo3");
        var demo4 = document.getElementById("demo4");
        var demo5 = document.getElementById("demo5");
        demo5.innerHTML = demo4.innerHTML;
        function linksMarquee1() {
            if (demo5.offsetWidth - demo3.scrollLeft <= 0) {
                demo3.scrollLeft -= demo4.offsetWidth;
            } else {
                demo3.scrollLeft++;
            }
        }

        var linksMar = setInterval(linksMarquee1, links_switch_speed);
        demo3.onmouseover = function () {
            clearInterval(linksMar)
        };
        demo3.onmouseout = function () {
            linksMar = setInterval(linksMarquee1, links_switch_speed);
        }

        //友情链接图片滚动
        var links_switch_speed = 50;
        var demo = document.getElementById("demo");
        var demo1 = document.getElementById("demo1");
        var demo2 = document.getElementById("demo2");
        demo2.innerHTML = demo1.innerHTML;
        function linksMarquee() {
            if (demo2.offsetWidth - demo.scrollLeft <= 0) {
                demo.scrollLeft -= demo1.offsetWidth;
            } else {
                demo.scrollLeft++;
            }
        }

        var linksMar = setInterval(linksMarquee, links_switch_speed);
        demo.onmouseover = function () {
            clearInterval(linksMar)
        };
        demo.onmouseout = function () {
            linksMar = setInterval(linksMarquee, links_switch_speed);
        }

        $('.tab_content ul').eq(2).html($('.tab_content ul').eq(0).html())

    }
    <%

    String isDlShow = (String)request.getAttribute("isDlShow");
    if(isDlShow.equals("1")){%>
    lastScrollY = 0;
    function heartBeat() {
        var diffY;
        if (document.documentElement && document.documentElement.scrollTop)
            diffY = document.documentElement.scrollTop;
        else if (document.body)
            diffY = document.body.scrollTop;
        else {/*Netscape stuff*/
        }

        percent = .1 * (diffY - lastScrollY);
        if (percent > 0)percent = Math.ceil(percent);
        else percent = Math.floor(percent);
        document.getElementById("lovexin12").style.top = parseInt(document.getElementById("lovexin12").style.top) + percent + "px";
        document.getElementById("lovexin14").style.top = parseInt(document.getElementById("lovexin14").style.top) + percent + "px";
        lastScrollY = lastScrollY + percent;

    }
    suspendcode12 = "<div id='lovexin12' style='left:2px;position:absolute;top:220px;'><div style='text-align:right;background:#ccc;' onclick='document.getElementById(\"lovexin12\").style.display=\"none\";document.getElementById(\"lovexin14\").style.display=\"none\";'>关闭</div><img src='${ctx}/uploads/system/titlepic/11.jpg' height='250px' width='120px'></div>";
    suspendcode14 = "<div id=\"lovexin14\" style='right:2px;position:absolute;top:220px;'><div style='text-align:right;background:#ccc;' onclick='document.getElementById(\"lovexin12\").style.display=\"none\";document.getElementById(\"lovexin14\").style.display=\"none\";'>关闭</div><img src='${ctx}/uploads/system/titlepic/11.jpg' height='250px' width='120px'></div>";
    document.write(suspendcode12);
    document.write(suspendcode14);
    window.setInterval("heartBeat()", 1);
    <%}%>

    function openwindow(theID) {
        $.ajax({
            type: "post",
            url: "${ctx}/web/queryUrlById.action",
            data: {id: theID},
            dataType: "text",
            success: function (data) {
                window.open(data);
            }
        });

    }
</script>
