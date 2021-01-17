package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Person;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("/TestServlet4")
public class TestServlet4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Person p = new Person("홍길동", 20);
		request.setAttribute("xxx", p); //여태 문자만 저장했지만 이번엔 객체를 저장, 즉 객체를 set
		
		RequestDispatcher dis = request.getRequestDispatcher("02_bind4.jsp");
		dis.forward(request, response); //"02_bind3.jsp"여기로 포워딩 함
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
