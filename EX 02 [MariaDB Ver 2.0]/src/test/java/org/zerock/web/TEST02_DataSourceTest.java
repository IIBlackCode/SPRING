package org.zerock.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//DataSourceTest 클래스 작성 page 88 20190529

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TEST02_DataSourceTest {
	
	//root-context.xml에 DataSource 등록 후 테스트코드 작성
	@Inject
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception{
		try(Connection connection = dataSource.getConnection()) {
			System.out.println(connection);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
