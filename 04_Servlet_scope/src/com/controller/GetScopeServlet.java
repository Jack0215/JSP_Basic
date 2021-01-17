package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// session scope, session얻기
		HttpSession session = request.getSession();

		// application scope에 저장, ServletContext 얻기
		ServletContext ctx = getServletContext();

		String x = (String) request.getAttribute("request"); // 형변환 해줘야함
		String x1 = (String) session.getAttribute("session");
		String x2 = (String) ctx.getAttribute("application");
		
		//console 출력
		System.out.println("request:"+x); 
		System.out.println("session:"+x1);
		System.out.println("application:"+x2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
