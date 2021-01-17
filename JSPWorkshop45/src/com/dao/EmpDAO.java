package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;

public class EmpDAO {
	

	public List<EmpDTO> select(SqlSession session , HashMap<String, String> map) {
	List<EmpDTO> list = session.selectList("com.dto.selectAll", map);
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
	
	public int update(SqlSession session, EmpDTO dto) {
		int n =  session.update("com.dto.update" , dto );
		return n;
	}
	
	public int delete(SqlSession session, int empno) {
		int n =  session.delete("com.dto.delete" , empno );
		return n;
	}
}
