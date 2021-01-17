package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet");
		request.setCharacterEncoding("UTF-8");
		
		//Map 형태도 파라미터 얻기
		Map<String, String[]> map = request.getParameterMap(); //Map 타입을 받아와 map에 저장. key, value를 map으로 리턴
		//응답처리
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		Set<String> keys = map.keySet();
		for(String key: keys) {
			String [] values = map.get(key);
			String mesg ="";
			for(String v : values) {
				mesg += v;
			}
			out.print(key+"="+mesg+"<br>");
		}
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
