package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
//import org.zerock.domain.Criteria;
import org.zerock.persistence.BoardDaoImpl;


@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDaoImpl dao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRegist()");
		logger.info("[board] : " + board.toString());
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRead()");
		logger.info("[bno] : " + bno);
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardModify()");
		logger.info("[board] : " + board);
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardRemove()");
		logger.info("[bno] : ",bno);
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListAll()");
		return dao.listAll();
	}
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListCriteria()");
		return dao.listCriteria(cri);
	}

	/*
	@Override
	public int boardListCountCriteria(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		logger.info("[Service] BoardService . boardListCountCriteria()");
		return dao.boardCouontPaging(criteria);
	}
	*/
}
