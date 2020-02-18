package com.yq.dormitory_system.mapper;

import com.yq.dormitory_system.model.Repair;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 21:53
 */
@Repository("repairMapper")
public interface RepairMapper {
    /**
     * 新增报修
     *
     * @return
     */
    public int insertRepair(Repair repair);

    /**
     * 根据ID进行一个或多个删除
     *
     * @param ids
     * @return
     */
    public int deleteRepairById(@Param("ids") Integer[] ids);

    /**
     * 查询所有报修信息
     *
     * @return
     */
    public List<Repair> getAllRepair();

    /**
     * 修改
     * @return
     */
    public int updateRepair(Repair repair);
}
