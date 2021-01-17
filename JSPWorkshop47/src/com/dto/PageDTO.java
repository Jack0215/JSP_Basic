package com.dto;

import java.util.List;

public class PageDTO {

	private List<EmpDTO> list; //사원정보 저장
	private int curPage; //현재 페이지 번호
	private int perPage=2; //한 페이지당 게시물 수
	private int totalCount; //전체 게시물 수
	public List<EmpDTO> getList() {
		return list;
	}
	public void setList(List<EmpDTO> list) {
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
