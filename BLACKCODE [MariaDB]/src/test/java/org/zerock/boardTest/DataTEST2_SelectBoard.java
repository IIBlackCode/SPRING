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
public class DataTEST2_SelectBoard {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST2_SelectBoard.class);
	
	@Test
	public void testRead() throws Exception {
		logger.info(boardDao.boardSelect(0).toString());
	}

}
