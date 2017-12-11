<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset==UTF-8">
<title>学生登録 − 確認画面</title>
</head>
<body>
<jsp:useBean id="stdInfoBean" class="mypackage.StudentInfoBean" scope="session"/>
<h1>>学生登録 − 確認画面</h1>
<p>学生が登録されました
現在の登録数: <%= stdInfoBean.getArraySize() %>件</p>
<a href="studentinfo_input.html">続けて学生を登録する</a><br>
<a href="studentinfo_output.jsp">登録されている学生を一覧表示</a>
</body>
</html>