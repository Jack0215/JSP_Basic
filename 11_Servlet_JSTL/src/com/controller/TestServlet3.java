package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Person;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L; 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person> list = Arrays.asList(new Person("홍길동", 20), new Person("이순신", 40), new Person("유관순", 10));
		request.setAttribute("xxx", list); //list를 xxx에 담음
		 
		String mesg="A/B/C";
		request.setAttribute("yyy", mesg);
		
		RequestDispatcher dis = request.getRequestDispatcher("03_forEach.jsp"); 
		dis.forward(request, response);
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
