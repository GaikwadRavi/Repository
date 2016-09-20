package com.backend.dao;
import java.util.List;
import com.backend.mode.Product;

public interface ProductDAO {
	//declare all CRUD operations
	
	public boolean saveorupdate(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id);
	
	public Product getRowById(String id);
	
	public List<Product> list();

}
