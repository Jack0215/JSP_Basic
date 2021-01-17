package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySerlvet
 */
@WebServlet("/info")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		/*
		 * out.print("<html>"); 
		 * out.print("<body>"); 
		 * out.print("<html><body>");
		 * out.print("<table border=1>"); 
		 * out.print("<tr>"); 
		 * out.print("<td>이름</td>");
		 * out.print("<td>나이</td>"); 
		 * out.print("<td>주소</td>"); 
		 * out.print("</tr>");
		 * out.print("<tr>"); 
		 * out.print("<td>홍길동</td>"); 
		 * out.print("<td>20</td>");
		 * out.print("<td>서울</td>"); 
		 * out.print("</tr>"); 
		 * out.print("</body></html>");
		 * out.print("</body>"); 
		 * out.print("</html>");
		 */

		String my = "<table border='1'>";
		my += "<tr>";
		my += "<td>이름</td>";
		my += "<td>나이</td>";
		my += "<td>주소</td>";
		my += "<tr>";
		my += "<tr>";
		my += "<td>홍길동</td>";
		my += "<td>20</td>";
		my += "<td>서울</td>";
		my += "<tr>";
		my += "</table>";
		
		out.print(my);

	}

}
