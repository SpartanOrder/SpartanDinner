package com.spartan.dao;

import com.spartan.model.EmployeeInfo;

import java.util.List;

public interface EmployeeInfoMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeInfo record);

    EmployeeInfo selectByPrimaryKey(Integer employeeId);

    List<EmployeeInfo> selectAll();

    int updateByPrimaryKey(EmployeeInfo record);
}