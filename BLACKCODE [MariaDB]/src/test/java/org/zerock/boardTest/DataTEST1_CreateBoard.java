package org.zerock.boardTest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.board.controller.BoardController;
import org.zerock.board.domain.BoardVO;
import org.zerock.board.persistence.BoardDao;
import org.zerock.board.service.IBoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DataTEST1_CreateBoard {
	
	@Inject
	private BoardDao boardDao;
	
	private static final Logger logger = LoggerFactory.getLogger(DataTEST1_CreateBoard.class);
	
	@Test
	public void testTime() throws Exception{
		logger.info("TEST");
	}
	
	@Test
	public void testCreate() throws Exception {
		BoardVO board = new BoardVO();
		board.setTitle("board Title Test");
		board.setContent("Board Content test");
		board.setWriter("board Writer Test");
		boardDao.boardCreate(board);
	}// The end of Test
}// The end of Class
