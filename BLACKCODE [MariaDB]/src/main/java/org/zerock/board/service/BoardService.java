package org.zerock.board.service;

import java.util.List;

import org.zerock.board.domain.BoardVO;
import org.zerock.board.domain.Criteria;


public interface BoardService {
	
	//게시글 등록
	public void boardRegist(BoardVO board) throws Exception;

	//게시글 읽기
	public BoardVO boardRead(Integer bno) throws Exception;
	
	//게시글 수정
	public void boardModify(BoardVO board) throws Exception;
	
	//게시글 삭제
	public void boardRemove(Integer bno) throws Exception;
	
	//게시글 리스트 Select
	public List<BoardVO> boardListAll() throws Exception;
	
	//게시글 페이징처리
	public List<BoardVO> boardListCriteria(Criteria criteria) throws Exception;
	
	//
	public int boardListCountCriteria(Criteria criteria) throws Exception;
	
}
