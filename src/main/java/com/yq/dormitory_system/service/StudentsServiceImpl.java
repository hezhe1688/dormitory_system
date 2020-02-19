package com.yq.dormitory_system.service;

import com.yq.dormitory_system.mapper.StudentsMapper;
import com.yq.dormitory_system.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 19:34
 */
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public int insertStudents(Students students) {
        return studentsMapper.insertStudents(students);
    }

    @Override
    public int deleteStudentsById(Integer[] ids) {
        return studentsMapper.deleteStudentsById(ids);
    }

    @Override
    public List<Students> getAllStudents(String stuName) {
        return studentsMapper.getAllStudents(stuName);
    }

    @Override
    public int allPeople() {
        return studentsMapper.allPeople();
    }

    @Override
    public int signedIn() {
        return studentsMapper.signedIn();
    }

    @Override
    public int noSignedIn() {
        return studentsMapper.signedIn();
    }

    @Override
    public int updateStudents(Students students) {
        return studentsMapper.updateStudents(students);
    }
}
