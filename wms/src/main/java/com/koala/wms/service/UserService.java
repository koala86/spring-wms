package com.koala.wms.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.koala.wms.entity.User;

public interface UserService extends IService<User>{
    List<User> listAll();
}
