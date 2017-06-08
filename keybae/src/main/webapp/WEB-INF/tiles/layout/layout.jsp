<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>키배닷컴 :: Keybae.com</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="apple-touch-icon" href="icon.png">
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/main.css'/>"/>
<style>
</style>
</head>
<body>
	<div id="wrapper">
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
</body>
</html>