package com.yq.dormitory_system.service;

import com.yq.dormitory_system.model.User;

/**
 * @author 贺哲
 * @2020-02-19 21:33
 */
public interface UserService {
    public int insertUser(User user);

    public User stuLogin(String username, String password);

    public User teaLogin(String username, String password);
}
