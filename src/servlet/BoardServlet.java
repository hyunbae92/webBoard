package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;

public class BoardServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private BoardService boardService = new BoardService();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		List<Map<String,Object>> boardList = boardService.getBoardList();
		String html = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" + 
		"<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n";
		html += "<table border=\"1\">";
		html += "<tr>\r\n <th>번호</th>\r\n<th>제목</th>\r\n<th>작성일</th>\r\n<th>작성자</th>\r\n</tr>";
		for(Map<String,Object> board:boardList) {
				html += "<tr>"
						+ "<td>" + board.get("num") + "</td>"
						+ "<td>" + board.get("title") + "</td>"
						+ "<td>" + board.get("credat") + "</td>"
						+ "<td>" + board.get("creusr") + "</td>"
						+ "<tr>";
		}
		html += "</table>\r\n"+"</body>\r\n" + "</html>";
		
		pw.print(html); 
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String creusr = request.getParameter("creusr");
		Map<String,Object> board = new HashMap<>();
		board.put("title", title);
		board.put("content", content);
		board.put("creusr", creusr);
		int result = boardService.insertBoard(board);
		PrintWriter pw = response.getWriter();
		if(result==1) {
			pw.println("저장완료");
		}else {
			pw.println("저장실패");
		}
	}
}
