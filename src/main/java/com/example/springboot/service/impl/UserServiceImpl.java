package com.example.springboot.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 00:15
 * @title
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查找列表
     * @return
     */
    @Override
    public List<User> list() {
        return userMapper.list();
    }

    /**
     * 分页查询
     * @param userPageRequest
     * @return
     */
    @Override
    public Object page(UserPageRequest userPageRequest) {
        PageHelper.startPage(userPageRequest.getPageNum(),userPageRequest.getPageSize());
        List<User> users= userMapper.listByCondition(userPageRequest);
        return new PageInfo<>(users);

    }

    /**
     * 新增用户
     * @param user
     */
    @Override
    public void save(User user) {
        Date date = new Date();
        // 当做卡号来处理
        user.setUsername(DateUtil.format(date,"yyyyMMdd")+IdUtil.fastSimpleUUID());
        userMapper.save(user);
    }

    /**
     * 获取当前id
     * @param id
     * @return
     */
    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }

    /**
     * 更新用户
     * @param user
     */
    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }
}
