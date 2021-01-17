package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;

public class EmpDAO {
	

	public List<EmpDTO> select(SqlSession session) {
		List<EmpDTO> list =  session.selectList("com.dto.selectAll");
		return list;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
	//������
		int num = session.insert("com.dto.insert", dto);
		return num;
	}
	
	
}
