package com.yq.dormitory_system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.dormitory_system.model.Dormitory;
import com.yq.dormitory_system.service.DormitoryService;
import com.yq.dormitory_system.tools.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-19 12:44
 */
@RestController
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;

    @PostMapping("/insertDormitory")
    public ResponseDate<Integer> insertDormitory(Dormitory dormitory) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = dormitoryService.insertDormitory(dormitory);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("新增成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("新增失败");
        }
        return responseDate;
    }

    @DeleteMapping("/deleteDormitoryById")
    public ResponseDate<Integer> deleteDormitoryById(@RequestParam("ids") Integer[] ids) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = dormitoryService.deleteDormitoryById(ids);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("删除成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("删除失败");
        }
        return responseDate;
    }

    @GetMapping("/getAllDormitory")
    public ResponseDate<List<Dormitory>> getAllDormitory(
            @RequestParam(value = "key", required = false) String floor) {
        ResponseDate<List<Dormitory>> responseDate = new ResponseDate();
        try {
            PageHelper.startPage(1, 5);
            List<Dormitory> dormitories = dormitoryService.getAllDormitory(floor);
            PageInfo<Dormitory> pageInfo = new PageInfo<>(dormitories);
            responseDate.setData(dormitories);
            responseDate.setCount(pageInfo.getTotal());
            responseDate.setMessage("查询成功");
            responseDate.setStatus(true);
        } catch (Exception e) {
            responseDate.setMessage("查询失败");
            responseDate.setStatus(false);
        }
        return responseDate;
    }

    @PutMapping("/updateDormitory")
    public ResponseDate<Integer> updateDormitory(Dormitory dormitory) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = dormitoryService.updateDormitory(dormitory);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("修改成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("修改失败");
        }
        return responseDate;
    }
}
