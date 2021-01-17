package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
@WebServlet("/TestServlet5")
public class TestServlet5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		List<Person> list =
				Arrays.asList(new Person("홍길동", 20), new Person("이순신", 44));
		request.setAttribute("xxx", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("02_bind5.jsp");
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
