package com.yq.dormitory_system.service;

import com.yq.dormitory_system.model.Dormitory;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 12:41
 */
public interface DormitoryService {
    public int insertDormitory(Dormitory dormitory);

    public int deleteDormitoryById(Integer[] ids);

    public List<Dormitory> getAllDormitory(String floor);

    public int updateDormitory(Dormitory dormitory);

}
