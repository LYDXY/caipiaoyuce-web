<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	String path = request.getContextPath();
	String domain = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript" type="text/javascript"
	src="../jqplot/js/jquery.min.js"></script>
<script language="javascript" type="text/javascript"
	src="../jqplot/js/jquery.jqplot.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../jqplot/css/jquery.jqplot.css" />
<script src="../jqplot/js/plugins/jqplot.canvasAxisTickRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.canvasTextRenderer.js"></script>
<script src="../jqplot/js/plugins/jqplot.canvasAxisLabelRenderer.js"></script>
<script src="../jqplot/js/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.barRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.logAxisRenderer.js"></script>
<!-- 饼图 -->
<script src="../jqplot/js/plugins/jqplot.pieRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.donutRenderer.min.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr class="success">
				<td>短期预测</td>
				<td>预测趋势图分析</td>
				<td>预测结果</td>
			</tr>
		</thead>
		<tbody>
		    <!-- 奇数偶数偏差系统分析 -->
			<tr>
				<td class="warning">
					<h3>奇数偶数偏差系统分析</h3> <br />
					<button id="getjisoufenxijieguo" onclick="getjisoufenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chartgetjisoufenxijieguo"
						style="height: 400px; width: 900px;"></div></td>
				<td width="500px">
					<table class="table">
						<thead>
							<tr>
								<td>总奇数</td>
								<td>总偶数</td>
								<td>差</td>
							</tr>
						</thead>
						<tr>
							<td id="zongjishu"></td>
							<td id="zongoushu"></td>
							<td id="zongcha"></td>

						</tr>
					</table>
				</td>
			</tr>
			<!-- 大数小数偏差系统分析 -->
			<tr>
				<td class="warning">
					<h3>大数小数偏差系统分析</h3> <br />
					<button id="getdaxiaofenxijieguo" onclick="getdaxiaofenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chatgetdaxiaofenxijieguo"
						style="height: 400px; width: 900px;"></div></td>
				<td>
				    <table class="table">
						<thead>
							<tr>
								<td>总大数</td>
								<td>总小数</td>
								<td>差</td>
							</tr>
						</thead>
						<tr>
							<td id="zongdashu"></td>
							<td id="zongxiaoshu"></td>
							<td id="zongdaxiaocha"></td>

						</tr>
					</table>
				</td>
			</tr>
			<!--末位数字偏差系统分析  -->
			<tr>
				<td class="warning">
					<h3>末位数字偏差系统分析</h3> <br />
					<button id="getMoWeifenxijieguo" onclick="getjisouFutureMoWei()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td>
                    <table class="table table-bordered" id="chartgetjisouFutureMoWei">
                       <thead>
                           <tr class="active"><td><h3>末位数字</h3></td><td><h3>过去5期</h3></td><td><h3>过去6期</h3></td><td><h3>过去7期</h3></td><td><h3>过去8期</h3></td><td><h3>过去9期</h3></td></tr>
                       </thead>
                        <tbody>
                             <tr class="info"><td>0</td><td id="future5zero"> </td><td id="future6zero"> </td><td id="future7zero"> </td><td id="future8zero"> </td><td id="future9zero"> </td></tr>
                             <tr class="success"><td>1</td><td id="future5one">  </td><td id="future6one">  </td><td id="future7one">  </td><td id="future8one">  </td><td id="future9one">  </td></tr>
                             <tr class="info"><td>2</td><td id="future5two">  </td><td id="future6two">  </td><td id="future7two">  </td><td id="future8two">  </td><td id="future9two">  </td></tr>
                             <tr class="success"><td>3</td><td id="future5three"></td><td id="future6three"></td><td id="future7three"></td><td id="future8three"></td><td id="future9three"></td></tr>
                             <tr class="info"><td>4</td><td id="future5four"> </td><td id="future6four"> </td><td id="future7four"> </td><td id="future8four"> </td><td id="future9four"> </td></tr>
                             <tr class="success"><td>5</td><td id="future5five"> </td><td id="future6five"> </td><td id="future7five"> </td><td id="future8five"> </td><td id="future9five"> </td></tr>
                             <tr class="info"><td>6</td><td id="future5six">  </td><td id="future6six">  </td><td id="future7six">  </td><td id="future8six">  </td><td id="future9six">  </td></tr>
                             <tr class="success"><td>7</td><td id="future5seven"></td><td id="future6seven"></td><td id="future7seven"></td><td id="future8seven"></td><td id="future9seven"></td></tr>
                             <tr class="info"><td>8</td><td id="future5eight"></td><td id="future6eight"></td><td id="future7eight"></td><td id="future8eight"></td><td id="future9eight"></td></tr>
                             <tr class="success"><td>9</td><td id="future5nine"> </td><td id="future6nine"> </td><td id="future7nine"> </td><td id="future8nine"> </td><td id="future9nine"> </td></tr>
                        </tbody>
                    </table>
				<td>预测结果</td>
			</tr>
			<!-- 热门冷门数字偏差系统 -->
			<tr>
			     <td class="warning">
					<h3>热门冷门偏差系统分析</h3> <br />
					<button id="getremenlengmenfenxijieguo" onclick="getremenlengmenfenxijieguo()"
						class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="remenlengmenfenxi" ></div></td>
				<td>预测结果</td>
			</tr>
			<!-- 遗漏数字偏差系统 -->
			<tr>
				<td class="warning"><a
					href="${ pageContext.request.contextPath }/SixOneAction/SixOneActionFutureColdHot.action">热门冷门偏差系统分析</a></td>
				<td><div id="chart2" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<!-- 和数值偏差系统分析 -->
			<tr>
				<td class="warning">
					<h3>和数值偏差系统分析</h3> <br />
					<button id="getheshuzhifenxijieguo"
						onclick="getheshuzhifenxijieguo()" class="btn btn-primary btn-lg">执行</button>
				</td>
				<td><div id="chartgetheshuzhifenxijieguo"
						style="width: 900px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chart5" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chart6" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chart7" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath }/SixOneAction/SixOneActionFutureYiLou.action">遗漏数字偏差分析系统</a></td>
				<td><div id="chart8" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chart9" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr class="warning">
				<td>33333333333333333333</td>
				<td><div id="chart10" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
		</tbody>
	</table>
	<!-- 基本图 -->
	<script type="text/javascript">
		//曲线
		$.jqplot('chartdiv', [ [ [ 1, 2 ], [ 3, 5.12 ], [ 5, 13.1 ],
				[ 7, 33.6 ], [ 9, 85.9 ], [ 11, 219.9 ] ] ]);
		$.jqplot('chartdiv3', [ [ [ 1, 2 ], [ 3, 5.12 ], [ 5, 13.1 ],
				[ 7, 33.6 ], [ 9, 85.9 ], [ 11, 219.9 ] ] ], {
			title : 'Exponential Line',
			axes : {
				yaxis : {
					renderer : $.jqplot.LogAxisRenderer
				}
			},
			series : [ {
				color : '#5FAB78'
			} ]
		});
	</script>
	<!-- 柱状图 -->
	<script type="text/javascript">
		var line1 = [ [ 'Cup Holder Pinion Bob', 7 ],
				[ 'Generic Fog Lamp', 9 ], [ 'HDTV Receiver', 15 ],
				[ '8 Track Control Module', 12 ],
				[ ' Sludge Pump Fourier Modulator', 3 ],
				[ 'Transcender/Spice Rack', 6 ],
				[ 'Hair Spray Danger Indicator', 18 ] ];
		$.jqplot('chart1', [ line1 ], {
			title : '柱状图',
			series : [ {
				renderer : $.jqplot.BarRenderer
			} ],
			axes : {
				xaxis : {
					renderer : $.jqplot.CategoryAxisRenderer
				}
			}
		});
	</script>
	<!-- 单柱状图 -->
	<script type="text/javascript">
		var line1 = [ [ 'Cup Holder Pinion Bob', 7 ],
				[ 'Generic Fog Lamp', 9 ], [ 'HDTV Receiver', 15 ],
				[ '8 Track Control Module', 12 ],
				[ ' Sludge Pump Fourier Modulator', 3 ],
				[ 'Transcender/Spice Rack', 6 ],
				[ 'Hair Spray Danger Indicator', 18 ] ];
		$.jqplot('chart2', [ line1 ], {
			title : '柱状图',
			series : [ {
				renderer : $.jqplot.BarRenderer
			} ],
			axesDefaults : {
				tickRenderer : $.jqplot.CanvasAxisTickRenderer,
				tickOptions : {
					fontFamily : 'Georgia',
					angle : -30,
					fontSize : '10pt'
				}
			},
			axes : {
				xaxis : {
					renderer : $.jqplot.CategoryAxisRenderer
				}
			}
		});
	</script>
	<!-- 饼图 -->
	<script type="text/javascript">
		var data = [ [ 'Heavy Industry', 12 ], [ 'Retail', 9 ],
				[ 'Light Industry', 14 ], [ 'Out of home', 16 ],
				[ 'Commuting', 7 ], [ 'Orientation', 9 ] ];
		var plot1 = jQuery.jqplot('chart5', [ data ], {
			seriesDefaults : {
				// Make this a pie chart.
				// 设置绘制一个饼状图
				renderer : jQuery.jqplot.PieRenderer,
				rendererOptions : {
					// Put data labels on the pie slices.
					// By default, labels show the percentage of the slice.
					// 展示饼块的数据
					showDataLabels : true
				}
			},
			// 展示图标，在图标的右侧
			legend : {
				show : true,
				location : 'e'
			}
		});
	</script>
	<!-- 饼图2 -->
	<script type="text/javascript">
		var data = [ [ 'Heavy Industry', 12 ], [ 'Retail', 9 ],
				[ 'Light Industry', 14 ], [ 'Out of home', 16 ],
				[ 'Commuting', 7 ], [ 'Orientation', 9 ] ];
		var plot2 = jQuery.jqplot('chart6', [ data ], {
			seriesDefaults : {
				renderer : jQuery.jqplot.PieRenderer,
				rendererOptions : {
					// Turn off filling of slices.
					// 设置不填充饼块
					fill : false,
					showDataLabels : true,
					// Add a margin to seperate the slices.
					// 饼块之间的距离为4px
					sliceMargin : 4,
					// stroke the slices with a little thicker line.
					// 饼块的线宽为5px
					lineWidth : 5
				}
			},
			legend : {
				show : true,
				location : 'e'
			}
		});
	</script>
	<!-- 柱状图3 -->
	<script type="text/javascript">
		var s1 = [ 200, 600, 700, 1000 ];
		var s2 = [ 460, -210, 690, 820 ];
		var s3 = [ -260, -440, 320, 200 ];
		// Can specify a custom tick Array.
		// Ticks should match up one for each y value (category) in the series.
		// 定义x轴的刻度数组，需与数据相对应
		var ticks = [ 'May', 'June', 'July', 'August' ];
		var plot1 = $.jqplot('chart7', [ s1, s2, s3 ], {
			// The "seriesDefaults" option is an options object that will
			// be applied to all series in the chart.
			seriesDefaults : {
				renderer : $.jqplot.BarRenderer,
				// 强制填充到0值
				rendererOptions : {
					fillToZero : true
				}
			// 若使用fillToValue,则可设置填充到的数值
			},
			// Custom labels for the series are specified with the "label"
			// option on the series option.  Here a series option object
			// is specified for each series.
			// 设置三条数据的标识label，依次对应
			series : [ {
				label : 'Hotel'
			}, {
				label : 'Event Regristration'
			}, {
				label : 'Airfare'
			} ],
			// Show the legend and put it outside the grid, but inside the
			// plot container, shrinking the grid to accomodate the legend.
			// A value of "outside" would not shrink the grid and allow
			// the legend to overflow the container.
			legend : {
				show : true,
				// 设置标识在图表外，元素内（在canvas内）
				placement : 'outsideGrid'
			},
			axes : {
				// Use a category axis on the x axis and use our custom ticks.
				// x轴使用CategoryAxisRenderer渲染器
				xaxis : {
					renderer : $.jqplot.CategoryAxisRenderer,
					ticks : ticks
				},
				// Pad the y axis just a little so bars can get close to, but
				// not touch, the grid boundaries.  1.2 is the default padding.
				yaxis : {
					pad : 1.05,
					tickOptions : {
						formatString : '$%d'
					}
				}
			}
		});
	</script>
	<!-- 柱状图4 -->
	<script type="text/javascript">
		// For horizontal bar charts, x an y values must will be "flipped"
		// from their vertical bar counterpart.
		var plot2 = $.jqplot('chart8', [
				[ [ 2, 1 ], [ 4, 2 ], [ 6, 3 ], [ 3, 4 ] ],
				[ [ 5, 1 ], [ 1, 2 ], [ 3, 3 ], [ 4, 4 ] ],
				[ [ 4, 1 ], [ 7, 2 ], [ 1, 3 ], [ 2, 4 ] ] ], {
			seriesDefaults : {
				renderer : $.jqplot.BarRenderer,
				// Show point labels to the right ('e'ast) of each bar.
				// edgeTolerance of -15 allows labels flow outside the grid
				// up to 15 pixels.  If they flow out more than that, they 
				// will be hidden.
				pointLabels : {
					show : true,
					location : 'e',
					edgeTolerance : -15
				},
				// Rotate the bar shadow as if bar is lit from top right.
				// 柱块的阴影角度为135度
				shadowAngle : 135,
				// Here's where we tell the chart it is oriented horizontally.
				// 设置为水平柱状图
				rendererOptions : {
					barDirection : 'horizontal'
				}
			},
			axes : {
				yaxis : {
					renderer : $.jqplot.CategoryAxisRenderer
				}
			}
		});
	</script>
	<!--  点击图表更新文本 -->
	<script type="text/javascript">
		$(document).ready(function() {
			var s1 = [ 2, 6, 7, 10 ];
			var s2 = [ 7, 5, 3, 4 ];
			var s3 = [ 14, 9, 3, 8 ];
			plot3 = $.jqplot('chart9', [ s1, s2, s3 ], {
				// Tell the plot to stack the bars.
				stackSeries : true,
				captureRightClick : true,
				seriesDefaults : {
					renderer : $.jqplot.BarRenderer,
					rendererOptions : {
						barMargin : 30,
						highlightMouseDown : true
					},
					pointLabels : {
						show : true
					}
				},
				axes : {
					xaxis : {
						renderer : $.jqplot.CategoryAxisRenderer
					},
					yaxis : {
						padMin : 1
					}
				},
				legend : {
					show : true,
					location : 'e',
					placement : 'outside'
				}
			});
		});
	</script>
	<!-- 大数小数偏差系统分析-->
	<script type="text/javascript">
		function getdaxiaofenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureBigSmall.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							BIGSHU = json.integersBIG;
							SMALLSHU = json.integersSMALL;
							
							ticks2 = json.qishulist;
							
							$("#zongdashu").html(json.zongbig);
							$("#zongxiaoshu").html(json.zongsmall);
							$("#zongdaxiaocha").html(json.cha);
							
							$
									.jqplot(
											'chatgetdaxiaofenxijieguo',
											[ BIGSHU, SMALLSHU ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '大数:>25'
												}, {
													label : '小数:<=25'
												} ],
												legend : {
													show : true,
													placement : 'outsideGrid'
												},
												title : {
													text : '大数小数偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 0, 1, 2, 3,
																4, 5, 6, 7, 8,
																9, 10 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 和数值偏差系统分析-->
	<script type="text/javascript">
		function getheshuzhifenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureHeShuzhi.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							heshuzhiList = json.heshuzhiList;
							middlesumiList = json.middlesumiList;
							ticks2 = json.qishulist;
							$
									.jqplot(
											'chartgetheshuzhifenxijieguo',
											[ heshuzhiList, middlesumiList ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '和数值 :每一期的数字之和'
												}, {
													label : '和中值 :175'
												} ],
												legend : {
													show : true,
													placement : 'outsideGrid'
												},
												title : {
													text : '和数值偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 105, 110, 115,
																120, 125, 130, 135,
																140, 145, 150,
																155, 160, 165,
																170, 175, 180,
																185, 190, 195,
																200, 205, 210,
																215, 220, 225,
																230, 235, 240,245,250,255,260 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
    <!-- 奇数偶数偏差系统分析-->
	<script type="text/javascript">
		function getjisoufenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureOddEven.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							JISHU = json.integersODD;
							OUSHU = json.integersEVEN;
							ticks2 = json.qishulist;
							$("#zongjishu").html(json.odd);
							$("#zongoushu").html(json.even);
							$("#zongcha").html(json.cha);
							//显示图表
							$
									.jqplot(
											'chartgetjisoufenxijieguo',
											[ JISHU, OUSHU ],
											{
												seriesDefaults : {
													renderer : $.jqplot.BarRenderer, //使用柱状图表示
													rendererOptions : {
														barMargin : 50,
														highlightMouseDown : true
													}
												},
												series : [ {
													label : '奇数'
												}, {
													label : '偶数'
												}
												],
												legend : {
													show : true,
													// 设置标识在图表外，元素内（在canvas内）
													placement : 'outsideGrid'
												},
												title : {
													text : '奇数偶数偏差系统分析', //设置当前图的标题
													show : true,//设置当前图的标题是否显示
												},
												axes : {
													xaxis : {
														ticks : ticks2,
														renderer : $.jqplot.CategoryAxisRenderer,
														pad : 1,
														tickOptions : {
															fontSize : '13px'
														},
														showTicks : true
													},
													yaxis : {
														ticks : [ 0, 1, 2, 3,
																4, 5, 6, 7, 8,
																9, 10 ],
														renderer : $.jqplot.LinearAxisRenderer,
														pad : 1
													}
												}
											});
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 末位数字偏差系统分析-->
	<script type="text/javascript">
		function getjisouFutureMoWei() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureMoWei.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
                            $("#future5zero").html(json.zeroTop5);
							$("#future5one").html(json.oneTop5);
                            $("#future5two").html(json.twoTop5);
                            $("#future5three").html(json.threeTop5);
                            $("#future5four").html(json.fourTop5);
                            $("#future5five").html(json.fiveTop5);
                            $("#future5six").html(json.sixTop5);
                            $("#future5seven").html(json.sevenTop5);
                            $("#future5eight").html(json.eightTop5);
                            $("#future5nine").html(json.nineTop5);
                            $("#future6zero").html(json.zeroTop6);
							$("#future6one").html(json.oneTop6);
                            $("#future6two").html(json.twoTop6);
                            $("#future6three").html(json.threeTop6);
                            $("#future6four").html(json.fourTop6);
                            $("#future6five").html(json.fiveTop6);
                            $("#future6six").html(json.sixTop6);
                            $("#future6seven").html(json.sevenTop6);
                            $("#future6eight").html(json.eightTop6);
                            $("#future6nine").html(json.nineTop6);
                            $("#future7zero").html(json.zeroTop7);
							$("#future7one").html(json.oneTop7);
                            $("#future7two").html(json.twoTop7);
                            $("#future7three").html(json.threeTop7);
                            $("#future7four").html(json.fourTop7);
                            $("#future7five").html(json.fiveTop7);
                            $("#future7six").html(json.sixTop7);
                            $("#future7seven").html(json.sevenTop7);
                            $("#future7eight").html(json.eightTop7);
                            $("#future7nine").html(json.nineTop7);
                            $("#future8zero").html(json.zeroTop8);
							$("#future8one").html(json.oneTop8);
                            $("#future8two").html(json.twoTop8);
                            $("#future8three").html(json.threeTop8);
                            $("#future8four").html(json.fourTop8);
                            $("#future8five").html(json.fiveTop8);
                            $("#future8six").html(json.sixTop8);
                            $("#future8seven").html(json.sevenTop8);
                            $("#future8eight").html(json.eightTop8);
                            $("#future8nine").html(json.nineTop8);
                            $("#future9zero").html(json.zeroTop9);
							$("#future9one").html(json.oneTop9);
                            $("#future9two").html(json.twoTop9);
                            $("#future9three").html(json.threeTop9);
                            $("#future9four").html(json.fourTop9);
                            $("#future9five").html(json.fiveTop9);
                            $("#future9six").html(json.sixTop9);
                            $("#future9seven").html(json.sevenTop9);
                            $("#future9eight").html(json.eightTop9);
                            $("#future9nine").html(json.nineTop9);
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
	<!-- 热门冷门数字偏差系统分析-->
	<script type="text/javascript">
		function getremenlengmenfenxijieguo() {
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureColdHot.action',
						dataType : "json",
						success : function(data) {
							var json = eval('(' + data + ')');
							alert(data);
							var table = document.createElement("table");//创建表格
							table.setAttribute("class", "table table-bordered");//给表格设置属性
						//	table.setAttribute("border", 1);//给表格设置属性
						//	table.addClass("table table-bordered");
	                        var trhead = document.createElement("tr");//创建表头
	                        var tdqishuhead = document.createElement("td"); //创建单元格子
                            var tdnumberhead = document.createElement("td"); //创建单元格子
                            var tdyilouqingkuanghead = document.createElement("td"); //创建单元格子
                            var tdzongyilougeshuhead = document.createElement("td"); //创建单元格子
                            var tdyiloucishuzongshuhead = document.createElement("td"); //创建单元格子
                            var tdyiloupingjungeshuhead = document.createElement("td"); //创建单元格子
                            tdqishuhead.innerHTML = "期数";
                            tdnumberhead.innerHTML = "开奖数字";
                            tdyilouqingkuanghead.innerHTML = "遗漏情况";
                            tdzongyilougeshuhead.innerHTML = "遗漏次数<10 的个数 (和)";
                            tdyiloucishuzongshuhead.innerHTML = "7个开奖数字的遗漏次数的和";
                            tdyiloupingjungeshuhead.innerHTML = "遗漏次数的和 / 7= 遗漏平均次数";
                            trhead.appendChild(tdqishuhead);
                            trhead.appendChild(tdnumberhead);
                            trhead.appendChild(tdyilouqingkuanghead);
                            trhead.appendChild(tdzongyilougeshuhead);
                            trhead.appendChild(tdyiloucishuzongshuhead);
                            trhead.appendChild(tdyiloupingjungeshuhead);
							//获取每一行的数据
							table.appendChild(trhead);
							for(i=0;i<json.length; i++){ //行数跟json.length一样
							   var tr = document.createElement("tr");//创建每一行
							   var tdqishu = document.createElement("td"); //创建单元格子
                               var tdnumber = document.createElement("td"); //创建单元格子
                               var tdyilouqingkuang = document.createElement("td"); //创建单元格子
                               var tdzongyilougeshu = document.createElement("td"); //创建单元格子
                               var tdyiloucishuzongshu = document.createElement("td"); //创建单元格子
                               var tdyiloupingjungeshu = document.createElement("td"); //创建单元格子
                               tdqishu.innerHTML = json[i].qishu;
                               tdnumber.innerHTML = json[i].number;
                               tdyilouqingkuang.innerHTML = json[i].yilouqingkuang;
                               tdzongyilougeshu.innerHTML = json[i].zongyilougeshu;
                               tdyiloucishuzongshu.innerHTML = json[i].yiloucishuzongshu;
                               tdyiloupingjungeshu.innerHTML = json[i].yiloupingjungeshu;
                               tr.appendChild(tdqishu);
                               tr.appendChild(tdnumber);
                               tr.appendChild(tdyilouqingkuang);
                               tr.appendChild(tdzongyilougeshu);
                               tr.appendChild(tdyiloucishuzongshu);
                               tr.appendChild(tdyiloupingjungeshu);
                               table.appendChild(tr);
							}
							document.getElementById("remenlengmenfenxi").appendChild(table);
						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});
		}
	</script>
</body>
</html>