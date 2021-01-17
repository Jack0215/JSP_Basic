package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productReg
 */
@WebServlet("/productReg")
public class productReg extends HttpServlet {

	ArrayList<Product> products = new ArrayList<Product>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");
		try {
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));

			if (products.size() != 0) {
				boolean flag = true;
				for (int i = 0; i < products.size(); i++) {
					Product p = products.get(i);
					if (p.getId().equals(id)) {
						p.setAmount(p.getAmount() + amount);
						flag = false;
					} // end if
				} // end for
				if (flag) {
					products.add(new Product(name, id, amount));
				}
			} else {
				products.add(new Product(name, id, amount));
			}

			out.print("<table border='1'>");
			out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th>");
			for (Product p : products) {
				out.print("<tr>"); 
				out.print("<td>" + p.getName() + "</td><td>" + p.getId() + "</td><td>" + p.getAmount() + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
			out.print("<a href='productForm.html'>돌아가기</a>");
		} catch (Exception e) {
			out.print("입력값을 확인하세요");
			out.print("<a href = 'productForm.html'>입력 값 확인 </a>");
			out.print("</body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
