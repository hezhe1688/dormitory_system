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
     * 新增公告
     *
     * @param notice
     * @return
     */
    public int insertNotice(Notice notice);

    /**
     * 根据ID进行一个或多个删除
     *
     * @param ids
     * @return
     */
    public int deleteNoticeById(@Param("ids") Integer[] ids);

    /**
     * 查询所有公告信息
     *
     * @param noticeName 根据标题名称查
     * @return
     */
    public List<Notice> getAllNotice(@Param("noticeName") String noticeName);

    /**
     * 修改
     * @param notice
     * @return
     */
    public int updateNotice(Notice notice);
}
