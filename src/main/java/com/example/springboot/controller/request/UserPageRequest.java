package com.example.springboot.controller.request;

import lombok.Data;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 08:35
 * @title 用户分页查询字段
 */
@Data
public class UserPageRequest  extends BaseRequest{
    private String name;
    private String phone;
}
