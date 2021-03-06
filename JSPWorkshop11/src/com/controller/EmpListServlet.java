package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.ForNode;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	public String driver = "oracle.jdbc.driver.OracleDriver";
	public String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public String userid = "scott";
	public String passwd = "tiger";

	public void init() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select empno, ename, sal, to_char(hiredate, 'yyyy/mm/dd') hiredate, deptno from emp order by empno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<head>");
			String my = "<table border='1'>";
			my += "<tr>";
			my += "<td>사원번호</td>";
			my += "<td>사원이름</td>";
			my += "<td>연봉</td>";
			my += "<td>고용일</td>";
			my += "<td>부서번호</td>";
			my += "</tr>";
			while (rs.next()) {
				my += "<tr>";
				my += "<td>" + rs.getInt("empno") + "</td>";
				my += "<td>" + rs.getString("ename") + "</td>";
				my += "<td>" + rs.getInt("sal") + "</td>";
				my += "<td>" + rs.getString("hiredate") + "</td>";
				my += "<td>" + rs.getInt("deptno") + "</td>";
				my += "</tr>";
			}
			my +="</table>";
			out.print(my);
			out.print("</body>");
			out.print("</html>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
