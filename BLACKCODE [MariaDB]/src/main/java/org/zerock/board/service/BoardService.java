package org.zerock.board.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.zerock.board.domain.BoardVO;
import org.zerock.board.domain.Criteria;
import org.zerock.board.persistence.BoardDao;


@Service
public class BoardService implements IBoardService {

	@Inject
	private BoardDao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Override
	public void boardRegist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRegist()");
		logger.info("[board] : " + board.toString());
		dao.boardCreate(board);
	}

	@Override
	public BoardVO boardRead(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRead()");
		logger.info("[bno] : " + bno);
		return dao.boardSelect(bno);
	}

	@Override
	public void boardModify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardModify()");
		logger.info("[board] : " + board);
		dao.boardUpdate(board);
	}

	@Override
	public void boardRemove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRemove()");
		logger.info("[bno] : ",bno);
		dao.boardDelete(bno);
	}

	@Override
	public List<BoardVO> boardListAll() throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListAll()");
		return dao.boardSelectAll();
	}

	@Override
	public List<BoardVO> boardListCriteria(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListCriteria()");
		return dao.boardCriteria(criteria);
	}

	@Override
	public int boardListCountCriteria(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListCountCriteria()");
		return dao.boardCouontPaging(criteria);
	}

}
