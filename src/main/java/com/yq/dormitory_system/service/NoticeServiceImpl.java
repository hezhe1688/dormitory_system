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
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }

    @Override
    public int deleteNoticeById(Integer[] ids) {
        return noticeMapper.deleteNoticeById(ids);
    }

    @Override
    public List<Notice> getAllNotice(String noticeName) {
        return noticeMapper.getAllNotice(noticeName);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }
}
