package com.backend.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.dao.UserDetailsDAO;
import com.backend.mode.UserDetails;

public class UserDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		UserDetailsDAO userdetailsDAO = (UserDetailsDAO) context.getBean("userdetailsDAO");
		UserDetails userdetails = (UserDetails) context.getBean("userdetails");
		
		userdetails.setId("US01");
		userdetails.setName("Ravi Gaikwad");
		userdetails.setAddress("Vaijapur");
		userdetails.setPassword("1234");
		userdetails.setContact("7276725450");
		//Save user Deatails
		if(userdetailsDAO.save(userdetails)==true)
		{
			System.out.println("UserDtails Added sucessfuly");
		}
		else
		{
			System.out.println("Not able to add userdetails");
		}
		//UserDetails delete operation
		if(userdetailsDAO.delete(userdetails)==true)
		{
			System.out.println("UserDtails deleted sucessfuly");
		}
		else
		{
			System.out.println("Not able to delete userdetails");
		}
		//User Details update
		if(userdetailsDAO.update(userdetails)==true)
		{
			System.out.println("UserDtails updated sucessfuly");
		}
		else
		{
			System.out.println("Not able to updated userdetails");
		}
	}

}
