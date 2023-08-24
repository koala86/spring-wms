package com.koala.wms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koala.wms.entity.User;
import com.koala.wms.service.UserService;

@RestController
public class UserController {
    public String hello() {
        return "hello wms";
    }

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.listAll();
    }
}
