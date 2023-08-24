package com.koala.wms.mapper;

import com.koala.wms.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author koala
 * @since 2023-08-25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
