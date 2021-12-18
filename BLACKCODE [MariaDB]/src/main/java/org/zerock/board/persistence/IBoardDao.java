package org.zerock.board.persistence;

import java.util.List;

import org.zerock.board.domain.BoardVO;
import org.zerock.board.domain.Criteria;


public interface IBoardDao {
	
	public void boardCreate(BoardVO vo) throws Exception;
	
	public BoardVO boardSelect(Integer bno) throws Exception;
	
	public int boardUpdate(BoardVO vo) throws Exception;
	
	public void boardDelete(Integer bno) throws Exception;
	
	/*게시글 리스트 조회*/
	public List<BoardVO> boardSelectAll() throws Exception;
	
	/*게시글 페이징 처리*/
	public List<BoardVO> boardListPage(int page) throws Exception;
	
	public List<BoardVO> boardCriteria(Criteria criteria) throws Exception;
	
	public int boardCouontPaging(Criteria criteria)throws Exception;
	
}
