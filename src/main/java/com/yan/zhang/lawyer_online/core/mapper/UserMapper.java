package com.yan.zhang.lawyer_online.core.mapper;

import com.yan.zhang.lawyer_online.core.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void addUser(User user);
}



