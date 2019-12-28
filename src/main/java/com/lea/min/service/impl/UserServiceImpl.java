package com.lea.min.service.impl;

import com.lea.min.entity.User;
import com.lea.min.mapper.UserMapper;
import com.lea.min.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUser(int id) {
        return userMapper.selectUser(id);
    }
}
