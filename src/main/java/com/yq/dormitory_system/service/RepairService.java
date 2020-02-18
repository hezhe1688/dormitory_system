package com.yq.dormitory_system.service;

import com.yq.dormitory_system.model.Repair;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 21:57
 */
public interface RepairService {
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
    public int deleteRepairById(Integer[] ids);

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
