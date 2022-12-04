package com.example.springboot.service;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;

import java.util.List;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 00:13
 * @title 用户表的业务层
 */
public interface IUserService {

    List<User> list();

    Object page(UserPageRequest userPageRequest);
}
