package com.yq.dormitory_system.mapper;

import com.yq.dormitory_system.model.Notice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-18 10:37
 */
@Repository("noticeMapper")
public interface NoticeMapper {
    /**
     * 查询所有公告信息
     * @param id 根据ID查
     * @param noticeName 根据标题名称查
     * @return
     */
    public List<Notice> getAllNotice(@Param("id") Integer id, @Param("noticeName") String noticeName);
}
