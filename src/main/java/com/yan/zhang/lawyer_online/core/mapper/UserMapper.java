package com.yan.zhang.lawyer_online.core.mapper;

import com.yan.zhang.lawyer_online.core.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface UserMapper {

    void addUser(@Param("user") User user);
}



