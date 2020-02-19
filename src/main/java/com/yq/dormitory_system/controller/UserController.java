package com.yq.dormitory_system.controller;

import com.yq.dormitory_system.model.User;
import com.yq.dormitory_system.service.UserService;
import com.yq.dormitory_system.tools.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 贺哲
 * @2020-02-19 22:08
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ResponseDate<User> login(String username, String password) {
        ResponseDate<User> responseDate = new ResponseDate<>();
        if (username.contains("tea")) {
            try {
                User user = userService.teaLogin(username, password);
                if (user != null) {
                    responseDate.setData(user);
                    responseDate.setMessage("老师登录成功");
                    responseDate.setStatus(true);
                } else {
                    responseDate.setMessage("账户名或密码错误");
                    responseDate.setStatus(false);
                }
            } catch (Exception e) {
                responseDate.setMessage("账户名或密码错误");
                responseDate.setStatus(false);
            }
        } else {
            try {
                User user = userService.stuLogin(username, password);
                if (user != null) {
                    responseDate.setData(user);
                    responseDate.setMessage("学生登录成功");
                    responseDate.setStatus(true);
                } else {
                    responseDate.setMessage("账户名或密码错误");
                    responseDate.setStatus(false);
                }
            } catch (Exception e) {
                responseDate.setMessage("账户名或密码错误");
                responseDate.setStatus(false);
            }
        }
        return responseDate;
    }
}
