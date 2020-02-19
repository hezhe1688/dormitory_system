package com.yq.dormitory_system.service;

import com.yq.dormitory_system.mapper.DormitoryMapper;
import com.yq.dormitory_system.model.Dormitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 12:42
 */
@Service("dormitoryService")
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Override
    public int insertDormitory(Dormitory dormitory) {
        return dormitoryMapper.insertDormitory(dormitory);
    }

    @Override
    public int deleteDormitoryById(Integer[] ids) {
        return dormitoryMapper.deleteDormitoryById(ids);
    }

    @Override
    public List<Dormitory> getAllDormitory(String floor) {
        return dormitoryMapper.getAllDormitory(floor);
    }

    @Override
    public int updateDormitory(Dormitory dormitory) {
        return dormitoryMapper.updateDormitory(dormitory);
    }
}
