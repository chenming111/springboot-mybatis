package com.example.controller;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/queryall")
    @ResponseBody
    public List<User> queryUserList(){

        List<User> users = userMapper.queryUserList();
        return users;

    }

    @RequestMapping("/getuser/{id}")
    @ResponseBody
    public String  queryById(@PathVariable int id){

        return userMapper.queryById(id).toString();
    }



}
