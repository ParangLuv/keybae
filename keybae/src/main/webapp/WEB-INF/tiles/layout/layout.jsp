<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
@import url(//fonts.googleapis.com/earlyaccess/notosanskr.css);
@import url(//fonts.googleapis.com/css?family=Roboto+Slab);
</style>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>키배닷컴 :: Keybae.com</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/resources/img/icon.png'/>">
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/layout.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/header.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/sidebar.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/msection.css'/>" />
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/footer.css'/>" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="<c:url value='/resources/js/kb.js'/>"></script>
</head>
<body>
	<div id="wrapper">
		<div id="main">
			<header id="header">
				<tiles:insertAttribute name="header" />
			</header>


			<section id="content">
				<tiles:insertAttribute name="content" />
			</section>


			<footer id="footer">
				<tiles:insertAttribute name="footer" />
			</footer>
		</div>
		<!-- main -->

		<div id="menuToggler">
			<a><img src= "<c:url value='/resources/img/nav.png'/>" /></a>
		</div>

		<div id="sidebar">
			<tiles:insertAttribute name="sidebar" />
		</div>
	</div>
	<!-- wrapper -->
</body>
</html>