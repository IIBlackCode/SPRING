package org.zerock.domain;

public class Criteria {
	
	private int page;
	private int perPageNum; // PAGE당 게시글 수?
	
	public Criteria() {
		super();
		this.page = 1;
		this.perPageNum = 10;
	}// The end of method
	
	// 기본 페이지가 0이면 1로 세팅
	public void setPage(int page) {
		
		if (page <= 0) {
			this.page = 1;
		}
	}// The end of method
	
	public void setPerPageNum(int perPageNum) {
		if (perPageNum <= 0 || perPageNum >100) {
			this.perPageNum = 10;
		}
		this.perPageNum = 10;
	}// The end of method
	
	// 현재 PAGE 정보
	public int getPage() {
		return page;
	}// The end of method
	
	public int getPageStart() {
		return (this.page -1) * perPageNum;
	}// The end of method

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
}
