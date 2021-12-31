package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;
import org.zerock.domain.Criteria;


public interface BoardDao {
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public int update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	/*게시글 리스트 조회*/
	public List<BoardVO> listAll() throws Exception;
	
	/*게시글 페이징 처리*/
	public List<BoardVO>listPage(int page) throws Exception;
	
	public List<BoardVO>listCriteria(Criteria cri) throws Exception;
//	
	public int couontPaging(Criteria cri)throws Exception;
	
}
