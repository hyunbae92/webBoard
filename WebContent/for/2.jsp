<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/for/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
2.jsp<br>
<%
RequestDispatcher rd = request.getRequestDispatcher(root+"/for/3.jsp");
rd.forward(request, response);
%>
</body>
</html>