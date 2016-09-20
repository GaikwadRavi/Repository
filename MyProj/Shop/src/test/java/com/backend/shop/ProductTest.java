package com.backend.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.dao.ProductDAO;
import com.backend.mode.Product;

public class ProductTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		
		ProductDAO productDAO=   (ProductDAO)    context.getBean("productDAO");
		Product product=  (Product)     context.getBean("product");
		//Save Product
		product.setId("PR113");
		product.setName("HI");
		product.setDescription("This is lapi");
		product.setPrice(500);
		System.out.println("It's woriking properyly");
		
		if( productDAO.saveorupdate(product)==true)
		{
			System.out.println("Product created successfully");
	
		}
		else
		{
			System.out.println("Not able to create the product");
		}
		//Delete Product Row
		product.setId("PR112");
		if(productDAO.delete(product))
		{
			System.out.println("Product row deleted successfully");
		}
		else
		{
			System.out.println("Not able to delete row in product");
		}
		//Update Row in Product table
		product.setId("PR003");
		product.setName("Boll");
		product.setDescription("This movie is in Telgu language only");
		product.setPrice(800);
		if(productDAO.update(product))
		{
			System.out.println("Row in product table updated successfully");
		}
		else
		{
			System.out.println("Row in product class not able to update");
		}
		
	}

}
