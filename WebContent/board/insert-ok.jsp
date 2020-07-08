<%@page import="common.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String title = request.getParameter("title");
String content = request.getParameter("content");
String creusr = request.getParameter("creusr");
String commit = "commit";
Connection conn = Connector.getConnection();
String sql = "insert into board(num, title, content, credat, cretim, creusr) ";
sql += " values((select nvl(max(num),0)+1 from board),'" + title + "','" + content + "',to_char(sysdate,'YYYYMMDD'),";
sql += "to_char(sysdate,'HH24MiSS'),'" + creusr + "')";
PreparedStatement ps = conn.prepareStatement(sql);
int result = ps.executeUpdate();
if(result==1){
%>
	<script>
		alert('정상입력!')
		location.href="/board/list.jsp"
	</script>
<%
ps = conn.prepareStatement(commit);
ps.executeQuery();
}else{
%>
	<script>
		alert('오류발생!')
		location.href="/board/insert.jsp"
	</script>
<%
}
%>