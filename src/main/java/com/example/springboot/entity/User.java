package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 00:10
 * @title 用户表
 */
@Data
public class User {

    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;
}
