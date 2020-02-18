package com.yq.dormitory_system.service;

import com.yq.dormitory_system.mapper.NoticeMapper;
import com.yq.dormitory_system.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 10:48
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    @Override
    public List<Notice> getAllNotice(Integer id, String noticeName) {
        return noticeMapper.getAllNotice(id, noticeName);
    }
}
