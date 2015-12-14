<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
</head>
<body>


    <!-- 打开对话框模块 -->
	<button data-toggle="modal" data-target="#myModal"
		data-keyboard="false" class="sui-btn btn-primary btn-lg">对话框已写入html</button>
	<!-- Modal-->
	<div id="myModal" tabindex="-1" role="dialog" data-hasfoot="false"
		class="sui-modal hide fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" data-dismiss="modal" aria-hidden="true"
						class="sui-close">×</button>
					<h4 id="myModalLabel" class="modal-title">Modal title</h4>
				</div>
				<div class="modal-body">我是内容body</div>
				<div class="modal-footer">
					<button type="button" data-ok="modal"
						class="sui-btn btn-primary btn-large">可自定ok</button>
					<button type="button" data-dismiss="modal"
						class="sui-btn btn-default btn-large">可自定dismiss</button>
				</div>
			</div>
		</div>
	</div>
	<script>
      $('#myModal').on('okHide', function(e){console.log('okHide')})
      $('#myModal').on('okHidden', function(e){console.log('okHidden')})
      $('#myModal').on('cancelHide', function(e){console.log('cancelHide')})
      $('#myModal').on('cancelHidden', function(e){console.log('cancelHidden')})
    </script>


</body>
</html>