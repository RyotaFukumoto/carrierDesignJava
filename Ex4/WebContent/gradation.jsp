<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP　演習　グラデーション</title>
<style type="text/css">
.rect {
	height: 60px;
	width: 60px;
	border: 1px #eee solid;
	padding: 2px;
	text-align: center;
}
</style>
</head>
<body>

<h3>グラデーション（幅：16）</h3>

<table>
<tr>
<%
	for (int i = 0 ; i < 256 ; i+=17) {
		String colorCode = "#ff" + String.format("%02x%02x", i, i);
		String colorStr = "#ff" + String.format("%x%x", i, i);
		out.println("<td class='rect' bgcolor='" + colorStr + "'>" + colorCode + "</td>");
	}
%>
</tr>
</table>

</body>
</html>
