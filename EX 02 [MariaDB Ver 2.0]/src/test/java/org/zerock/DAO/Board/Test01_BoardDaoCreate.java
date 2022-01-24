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
public class Test01_BoardDaoCreate {
	
//	root-context.xml에 등록된 SqlSessionFactory 주입
	@Inject
	private BoardDaoImpl boardDao;
	
	private static Logger logger = LoggerFactory.getLogger(Test01_BoardDaoCreate.class);
	
	@Test
	public void testCreate() throws Exception{
		
		BoardVO board = new BoardVO();
		for (int i = 0; i <= 100; i++) {
			board.setTitle("board Title Test"+i);
			board.setContent("Board Content test"+i);
			board.setWriter("board Writer Test"+i);
			boardDao.create(board);
		}
		
	}

}
