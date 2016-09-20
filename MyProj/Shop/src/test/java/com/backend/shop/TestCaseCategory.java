package com.backend.shop;
/*package com.backend.shop;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.backed.dao.CategoryDAO;
import com.backed.mode.Category;

import junit.framework.TestCase;

public class TestCaseCategory extends TestCase {
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		category = (Category) context.getBean("category");
	}
	@Test
	public void categoryListTestCase()
	{
		List<Category> list = categoryDAO.list();
		int rowCount = list.size();
		assertEquals("Category List Test Case",rowCount,2);
		
	}
	@Test
	public void categoryAddTestcase()
	{
		category.setId("CG02");
		category.setName("Rustam");
		category.setDescription("The movie based");
		boolean flag = categoryDAO.save(category);
		assertEquals(flag,true);
	}
	@Test
	public void categoryGetTestCase()
	{
		
		categoryDAO.get("CG00");
		assertEquals(category.getName(),"Hindi");
		
	}
	
	
	

}
*/