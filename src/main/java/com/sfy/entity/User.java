package com.sfy.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Sfy
 * @Date: 2020/7/2 0002 9:35
 */
@Data
public class User {
    /**
     * 唯一标识 主键
     */
    private int userid;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户生日
     */
    private Timestamp userBirthday;
}
