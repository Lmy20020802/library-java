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

    /**
     * 查询列表
     * @return
     */
    List<User> list();

    /**
     * 分页查询
     * @param userPageRequest
     * @return
     */
    Object page(UserPageRequest userPageRequest);

    /**
     * 新增
     * @param user
     */
    void save(User user);

    /**
     * 获取指定id的元素
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 更新
     * @param user
     */
    void update(User user);

    /**
     * 删除
     * @param id
     */
    void deleteById(Long id);
}
