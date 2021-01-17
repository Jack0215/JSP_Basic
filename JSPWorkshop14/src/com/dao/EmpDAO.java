package com.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;

public class EmpDAO {
	

	public List<EmpDTO> select(SqlSession session) {
		//Mapper에서 select결과를 리스트에 담기
		//리스트 리턴
		List<EmpDTO> list = session.selectList("selectAll");
		return list;
	}
}