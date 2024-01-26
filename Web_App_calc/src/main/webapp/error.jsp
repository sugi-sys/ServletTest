<%@page contentType= "text/html; charset=UTF-8" %>

<%
String message = request.getParameter("message");
%>

<html>
	<head>
		<title>エラー</title>
	</head>
	<body>
		エラーです。<br>
		<%= message %>
	</body>
</html>