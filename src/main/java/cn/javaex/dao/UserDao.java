package cn.javaex.dao;

import java.util.List;


import cn.javaex.entity.User;

public interface UserDao {

	// 根据 id 寻找对应的 User
	public User findUserById(int id);
}
