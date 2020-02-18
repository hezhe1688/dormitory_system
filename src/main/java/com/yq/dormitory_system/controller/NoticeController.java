package com.yq.dormitory_system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.dormitory_system.model.Notice;
import com.yq.dormitory_system.service.NoticeService;
import com.yq.dormitory_system.tools.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 10:51
 */
@RestController
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    /*@RequestParam("page") Integer page,
    @RequestParam("limit") Integer limit,*/

    @GetMapping("/getAllNotice")
    public ResponseDate<List<Notice>> getAllNotice(
            @RequestParam(value = "key", required = false) String noticeName) {
        ResponseDate<List<Notice>> responseDate = new ResponseDate();
        try {
            PageHelper.startPage(1, 5);
            List<Notice> notices = noticeService.getAllNotice(noticeName);
            PageInfo<Notice> pageInfo = new PageInfo<>(notices);
            responseDate.setData(notices);
            responseDate.setCount(pageInfo.getTotal());
            responseDate.setMessage("查询成功");
            responseDate.setStatus(true);
        } catch (Exception e) {
            responseDate.setMessage("查询失败");
            responseDate.setStatus(false);
        }
        return responseDate;
    }
}
