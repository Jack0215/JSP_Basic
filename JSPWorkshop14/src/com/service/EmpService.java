package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	
	EmpDAO dao = new EmpDAO();

	public List<EmpDTO> select() {
		//dao생성
		//MysqlSessionFactory에서 session얻기
		//dao의  select함수호출 하면서 session 전달,
		//select결과인  list받은 후  session닫기 , list servlet���� ����
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			list = dao.select(session);
		}finally{
			session.close();
		}
		return list;
	}//end select
}