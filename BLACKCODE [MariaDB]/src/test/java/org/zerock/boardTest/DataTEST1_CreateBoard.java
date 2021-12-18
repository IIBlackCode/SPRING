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
import org.zerock.board.service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataTEST1_CreateBoard {
	
	@Inject private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(DataTEST1_CreateBoard.class);
	
	@Test
	public void testCreate() throws Exception {
		BoardVO board = new BoardVO();
		System.out.println("Board 객체 생성");
		int i = 0;
		
		if (board.getBno().equals(null)) {
			System.out.println("Board 정보 저장 실패");
		}else {
			for (i = 1; i <= 100; i++) {
//			board.setBno(0);
				board.setTitle("Title Test" + i);
				board.setContent("Test Content " + i);
				board.setWriter("TESTER " + i);
				boardService.boardRegist(board);
				System.out.println("Board 객체 정보 저장 완료");
			}// THe end of for
//			boardDao.boardCreate(board);
		}
	}// The end of Test
}// The end of Class
