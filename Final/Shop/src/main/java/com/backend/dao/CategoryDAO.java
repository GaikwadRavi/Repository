package com.backend.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.mode.Category;

@Repository
public interface CategoryDAO {
	//declare all CRUD operations
	
	
	//public boolean saveorupdate(Category category);
	
	public boolean saveorupdate(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(int categoryId);
	
	public Category getRowById(int categoryId);
	

	public int updateRow(Category category);
	
	public List<Category> list();

}
