package com.yq.dormitory_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 贺哲
 * @2020-02-19 19:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Students {
    private int id;
    private String stuName;
    private String sex;
    private String sid;
    private String stuClass;
    private int floor;
    private int hostelNum;
    private boolean isIn;
    private String checkInTime;
    private boolean isLate;
}
