package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.dto.PageDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//curPage = null이면 1로 설정, searchName, searchValue 뽑아옴
		//서비스, 위 3개 받아서 pageDTO에 저장
		String curPage = request.getParameter("curPage");
		if(curPage == null) curPage = "1";
		
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");
		EmpService service = new EmpService();
		PageDTO pDTO = service.select(searchName, searchValue, Integer.parseInt(curPage));
		
		request.setAttribute("pDTO", pDTO);
		request.setAttribute("searchName", searchName);
		request.setAttribute("searchValue", searchValue);
		
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
 
	}

}
