<%@page import="common.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String title = request.getParameter("title");
String content = request.getParameter("content");
String creusr = request.getParameter("creusr");
String searchStr = request.getParameter("searchStr");
Connection conn = Connector.getConnection();
String sql = "select num, title, content, credat, creusr from board where 1=1 ";
if(title!=null && !"".equals(title.trim())){
	sql += " and title like '%'||?||'%' ";
}
if(content!=null && !"".equals(content.trim())){
	sql += " and content like '%'||?||'%' ";
}
if(creusr!=null && !"".equals(searchStr.trim())){
	sql += " and creusr like '%'||?||'%' ";
}
PreparedStatement ps = conn.prepareStatement(sql);
int cnt = 1;
if(title!=null && ""!=searchStr)
	ps.setString(cnt++, searchStr);
if(content!=null && ""!=searchStr)
	ps.setString(cnt++, searchStr);
if(creusr!=null && ""!=searchStr)
	ps.setString(cnt++, searchStr);
ResultSet rs = ps.executeQuery();
%>
<form>
제목<input type="checkbox" name="title" value="title">
내용<input type="checkbox" name="content" value="content">
작성자<input type="checkbox" name="creusr" value="creusr">
<input type="text" name="searchStr">
<button>검색</button>
</form>
<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성일</th>
		<th>작성자</th>
	</tr>
<%
while(rs.next()){
%>
	<tr>
		<td><%=rs.getInt("num")%></td>
		<td><%=rs.getString("title")%></td>
		<td><%=rs.getString("content")%></td>
		<td><%=rs.getString("credat")%></td>
		<td><%=rs.getString("creusr")%></td>
	</tr>
<%
}
%>
</table>
<a href="/board/insert.jsp"><button>글쓰기</button></a>
</body>
</html>