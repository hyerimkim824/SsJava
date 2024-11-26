<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 상세</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
</head>
<body>
	<div class="page-main">
	
	<h2>글 상세</h2>
	<ul>
		<li>글번호 : ${NewsVO.num}</li>
		<li>제목 : ${NewsVO.title}</li>
		<li>작가 : ${NewsVO.writer}</li>
		<li>이메일 : ${NewsVO.email}</li>
	</ul>
	<hr size="1" noshade="noshade" width="100%">
	<p>
		${NewsVO.article}
	</p>
	<hr size="1" noshade="noshade" width="100%">
		<div class="align-right">
			작성일 : ${NewsVO.reg_date}
        <input type="button" value="수정" onclick="location.href='modifyForm.do?num=${NewsVO.num}'">
        <input type="button" value="삭제" onclick="location.href='deleteForm.do?num=${NewsVO.num}'">
        <input type="button" value="목록" onclick="location.href='list.do'">
    </div>
</div>
</body>
</html>