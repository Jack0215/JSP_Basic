package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 서비스 public arrayList<EmpDTO> selecrAllEmp() 호출 ArrayLIst받아오기

		EmpService service = new EmpService();
		ArrayList<EmpDTO> list = null;
		try {
			list = service.selectAllEmp();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		String my = "<table border='1'>";
		my += "<tr>";
		my += "<td>사원번호</td>";
		my += "<td>사원이름</td>";
		my += "<td>부서</td>";
		my += "<td>담당 매니저</td>";
		my += "<td>고용일</td>";
		my += "<td>연봉</td>";
		my += "<td>Comm</td>";
		my += "<td>부서번호</td>";
		my += "</tr>";
		for (EmpDTO dto : list) {
			// 표로 emp 출력
			my += "<tr>";

			out.print("<tr>");
			my += "<td>";
			my += dto.getEmpno() + "</td><td>" + dto.getEname() + "</td><td>" + dto.getJob() + "</td><td>"
					+ dto.getMgr() + "</td><td>" + dto.getHiredate() + "</td><td>" + dto.getSal() + "</td><td>"
					+ dto.getComm() + "</td><td>" + dto.getDeptno();
			my += "</tr>";
		}
		my += "</table>";
		out.print(my);
		out.print("</body>");
		out.print("</html>");
	}

}
