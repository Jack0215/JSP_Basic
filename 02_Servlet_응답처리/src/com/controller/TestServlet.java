package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet") //()안에있는게 맵핑주소
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. 사용자 요청 데이터 뽑기
		//1. 사용자 요청데이터 처리
		//2. 요청 완료 후 응답처리
		response.setContentType("text/html;charset=UTF-8"); //2-1 HTML CONTENT타입 지정
		PrintWriter out = response.getWriter();	//2-2 PrintWriter 얻기 (io에서 했던것처럼)
		out.print("<html><body>"); //2-3 응답 할 html 코드 작성
		out.print("<h1>서블릿 응답처리 실습</h1>");
		out.print("<p>Hello World</p>");
		out.print("</body></html>");
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
