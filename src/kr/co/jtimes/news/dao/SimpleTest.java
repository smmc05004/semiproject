package kr.co.jtimes.news.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {
	
	
	@Test
	public void testGetTotalRows() {
		
		BoardDao dao = new BoardDao();
		int result = dao.getTotalRows();
		Assert.assertEquals(10, result);
	}
	
		
	BoardDao dao;
	
	@Before
	public void setup() {
		dao = new BoardDao();
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testOne() {
		
	} 
	
	@Test
	public void testTwo() {
		
	}
	
}
