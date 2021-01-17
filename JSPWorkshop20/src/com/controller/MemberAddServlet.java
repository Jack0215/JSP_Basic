package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dto.Product;

/**
 * Servlet implementation class GetScopeServlet
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	private ArrayList<Product> products = new ArrayList<Product>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //아래 3가지 데이터 파싱 
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		HttpSession session = request.getSession();
		Product p = (Product)session.getAttribute(id); //최초인 경우 id에 해당 하는 객체가 없어 null, 세션에서 id를 찾아 p로 저장
		//두번째 드렁온 경우 id로 찾아서 있는 경우 하단 else의 수량증가 코드 실행
		//없는 경우는 세션에 객체를 넣는 코드 실행
	
		if(p==null) { //담겨있는게 없는경우
			p=new Product(name, id, amount); //사용자가 입력한걸로 객체 만들고 37라인에서 저장
			session.setAttribute(id, p);
		}else { //31번에서 같은 값이 있을 때 38라인이 실행됨
			p.setAmount(p.getAmount()+amount);
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h2>상품 등록 성공</h2>");
		out.print("<a href='product.html'>등록화면보기</a><br>");
		out.print("<a href='MemberListServlet'>상품목록보기</a><br>");
		out.print("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
