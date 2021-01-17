package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;


@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//curPae ���� ������, perPage ���������� ��α�
	//totalPage��ü ��ϼ�
	//���� �������� �Ľ� null�̸�  1�μ���
	//service�� selectAllPageStudent���
	//1������ ��� �Ǵ� curPages ���� �о�� �Խ�
	//�Ʒ��κп� ������ ��ȣ ���
		String curPage = request.getParameter("curPage"); //최초에 curPage값을 구해온다.
		if(curPage==null) { //최초엔 아무 값이 없으므로
			curPage="1"; //최초값을 1로 설정
		}
		StudentService service = new StudentService();
		PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage));//페이지 번호 전송
		List<StudentDTO> list = pDTO.getList(); // DAO 리턴값을 받음
		int perPage = pDTO.getPerPage(); //현재 페이지 번호
		int totalCount = pDTO.getTotalCount(); //전체 목록 수
		int totalPage = totalCount/perPage; //전체 페이지 갯수 계산
		if(totalCount%perPage != 0) totalPage++; //
		System.out.println("totalCount > " +totalCount); //
		System.out.println("totalPage > " +totalPage);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("</html>");
		out.print("</body>");
		  
		String my = "<table border='1'>";
	
		my +="<tr>";
		my +="<td>학번</td>";
		my +="<td>이름</td>";
		my +="<td>주민번호</td>";
		my +="<td>주소</td>";
		my +="<td>입학년도</td>";
		my +="<td>휴학여부</td>";
		my +="</tr>";
		for (StudentDTO dto : list) {
			my +="<tr>";
			my +="<td>"+dto.getStuNo()+"</td>";
			my +="<td>"+dto.getStuName()+ "</td>";
			my +="<td>"+dto.getStuSsn()+ "</td>";
			my +="<td>"+dto.getStuAddress()+ "</td>";
			my +="<td>"+dto.getEntDate()+ "</td>";
			my +="<td>"+dto.getAbsYn()+ "</td>";
			my +="</tr>";
		}
		my += "<tr><td colspan='6'>";
		for(int i=1; i<=totalPage; i++) {
			if(i==Integer.parseInt(curPage)) {
				my += "<span style='color:red'>"+i+"</span>&nbsp;&nbsp;"; //for의 i와 같음 빨간색으로변경
			} else {
				my += "<a href = 'StudentListServlet?curPage="+i+"'>"+i+"</a>&nbsp;&nbsp;";
			}
		}
		
		my += "</td></tr>";
		my += "</table>";
		out.print(my);
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
