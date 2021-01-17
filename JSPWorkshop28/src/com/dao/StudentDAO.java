package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

	public int totalCount(SqlSession session) {//전체 목록 수를 구해호는 함수
		// ��ü ��ϼ� ���ϱ� 
		return session.selectOne("totalCount");
	}
	
    public PageDTO selectAllPageStudent(SqlSession session, int curPage){ //여기 curPage는 ListServlet에서 1 값을 가져옴
		
		//페이지를 담을 PageDTO 생성
    	PageDTO pDTO = new PageDTO();
    	//페이지당 3개 씩
    	int perPage = 3;
    	int offset=(curPage-1)*perPage;    	//db에서 읽어올 부분의 시작 번호 부터 perPage만큼 읽기
    	List<StudentDTO> list = session.selectList("selectAllStudent", null, new RowBounds(offset, perPage));//rowbounds를 offset부터 해서 perPage까지(3개)
    				
    	pDTO.setPerPage(perPage); //페이지당 목록수
    	pDTO.setCurPage(curPage);//현재 페이지 번호
    	pDTO.setList(list);//보여질 목록
    	pDTO.setTotalCount(totalCount(session)); //전체 목록 수는 위의 totalCount에서 가져옴
    	//
    	return pDTO; //위 4가지를 저장해서 로 리턴한다. ListServlet 34라인으로 값을 넘김
	
	}
	
}
