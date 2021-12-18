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
public class DataTEST4_DeleteBoard {
	
	@Inject
	private BoardDao boardDao;

	private static final Logger logger = LoggerFactory.getLogger(DataTEST4_DeleteBoard.class);
	
	@Test
	public void testUpdate() throws Exception {
		
		boardDao.boardSelectAll();
		
		Scanner scan = new Scanner(System.in);

		String check = "";
		int boardNum = 0;
		
		
		System.out.println("진행여부 : ");
		check = scan.next();
		
		while (check.equals("y")) {
			
			System.out.println("삭제할 게시글 번호 입력  :");
			boardNum = scan.nextInt();
			
			System.out.println("[삭제 전]"+boardDao.boardSelect(boardNum).toString());
			boardDao.boardDelete(boardNum);
			System.out.println("[삭제 후]"+boardDao.boardSelect(boardNum).toString());
			
		}// The end of while
		
	}
	
//	@Test
//	public void testRead() throws Exception {
//		logger.info(boardDao.boardSelect(1).toString());
//	}

}
