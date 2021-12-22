package org.zerock.DAO.Board;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Test03_BoardDaoUpdate {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private BoardDaoImpl boardDao;
	
	private static Logger logger = LoggerFactory.getLogger(Test03_BoardDaoUpdate.class);
	
	@Test
	public void testCreate() throws Exception{
		
		BoardVO board = new BoardVO();
		board.setTitle("board Title Test");
		board.setContent("Board Content test");
		board.setWriter("board Writer Test");
		boardDao.create(board);
		
	}

}
