package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/* Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")     
public class EmpListServlet extends HttpServlet {    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EmpService service = new EmpService(); //empservice 만들어주고
		List<EmpDTO> list = service.select(); //emp service의  select호출
		//EmpService select() 호출 list<EmpDTO>받아오기 
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		String my = "<table border='1'>";  
		my += "<tr>";
		my += "<td>STUDENT_NO</td>";
		my += "<td>DEPARTMENT_NO</td>";
		my += "<td>STUDENT_NAME</td>";
		my += "<td>STUDENT_SSN 매니저</td>";
		my += "<td>STUDENT_ADDRESS</td>";
		my += "<td>ENTRANCE_DATE</td>";
		my += "<td>ABSENCE_YN</td>";
		my += "<td>COACH_PROFESSOR_NO</td>";
		my += "</tr>";
		   for (EmpDTO dto : list) {
			   my += "<tr>";
				out.print("<tr>");
				my += "<td>";
				my += dto.getSTUDENT_NO() + "</td><td>" + dto.getDEPARTMENT_NO() + "</td><td>" + dto.getSTUDENT_NAME() + "</td><td>"
						+ dto.getSTUDENT_SSN() + "</td><td>" + dto.getSTUDENT_ADDRESS() + "</td><td>" + dto.getENTRANCE_DATE() + "</td><td>"
						+ dto.getABSENCE_YN() + "</td><td>" + dto.getSTUDENT_NO();
				my += "</tr>";
		   }
		//리스트에서 한명씩 꺼내서 표로 만들어 출력
		   my += "</table>";
		   out.print(my);
		   out.print("</body>");
		   out.print("</html>");
	}

}