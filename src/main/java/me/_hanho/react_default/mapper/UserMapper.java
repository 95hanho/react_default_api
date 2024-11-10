package me._hanho.react_default.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	int isUser(String id);

}
