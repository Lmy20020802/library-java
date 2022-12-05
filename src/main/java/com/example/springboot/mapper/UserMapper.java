package com.example.springboot.mapper;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 00:12
 * @title User的持久层
 */

@Mapper
public interface UserMapper {

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
    List<User> listByCondition(UserPageRequest userPageRequest);

    /**
     * 新增用户
     * @param user
     */
    void save(User user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 修改用户
     * @param user
     */
    void updateById(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteById(Long id);
}
