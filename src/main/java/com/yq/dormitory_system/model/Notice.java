package com.yq.dormitory_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author 贺哲
 * @2020-02-18 10:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Notice {
    private int id;
    private String noticeName;
    private String noticeAuthor;
    private int noticeStatus;
    private Date newsTime;
    private String content;
}
