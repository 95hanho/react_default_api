package me._hanho.react_default.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.react_default.mapper.UserMapper;

@Repository
public class UserRepository {
	
	@Autowired
	UserMapper userMapper;

	public int isUser(String id) {
		return userMapper.isUser(id);
	}

	
}
