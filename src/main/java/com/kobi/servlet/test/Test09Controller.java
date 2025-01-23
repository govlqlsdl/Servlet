package com.kobi.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String apply = request.getParameter("apply");
		
		out.println(""
				+ "<html>\n"
				+ "		<head><title>입사지원</title></head>\n"
				+ "		<body>\n"
				+ "			<h3>" + name + "님 지원이 완료 되었습니다.</h3>\n"
				+ " 		<hr>\n"
				+ "			<p>지원내용</p>\n"
				+ " 		<p>" + apply + "</p>\n"
				+ "		</body>\n"
				+ "</html>");
		
	}
}
