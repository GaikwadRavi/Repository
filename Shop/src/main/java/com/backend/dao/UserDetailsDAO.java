package com.backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.mode.UserDetails;

@Repository
public interface UserDetailsDAO {
	//declare all CRUD operations
	
		public boolean save(UserDetails userdetails);
		
		public boolean update(UserDetails userdetails);
		
		public boolean delete(UserDetails userdetails);
		
		public UserDetails get(String id);
		
		public List<UserDetails> list();


}
