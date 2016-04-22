package com.mytest.dao;

import com.mytest.model.User;

public interface UserDao {
	User findByUserName(String username);
}
