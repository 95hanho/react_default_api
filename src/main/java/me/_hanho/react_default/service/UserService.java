package me._hanho.react_default.service;

public interface UserService {

	// 해당 아이디 존재여부 조회
	String getUser(String id);

	int isUser(String id);
}
