package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	private EmpDAO dao;

		
	public List<EmpDTO> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list =  session.selectList("com.dto.selectAll");
		return list;
	}
	
	public EmpService() {
		dao = new EmpDAO();
	}

	public int memberAdd(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.memberAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
}
