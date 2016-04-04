package com.spartan.dao;

import com.spartan.model.Department;
import com.spartan.model.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper extends BaseMapper<Department, Integer> {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    List<Department> selectByExample(DepartmentExample example);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);
}