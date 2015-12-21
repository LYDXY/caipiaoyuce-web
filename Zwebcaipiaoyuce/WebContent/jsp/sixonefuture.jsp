<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	
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

<script src="../jqplot/js/plugins/jqplot.logAxisRenderer.js"></script>

<!-- 饼图 -->
<script src="../jqplot/js/plugins/jqplot.pieRenderer.min.js"></script>
<script src="../jqplot/js/plugins/jqplot.donutRenderer.min.js"></script>

</head>
<body>

	<div id="chartdiv" style="height: 400px; width: 300px;"></div>
	<div id="chartdiv2" style="height: 400px; width: 300px;"></div>
	<div id="chartdiv3" style="height: 400px; width: 300px;"></div>
	<div id="chart1" style="width: 500px; height: 300px;"></div>
	<div id="chart2" style="width: 500px; height: 300px;"></div>
	<div id="chart3" style="width: 500px; height: 300px;"></div>
	<div id="chart4" style="width: 500px; height: 300px;"></div>
	<div id="chart5" style="width: 500px; height: 300px;"></div>
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

	<!-- 双 柱状图-->
	<script type="text/javascript">
		line1 = [ 4, 7, 9, 16 ]; //子统计1数据
		line2 = [ 3, 7, 9.25, 3.125 ]; //子统计2数据
		$.jqplot('chart3', [ line1, line2 ], {
			seriesDefaults : {
				renderer : $.jqplot.BarRenderer, //使用柱状图表示
				rendererOptions : {
					barMargin : 35
				//柱状体组之间间隔
				}
			}
		});

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

</body>
</html>