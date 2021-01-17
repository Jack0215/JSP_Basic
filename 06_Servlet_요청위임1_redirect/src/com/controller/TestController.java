package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController.doGet");
		
		request.setAttribute("request", "홍길동");
		
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");

		ServletContext ctx = getServletContext(); //Context=어플리케이션
		ctx.setAttribute("application", "유관순");
		
		//출력이 불편하여 출력이 편한 JSP로 변경
		//1. redirect 방법- 다른 페이지에 응답을 위임하지만 request 객체는 전달이 되지 않음
		//request는 전달이 안됨, session과 어플은 뽑아올 수 있음
		response.sendRedirect("hello.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
