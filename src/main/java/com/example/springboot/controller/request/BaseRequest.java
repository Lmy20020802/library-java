package com.example.springboot.controller.request;

import lombok.Data;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 08:36
 * @title 分页查询公共字段
 */
@Data
public class BaseRequest {

    private Integer pageNum;
    private Integer pageSize;
}
