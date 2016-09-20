package com.backend.dao;

import java.util.List;

import com.backend.mode.User;

public interface DataDao {
	 public int insertRow(User user);

	 public List getList();

	 public User getRowById(int id);

	 public int updateRow(User user);

	 public int deleteRow(int id);


}
