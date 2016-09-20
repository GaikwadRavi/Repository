package com.backend.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.dao.CategoryDAO;
import com.backend.mode.Category;

public class CategoryTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		
		CategoryDAO categoryDAO=   (CategoryDAO) context.getBean("categoryDAO");
		Category category=  (Category)     context.getBean("category");
		System.out.println("hidfkjdkfjkdfj");
		
		//Save Operation
		category.setId("CGMar");
		category.setName("TimePass");
		category.setDescription("Love Story");
		
		if( categoryDAO.saveorupdate(category)==true)
		{
			System.out.println("Category created successfully");
		}
		else
		{
			System.out.println("Not able to create the category");
		}
		
		//Delete Operation
		/*category.setId("CG004");
		if(categoryDAO.delete(category))
		{
			System.out.println("Category row deleted successfully");
		}
		else
		{
			System.out.println("Not able to delete the category");
		}
		//Update Operation
		category.setId("CG005");
		category.setName("Nilesh");
		category.setDescription("This is updated value");
		if(categoryDAO.update(category))
		{
			System.out.println("Category row updated succesfully");
		}
		else
		{
			System.out.println("No able to update the category");
		}*/
	}

}
