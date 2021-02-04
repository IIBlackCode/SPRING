package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;


public interface BoardDaoImpl {
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public int update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	/*게시글 리스트 조회*/
	public List<BoardVO> listAll() throws Exception;
	
	/*게시글 페이징 처리*/
	public List<BoardVO> boardListPage(int page) throws Exception;
	
//	public List<BoardVO> boardCriteria(Criteria criteria) throws Exception;
//	
//	public int boardCouontPaging(Criteria criteria)throws Exception;
	
}
