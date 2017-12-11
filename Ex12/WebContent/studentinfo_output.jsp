<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登録 − 出力画面</title>
</head>
<body>
<jsp:useBean id="stdInfoBean" class="mypackage.StudentInfoBean" scope="session"/>
<h1>学生登録 − 出力画面</h1>
<p>登録されている学生一覧
<table border="1">
	<tr><th>学生番号</th><th>氏名</th><th>学年</th></tr>
	<% ArrayList<mypackage.StudentRecordBean> stdRecordArray = stdInfoBean.getStudentRecordArray();
	for (mypackage.StudentRecordBean rcd : stdRecordArray) {
		out.println("<tr><td>" + rcd.getStudentNo() + "</td><td>"
		+ rcd.getStudentName() + "</td><td>" + rcd.getSchoolYear()
		+ "</td></tr>");
		} %>


</table>
<br>
<a href="javascript:history.back()">戻る</a><br>
<a href="studentinfo_input.html">続けて学生を登録する</a>
</body>
</html>