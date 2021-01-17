//가장 먼저 실행됨
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
import com.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//데이터 파싱
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		
//MemberDTO 생성 id,pw저장
		MemberDTO dto = new MemberDTO(userid, passwd, null, null, null);
		
//service사용 db에 dto전송 id/pass맞는 데이터를 select=>service=>dao 사용, mapper.xml => memberDTO받아오기
		
		LoginService service = new LoginService();
		MemberDTO getdto = service.loginCheck(dto);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (  getdto == null   ) {
			out.print("아이디와 비밀번호를 확인하세요.<br>");
			out.print("<a href='loginForm.html'>로그인 화면</a>");
		} else {
			//세션에 login 이란 key로 객체를 저장
			HttpSession session = request.getSession();
			session.setAttribute("login", getdto );	
			//환경합니다. 사용자 이름 출력 
			out.print("환영합니다"+getdto.getUsername()+"님<br>");
			out.print("<a href='LogoutServlet'>로그아웃</a><br>");
			out.print("<a href='MemberInfoServlet'>회원정보보기</a>");
		}
		out.print("</body>");
		out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
