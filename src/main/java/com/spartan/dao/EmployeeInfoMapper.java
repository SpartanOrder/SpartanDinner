package com.spartan.dao;

import com.spartan.model.EmployeeInfo;

import java.util.List;

public interface EmployeeInfoMapper {
    int insert(EmployeeInfo record);

    List<EmployeeInfo> selectAll();
}