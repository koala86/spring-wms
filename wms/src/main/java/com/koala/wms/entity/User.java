package com.koala.wms.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class User {
    private int id;
    private String account;
    private String name;
    private String password;
    private int sex;
    private int age;
    private String phone;
    private int roldId;
    private String isValid;
}
