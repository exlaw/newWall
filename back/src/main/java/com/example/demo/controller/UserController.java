package com.example.demo.controller;

import com.example.demo.dao.userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//用户信息的增删改查
@RestController
public class UserController {
    @Autowired
    userdao userdao;
    @RequestMapping("/")
    public String get(){
        return userdao.getUser().toString();
    }
}
