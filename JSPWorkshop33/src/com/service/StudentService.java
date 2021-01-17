package com.service;


import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.PageDTO;

public class StudentService {

	private StudentDAO dao;
	
	public StudentService() {
	   dao = new StudentDAO();
	}
	
   public PageDTO selectAllPageStudent(int curPage){//페이지 번호 전달
		
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pDTO = null;
		try {
			pDTO = dao.selectAllPageStudent(session, curPage);
		}finally {
			session.close();
		}
		 return pDTO;//페이지 자료와 현재페이지번호 등 페이지 정보를 담고 있는  PageDTO전송
	}
	
}
