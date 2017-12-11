
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>フィボナッチ数列</title>
</head>
<body>
<h3>
<%
	int pre = 0;
	int cur = 1;
	while (cur <= 100) {
		out.print(cur + ", ");
		int tmp = pre;
		pre = cur;
		cur = cur + tmp;
	}
%>
</h3>
</body>
</html>