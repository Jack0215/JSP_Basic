package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class member
 */
@WebServlet("/member")
public class member extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String ssn = request.getParameter("ssn");

		response.setContentType("text/html;charset=UTF-8");
		
		String gender=(ssn.substring(7,8)).equals("1")?"남자":"여자";
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름은  " + username + "<br>" +"성별은 " + gender+ "<br>");
		out.print("");
		
		String[] hobby = request.getParameterValues("hobby");

		for (String h : hobby) {
			out.print("취미는"+ h+"<br>");
		};
		
		String[] marry = request.getParameterValues("marry");

		for (String m : marry) {
			out.println("결혼 상태는"+m+"입니다");
		}
		
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
