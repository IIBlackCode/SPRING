package org.zerock.DAO.Member;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.persistence.MemberDAO;
//[page 137] 20190529


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TEST06_MemberDAOTest2 {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private MemberDAO memberDAO;

	@Test 
	public void testReadMember() throws Exception {
		
		System.out.println(memberDAO.readMember("testID_00"));
	
	}
}
