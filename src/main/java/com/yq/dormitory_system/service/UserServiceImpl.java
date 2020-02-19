package com.yq.dormitory_system.service;

import com.yq.dormitory_system.mapper.UserMapper;
import com.yq.dormitory_system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 贺哲
 * @2020-02-19 21:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User stuLogin(String username, String password) {
        return userMapper.stuLogin(username, password);
    }

    @Override
    public User teaLogin(String username, String password) {
        return userMapper.teaLogin(username, password);
    }
}
