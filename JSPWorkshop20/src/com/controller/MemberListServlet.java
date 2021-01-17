package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dto.Product;

/**
 * Servlet implementation class SetScopeServlet
 */
@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//세션 생성
		
		HttpSession session =  request.getSession();
		Enumeration<String> key = session.getAttributeNames(); //key값은 모두 str타입임
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>상품입력결과</title></head><body>");
		out.println("<b>상품입력 결과</b><hr/>");
		String sy ="<table border='1'>";
		sy+="<tr>";
		sy+="<td>상품아이디</td>";
		sy+="<td>상품명</td>";  
		sy+="<td>갯수</td>";
		sy+="</tr>";
		while(key.hasMoreElements()) { //하나의 키가 있는지 검사해서 true, false 리턴
			String id = key.nextElement(); //key 하나 저장
			Product p =(Product)session.getAttribute(id);//세션에서 key(제품id)에 해당하는 객체 가져옴
			sy+="<tr>";
			sy+="<td>"+p.getId()+"</td>";
			sy+="<td>"+p.getName()+"</td>";
			sy+="<td>"+p.getAmount()+"</td>";
			sy+="</tr>";
		}
		sy += "</table>";
		
		out.print(sy);
		out.print("<a href='product.html'>등록화면보기</a><br>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
