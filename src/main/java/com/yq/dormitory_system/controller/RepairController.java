package com.yq.dormitory_system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.dormitory_system.model.Repair;
import com.yq.dormitory_system.service.RepairService;
import com.yq.dormitory_system.tools.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 22:02
 */
@RestController
public class RepairController {

    @Autowired
    RepairService repairService;

    @PostMapping("/insertRepair")
    public ResponseDate<Integer> insertRepair(Repair repair) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = repairService.insertRepair(repair);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("新增成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("新增失败");
        }
        return responseDate;
    }

    @DeleteMapping("/deleteRepairById")
    public ResponseDate<Integer> deleteRepairById(@RequestParam("ids") Integer[] ids) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = repairService.deleteRepairById(ids);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("删除成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("删除失败");
        }
        return responseDate;
    }


    @GetMapping("/getAllRepair")
    public ResponseDate<List<Repair>> getAllRepair(@RequestParam("page") Integer page,
                                                   @RequestParam("limit") Integer limit) {
        ResponseDate<List<Repair>> responseDate = new ResponseDate();
        try {
            PageHelper.startPage(1, 5);
            List<Repair> repairs = repairService.getAllRepair();
            PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
            responseDate.setData(repairs);
            responseDate.setCount(pageInfo.getTotal());
            responseDate.setMessage("查询成功");
            responseDate.setStatus(true);
        } catch (Exception e) {
            responseDate.setMessage("查询失败");
            responseDate.setStatus(false);
        }
        return responseDate;
    }

    @PutMapping("/updateRepair")
    public ResponseDate<Integer> updateRepair(Repair repair) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = repairService.updateRepair(repair);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            responseDate.setStatus(false);
            responseDate.setMessage("修改失败");
        }
        return responseDate;
    }
}
