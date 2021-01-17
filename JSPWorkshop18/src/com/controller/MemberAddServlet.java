package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

/**
 * Servlet implementation class GetScopeServlet
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		//세션생성
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		//중복검사									key값 명명
		String name = (String)session.getAttribute("user"); //먼저 세션 검사
		if(name != null && username.trim().equals(name.trim())) { //null이 아닌 녁우 이름 비교
			out.print("<h2>중복 데이터로 인한 이름 저장 실패<h2>");
			out.print("<a href='member.html'>이름 입력 화면 보기</a>");
		}else {
			session.setAttribute("user", username);
			out.print("<h2>세션에 이름 저장 성공</h2>");
			out.print("<a href='MemberListServlet'>세션 정보 보기</a>");
			
		}
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
