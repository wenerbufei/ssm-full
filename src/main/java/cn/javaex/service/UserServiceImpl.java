package cn.javaex.service;

// UserService的实现类

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.javaex.dao.UserDao;
import cn.javaex.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userDao")
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);

    }
}