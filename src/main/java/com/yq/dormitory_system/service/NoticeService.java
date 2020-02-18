package com.yq.dormitory_system.service;


import com.yq.dormitory_system.model.Notice;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 10:47
 */
public interface NoticeService {
    public int insertNotice(Notice notice);

    public int deleteNoticeById(Integer[] ids);

    public List<Notice> getAllNotice(String noticeName);

    public int updateNotice(Notice notice);
}
