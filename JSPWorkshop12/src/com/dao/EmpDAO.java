package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.dto.EmpDTO;

public class EmpDAO {
	public ArrayList<EmpDTO> selectAllEmp(Connection con) {
		// DB에서 데이터를 꺼내서
		// emp 한명 당 empDTO로 만들어 ArrayList에 저장, ArrayList 리턴
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'yyyy/mm/dd') hiredate, sal,comm, deptno from emp order by empno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt(1));
				dto.setEname(rs.getString(2));
				dto.setJob(rs.getString(3));
				dto.setMgr(rs.getInt(4));
				dto.setHiredate(rs.getString(5));
				dto.setSal(rs.getInt(6));
				dto.setComm(rs.getInt(7));
				dto.setDeptno(rs.getInt(8));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
