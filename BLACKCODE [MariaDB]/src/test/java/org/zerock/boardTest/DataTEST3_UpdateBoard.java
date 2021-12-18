package org.zerock.boardTest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.board.domain.BoardVO;
import org.zerock.board.persistence.BoardDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataTEST3_UpdateBoard {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST3_UpdateBoard.class);
	
	@Test
	public void testUpdate() throws Exception {
		BoardVO board = new BoardVO();
		board.setBno(6);
		board.setTitle("6번 Title 수정");
		board.setContent("6번 Content 수정");
		boardDao.boardUpdate(board);
		logger.info(boardDao.boardSelect(6).toString());
	}
	
//	@Test
//	public void testRead() throws Exception {
//		logger.info(boardDao.boardSelect(1).toString());
//	}

}
