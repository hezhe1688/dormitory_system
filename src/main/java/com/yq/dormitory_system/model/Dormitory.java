package com.yq.dormitory_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 贺哲
 * @2020-02-19 12:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dormitory {
    private int id;
    private int floor;
    private int dormitories;
    private int num;
    private String bedtime;
    private String checkTime;
    private String periphery;
}
