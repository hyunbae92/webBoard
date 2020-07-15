<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/for/common.jsp" %>
<%
// <%@ <-- Directive(설명서)
// <%  <-- Scriptlet(실행부)
// <%= <-- Expression(표현식)
// <%! <-- Declaration(선언부)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1.jsp<br>
<%=request.getParameter("name")%>
<%
RequestDispatcher requestDispatcher = request.getRequestDispatcher(root+"/for/2.jsp");
requestDispatcher.forward(request, response);
%>
</body>
</html>