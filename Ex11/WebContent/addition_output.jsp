<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset==UTF-8">
<title>足し算 - 出力画面</title>
</head>
<body>
<jsp:useBean id="addBean" class="mypackage.AdditionBean" scope="request" />
<h1>足し算 - 出力画面</h1>
<p>入力された2つの値の和を求めます。
<jsp:getProperty property="value1" name="addBean"/> +
<jsp:getProperty property="value2" name="addBean" /> =
<jsp:getProperty property="ans" name="addBean"  />
</p>
<a href="javascript:history.back()">戻る</a>
</body>
</html>