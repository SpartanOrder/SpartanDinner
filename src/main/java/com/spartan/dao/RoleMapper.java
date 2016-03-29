package com.spartan.dao;

import com.spartan.model.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Byte roleid);

    int insert(Role record);

    Role selectByPrimaryKey(Byte roleid);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}