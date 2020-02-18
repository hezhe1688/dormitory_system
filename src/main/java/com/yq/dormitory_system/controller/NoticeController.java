package com.yq.dormitory_system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.dormitory_system.model.Notice;
import com.yq.dormitory_system.service.NoticeService;
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

    @GetMapping("/getAllNotice")
    public PageInfo<Notice> getAllNotice(
                                         @RequestParam(value = "id", required = false) Integer id,
                                         @RequestParam(value = "noticeName", required = false) String noticeName) {
        PageHelper.startPage(1, 5);
        List<Notice> notices = noticeService.getAllNotice(id, noticeName);
        PageInfo<Notice> pageInfo = new PageInfo<>(notices);
        return pageInfo;
    }
}
