package org.zerock.boardTest;

import java.util.List;

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
public class DataTEST6_SelectListPage {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST6_SelectListPage.class);
	
	@Test
	public void testListPage() throws Exception {
		int page = 3;
		System.out.println("page : "+page);
		
		List<BoardVO> list = boardDao.boardListPage(page);
		for (BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + " : " + boardVO.getTitle());
		}
	}
}
