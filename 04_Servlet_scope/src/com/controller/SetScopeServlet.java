package com.controller;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetScopeServlet
 */
@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request scope에 저장 //한번 응답이 이루어지면 request는 삭제됨
		request.setAttribute("request", "홍길동"); // "request"가 key가 됨, key값을 이용해서 객체를 담을 수 있음 "홍길동"은 문자열

		// session scope에 저장//브라우저 주기
		HttpSession session = request.getSession(); // 세션을 하나 얻어온다. 브라우저 1명당 생기는 유일한 객체,
		session.setAttribute("session", "이순신"); // 브라우저 닫기 전 까지 살아있는 객체 key값을 session으로 해서 이순신을 넣어줌

		// application scope에 저장 // context주기(서버 가동하는 동안, 프로젝트 실행하는 동안)
		ServletContext ctx = getServletContext(); // a서블릿에 꽂아줬을때 b에서 사용 가능
		ctx.setAttribute("application", "유관순");

		/*
		 * // ↑세군데에 꽂아줌 System.out.println("resquest: 홍길동");
		 * System.out.println("session: 이순신"); System.out.println("application: 유관순");
		 */
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
