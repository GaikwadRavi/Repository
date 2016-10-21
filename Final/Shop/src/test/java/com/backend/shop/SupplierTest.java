package com.backend.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.dao.SupplierDAO;
import com.backend.mode.Supplier;

public class SupplierTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		
		SupplierDAO supplierDAO=   (SupplierDAO)    context.getBean("supplierDAO");
		Supplier supplier=  (Supplier)     context.getBean("supplier");
		System.out.println("This is run sucessfuly");
		//Save supllier details
		/*supplier.setSupplierId(1);
		supplier.setSupplierName("SUName003");
		supplier.setType("Monitor");
		supplier.setAddress("Pune");
		
		if( supplierDAO.save(supplier)==true)
		{
			System.out.println("Supplier created successfully");
		}
		else
		{
			System.out.println("Not able to create the supplier");
		}*/
		//supplier delete operation
		supplier.setSupplierId(3);
		if(supplierDAO.delete(supplier))
		{
			System.out.println("Supplier row deleted sucessfully");
		}
		else
		{
			System.out.println("Supplier not able to delete");
		}
		//supplier update
		/*supplier.setSupplierId(4);
		supplier.setSupplierName("SUName002");
		supplier.setType("Laptop");
		supplier.setAddress("Aurangabad");
		if(supplierDAO.update(supplier))
		{
			System.out.println("Supplier row updated sucessfully");
		}
		else
		{
			System.out.println("Supplier not able to update");
		}*/
	}

}
