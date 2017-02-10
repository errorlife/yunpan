<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="../js/upload/webuploader-0.1.5/webuploader.css">


</head>
<body>
	<div id="uploader" class="wu-example">
		<!--用来存放文件信息-->
		<div id="thelist" class="uploader-list"></div>
		<div class="btns">
			<div id="picker">选择文件</div>
			<button id="ctlBtn" class="btn btn-default">开始上传</button>
		</div>
	</div>

<!-- 	<div id="uploader-demo">
		用来存放item
		<div id="fileList" class="uploader-list"></div>
		<div id="filePicker">选择图片</div>
	</div> -->
</body>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.9.1/jquery.min.js"></script>

<script type="text/javascript"src="../js/upload/webuploader-0.1.5/webuploader.nolog.min.js"></script>

<script type="text/javascript" src="../js/upload/upload.js"></script>

</html>