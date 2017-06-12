<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="inner">

	<section id="searchbar" class="alt">
		<form method="post" action="<c:url value='/search'/>">
			<input type="text" name="keyword" id="keyword" placeholder="검색">
		</form>
	</section>
	<!-- searchbar -->


	<!-- Section -->
	<section>
		<header class="major">
			<h2>회원센터</h2>
		</header>
		<div class="mini-posts">
			<input type="text" placeholder="아이디">
			<input type="text" placeholder="비밀번호">
		</div>
		<ul class="actions">
			<li><a href="<c:url value='/login'/>" class="button mbutton">로그인</a><a href="<c:url value='/join'/>" class="button mbutton">회원가입</a></li>
		</ul>
	</section>


	<!-- Menu -->
	<nav id="menu">
	
		<header class="major">
			<h2>메뉴</h2>
		</header>
		
		<ul>
			<li><a href="<c:url value='/'/>">홈으로</a></li>
			<li><a href="<c:url value='/notice'/>">공지사항</a></li>
			<li><span class="opener">커뮤니티</span>
				<ul>
					<li><a href="<c:url value='board/free'/>">자유게시판</a></li>
					<li><a href="<c:url value='board/news'/>">뉴스게시판</a></li>
					<li><a href="<c:url value='board/debate'/>">토론게시판</a></li>
				</ul></li>
			<li><a href="<c:url value='/pointshop'/>">포인트샵</a></li>
		</ul>
	</nav>

	

	<!-- Section -->
	<section>
		<header class="major">
			<h2>문의/건의</h2>
		</header>
		<p>사이트 이용 중 불편한 사안이나, 토론 주제 제안, 사이트 개선에 대한 아이디어 등 운영진에게 전하고 싶은 내용이 있으면 아래 명시된 연락처로 연락주세요.</p>
		<ul class="contact">
			<li class="fa-envelope-o"><a href="mailto:redesign628@naver.com">admin@keybae.com</a></li>
			<li class="fa-phone">(012) 1234-5678</li>
			<li class="fa-home">대구광역시 남구 중앙대로 220 3층<br/> 대구IT교육원 : 키배닷컴 
			</li>
		</ul>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<p class="copyright">&copy; Redesign628@naver.com. All rights reserved.</p>
	</footer>

</div>
<!-- inner -->