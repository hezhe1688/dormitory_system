package com.yq.dormitory_system.mapper;

import com.yq.dormitory_system.model.Dormitory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 12:33
 */
@Repository("dormitoryMapper")
public interface DormitoryMapper {

    public int insertDormitory(Dormitory dormitory);

    public int deleteDormitoryById(@Param("ids") Integer[] ids);

    public List<Dormitory> getAllDormitory(@Param("floor") String floor);

    public int updateDormitory(Dormitory dormitory);
}
