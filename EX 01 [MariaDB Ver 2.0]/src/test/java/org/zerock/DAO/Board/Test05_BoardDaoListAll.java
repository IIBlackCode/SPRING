package org.zerock.DAO.Board;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.persistence.BoardDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Test05_BoardDaoListAll {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private BoardDaoImpl boardDao;
	
	private static Logger logger = LoggerFactory.getLogger(Test05_BoardDaoListAll.class);
	
	@Test
	public void testCreate() throws Exception{
		
		logger.info(">>"+boardDao.listAll());
		
	}

}
