package com.koala.wms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.koala.wms.entity.User;
import com.koala.wms.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author koala
 * @since 2023-08-25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/saveOrUpdate")
    public boolean saveOrUpdate(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @GetMapping("/remove")
    public boolean remove(Integer id) {
        return userService.removeById(id);
    }
}
