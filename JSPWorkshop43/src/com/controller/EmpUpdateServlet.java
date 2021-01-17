package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EMPInsertServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3가지 값 파싱, dto 생성, update한테 넘겨줌(맵퍼로), 업데이트가 되고나면 수정된 내용이 보여야하므로 send로 emplist서블릿 호출
		request.setCharacterEncoding("UTF-8");
		String empno = request.getParameter("empno");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");
		
		EmpDTO dto = new EmpDTO();
		   dto.setEmpno(Integer.parseInt(empno)); 
		   dto.setJob(job);
		   dto.setSal(Integer.parseInt(sal)); 
		   
		  response.sendRedirect("EmpListServlet");
	}//end doPost
}//end class
