package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자 요청이 왔을 때 화면만 바꿔줌

@WebServlet("/EmpWriteFormServlet")
public class EmpWriteFormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     response.sendRedirect("memberForm.jsp"); //memberForm.jsp로 response를 바꿔줌
	     //데이터가 전달되지 않고 화면만 이동
	}//end doPost
}//end class
