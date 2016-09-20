package com.backend.dao;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.backend.mode.Supplier;
@Repository
public interface SupplierDAO {
	//declare all CRUD operations
	
		public boolean save(Supplier supplier);
		
		public boolean update(Supplier supplier);
		
		public boolean delete(Supplier supplier);
		
		public Supplier get(String id);
		
		public Supplier getRowById(String id);
		
		public List<Supplier> list();

}
