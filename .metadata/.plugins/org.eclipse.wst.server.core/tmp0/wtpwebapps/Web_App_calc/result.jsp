<%@page contentType= "text/html; charset=UTF-8" %>

<%
String answer = request.getParameter("answer");
%>

<html>
	<head>
		<title>答えは</title>
	</head>
	<body>
		答えは「<%= answer %>」です。
	</body>
</html>