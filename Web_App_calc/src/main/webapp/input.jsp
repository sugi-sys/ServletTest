<%@page contentType= "text/html; charset=UTF-8" %>

<%
System.out.println("足し算を行います");
%>
<html>
	<head>
		<title>足し算計算機</title>
	</head>
	<body>
		<form action="<%= request.getContextPath() %>/Plus">
			<input type="text" name="num1">&nbsp;+&nbsp;<input type="text" name="num2">
			<button>計算！</button>
		</form>
 	</body>
</html>