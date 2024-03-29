package org.zerock.boardTest;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.zerock.board.domain.BoardVO;
import org.zerock.board.domain.Criteria;
import org.zerock.board.persistence.BoardDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataTEST8_URL {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST8_URL.class);
	
	@Test
	public void testListPage() throws Exception {
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
//				.path("/board/read")
//				.queryParam("bno", 10)
//				.queryParam("perPageNum", 20)
//				.build()

				.path("/{module}/{page}")
				.queryParam("bno", 10)
				.queryParam("perPageNum", 20)
				.build()
				.expand("board","read")
				.encode();
		logger.info("/board/read?bno=10&perPageNum=20");
		logger.info(uriComponents.toString());
		
	}
}
