package org.zerock.test;

import static org.junit.jupiter.api.Assertions.fail;

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
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDAOTest {

	@Inject
	private BoardDao dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	//@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("Create New Title Test");
		board.setContent("Create new Content Test");
		board.setWriter("Tester");
		dao.create(board);
	}
	
	//@Test
	public void testRead() throws Exception{
		logger.info(">>"+dao.read(100));
	}
	
	//@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(100);
		board.setTitle("UPDATE QUERRY");
		board.setContent("UPDATE QUERRY");
		dao.update(board);
	}
	
	//@Test
	public void testDelete() throws Exception{
		dao.delete(102);
	}
	
	//@Test
	public void testListCriteria() throws Exception {
		
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);
		
		List<BoardVO> list = dao.listCriteria(cri);
		
		for (BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + ":" +boardVO.getTitle());
		}
	}

	//@Test
	public void testURI() throws Exception{
		UriComponents uriComponents = 
				UriComponentsBuilder
				.newInstance()
				.path("/board/read")
				.queryParam("bno", 12)
				.queryParam("perPageNum", 20)
				.build();
		
		logger.info("/web/board/read?bno=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	
	//@Test
	public void testURI2() throws Exception{
		UriComponents uriComponents = 
				UriComponentsBuilder
				.newInstance()
				.path("/{module}/{page}")
				.queryParam("bno", 12)
				.queryParam("perPageNum", 20)
				.build()
				.expand("board","read")
				.encode();
		
		logger.info("/web/board/read?bno=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	
	@Test
	public void testDynamic1() throws Exception {
		
		SearchCriteria cri = new SearchCriteria();
		cri.setPage(1);
		cri.setKeyword("글");
		cri.setSearchType("t");
		
		logger.info("================================================");
		
		List<BoardVO> list = dao.listSearch(cri);
		
		for (BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + " : "+boardVO.getTitle());
		}
		
		logger.info("================================================");
		logger.info("COUNT : "+dao.listSearchCount(cri));
	}
}