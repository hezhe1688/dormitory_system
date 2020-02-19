package com.yq.dormitory_system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.dormitory_system.model.Students;
import com.yq.dormitory_system.service.StudentsService;
import com.yq.dormitory_system.tools.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 贺哲
 * @2020-02-19 19:50
 */
@RestController
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping("/insertStudents")
    public ResponseDate<Integer> insertStudents(Students students) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        /*Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        students.setCheckInTime(hour + ":" + minute);*/
        students.setCheckInTime("");
        students.setIn(false);
        students.setLate(false);
        try {
            int i = studentsService.insertStudents(students);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("新增成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("新增失败");
        }
        return responseDate;
    }

    @DeleteMapping("/deleteStudentsById")
    public ResponseDate<Integer> deleteStudentsById(@RequestParam("ids") Integer[] ids) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = studentsService.deleteStudentsById(ids);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("删除成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("删除失败");
        }
        return responseDate;
    }

    @GetMapping("/getAllStudents")
    public ResponseDate<List<Students>> getAllStudents(
            @RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit,
            @RequestParam(value = "key", required = false) String stuName) {
        ResponseDate<List<Students>> responseDate = new ResponseDate();
        try {
            PageHelper.startPage(page, limit);
            List<Students> students = studentsService.getAllStudents(stuName);
            PageInfo<Students> pageInfo = new PageInfo<>(students);
            responseDate.setData(students);
            responseDate.setCount(pageInfo.getTotal());
            responseDate.setMessage("查询成功");
            responseDate.setStatus(true);
        } catch (Exception e) {
            responseDate.setMessage("查询失败");
            responseDate.setStatus(false);
        }
        return responseDate;
    }

    @PutMapping("/updateStudents")
    public ResponseDate<Integer> updateStudents(Students students) {
        ResponseDate<Integer> responseDate = new ResponseDate();
        try {
            int i = studentsService.updateStudents(students);
            responseDate.setData(i);
            responseDate.setStatus(true);
            responseDate.setMessage("修改成功");
        } catch (Exception e) {
            responseDate.setStatus(false);
            responseDate.setMessage("修改失败");
        }
        return responseDate;
    }

    @GetMapping("/countNum")
    public ResponseDate<Map<Object, Object>> countNum() {
        ResponseDate<Map<Object, Object>> responseDate = new ResponseDate();
        Map<Object, Object> map = new HashMap<>();
        try {
            int allPeople = studentsService.allPeople();
            int signedIn = studentsService.signedIn();
            int noSignedIn = studentsService.noSignedIn();
            map.put("allPeople", allPeople);
            map.put("signedIn", signedIn);
            map.put("noSignedIn", noSignedIn);
            responseDate.setData(map);
            responseDate.setStatus(true);
            responseDate.setMessage("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            responseDate.setStatus(false);
            responseDate.setMessage("查询失败");
        }
        return responseDate;

    }
}
