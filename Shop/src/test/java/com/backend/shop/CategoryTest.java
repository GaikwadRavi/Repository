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
		category.setId("CG006");
		category.setName("CGName006");
		category.setDescription("This is category006 description");
		
		if( categoryDAO.save(category)==true)
		{
			System.out.println("Category created successfully");
		}
		else
		{
			System.out.println("Not able to create the category");
		}
		
		//Delete Operation
		category.setId("CG007");
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
		category.setName("Ravi");
		category.setDescription("This is updated value");
		if(categoryDAO.update(category))
		{
			System.out.println("Category row updated succesfully");
		}
		else
		{
			System.out.println("No able to update the category");
		}
	}

}
