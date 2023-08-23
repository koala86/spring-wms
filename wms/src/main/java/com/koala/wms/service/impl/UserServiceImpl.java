package com.koala.wms.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.koala.wms.entity.User;
import com.koala.wms.mapper.UserMapper;
import com.koala.wms.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
    
}
