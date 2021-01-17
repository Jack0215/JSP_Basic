package com.dto;

import java.util.List;

public class PageDTO {//페이지 정보, 페이지 해당 자료

	private List<StudentDTO> list; //페이지에 해당하는 학생만 저장할 리스트, 리스트엔 3개만 저장할 것임, 실제 화면에 뿌려질 자료
	//↑ StudentDTO를 담고있음
	private int curPage; //현재 내가 볼 페이지
	private int perPage = 5; //한 페이지당 보여질 목록 수
	private int totalCount; //전체 목록 수
	
	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageDTO(List<StudentDTO> list, int curPage, int perPage, int totalCount) {
		super();
		this.list = list;
		this.curPage = curPage;
		this.perPage = perPage;
		this.totalCount = totalCount;
	}
	public List<StudentDTO> getList() {
		return list;
	}
	public void setList(List<StudentDTO> list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
