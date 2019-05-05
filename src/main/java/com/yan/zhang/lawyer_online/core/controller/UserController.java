package com.yan.zhang.lawyer_online.core.controller;

import com.yan.zhang.lawyer_online.core.mapper.UserMapper;
import com.yan.zhang.lawyer_online.core.model.User;
import com.yan.zhang.lawyer_online.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public String insertUser(@RequestBody User user){
        user.setUserId(SnowflakeIdWorker.generateId());
        userMapper.addUser(user);
        return "恭喜你，注册成功！";
    }
}
