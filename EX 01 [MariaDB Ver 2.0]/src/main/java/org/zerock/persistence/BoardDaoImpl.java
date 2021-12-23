package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;


@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Inject
	private SqlSession session;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDaoImpl.class);
	
	private static String namespace = "org.zerock.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardCreate() :" + vo);
		session.insert(namespace+".create",vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardSelect() :" + bno);
		return session.selectOne(namespace+".read",bno);
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardUpdate() :" + vo.toString());
		return session.update(namespace+".update",vo);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[Dao] boardDelete() :" + bno);
		logger.info("[boardDelete() Method] bno :"+ bno);
		session.delete(namespace+".delete",bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		logger.info("[listAll() Method]");
		return session.selectList(namespace+".listAll");
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
