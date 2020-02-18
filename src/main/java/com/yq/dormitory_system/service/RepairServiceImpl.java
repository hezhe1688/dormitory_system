package com.yq.dormitory_system.service;

import com.yq.dormitory_system.mapper.RepairMapper;
import com.yq.dormitory_system.model.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 21:57
 */
@Service("repairService")
public class RepairServiceImpl implements RepairService {

    @Autowired
    RepairMapper repairMapper;

    @Override
    public int insertRepair(Repair repair) {
        return repairMapper.insertRepair(repair);
    }

    @Override
    public int deleteRepairById(Integer[] ids) {
        return repairMapper.deleteRepairById(ids);
    }

    @Override
    public List<Repair> getAllRepair() {
        return repairMapper.getAllRepair();
    }

    @Override
    public int updateRepair(Repair repair) {
        return repairMapper.updateRepair(repair);
    }
}
