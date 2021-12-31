package org.zerock.domain;

public class PageMaker {
	
	private int totalCount;	// 총 데이터 수
	private int startPage;	// 시작페이지
	private int endPage;	// 끝 페이지
	
	private boolean prev;	// 이전
	private boolean next;	// 다음
	
	private int displayPageNum = 10; // 진열된 페이지 개수
	
	private Criteria cri;
	
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		
		calcData();
	}
	
	private void calcData() {
		// 끝페이지 = 반올림(현재페이지/진열된 페이지 수) * 진열된 페이지 수  
		// 지금 12p일때 (12/진열된 페이지 수10)에서 반올림 후 * 진열된 페이지 수
		endPage = (int)(Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
		
		// 시작페이지 = 끝페이지 - 진열된페이지의 수 + 1
		// 11         = 20       - 10                + 1
		startPage = (endPage - displayPageNum) + 1;
		
		//						게시글 수 / 
		int tempEndPage = (int) (Math.ceil(totalCount/(double) cri.getPerPageNum()));
	
		if (endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		
		prev = startPage == 1 ? false : true;
		next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
		System.out.println("totalCount : "+totalCount);
		System.out.println("cri.getPerPageNum() : "+cri.getPerPageNum());
		System.out.println("endPage : "+endPage);
		System.out.println("startPage : "+startPage);
		System.out.println("tempEndPage : "+tempEndPage);
		System.out.println("prev : "+prev);
		System.out.println("next : "+next);
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public Criteria getCri() {
		return cri;
	}

	@Override
	public String toString() {
		return "PageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", displayPageNum=" + displayPageNum + ", cri=" + cri + "]";
	}
	
}