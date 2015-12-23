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

			<tr>
				<td class="warning">
					<h3>奇数偶数偏差系统分析</h3>
					<br />
					<button id="getjisoufenxijieguo" onclick="getjisoufenxijieguo()"
						class="btn btn-primary btn-lg">执行</button></td>
				<td><div id="chartgetjisoufenxijieguo"
						style="height: 400px; width: 900px;"></div></td>
				<td width="500px">预测结果</td>

			</tr>
			<tr>
				<td class="warning"><a
					href="${ pageContext.request.contextPath }/SixOneAction/SixOneActionFutureColdHot.action">热门冷门偏差系统分析</a></td>
				<td><div id="chartdiv2" style="height: 400px; width: 600px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chartdiv3" style="height: 400px; width: 600px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chart1" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td class="warning"><a
					href="${ pageContext.request.contextPath }/SixOneAction/SixOneActionFutureColdHot.action">热门冷门偏差系统分析</a></td>
				<td><div id="chart2" style="width: 600px; height: 400px;"></div></td>
				<td>预测结果</td>
			</tr>
			<tr>
				<td>33333333333333333333</td>
				<td><div id="chartdiv" style="width: 700px; height: 400px;"></div></td>
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
				<td>33333333333333333333</td>
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

		//曲线
		$.jqplot('chartdiv2', [ [ [ 1, 2 ], [ 3, 5.12 ], [ 5, 13.1 ],
				[ 7, 33.6 ], [ 9, 85.9 ], [ 11, 219.9 ] ] ], {
			title : 'Exponential Line',
			axes : {
				yaxis : {
					min : -10,
					max : 240
				}
			},
			series : [ {
				color : '#5FAB78'
			} ]
		});
		//直线
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

	<!-- 奇数偶数偏差系统分析-->
	<script type="text/javascript">
		line1 = [ 4, 3, 6, 1, 7, 0, 4, 3, 5, 2 ]; //子统计1数据
		line2 = [ 3, 4, 1, 6, 0, 7, 3, 4, 2, 5 ]; //子统计2数据
		var ticks = [ 2015, 2015, 2015, 2015 ];
		//奇数偶数个数分析
		function getjisoufenxijieguo() {
			//  alert();
			//获取服务器数据
			$.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOneAction/SixOneActionFutureOddEven.action',
					
						dataType : "json",
						success : function(data) {
							 var json = eval('(' + data + ')'); 
							 JISHU = json.integersODD;
						     OUSHU = json.integersEVEN;
							 ticks2 =json.qishulist;
							 ODD=json.odd;
							 EVEN=json.even;
							 CHA=json.cha;
							//显示图表
							$.jqplot('chartgetjisoufenxijieguo', [ JISHU, OUSHU ], {
								seriesDefaults : {
									renderer : $.jqplot.BarRenderer, //使用柱状图表示
									rendererOptions : {
										barMargin : 50,
										highlightMouseDown: true   
									
									}
									
								},
								series:[
							            {label:'奇数'},
							            {label:'偶数'}
							           
							        ],
							    legend: {
							            show: true,
							            // 设置标识在图表外，元素内（在canvas内）
							            placement: 'outsideGrid'
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
										tickOptions: {
											fontSize:'13px'
										},
										showTicks: true

									},
									yaxis : {
										ticks : [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ],
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
		$.jqplot('chart4', [ line1, line2 ], {
			seriesDefaults : {
				renderer : $.jqplot.BarRenderer, //使用柱状图表示
				rendererOptions : {
					barMargin : 10
				//柱状体组之间间隔
				}
			},
			axes : {
				xaxis : {
					ticks : [ '区域1', '区域2', '区域3', '区域4' ],
					renderer : $.jqplot.CategoryAxisRenderer
				//x轴绘制方式
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
		$(document).ready(
				function() {
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
</body>
</html>