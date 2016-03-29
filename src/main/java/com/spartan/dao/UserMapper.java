package com.spartan.dao;

import com.spartan.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    User selectByPrimaryKey(Integer userid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}