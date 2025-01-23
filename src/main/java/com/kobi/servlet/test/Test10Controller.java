package com.kobi.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10Controller extends HttpServlet {
	
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String idInput = request.getParameter("id");
		String passwordInput = request.getParameter("password");
		
		out.println(""
				+ "<html>"
				+ "		<head><title>로그인</title></head>\n"
				+ "		<body>\n");
		//if(!idInput.equals(userMap.get("id"))) {
		if(!userMap.get("id").equals(idInput)) {
			out.println("		<h3>id가 일치하지 않습니다.</h3>");
		}else if(!userMap.get("password").equals(passwordInput)) {
			out.println("		<h3>password가 일치하지 않습니다.</h3>");
		}else {
			out.println("		<h1>" + userMap.get("name") + "님 환영 합니다.</h1>");
		}
		out.println(""
				+ "		</body>\n"
				+ "</html>");
		
	}
}
