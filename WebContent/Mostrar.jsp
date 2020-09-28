<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	String resParam = request.getParameter("res");
	
	String rerParam = request.getParameter("rer");
	
	String retParam = request.getParameter("python");
	
	String reuParam = request.getParameter("C#");
	
	String revParam = request.getParameter("Cobol");
	
	
%>
	Resultado: <%= resParam %>
	<br>
	<br>
	Java: <%= rerParam %> vezes
	<br>
	Python: <%= retParam %> vezes
	<br>
	C#: <%= reuParam %> vezes
	<br>
	Cobol: <%= revParam %> vezes
	
	
</body>
</html>