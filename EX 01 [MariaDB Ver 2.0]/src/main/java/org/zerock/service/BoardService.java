package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;


public interface BoardService {
	
	//게시글 등록
	public void regist(BoardVO board) throws Exception;

	//게시글 읽기
	public BoardVO read(Integer bno) throws Exception;
	
	//게시글 수정
	public void modify(BoardVO board) throws Exception;
	
	//게시글 삭제
	public void remove(Integer bno) throws Exception;
	
	//게시글 리스트 Select
	public List<BoardVO> listAll() throws Exception;
	
	//게시글 페이징처리
//	public List<BoardVO> boardListCriteria(Criteria criteria) throws Exception;
	
	//
//	public int boardListCountCriteria(Criteria criteria) throws Exception;
	
}
