package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	
	private EmpDAO dao;
	
	public EmpService() {
		dao = new EmpDAO();
	}

	public List<EmpDTO> select() {
	SqlSession session = MySqlSessionFactory.getSession();
	List<EmpDTO> list = null;
	try {
		list = dao.select(session);
	}finally {
		session.close();
	}
	return list;
	}//end select
	
	
	
}
