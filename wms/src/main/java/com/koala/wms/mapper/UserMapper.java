package com.koala.wms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.koala.wms.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    
}
