package com.lea.min.mapper;

import com.lea.min.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUser(int id);
}
