package org.zerock.domain;

public class Criteria {
	
	private int page;		//PAGE DEFAULT 값
	private int perPageNum; //PAGE당 게시글 수
	
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
		//없으면 외부에서 get방식으로 페이지가 변경되지 않음
		this.page = page;
	}// The end of method
	
	public void setPerPageNum(int perPageNum) {
		if (perPageNum <= 0 || perPageNum >100) {
			this.perPageNum = 10;
		}
		//없으면 외부에서 get방식으로 페이지가 변경되지 않음
		this.perPageNum = perPageNum;
	}// The end of method
	
	// 현재 PAGE 정보
	public int getPage() {
		return page;
	}// The end of method
	
	// 진열된 페이지 숫자의 개수
	public int getPageStart() {
		return (this.page -1) * perPageNum;
	}// The end of method

	//
	public int getPerPageNum() {
		return this.perPageNum;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
}
