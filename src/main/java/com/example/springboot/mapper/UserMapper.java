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

    List<User> list();


    List<User> listByCondition(UserPageRequest userPageRequest);
}
