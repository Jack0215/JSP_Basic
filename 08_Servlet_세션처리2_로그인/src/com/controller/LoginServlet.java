package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String userid = (String)request.getParameter("userid");
	String passwd = (String)request.getParameter("passwd");
	//db에서 id/pass검사 후 인증 후 session에 자료 저장
	HttpSession session = request.getSession();
	session.setAttribute("userid", userid); //"userid"란 키값으로 19라인 userid를 23라인 userid에 저장
	session.setAttribute("passwd", passwd); //위와 마찬가지
	
	response.sendRedirect("logininfo.jsp"); //로그인 인포로 이동
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
