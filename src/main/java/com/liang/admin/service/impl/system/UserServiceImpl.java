package com.liang.admin.service.impl.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liang.admin.entity.system.User;
import com.liang.admin.mapper.system.UserMapper;
import com.liang.admin.service.impl.BaseServiceImpl;
import com.liang.admin.service.system.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService  {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserByUserName(String username) {
        QueryWrapper queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("username",username);
        return userMapper.selectOne(queryWrapper);
    }
}
