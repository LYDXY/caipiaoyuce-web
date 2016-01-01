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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dhtmlx Sky Blue Style Grid</title>
<!-- grid.simple.min.css, grid.simple.min.js -->

<link rel="stylesheet" href="../css/bsgrid.all.min.css" />
<link rel="stylesheet" href="../css/example.css" />
<style type="text/css">
.d-content {
	width: 100%;
	height: 100%;
	overflow-y: auto;
}
</style>

<link rel="stylesheet" href="../css/grid_sky_blue.min.css" />
<script type="text/javascript" src="../js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../js/grid.zh-CN.min.js"></script>
<script type="text/javascript" src="../js/bsgrid.all.min.js"></script>
<link rel="stylesheet" href="../css/blue.css" />
<link rel="stylesheet" href="../css/artDialog.skins.override.css" />
<script type="text/javascript" src="../js/jquery.artDialog.min.js"></script>
<script type="text/javascript" src="../js/artDialog.plugins.min.js"></script>
<script type="text/javascript" src="../js/override.grid.js"></script>
<script type="text/javascript"
	src="../js/artDialog.plugin.override.en.js"></script>
<script type="text/javascript" src="../js/artDialog.plugin.override.js"></script>
<script type="text/javascript" src="../js/override.pop.js"></script>
</head>
<body style="background-color: #fff;">
	<br>
	cswzxly ----lin8879372----------8879372
	
	<br>




	<input type="button" onclick="doAdd()" value="添加一条新的数据" />


	<br>
	<br>
	<!-- 表格模块 -->
	<table id="searchTable">
		<tr>
			<th w_sort="qishu,desc" w_index="qishu" width="5%;">期数<a
				class="sort sort-desc" sortname="qishu" href="#"></a></th>
			<th w_index="first" width="5%;">球1</th>
			<th w_index="second" width="5%;">球2</th>
			<th w_index="third" width="5%;">球3</th>
			<th w_index="fourth" width="5%;">球4</th>
			<th w_index="fifth" width="5%;">球5</th>
			<th w_index="sixth" width="5%;">球6</th>
			<th w_index="seventh" width="5%;">球7</th>
			<th w_index="ID" w_render="operate" width="10%;">操作</th>
		</tr>
	</table>

	<div>
		<a
			href="${ pageContext.request.contextPath }/SixOne2Action/SixOne2ActionFuture.action">未来一期系统分析</a>
		<br>
	</div>
	<!-- 对话框模块 -->
	<div id="artDialog-gridForm" style="display: none;">
		<form id="gridForm" class="bsgrid_form">
			<table>
				<tr>
					<td class="formLabel">期数</td>
					<td class="formInput"><input id="form_qishu" name="qishu"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球1</td>
					<td class="formInput"><input id="form_first" name="first"
						type="text" /></td>
				</tr>

				<tr>
					<td class="formLabel">球2</td>
					<td class="formInput"><input id="form_second" name="second"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球3</td>
					<td class="formInput"><input id="form_third" name="third"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球4</td>
					<td class="formInput"><input id="form_fourth" name="fourth"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球5</td>
					<td class="formInput"><input id="form_fifth" name="fifth"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球6</td>
					<td class="formInput"><input id="form_sixth" name="sixth"
						type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">球7</td>
					<td class="formInput"><input id="form_seventh" name="seventh"
						type="text" /></td>
				</tr>
				<tr>
					<td colspan="2"
						style="text-align: center; border-left-width: 0; border-right-width: 0; border-bottom-width: 0;">
						<input type="button" value="确定" onclick="doCommit();" /> &emsp; <input
						type="button" value="取消" onclick="gridFormDialog.hidden();" />
					</td>
				</tr>
			</table>
		</form>
	</div>

	<!-- 脚本模块 -->
	<script type="text/javascript">
		var gridObj;

		var gridFormObject;
		var gridFormDialog;
		$(function() {
			gridObj = $.fn.bsgrid
					.init(
							'searchTable',
							{
								url : '${ pageContext.request.contextPath }/SixOne2Action/SixOne2ActionGetSixOne2sByFenYe.action',
								// autoLoad: false,
								pageSizeSelect : true,
								stripeRows : true,
								pageSize : 20
							});
			if ($('#artDialog-gridForm').length == 1) {
				var gridFormHtml = $("#artDialog-gridForm").html();
				$("#artDialog-gridForm").html('');
				gridFormDialog = $.dialog({
					id : 'artDialog-gridForm-dialog',
					title : 'Form',
					width : 400,
					height : 350,
					padding : '0px 0px 0px 0px',
					content : gridFormHtml,
					lock : true,
					fixed : true,
					ok : false,
					okValue : false,
					cancel : function() {
						gridFormDialog.hidden();
						return false;
					},
					visible : false
				});
			}

			// grid form obj, note grid form should init after artDialog
			gridFormObject = $.fn.bsgrid_form.init('gridForm', {});

			doSearch();
		});

		/*  function operate(record, rowIndex, colIndex, options) {
		     return '<a href="#" onclick="alert(\'期数=' + gridObj.getRecordIndexValue(record, 'XH') + '\');">操作</a>';
		 } */

		function doSearch() {
			console
					.log('Search params: [' + $('#searchForm').serialize()
							+ ']');
			gridObj.options.otherParames = $('#searchForm').serializeArray();
			gridObj.page(1);
		}

		function operate(record, rowIndex, colIndex, options, options) {
			return '<a href="#" onclick="doView(' + rowIndex + ');">View</a>'
					+ '&emsp;<a href="#" onclick="doEdit(' + rowIndex
					+ ');">Edit</a>' + '&emsp;<a href="#" onclick="doDelete('
					+ rowIndex + ');">Delete</a>';
		}

		function doAdd() {
			//	var qishu;
			$('#gridForm')[0].reset();

			//	alert();

			//查询最新的期数
			$
					.ajax({
						type : "POST",
						url : '${pageContext.request.contextPath }/ajaxSixOne2Action/ajaxSixOne2ActionMaxQishu.action',
						dataType : "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
						success : function(result) {
							$("#form_qishu").val(result);
							showFormDialog('add');

						},
						error : function(result) {
							alert("系统异常,请重新尝试");
							return false;
						}
					});

		}

		function doView(rowIndex) {
			fillDataAndShowFormDialog('view', rowIndex);
		}

		function doEdit(rowIndex) {
			fillDataAndShowFormDialog('edit', rowIndex);
		}

		function fillDataAndShowFormDialog(type, rowIndex) {
			// get record by rowIndex: gridObj.getRecord(rowIndex)
			// get column value by record and index: gridObj.getRecordIndexValue(record, index)
			// get column value by rowIndex and index: gridObj.getColumnValue(rowIndex, index)
			var record = gridObj.getRecord(rowIndex);
			$('#gridForm :input').each(
					function() {
						var input_name = $.trim($(this).attr('name'));
						if (input_name != '') {
							var input_value = gridObj.getRecordIndexValue(
									record, input_name);
							if ($(this).attr('type') == 'radio'
									|| $(this).attr('type') == 'checkbox') {
								if ((',' + input_value + ',').indexOf(','
										+ $(this).val() + ',') > -1) {
									$.bsgrid.adaptAttrOrProp($(this),
											'checked', true);
								} else {
									$.bsgrid.adaptAttrOrProp($(this),
											'checked', false);
								}
							} else {
								$(this).val(input_value);
							}
						}
					});
			showFormDialog(type);
		}

		function showFormDialog(type) {
			gridFormObject.showForm(type);
			if (type == 'view') {
				$('#gridForm :button[value="确定"]').hide();
				$('#gridForm :button[value="取消"]').hide();
			}
			if (type == 'edit') {
				$('#gridForm :button[value=确定]').show();
				$('#gridForm :button[value="取消"]').show();
			}
			if (type == 'add') {
				$('#gridForm :button[value=确定]').show();
				$('#gridForm :button[value="取消"]').show();
			}
			gridFormDialog.title(type);
			// hide artDialog footer
			$(
					'div[aria-labelledby=d-title-artDialog-gridForm-dialog] .d-footer')
					.hide();
			gridFormDialog.visible();
		}
		//删除操作
		function doDelete(rowIndex) {
			var id = gridObj.getColumnValue(rowIndex, 'ID');
			$.confirm('Delete?', function() {
				alert('delete. ID=' + id);
			});
		}
		// 提交  添加一条新的记录到数据库
		function doCommit() {
			var params = {
				qishu : $("#form_qishu").val(),
				first : $("#form_first").val(),
				second : $("#form_second").val(),
				third : $("#form_third").val(),
				fourth : $("#form_fourth").val(),
				fifth : $("#form_fifth").val(),
				sixth : $("#form_sixth").val(),
				seventh : $("#form_seventh").val()

			};
			$
					.ajax({
						type : "POST",
						url : '${ pageContext.request.contextPath }/ajaxSixOne2Action/SixOne2ActionAddSixOne2.action',
						data : params,
						dataType : "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
						success : function(data) {
							if (data == "添加成功") {
								gridObj.refreshPage(); //刷新
								var qi = $("#form_qishu").val(); //获取最新期数
								$('#gridForm')[0].reset(); //重置
								var c = parseInt(qi) + 1; //再加
								$("#form_qishu").val(c);
								alert(data);

							} else {
								alert(data);
							}

						},
						error : function(data) {
							alert("系统异常,请重新尝试");
						}
					});

		}
	</script>



</body>
</html>