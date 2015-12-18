<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<!-- 获取数据的地方 -->
<%
	String path = request.getContextPath();
	String domain = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
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
	<br>
	<!-- 搜索模块 -->
	<form id="searchForm">
		参数1:&nbsp;<input type="text" name="first" /> &emsp; NUM:&nbsp;<input
			type="text" name="XH" /> &emsp; <input type="button"
			onclick="doSearch();" value="搜索" /> &nbsp; &emsp; <input
			type="button" onclick="doAdd();" value="添加一条新的数据" />
	</form>
	<br>
	<br>
	<!-- 表格模块 -->
	<table id="searchTable">
		<tr>
			<th w_sort="XH,desc" w_index="XH" width="5%;">期数<a
				class="sort sort-desc" sortname="XH" href="#"></a></th>
			<th w_index="first" width="5%;">球1</th>
			<th w_index="CHAR" width="5%;">球2</th>
			<th w_index="TEXT" width="5%;">球3</th>
			<th w_index="fourth" width="5%;">球4</th>
			<th w_index="DATE" width="5%;">球5</th>
			<th w_index="TIME" width="5%;">球6</th>
			<th w_index="NUM" width="5%;">球7</th>
			<th w_index="ID" w_render="operate" width="10%;">操作</th>
		</tr>
	</table>
	<!-- 对话框模块 -->
	<div id="artDialog-gridForm" style="display: none;">
		<form id="gridForm" class="bsgrid_form">
			<table>
				<tr showType="false">
					<td class="formLabel">ID:</td>
					<td class="formInput"><input name="ID" type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel"><span class="require">*</span>XH:</td>
					<td class="formInput"><input name="XH" type="text"
						editAble="false" /> <span class="inputTip" showType="add">Must
							unique</span></td>
				</tr>
				<tr>
					<td class="formLabel">CHAR:</td>
					<td class="formInput"><input name="CHAR" type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">TEXT:</td>
					<td class="formInput"><textarea name="TEXT"></textarea></td>
				</tr>
				<tr>
					<td class="formLabel">DATE:</td>
					<td class="formInput"><input name="DATE" type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">TIME:</td>
					<td class="formInput"><input name="TIME" type="text" /></td>
				</tr>
				<tr>
					<td class="formLabel">NUM:</td>
					<td class="formInput"><input name="NUM" type="text" /></td>
				</tr>
				<tr>
					<td colspan="2"
						style="text-align: center; border-left-width: 0; border-right-width: 0; border-bottom-width: 0;">
						<input type="button" value="Save" onclick="doCommit();" /> &emsp;
						<input type="button" value="Cancel"
						onclick="gridFormDialog.hidden();" />
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
    $(function () {
        gridObj = $.fn.bsgrid.init('searchTable', {
            url: '${ pageContext.request.contextPath }/SixOneAction/SixOneActionGetSixOnesByFenYe.action',
            // autoLoad: false,
            pageSizeSelect: true,
            stripeRows: true,
            pageSize: 10
        });
        if ($('#artDialog-gridForm').length == 1) {
            var gridFormHtml = $("#artDialog-gridForm").html();
            $("#artDialog-gridForm").html('');
            gridFormDialog = $.dialog({
                id: 'artDialog-gridForm-dialog',
                title: 'Form',
                width: 400,
                height: 350,
                padding: '0px 0px 0px 0px',
                content: gridFormHtml,
                lock: true,
                fixed: true,
                ok: false,
                okValue: false,
                cancel: function () {
                    gridFormDialog.hidden();
                    return false;
                },
                visible: false
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
        console.log('Search params: [' + $('#searchForm').serialize() + ']');
        gridObj.options.otherParames = $('#searchForm').serializeArray();
        gridObj.page(1);
    }

    function operate(record, rowIndex, colIndex, options, options) {
        return '<a href="#" onclick="doView(' + rowIndex + ');">View</a>'
                + '&emsp;<a href="#" onclick="doEdit(' + rowIndex + ');">Edit</a>'
                + '&emsp;<a href="#" onclick="doDelete(' + rowIndex + ');">Delete</a>';
    }

    function doAdd() {
        $('#gridForm')[0].reset();
        showFormDialog('add');
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
        $('#gridForm :input').each(function () {
            var input_name = $.trim($(this).attr('name'));
            if (input_name != '') {
                var input_value = gridObj.getRecordIndexValue(record, input_name);
                if ($(this).attr('type') == 'radio' || $(this).attr('type') == 'checkbox') {
                    if ((',' + input_value + ',').indexOf(',' + $(this).val() + ',') > -1) {
                        $.bsgrid.adaptAttrOrProp($(this), 'checked', true);
                    } else {
                        $.bsgrid.adaptAttrOrProp($(this), 'checked', false);
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
            $('#gridForm :button[value=Save]').hide();
        } else {
            $('#gridForm :button[value=Save]').show();
        }
        gridFormDialog.title(type);
        // hide artDialog footer
        $('div[aria-labelledby=d-title-artDialog-gridForm-dialog] .d-footer').hide();
        gridFormDialog.visible();
    }

    function doDelete(rowIndex) {
        var id = gridObj.getColumnValue(rowIndex, 'ID');
        $.confirm('Delete?', function () {
            alert('delete. ID=' + id);
        });
    }

    function doCommit() {
        var type = gridFormObject.options.formType;;
        if (type == 'view') {
            alert('This is view.');
        } else if (type == 'add') {
            alert($('#gridForm').serialize() + '&amp;formType=' + type);
        } else if (type == 'edit') {
            // editAble false not commit
            alert($('#gridForm :not([editAble="false"])').serialize() + '&amp;formType=' + type);
        } else {
            alert('None.');
        }
    }
    
    
</script>
</body>
</html>