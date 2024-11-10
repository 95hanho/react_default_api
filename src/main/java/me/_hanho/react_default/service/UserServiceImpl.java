package me._hanho.react_default.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me._hanho.react_default.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userDAO;
	
	@Override
	public String getUser(String id) {
		return null;
	}

	@Override
	public int isUser(String id) {
		return userDAO.isUser(id);
	}

	
}
