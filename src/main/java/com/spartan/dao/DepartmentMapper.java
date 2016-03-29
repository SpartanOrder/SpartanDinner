package com.spartan.dao;

import com.spartan.model.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Department record);

    Department selectByPrimaryKey(Integer roleid);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}