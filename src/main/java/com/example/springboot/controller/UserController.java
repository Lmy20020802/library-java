package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author 程序员小洋
 * @version 2022.3
 * @date 2022/12/4 00:16
 * @title User的控制层
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询数据
     * @return
     */
    @GetMapping("/list")
    public Result list() {
        List<User> users = userService.list();
        return Result.success(users);
    }

    /**
     * 分页查询
     * @param userPageRequest
     * @return
     */
    @GetMapping("/page")
    public Result page(UserPageRequest userPageRequest) {
        return Result.success(userService.page(userPageRequest));
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    /**
     * 获取指定id的信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id){
        User user= userService.getById(id);
        return Result.success(user);
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user){
        user.setUpdateTime(new Date());
        userService.update(user);
        return Result.success();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return Result.success();
    }
}
