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

		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			list = dao.select(session);

//      }catch(Exception e) {
//    	  e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}// end select

	public int insert(EmpDTO dto) {
		// ������

		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.insert(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}// end select

}
