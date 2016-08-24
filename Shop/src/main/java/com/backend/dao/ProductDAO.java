package com.backend.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.mode.Product;

@Repository
public interface ProductDAO {
	//declare all CRUD operations
	
	public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id);
	
	public List<Product> list();

}
