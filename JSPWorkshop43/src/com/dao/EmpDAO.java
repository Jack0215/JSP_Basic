package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;

public class EmpDAO {
	public int update(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.update" , dto );
		return n;
	}
	

	public List<EmpDTO> select(SqlSession session) {
		List<EmpDTO> list =  session.selectList("com.dto.selectAll");
		return list;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.insert" , dto );
		return n;
	}
	
	public EmpDTO retrieve(SqlSession session, int empno) {
		EmpDTO dto =  session.selectOne("com.dto.selectByEmpno" , empno);
		return dto;
	}
}
