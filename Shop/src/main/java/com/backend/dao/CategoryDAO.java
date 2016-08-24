package com.backend.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.mode.Category;

@Repository
public interface CategoryDAO {
	//declare all CRUD operations
	
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(String id);
	
	public List<Category> list();

}
