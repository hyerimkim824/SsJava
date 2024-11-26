<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]성적 처리</title>
</head>
<body>

<%--
배열 생성(score) : 국어, 영어, 수학 성적을 배열에 저장
[출력 예시]

국어 : 88
영어 : 99
수학 : 86
총점 : 273
평균 : 91

 --%>
 
 <%
 
//선언
String[] subject = {"국어", "영어","수학"};
int[] score = {88,99,86};
int sum=0;
int avg = 0;
String s = "총점";
String a = "평균";

 
 %>

<h2>성적</h2>
<table>

<%

	for(int i=0;i<subject.length;i++){
		sum+=score[i];
			
%>
<tr>
	<td> <%=subject[i] %></td>
	<td> <%=score[i] %></td>
<%} %>
</tr>
	<tr>
		<td><%=s%></td>
		<td><%=sum%></td>
	</tr>
	<tr>
		<td><%=a%></td>
		<td><%=avg%></td>
	</tr>
	


</table>

</body>
</html>