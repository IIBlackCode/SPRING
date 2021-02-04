package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;


@Repository
public class BoardDao implements IBoardDao{
	
	@Inject
	private SqlSession session;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDao.class);
	
//	private static String namespace = "org.zerock.board.mapper.BoardMapper";
	private static String namespace = "org.zerock.board.mybatis.BoardMapper";
	
	@Override
	public void boardCreate(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardCreate() :" + vo);
		session.insert(namespace+".boardCreate",vo);
	}

	@Override
	public BoardVO boardSelect(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardSelect() :" + bno);
		return session.selectOne(namespace+".boardSelect",bno);
	}

	@Override
	public int boardUpdate(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardUpdate() :" + vo.toString());
		logger.info("[boardUpdate() Method] bno :",session.update(namespace+".boardUpdate"));
		return session.update(namespace+".boardUpdate",vo);
	}

	@Override
	public void boardDelete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardDelete() :" + bno);
		logger.info("[boardDelete() Method] bno :"+ bno);
		session.delete(namespace+".boardDelete",bno);
	}

	@Override
	public List<BoardVO> boardSelectAll() throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("[Dao] boardListAll()" + session.selectList(namespace+".boardSelectAll").toString());	
		return session.selectList("org.zerock.board.mybatis.BoardTestMapper"+".boardSelectAll");
	}

	@Override
	public List<BoardVO> boardListPage(int page) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("선택한 페이지 번호 : "+page);
//		System.out.println("[Dao] boardListPage()" + session.selectList(namespace+".boardListPage").toString());
		if (page <= 0) {
			page = 1;
		}
		
		page = (page -1) * 10;
		System.out.println("입력될 번호 : "+page);
		
//		return null;
		return session.selectList(namespace+".boardListPage",page);
	}
	
	/*
	@Override
	public List<BoardVO> boardCriteria(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardCriteria() ");
		return session.selectList(namespace+".boardListCriteria",criteria);
	}

	@Override
	public int boardCouontPaging(Criteria criteria) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardCouontPaging() ");
		return session.selectOne(namespace+".boardCountPaging", criteria);
	}
	*/
}
