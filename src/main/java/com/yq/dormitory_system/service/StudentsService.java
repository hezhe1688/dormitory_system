package com.yq.dormitory_system.service;

import com.yq.dormitory_system.model.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 19:33
 */
public interface StudentsService {

    public int insertStudents(Students students);

    public int deleteStudentsById(@Param("ids") Integer[] ids);

    public List<Students> getAllStudents(@Param("stuName") String stuName);

    /**
     * 获取所有人
     *
     * @return
     */
    public int allPeople();

    /**
     * 获取归寝人数
     *
     * @return
     */
    public int signedIn();

    /**
     * 获取未寝人数
     *
     * @return
     */
    public int noSignedIn();

    public int updateStudents(Students students);

    public int signIn(Students students);
}
