package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.세션얻기
		HttpSession session = request.getSession();
		
		String username = (String)session.getAttribute("username");
		String passwd = (String)session.getAttribute("passwd");
		if(username==null) {
			response.sendRedirect("error.jsp");//에러이동
		}else {
			response.sendRedirect("info2.jsp");//회원정보페이지로 이동
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
