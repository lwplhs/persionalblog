package com.lhs.blog.dao;

import java.util.List;

import com.lhs.blog.entity.User;


public interface UserDao {

	
	List<User> selectAll();
	List<User> findAll();
}
