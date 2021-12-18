package org.zerock.boardTest;

import java.util.Scanner;

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
public class DataTEST5_SelectListBoard {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST5_SelectListBoard.class);
	
	@Test
	public void testSelectListAll() throws Exception {
		boardDao.boardSelectAll();
	}
}
