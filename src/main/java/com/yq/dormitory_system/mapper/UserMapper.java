package com.yq.dormitory_system.mapper;

import com.yq.dormitory_system.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 贺哲
 * @2020-02-19 21:32
 */
@Repository
public interface UserMapper {
    public int insertUser(User user);

    /**
     * 学生登录
     *
     * @param username
     * @param password
     * @return
     */
    public User stuLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 老师登录
     *
     * @param username
     * @param password
     * @return
     */
    public User teaLogin(@Param("username") String username, @Param("password") String password);
}
