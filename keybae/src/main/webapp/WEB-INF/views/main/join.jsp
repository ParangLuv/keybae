<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section id="join">
	<form action="post" action="#" style="width:90%; margin:0 auto; text-align: center;">
		<h2 style="text-align: left;">회원가입</h2>
		<p><input type="email" placeholder="이메일(아이디)" name="email"></p>
		<p><input type="text" placeholder="닉네임" name="userName"></p>
		<p><input type="password" placeholder="패스워드" name="password"></p>
		<p><input type="password" placeholder="패스워드 다시입력" name="repassword"></p>
		<p><input type="submit" value="가입" class="button special fit">
			<input type="reset" value="취소" class="button fit">
		</p>
	</form>
</section>