package org.zerock.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TEST09_BoardDAOTest2 {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private BoardDao boardDao;
	
	private static Logger logger = LoggerFactory.getLogger(TEST09_BoardDAOTest2.class);
	
	@Test
	public void testCreate() throws Exception{
		
		logger.info(">>"+boardDao.read(1).toString());
		
	}

}
