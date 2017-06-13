<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
	@import url(//fonts.googleapis.com/earlyaccess/notosanskr.css);
	@import url(//fonts.googleapis.com/css?family=Roboto+Slab);
</style>
<title>키배닷컴 :: Keybae.com</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<link rel="icon" href="<c:url value='/resources/img/icon.png'/>">
<!-- [if let IE8]>
<script src="<c:url value='/resources/js/ie/html5shiv.js'/>" ></script><![endif]-->
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<!--[if lte IE 9]>
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/ie9.css'/>" /><![endif]-->
<!--[if lte IE 8]>
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/ie8.css'/>" /><![endif]-->
<style>
	ul.actions{
		margin-top:10px;
	}
	
	ul.actions li{
		display:flex !important;
	}

	.mbutton{
		margin: 0 3px;
		width:100%;
	}
		
</style>
</head>
<body>
	<div id="wrapper">
		<div id="main">
			<div class="inner">
				<header id="header">
					<tiles:insertAttribute name="header" />
				</header>
	
				<tiles:insertAttribute name="content" />
			</div>

		</div>
		<!-- main -->


		<div id="sidebar">
			<tiles:insertAttribute name="sidebar" />
		</div>
	</div>
	<!-- wrapper -->
	
	<!-- Scripts -->
			<script src="<c:url value='/resources/js/jquery.min.js'/>" ></script>
			<script src="<c:url value='/resources/js/skel.min.js'/>" ></script>
			<script src="<c:url value='/resources/js/util.js'/>" ></script>
			<!--[if lte IE 8]>
			<script src="<c:url value='/resources/js/ie/respond.min.js'/>" ></script>
       		<![endif]-->
			<script src="<c:url value='/resources/js/main.js'/>" ></script>
	
</body>
</html>