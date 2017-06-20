<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Banner -->
<!-- Content -->
<section>
	<form method="post" action="<c:url value='/debate/new/'/>" enctype="multipart/form-data">
		<header class="main">
			<h2>토론제목</h2>
			<input type="text" placeholder="토론제목" name="title">
		</header>
	
		<hr class="major" />
	
	
		<h2>대표이미지</h2>
		<div class="filebox preview-image"> 
			<input type="file" name="refImage">
		</div>
	
	
		<hr class="major" />
	
	
		<h2>토론개요</h2>
		<textarea rows=10 style="resize:none;" name="summary"></textarea>
	
		<hr class="major" />
	
		<h2>찬성측 의견</h2>
		<p><b>찬성측 주장</b></p>
		<p>
			<textarea rows=10 style="resize:none;" name="prosopinion"></textarea>
		</p>
	
		<p><b>찬성측 논거</b></p>
		<p>
			<textarea rows=10 style="resize:none;" name="prosbasis"></textarea>
		</p>
	
		<hr class="major" />
	
		<h2>반대측 의견</h2>
		<p><b>반대측 주장</b></p>
		<p>
			<textarea rows=10 style="resize:none;" name="consopinion"></textarea>
		</p>
		<p><b>반대측 논거</b></p>
		<p>
			<textarea rows=10 style="resize:none;" name="consbasis"></textarea>
		</p>
	
		<hr class="major" />
	
		<h2>참고자료</h2>
		<p>
			<textarea rows=10 style="resize:none;" name="refs"></textarea>
		</p>
	
		<hr class="major" />
		<p style="text-align: right;">
			<input type="submit" value="등록하기" class="special"><input type="button" value="돌아가기" style="margin-left:3px;">
		</p>
	</form>
</section>