package com.yq.dormitory_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 贺哲
 * @2020-02-18 10:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Repair implements Serializable {
    private int id;
    private String floor;
    private String hostelNum;
    private String type;
    private Date repairTime;
    private String describe;
}
