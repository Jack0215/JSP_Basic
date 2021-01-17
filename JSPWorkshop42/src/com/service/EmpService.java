package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	

	public List<EmpDTO> select() {
	 EmpDAO dao = new   EmpDAO();
	 SqlSession session = MySqlSessionFactory.getSession();
	 List<EmpDTO> list = null; 
	 try {
      list = dao.select(session);
    	  
//      }catch(Exception e) {
//    	  e.printStackTrace();
      }finally {
		session.close();
      }
      return list;
	}//end select
	
	public int insert(EmpDTO dto) {
		 EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 int n = 0; 
		 try {
	      n = dao.insert(session, dto);
	       session.commit();	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return n;
		}//end select
	
	public EmpDTO retrieve(int empno) {
		 EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 EmpDTO dto = null;
		 try {
			 dto = dao.retrieve(session, empno);
		 }finally {
			 session.close();
		 }
		 return dto;
		}//end select
}
