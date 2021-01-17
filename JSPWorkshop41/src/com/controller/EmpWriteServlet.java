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
@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      request.setCharacterEncoding("UTF-8");
	      
	      int empno=Integer.parseInt(request.getParameter("empno"));
	      String ename=request.getParameter("ename");
	      String job=request.getParameter("job");
	      int mgr=Integer.parseInt(request.getParameter("mgr"));
	      int sal=Integer.parseInt(request.getParameter("sal"));
	      
	      EmpDTO dto=new EmpDTO();
	      dto.setEmpno(empno);
	      dto.setEname(ename);
	      dto.setJob(job);
	      dto.setMgr(mgr);
	      dto.setSal(sal);
	      
	      EmpService service=new EmpService();
	      int n=service.insert(dto);
	      
	      response.sendRedirect("EmpListServlet");
	}//end doPost
}//end class
